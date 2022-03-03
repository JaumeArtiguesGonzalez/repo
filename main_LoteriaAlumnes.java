import java.util.Scanner;

public class main_LoteriaAlumnes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int numAlumnes, guanyador;
		
		System.out.println("INTRODUEIX EL NOMBRE D'ALUMNES QUE ENTRARAN A LA LOTERIA:");
		numAlumnes = sc.nextInt();
		
		String alumnes[] = new String[numAlumnes];
		
		System.out.println("INTRODUEIX EL NOM DELS ALUMNES QUE ENTRARAN A LA LOTERIA:");
		for (int i=0; i<alumnes.length; i++)
			alumnes[i] = sc.next();
		
		System.out.println("INTRODUEIX EL NUMERO GUANYADOR DE LA LOTERIA:");
		guanyador = sc.nextInt();
		
		System.out.println("ELS ALUMNES QUE HAN SOBREVISCUT SON: ");
		for (int i=0; i<alumnes.length; i++)
			if(alumnes[i]!=alumnes[guanyador])
				System.out.print(alumnes[i] + " ");
			
	}

}
