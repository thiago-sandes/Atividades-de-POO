package laboratorio2;



public class MainVeiculo {

    
    public static void main(String[] args) {
        
        Veiculo carro = new Carro("1", "Susuki", 4, "Automovel", 4);
        Veiculo moto = new Moto("2", "Honda", 2, "Moto", 80);
        Veiculo bicicleta = new Bicicleta("3", "Caloi", 2, "bike", 10);
        
        carro.imprime();
        moto.imprime();
        bicicleta.imprime();
    }
    
}
