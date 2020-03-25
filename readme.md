This is my work for the Compiler course at UVic. The objective is to write a compiler for a C-like but much simpler programming language using Antlr (https://www.antlr.org/) as front-end tool for lexical, syntax and semantic analysis.

This language, however, allows `string` as a type (not `char[]`).

The grammer is written in Antlr 3.5.2 for learning purpose. A reason is 3.5.2 doesn't support left-recursive rules, you'll have to learn how to elimiate left-recursion and establish precedence rules for operators (+, -, *, //, ...). From Antlr 4, it makes your life much easier (https://github.com/antlr/antlr4/blob/master/doc/left-recursion.md).

`export CLASSPATH=".:/usr/local/lib/antlr-3.5.2-complete.jar:$CLASSPATH"`

## Lexical and syntax analysis

## Semantic analsysis

### Type checking

Suppose we have a function written in this language to compute factorials.

```
int factorial(int n)
{
	int returnValue;

	if (n == 1)
	{
		returnValue = 1;
	}
	else
	{
		returnValue =  n*factorial(n-1);
	}
	return returnValue;
}

void main()
{
	print "The factorial of 9 is ";
	println factorial(9);
}
```

### Intermediate Representation

The generated IR is:
```
PROG factorial
FUNC factorial (I)I
{
    TEMP 0:I;
    TEMP 1:I;
    TEMP 2:I;
    TEMP 3:Z;
    TEMP 4:I;
    TEMP 5:I;
    TEMP 6:I;
    TEMP 7:I;
    TEMP 8:I;
        T2 := 1;
        T3 := T0 I== T2;
        T3 := Z! T3;
        IF T3 GOTO L0;
        T4 := 1;
        T1 := T4;
        GOTO L1;
L0:;
        T5 := 1;
        T6 := T0 Isub T5;
        T7 := CALL factorial(T6);
        T8 := T0 Imul T7;
        T1 := T8;
L1:;
        RETURN T1;
}
FUNC main ()V
{
    TEMP 0:U;
    TEMP 1:I;
    TEMP 2:I;
        T0 := "The factorial of 9 is ";
        PRINTU T0;
        T1 := 9;
        T2 := CALL factorial(T1);
        PRINTLNI T2;
        RETURN;
}
```

### JVM Bytecode Generation

The generated JVM bytecode is:
```
.source factorial.ir
.class public factorial
.super java/lang/Object
.method public static factorial(I)I
    .limit stack 16
    .limit locals 9
    ldc 1
    istore 2
    iload 0
    iload 2
    isub
    ifeq L_0
    ldc 0
    goto L_1
L_0:
    ldc 1
L_1:
    istore 3
    iload 3
    ldc 1
    ixor
    istore 3
    iload 3
    ifne L0
    ldc 1
    istore 4
    iload 4
    istore 1
    goto L1
L0:
    ldc 1
    istore 5
    iload 0
    iload 5
    isub
    istore 6
    iload 6
    invokestatic factorial/factorial(I)I
    istore 7
    iload 0
    iload 7
    imul
    istore 8
    iload 8
    istore 1
L1:
    iload 1
    ireturn
.end method
.method public static __main()V
    .limit stack 16
    .limit locals 3
    ldc "The factorial of 9 is "
    astore 0
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 0
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    ldc 9
    istore 1
    iload 1
    invokestatic factorial/factorial(I)I
    istore 2
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    invokevirtual java/io/PrintStream/println(I)V
    return
.end method

;--------------------------------------------;
;                                            ;
; Boilerplate                                ;
;                                            ;
;--------------------------------------------;

.method public static main([Ljava/lang/String;)V
    ; set limits used by this method
    .limit locals 1
    .limit stack 4
    invokestatic factorial/__main()V
    return
.end method

; standard initializer
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
```
The above Bytecode can be compiled to an executable class file by Jasmin (http://jasmin.sourceforge.net/)
