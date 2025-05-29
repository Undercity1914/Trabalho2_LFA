package com.mycompany.trabalho_do_ze.classe;

public class ExpressaoRegular {

    public String BRANCO, BRANCOS;
    public String DIGITO, DIGITOS;
    public String LETRA, LETRAS;
    public String IDENT;
    public String EXPONENCIAL;
    public String REAL;
    public String INTEIRO;
    public String NUMEROS;
    public String ATRIBUICAO;
    public String TIPO;
    public String PARAM;
    public String PARAMS;
    public String FUNCAO;
    public String OPERADOR;
    public String CONDICAO;
    public String IF;
    
    public String EXPRESSAOMATEMATICA;
    public String OPERADORMATEMATICO;
    public String DIGITOSEMZERO;
    public String DIGITOSSEMZERO;
    public String EXPONENCIALSEMZERO;
    public String REALSEMZERO;
    public String ARRAY;
    public String IDENTIFICADOR;
    public String CAMPO;
    public String OPERANDO;
    public String CHAMADAFUNCAO;
    public String GRUPO;

    public String EX2B;
    public String EX2C;
    
    public ExpressaoRegular() {
        BRANCO = "(\\s)"; 
        BRANCOS = BRANCO + "*";
        DIGITO = "([0-9])";
        DIGITOS = DIGITO + "*";
        LETRA = "([A-Za-z])";
        LETRAS = LETRA + "*";
        IDENT = "(" + LETRA + "(" + LETRA + "|" + DIGITO + ")*)";
        EXPONENCIAL = "(E(\\+|-)" + DIGITOS + ")";
        REAL = "(\\-?(" + DIGITOS + "\\.?" + DIGITOS + "|" + DIGITOS + ")(" + EXPONENCIAL + ")?)";
        INTEIRO = "(" + DIGITOS + EXPONENCIAL + "?)";
        NUMEROS = "(" + INTEIRO + "|" + REAL + ")";
        ATRIBUICAO = IDENT + BRANCOS + "=" + BRANCOS + "(" + LETRA + "(" + LETRA + "|" + REAL + ")*" + "|" + REAL + "(" + LETRA + "|" + REAL + ")*)";

        TIPO = "(void|int|float|double|char|String|boolean)";

        PARAM = "(" + TIPO + BRANCOS + IDENT + ")";

        PARAMS = "(" + BRANCOS + "(" + PARAM + "(" + BRANCOS + "," + BRANCOS + PARAM + ")*)?" + BRANCOS + ")";

        FUNCAO = "(" + TIPO + BRANCOS + IDENT + BRANCOS + "\\(" + PARAMS + "\\)" + ")" + "\\{"+ BRANCOS + "\\}";

        OPERADOR = "(==|!=|<=|>=|<|>)";

        CONDICAO = IDENT + BRANCOS + OPERADOR + BRANCOS + "(" + IDENT + "|" + NUMEROS + ")";

        IF = "if" + BRANCOS + "\\(" + BRANCOS + CONDICAO + BRANCOS + "\\)";
        
        OPERADORMATEMATICO = "(/|\\*|\\+|\\-)";
        
        DIGITOSEMZERO = "[1-9]";
        DIGITOSSEMZERO = "(" + DIGITOSEMZERO + DIGITO + ")" + "*";
        
        EXPONENCIALSEMZERO = DIGITOSSEMZERO + "\\^" + DIGITOSSEMZERO;
        REALSEMZERO = "(\\-?" + DIGITOSEMZERO + "\\.?" + DIGITOS + "(" + EXPONENCIAL + ")?)";  
        
        CHAMADAFUNCAO = BRANCOS + IDENT + BRANCOS + "(" + "\\(" + IDENT + "\\)" + ")+";
        
        ARRAY = IDENT + "(\\[" + DIGITOS + "\\])";   
        CAMPO = ARRAY + "?" + "(" + "\\."  + IDENT + ")+";
        
        OPERANDO = "(" + REAL + "|" + CAMPO + "|" + ARRAY + "|" + CHAMADAFUNCAO + "|" + IDENT + ")";
        GRUPO = "\\(" + BRANCOS + OPERANDO + "(" + BRANCOS + OPERADORMATEMATICO + BRANCOS + OPERANDO + ")*" + BRANCOS + "\\)";

        EXPRESSAOMATEMATICA = BRANCOS + "(" + OPERANDO + "|" + GRUPO + ")" + "(" + BRANCOS + OPERADORMATEMATICO + BRANCOS + 
                "(" + OPERANDO + "|" + GRUPO + "))*" + BRANCOS;        
        
        EX2B = "0[01]*1";
        EX2C = "1[01]*0";
    }

    public void confere(String exp, String sentenca) {
        if ((sentenca != null) && !sentenca.isEmpty()) {
            if (sentenca.matches(exp)) {
                System.out.println("W:'" + sentenca + "'........ ACEITA!");
            } else {
                System.err.println("W:'" + sentenca + "'........ rejeitada.");
            }
        } else {
            System.err.println("Sentença vazia.");
        }
    }
}
