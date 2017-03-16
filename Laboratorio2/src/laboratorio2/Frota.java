package laboratorio2;


import java.util.ArrayList;
import java.util.Iterator;

public class Frota
{
    // Storage for an arbitrary number of cars.
    private ArrayList<Veiculo> veiculos;

    
    public Frota()
    {
        veiculos = new ArrayList<Veiculo>();
    }

    
    public void storeVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }

    public int numberOfVeiculos()
    {
        return veiculos.size();
    }

    
    public void removeVeiculo(int Veiculonumber)
    {
        if(Veiculonumber < 0) {
            System.out.println(" This is not a valid veiculo number");
        }
        else if(Veiculonumber < numberOfVeiculos()) {
            // This is a valid veiculo number.
            veiculos.remove(Veiculonumber);
        }
        else {
            System.out.println("This is not a valid veiculo number");
        }
    }

    
	public void listVeiculos()
	{
		Iterator<Veiculo> it = veiculos.iterator();
		while(it.hasNext()) {
			it.next().imprime();
                        System.out.println("\n");
		}
	}
	
	public boolean verificaVeiculo(String numeroveiculo)
    {
        int index = 0;
		while(index < veiculos.size()) {
			if (numeroveiculo.equals((veiculos.get(index)).getnumeroVeiculo())) return true;
			index++;
		}
		return false;

    }
	
}
