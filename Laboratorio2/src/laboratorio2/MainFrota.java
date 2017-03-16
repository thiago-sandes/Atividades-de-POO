package laboratorio2;


import java.util.Scanner;
public class MainFrota
{
	
	public static void main(String[] args) 
	{
		Frota frota;      
		frota = new Frota();  
		Veiculo carro = new Carro("1", "Susuki", 4, "Automovel", 4);
                Veiculo moto = new Moto("2", "Honda", 2, "Moto", 80);
                Veiculo bicicleta = new Bicicleta("3", "Caloi", 2, "bike", 10);
		frota.storeVeiculo(carro);
                frota.storeVeiculo(moto);
		frota.storeVeiculo(bicicleta);
		frota.listVeiculos();
                
                System.out.println("\n\n");
                
                System.out.println("Número de veículos: " + frota.numberOfVeiculos());
                
                System.out.println("\n\n");
                
                System.out.println("Removo o veículo 1 ... \n\n");
                frota.removeVeiculo(0);
                
                frota.listVeiculos();
		
  		Scanner reader = new Scanner(System.in);
		System.out.print("entre com um numero de veiculo > "); 
                String strNumero = reader.nextLine();
		if (frota.verificaVeiculo(strNumero)) System.out.println("Veiculo cadastrado");
		else System.out.println("Veiculo nao cadastrado");
	}

}