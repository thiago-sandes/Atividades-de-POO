package laboratorio2;

public class Veiculo {
    private String numeroVeiculo;
    private String fabricanteVeiculo;
    private int numeroRodas;
    private String tipoVeiculo;
   
    public Veiculo(){
        
    }
    
    public Veiculo(String numeroveiculo, String fabricanteveiculo, int numerorodas, String tipoveiculo) {
		setnumeroVeiculo(numeroveiculo);
		setfabricanteVeiculo(fabricanteveiculo);
		setnumeroRodas(numerorodas);
		settipoVeiculo(tipoveiculo);		
    }
	
	public String getfabricanteVeiculo() {
        return fabricanteVeiculo;
    }

    public void setfabricanteVeiculo(String fabricanteveiculo) {
        if (fabricanteveiculo.isEmpty()) {
            System.out.println("Fabricante de veiculo vazio");
        } else {
            fabricanteVeiculo = fabricanteveiculo;
        }
    }
	
    public String getnumeroVeiculo() {
        return numeroVeiculo;
    }

    public void setnumeroVeiculo(String numeroveiculo) {
        if (numeroveiculo.isEmpty()) {
            System.out.println("Número de veiculo vazio");
        } else {
            numeroVeiculo = numeroveiculo;
        }
    }

    public int getnumeroRodas() {
        return numeroRodas;
    }

    public void setnumeroRodas(int numerorodas) {
        if (numerorodas <= 0) {
            System.out.println("Número de rodas inválido");
        } else {
            numeroRodas = numerorodas;
        }
    }

    public String gettipoVeiculo() {
        return tipoVeiculo;
    }

    public void settipoVeiculo(String tipoveiculo) {
        if (tipoveiculo.isEmpty()) {
            System.out.println("Tipo de veiculo vazio");
        } else {
            tipoVeiculo = tipoveiculo;
        }
    }
     
    public void imprime(){
        System.out.println("Numero do veiculo: " + getnumeroVeiculo());
        System.out.println("Fabricante do veiculo: " + getfabricanteVeiculo());
	System.out.println("Numero de rodas: " + getnumeroRodas());
        System.out.println("Tipo de veiculo: " + gettipoVeiculo());
    }
}
