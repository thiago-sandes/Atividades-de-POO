/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author thiago_sandes
 */
public class CD extends Item{
    private String artista;
    private int numTrilhas;
    
    public CD(){
        
    }
    
    public CD(String titulo, String artista, int tempReproducao, int numTrilhas, boolean possuo, String comentario){
        super(titulo, tempReproducao, possuo, comentario);
        this.artista = artista;
        this.numTrilhas = numTrilhas;
    }
  
    public String getArtista(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public int getNumTrilhas(){
        return numTrilhas;
    }
    
    public void setNumTrilhas(int numTrilhas){
        this.numTrilhas = numTrilhas;
    }  
    
}
