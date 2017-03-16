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
public class Bicicleta extends Veiculo{
    private int numMarchas;
    
    public Bicicleta(){
        
    }
    
    public Bicicleta(String numeroVeiculo, String fabricanteVeiculo, int numeroRodas, String tipoVeiculo, int numMarchas){
        super(numeroVeiculo, fabricanteVeiculo, numeroRodas,  tipoVeiculo);
        this.numMarchas = numMarchas;
        
    }
    
    public int getNumMarchas(){
        return numMarchas;
    }
    
    public void setNumMarchas(int numMarchas){
        this.numMarchas = numMarchas;
    }
    
    public void imprime(){
        System.out.println("Numero do veiculo: " + getnumeroVeiculo());
        System.out.println("Fabricante do veiculo: " + getfabricanteVeiculo());
	System.out.println("Numero de rodas: " + getnumeroRodas());
        System.out.println("Tipo de veiculo: " + gettipoVeiculo());
        System.out.println("Numero de marchas: " + getNumMarchas());
    }
}
