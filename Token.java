package com.craftinginterpreters.lox; 

class Token {
    // final -> after initialization values can't change
    final TokenType type; 
    final String lexeme; 
    final Object literal; 
    final int line; 

    Token(TokenType type, String lexeme, Object literal, int line){
        this.type = type; 
        this.lexeme = lexeme; 
        this.literal = literal; 
        this.line = line; 
    }

    public String toString(){
        return type + " " + lexeme + " " + literal; 
    }
}
