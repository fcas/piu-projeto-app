/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Dalay
 */
public class serializa implements Serializable{
    public static void serializaLista() {
	LinkedList<Prato> lista = Informacoes.pratos;
        String arquivo = "save.dat";
        FileOutputStream arq = null;
	ObjectOutputStream out = null;
	try {
		//arquivo no qual os dados vao ser gravados
		arq = new FileOutputStream(arquivo);
                
		//objeto que vai escrever os dados
		out = new ObjectOutputStream(arq);
                out.reset();
		//escreve todos os dados
		out.writeObject(lista);
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		try {
			arq.close();
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
    }
        
    public static LinkedList<Prato> deserializaLista() {
        String arquivo = "save.dat";
	FileInputStream arqLeitura = null;
	ObjectInputStream in = null;
	LinkedList<Prato> lista = null;
	try {
		//arquivo onde estao os dados serializados
		arqLeitura = new FileInputStream(arquivo);
 
		//objeto que vai ler os dados do arquivo
		in = new ObjectInputStream(arqLeitura);
 
		//recupera os dados
		lista = (LinkedList<Prato>) in.readObject();
	} catch (ClassNotFoundException ex) {
		ex.printStackTrace();
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		try {
			arqLeitura.close();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
 
	return lista;
    }
}
