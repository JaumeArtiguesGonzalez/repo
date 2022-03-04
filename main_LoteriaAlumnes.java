public class main_LoteriaAlumnes {

	public static void main(String[] args) 
	{	
		//CREO OBJECTE loteria1 DE LA CLASSE classe_LoteriaAlumnes
		classe_LoteriaAlumnes loteria1 = new classe_LoteriaAlumnes();
		
		//COLOCO ELS ALUMNES EN UN ARRAY
		String alumnes[] = loteria1.colocarAlumnes();
		
		//MOSTRO ELS ALUMNES QUE PARTICIPEN A LA LOTERIA
		loteria1.mostrarAlumnes(alumnes);
		
		//EXECUTO LA LOTERIA
		loteria1.començaLoteria(alumnes);
				
	}

}
