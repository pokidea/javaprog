/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

import static estoque.materiaplima.bacon;
import static estoque.materiaplima.dinheiro;
import static estoque.materiaplima.frango;
import static estoque.materiaplima.hamburg;
import static estoque.materiaplima.pao;
import static estoque.materiaplima.salsicha;
import javax.swing.JOptionPane;

/**
 *
 * @author kappa
 */
public class cozinheiroespecial extends cozinheiro implements cozinheiro_porcao {
    //public static String nome;
    //public static int numero;
    // public static int  classe;

    public cozinheiroespecial() {

    }

    public cozinheiroespecial(String nome, int numero, int classe) {
        this.nome = nome;
        this.numero = numero;
        this.classe = classe;

    }

    public void fazercachorro() {
        int ata = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o tipo:"
                        + "\n1 - cachorro quente=$10"
                        + "\n2 - xtudo =$15.50"
                        + "\n3 - xfrango=13.50"
                        + "\n4 - xbacon=13.50"));
        switch (ata) {
            case 1:
                salsicha = salsicha - 2;
                pao--;
                dinheiro = dinheiro + 10;
                break;
            case 2:
                salsicha = salsicha - 2;
                pao--;
                hamburg = hamburg - 2;
                dinheiro = dinheiro + 15.50;
                frango = frango - 2;
                bacon = bacon - 2;

                break;
            case 3:
                salsicha = salsicha - 2;
                pao--;
                hamburg = hamburg - 2;
                dinheiro = dinheiro + 13.50;
                frango = frango - 4;

                break;
            case 4:
                salsicha--;
                pao--;
                hamburg = hamburg - 2;
                dinheiro = dinheiro + 13.50;

                bacon = bacon - 4;

                break;

        }

    }

    public void cozinharporcao() {
        int at = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o tipo:"
                        + "\n1 - batata=$25"
                        + "\n2 - frango=$35 "
                        + "\n3 - bacon=$35"
                ));
        switch (at) {
            case 1:
                batata = batata - 7;
                dinheiro = dinheiro + 25;
                break;
            case 2:
                frango = frango - 7;
                dinheiro = dinheiro + 35;
                break;
            case 3:
                bacon = bacon - 7;
                dinheiro = dinheiro + 35;

                break;

        }

    }
}
