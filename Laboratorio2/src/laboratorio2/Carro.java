/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
    String numeroVeiculo;
    private String fabricanteVeiculo;
    private int numeroRodas;
    private String tipoVeiculo;
 */
public class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(){
        
    }
    
    public Carro(String numeroVeiculo, String fabricanteVeiculo, int numeroRodas, String tipoVeiculo, int numPortas){
        super(numeroVeiculo, fabricanteVeiculo, numeroRodas,  tipoVeiculo);
        this.numPortas = numPortas;
        
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    public void imprime(){
        System.out.println("Numero do veiculo: " + getnumeroVeiculo());
        System.out.println("Fabricante do veiculo: " + getfabricanteVeiculo());
	System.out.println("Numero de rodas: " + getnumeroRodas());
        System.out.println("Tipo de veiculo: " + gettipoVeiculo());
        System.out.println("Número de portas: " + getNumPortas());
    }
}
