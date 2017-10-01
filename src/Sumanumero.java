
public class Sumanumero {
	
	public int Sumanormal(int n){	
		
		int a,b;
		int suma=0;
		
		//divide la parte entera del numero
		a =(int)n/10;
		//obtiene el residuo 
		b = n%10;
		// suma lo que obtiene de b
		suma=suma+b;
		n=a;
		
		a =(int)n/10;
		b=n%10;
		suma=suma+b;
		n=a;
		
		a =(int)n/10;
		b=n%10;
		suma=suma+b;
		n=a;
		
		a =(int)n/10;
		b=n%10;
		suma=suma+b;
		n=a;
		
		return suma;
	}

	public int Sumaciclo(int n) {
		int suma=0;
		// inicia el ciclo
		while (n>0)
		{
		    //realiza la suma
			suma=suma+(n%10);
			n=n/10;
		}
	return suma;
	}
	
public int SumaRecursiva(int n){
	// Caso Base
	if (n==0){
		return 0;
	}else{
		// Dominio o funcion recursiva
		return ((n%10)+ SumaRecursiva(n/10));	
		}
	}
}
