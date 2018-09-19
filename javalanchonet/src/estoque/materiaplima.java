package estoque;

import javax.swing.JOptionPane;

public class materiaplima {

    public static int salsicha = 100;
    public static int pao = 100;
    public static int hamburg = 100;
    public static double dinheiro;
    public static int frango = 100;
    public static int bacon = 100;
    public static int batata = 100;

    public void adicionar(int valor) {
        int ata = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o tipo:"
                        + "\n1 - salsicha"
                        + "\n2 - pao "
                        + "\n3 - hamburg"
                        + "\n4 - fragon"
                        + "\n5  - bacon "
                        + "\n6-batata "));
        switch (ata) {
            case 1:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));

                salsicha += valor;

                break;
            case 2:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));
                pao += valor;

                break;
            case 3:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));
                hamburg += valor;
                break;
            case 4:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));
                frango += valor;

                break;
            case 5:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));
                bacon += valor;

                break;
            case 6:
                valor = Integer.parseInt(JOptionPane
                        .showInputDialog("informe a quantidade: "
                        ));
                batata += valor;

        }

    }
}
