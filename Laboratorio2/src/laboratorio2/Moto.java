/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**

 */
public class Moto extends Veiculo {
    private int cilindrada;
    
    public Moto(){
        
    }
    
    public Moto(String numeroVeiculo, String fabricanteVeiculo, int numeroRodas, String tipoVeiculo, int cilindrada){
        super(numeroVeiculo, fabricanteVeiculo, numeroRodas,  tipoVeiculo);
        this.cilindrada = cilindrada;
        
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public void imprime(){
        System.out.println("Numero do veiculo: " + getnumeroVeiculo());
        System.out.println("Fabricante do veiculo: " + getfabricanteVeiculo());
	System.out.println("Numero de rodas: " + getnumeroRodas());
        System.out.println("Tipo de veiculo: " + gettipoVeiculo());
        System.out.println("Cilindrada: " + getCilindrada());
    }
}
