/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalanchonet;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import javax.swing.JOptionPane;

import estoque.materiaplima;
import funcionarios.cozinheiro;
import funcionarios.cozinheiro1;
import funcionarios.cozinheiroespecial;
import static java.lang.System.out;
import java.util.ArrayList;

public class Javalanchonet {

    private static int u() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ArrayList<cozinheiroespecial> lcozinheiros;
    ArrayList<cozinheiro1> cozinheiro1;

    public static void main(String[] args) {
        //   int i=0;   int n=0;
        // Javalanchonet joc =new Javalanchonet();

        //  joc.lcozinheiros=new ArrayList<>();
        // joc.fazercachorro();
        int u = 0;
        int k = 0;
        int n = 0;
        int i = 0;
        materiaplima estoque = new materiaplima();

        cozinheiro1[] ca = new cozinheiro1[100];

        //               System.out.println(ca.numero);
        cozinheiroespecial[] c = new cozinheiroespecial[100];
        
        c[n] = new cozinheiroespecial("chefe especial", n, 2);
        ca[i] = new cozinheiro1("nomee", i, 1);

        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha uma opção: "
                            + "\n1 -Fazer porçao"
                            + "\n2 - Fazer Lanche"
                            + "\n3 - Exibir estoque"
                            + "\n4 - Exibir caixa"
                            + "\n5 - Adicionar estoque"
                            + "\n6 - Adicionar Funcionario"
                            + "\n7 - Exibir Funcionario"
                            + "\n0 - Sair"));

            switch (opcao) {

                case 1:

                    int at = Integer.parseInt(
                            JOptionPane.showInputDialog("Escolha o tipo:"
                                    + "\n1 - Conzinheiro especial"
                                    + "\n2 - Cozinheiro comum"
                            ));
                    switch (at) {
                        case 1:
                            c[n].cozinharporcao();

                            break;
                        case 2:
                            ca[i].cozinharporcao();
                            break;
                    }
                    break;
                case 2:

                    int ataa = Integer.parseInt(
                            JOptionPane.showInputDialog("Escolha o tipo:"
                                    + "\n1 - Cozinheiro especial"
                                    + "\n2   Cozinheiro comum"
                            ));
                    switch (ataa) {

                        case 1:// int att = Integer.parseInt(
                            //  JOptionPane.showInputDialog("Escolha o :"
                            //           + "\n1 - conzinheiro l"

                            //                        ));
                            // c[att].fazercachorro();
                            c[n].fazercachorro();

                            break;
                        case 2:
                            ca[i].fazercachorro();

                            break;
                    }
                    break;

                case 3:
                    
                    JOptionPane.showMessageDialog(null,
                                "estoque\n"
                                + "\nsalsichas "  + materiaplima.salsicha
                                + "\nPao: " + materiaplima.pao
                                + "\nHamburg: " + materiaplima.hamburg
                                + "\nFrango: " + materiaplima.frango  
                                + "\nBacon: " + materiaplima.bacon     
                                + "\nBatata: " + materiaplima.batata          
                                + "\n------------------------");
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                case 4:
                   JOptionPane.showMessageDialog(null,
                                "estoque\n"
                                + "\n dinheio "  + materiaplima.dinheiro);

                    break;
                case 5:

                    estoque.adicionar(opcao);

                    break;
                case 6:
                    int ataaa = Integer.parseInt(
                            JOptionPane.showInputDialog("Escolha o tipo:"
                                    + "\n1 - conzinheiro especial"
                                    + "\n2 cozinheiro comum"
                            ));
                    switch (ataaa) {

                        case 1:

                            String nome = JOptionPane
                                    .showInputDialog("Digite o nome do funcionario:");
                            c[n] = new cozinheiroespecial(nome, n, 2);
                            n++;
                            break;

                        case 2:

                            String nomee = JOptionPane
                                    .showInputDialog("Digite o nome do funcionario:");
                            ca[i] = new cozinheiro1(nomee, i, 1);

                            i++;

                            break;

                    }

                    break;
                case 7:

                    int l = 0;

                    for (int z = 0; z < n; z++) {
                        JOptionPane.showMessageDialog(null,
                                "Cozinheio especial\n"
                                + "\nNome: " + c[z].nome
                                + "\nNúmero: " + c[z].numero
                                + "\nClasse: " + c[z].classe
                                + "\n------------------------");

//                    System.out.println("nome: " + c[z].nome);                    
//                     //System.out.println(c[z].nome); 
//                     System.out.println("numero: " + c[z].numero); 
//                     //System.out.println(c[z].numero); 
//                    System.out.println("classe: " + c[z].classe); 
//                     //System.out.println(c[z].classe);   
//                     System.out.println("------------------------ ");
                    }

                    for (int z = 0; z < i; z++) {
                        JOptionPane.showMessageDialog(null,
                                "cozinheiro comum"
                                + "\nNome: " + ca[z].nome
                                + "\nNúmero: " + ca[z].numero
                                + "\nClasse: " + ca[z].classe
                                + "\n------------------------");

                    }

                    break;

                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);

    }

}
