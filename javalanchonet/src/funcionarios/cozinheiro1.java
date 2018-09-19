/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kappa
 */
public class cozinheiro1 extends cozinheiro implements cozinheiro_porcao {

    public static int qtd;

    public static String nome;
    public static int numero;
    public static int classe;

    public cozinheiro1() {

    }

    public cozinheiro1(String nome, int numero, int classe) {
        this.nome = nome;
        this.numero = numero;
        this.classe = classe;

    }

    public void fazercachorro() {
        int ata = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o tipo:"
                        + "\n1 - cachorro quente=$8"
                        + "\n2 - xtudo =$13.50"
                        + "\n3 - xfrango=11.50"
                        + "\n4 - xbacon=10.50"));
        switch (ata) {
            case 1:
                salsicha--;
                pao--;
                dinheiro = dinheiro + 8;
                break;
            case 2:
                salsicha--;
                pao--;
                hamburg--;
                dinheiro = dinheiro + 13.50;
                frango--;
                bacon--;
                break;
            case 3:
                salsicha = salsicha - 2;
                pao--;
                hamburg--;
                dinheiro = dinheiro + 11.50;
                frango = frango - 2;

                break;
            case 4:
                salsicha--;
                pao--;
                hamburg--;
                dinheiro = dinheiro + 10.50;

                bacon = bacon - 2;

                break;

        }

    }

    public void cozinharporcao() {
        int at = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o tipo:"
                        + "\n1 - batata=$20"
                        + "\n2 - frango=$30 "
                        + "\n3 - bacon=$30"
                ));
        switch (at) {
            case 1:
                batata = batata - 5;
                dinheiro = dinheiro + 20;
                break;
            case 2:
                frango = frango - 5;
                dinheiro = dinheiro + 30;
                break;
            case 3:
                bacon = bacon - 5;
                dinheiro = dinheiro + 30;

                break;

        }

    }
}
