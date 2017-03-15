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
public class Item {
    private String titulo;
    private int tempReproducao;
    private boolean possuo;
    private String comentario;
    
    public Item(){
        
    }
    
    public Item(String titulo, int tempReproducao, boolean possuo, String comentario){
        this.titulo = titulo;
        this.tempReproducao = tempReproducao;
        this.possuo = possuo;
        this.comentario = comentario;
    }
    
       
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getTempReproducao(){
        return tempReproducao;
    }
    
    public void setTempReproducao(int tempReproducao){
        this.tempReproducao = tempReproducao;
    }
        
    public boolean getPossuo(){
        return possuo;
    }
    
    public void setPossuo(boolean possuo){
        this.possuo = possuo;
    }
    
    public String getComentario(){
        return comentario;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    

    
}
