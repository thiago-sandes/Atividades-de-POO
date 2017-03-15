/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author thiago_sandes
 */
public class CDDVDCollection {
    private ArrayList<Item> itens;
    private Scanner ler;
    
    public CDDVDCollection() {
        this.itens = new ArrayList<Item>();
        ler = new Scanner(System.in);
    }
    
    public void addCD(CD cd){
        itens.add(cd);
    }
    
    public void removeCD(CD cd){
        itens.remove(cd);
    }
    
    public int numCds(){
        return itens.size();
    }
    
  //  public void listarCD(){
 //       Iterator <CD> it = cds.iterator();
  //      while(it.hasNext()) {
  //          it.next().toString();
//	}
  //  }
    
    public void listarCD(){
       int index=0;
        while(index<itens.size()) {
          //toString();
            System.out.println("\n Dados do CD \n"+ "\n" +
                    "Título: "+ itens.get(index).getTitulo() + "\n" +
                    "Tempo de reprodução: "+ itens.get(index).getTempReproducao()+ "\n" +
                    "Artista: "+ itens.get(index).getArtista()+ "\n" +
                    "Número de trilhas: "+ itens.get(index).getNumTrilhas()+ "\n" +
                    "Possuo:"+ (itens.get(index).getPossuo() == true ? "Sim":"Não")+ "\n" +
                    "Comentário: "+ itens.get(index).getComentario()+ "\n");
            index++;
	}
    }
     
     
    public boolean verificaCd(String title)
    {
        int index = 0;
		while(index < numCds()) {
			if (title.equals((itens.get(index)).getTitulo()))
                        return true;
			index++;
		}
		return false;
    }
    
    public void addDVD(DVD dvd){
        itens.add(dvd);
    }
    
    public void removeDVD(DVD dvd){
        itens.remove(dvd);
    }
    
    public int numDvds(){
        return itens.size();
    }
    
    public void listarDVD(DVD dvd){
        Iterator <Item> it = itens.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void listarDVD(){
       int index=0;
        while(index<itens.size()) {
          //toString();
            System.out.println("\n Dados do DVD \n"+
                    "Tempo de reprodução: "+ itens.get(index).getTempReproducao()+ "\n" +
                    "Diretor: "+ itens.get(index).getDiretor()+ "\n" +
                    "Possuo:"+ (itens.get(index).getPossuo() == true ? "Sim":"Não")+ "\n" +
                    "Comentário: "+ itens.get(index).getComentario()+ "\n");
            index++;
	}
    }
    
    public boolean verificaDvd(String title)
    {
        int index = 0;
		while(index < numDvds()) {
			if (title.equals((itens.get(index)).getTitulo()))
                        return true;
			index++;
		}
		return false;
    }
    

    
}
