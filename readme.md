This is my work for the Compiler course at UVic. The objective is to write a compiler for a C-like but much simpler programming language using Antlr (https://www.antlr.org/) as front-end tool for lexical, syntax and semantic analysis.

This language, however, allows `string` as a type (not `char[]`).

The grammer is written in Antlr 3.5.2 for learning purpose. A reason is 3.5.2 doesn't support left-recursive rules, you'll have to learn how to elimiate left-recursion and establish precedence rules for operators (+, -, *, //, ...). From Antlr 4, it makes your life much easier (https://github.com/antlr/antlr4/blob/master/doc/left-recursion.md).

`export CLASSPATH=".:/usr/local/lib/antlr-3.5.2-complete.jar:$CLASSPATH"`

## Lexical and syntax analysis

## Semantic analsysis

### Type checking
