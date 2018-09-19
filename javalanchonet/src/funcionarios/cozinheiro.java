/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

import estoque.materiaplima;

public abstract class cozinheiro extends materiaplima {

    public String nome;
    public int numero;
    public int classe;

    public abstract void fazercachorro();

}
