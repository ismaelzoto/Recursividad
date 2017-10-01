
public class Program {

	public static void main(String[] args) {
	
		Sumanumero sumar = new Sumanumero();{
			
			System.out.println("la suma de cifras de 5491 mediante variables es: " + sumar.Sumanormal(5491));
			
			System.out.println("la suma de de cifras de 7535 mediante un ciclo es: "+ sumar.Sumaciclo(7535));
			
			System.out.println("la suma de cifras de 8253 mediante recursividad es: "+ sumar.SumaRecursiva(8253));
		}
	}

}
