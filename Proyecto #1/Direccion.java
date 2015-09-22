
public class Direccion {
	private int numero;
	private String calle;
	private String colonia;
	private String delOMun;
	private String estado;
	private int cp;
	
	public void CapturaDireccion()
	{
		LeeCalle();
		LeeNumero();
		LeeColonia();
		LeeCP();
		LeeDelOMunicipio();
		LeeEstado();
	}
	
	public void LeeNumero() {
		numero=Teclado.LeeEntero("N�mero de domicilio: ");
	}

	public void LeeCalle() {
		calle=Teclado.LeeCadena("Calle: ");
	}
	
	public void LeeColonia() {
		colonia=Teclado.LeeCadena("Colonia: ");
	}
	
	public void LeeCP() {
		cp=Teclado.LeeEntero("CP: ");
	}
	
	public void LeeDelOMunicipio() {
		delOMun=Teclado.LeeCadena("Delegaci�n o municipio: ");
	}
	
	public void LeeEstado() {
		estado=Teclado.LeeCadena("Estado: ");
	}
	
	public void Listar() {
		System.out.println("\n\tCalle: "+calle+"\n\tN� Exterior: "+numero+
				"\n\tColonia: "+colonia+"\n\tC�digo Postal: "+cp+
				"\n\tDelegaci�n/Municipio: "+delOMun+"\n\tEstado: "+estado);
	}
	
	public void Actualizar() {
		int opcion;
		Menu menu = new Menu();
		do {
			System.out.println("�Qu� desea actualizar?:");
			opcion = menu.ListaMenu("\t1)Calle\n\t2)Numero\n\t3)Colonia\n\t4)CP"+
							"\n\t5)Del/Municipio\n\t6)Estado\n\t7)Salir\nOpci�n: ", 7);
			switch(opcion)
			{
				case 1:
					LeeCalle();
					break;
				case 2:
					LeeNumero();
					break;
				case 3:
					LeeColonia();
					break;
				case 4:
					LeeCP();
					break;
				case 5:
					LeeDelOMunicipio();
					break;
				case 6:
					LeeEstado();
					break;
			}
		}while(opcion != 7);
	}
}
