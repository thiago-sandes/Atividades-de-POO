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
public class DVD extends Item{
    private String diretor;
    
    
    public DVD(){
        
    }
    
    public DVD(String titulo, int tempReproducao, String diretor, boolean possuo, String comentario){
        super(titulo, tempReproducao, possuo, comentario);
        this.diretor = diretor;
    }
 
    public String getDiretor(){
        return diretor;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
      
    public String toString(){
        return "\n Dados do DVD \n"+
                    "Tempo de reprodução: "+ getTempReproducao()+ "\n" +
                    "Diretor: "+ getDiretor()+ "\n" +
                    "Possuo:"+ (getPossuo() == true ? "Sim":"Não")+ "\n" +
                    "Comentário: "+ getComentario()+ "\n";
    }
}
