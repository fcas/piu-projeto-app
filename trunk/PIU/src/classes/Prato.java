/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Dalay
 */
public class Prato implements Serializable{
    public String nome;
    public String valor;
    public String descricao;
    public String culinaria;

    public Prato(String n, String d, String v, String c) {
            nome = n;
            descricao = d;
            valor = v;
            culinaria = c;
    }

}
