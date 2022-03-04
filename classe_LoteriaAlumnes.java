import java.util.Scanner;

public class classe_LoteriaAlumnes
{
	Scanner sc=new Scanner(System.in);
	
	public String[] colocarAlumnes ()
	{
		int numAlumnes;
		
		System.out.println("INTRODUEIX EL NOMBRE D'ALUMNES QUE ENTRARAN A LA LOTERIA:");
		numAlumnes = sc.nextInt();
		
		String[] nomAlumnes=new String[numAlumnes];
		
		System.out.println("\nINTRODUEIX EL NOM DELS ALUMNES QUE PARTICIPARAN A LA LOTERIA:");
		for(int i=0; i<nomAlumnes.length; i++)
			nomAlumnes[i] = sc.next();
		
		
		return nomAlumnes;
	}
	
	public void mostrarAlumnes(String[] nomAlumnes)
	{
		System.out.println("\nELS ALUMNES QUE PARTICIPEN A LA LOTERIA SON:");
		for (String s: nomAlumnes)
			System.out.print(s + " ");
	}
	
	public String[] començaLoteria (String[] alumnes)
	{
		int guanyador;
		System.out.println("\n\nINTRODUEIX EL NUMERO GUANYADOR DE LA LOTERIA:");
		guanyador = sc.nextInt();
		
		System.out.println("======================================");
		
		System.out.println("ELS ALUMNES QUE HAN SOBREVISCUT SON: ");
		for (int i=0; i<alumnes.length; i++)
			if(alumnes[i]!=alumnes[guanyador])
				System.out.print(alumnes[i] + " ");
		
		return alumnes;
	}
	
	
}
