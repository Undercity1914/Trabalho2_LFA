/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho_do_ze;

import com.mycompany.trabalho_do_ze.classe.ExpressaoRegular;

/**
 *
 * @author marco
 */
public class Trabalho_do_ze {
    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();

        /*ER.confere(ER.DIGITOS, "000511200021");

        ER.confere(ER.DIGITOS, "000511200021ADAF");

        ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf");

        ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf4565");

        ER.confere(ER.IDENT, "Altura1");

        ER.confere(ER.IDENT, "1Altura");

        ER.confere(ER.REAL, "123.908777E+30");

        ER.confere(ER.REAL, "0.17E-5");

        ER.confere(ER.ATRIBUICAO, "media=2132313");

        ER.confere(ER.INTEIRO, "10");*/

        ER.confere(ER.FUNCAO, "String funcao2(){     }");

        ER.confere(ER.IF, "if (altura > 1.70)");
        
        ER.confere(ER.EXPRESSAOMATEMATICA, "( x - - - y ) * ( a + b / c ) - funcao(h)");
        
        ER.confere(ER.EX2B, "01011");
        
        ER.confere(ER.EX2C, "01011");
    }
}
