
public class Cliente {
	//ATRIBUTOS
	private int numCuenta;
	private int edad;
	private String nombre;
	private String genero;
	private String eCivil;
	private String curp;
	private double saldo;
	private ArregloEnteros tels;
	private Direccion dir;
	
	//CONSTRUCTORES
	public Cliente(int numTels) {
		tels = new ArregloEnteros(numTels);
		dir = new Direccion();
	}
	
	public void LeeClave() {
		numCuenta = Teclado.LeeEntero("N� de cuenta: ");
	}
	
	public void LeeEdad() {
		edad = Teclado.LeeEntero("Edad: ");
	}
	
	public void LeeCurp() {
		curp= Teclado.LeeCadena("CURP: ");
	}
	
	public void LeeNom() {
		nombre = Teclado.LeeCadena("Nombre: ");
	}
	
	public void LeeGenero() {
		genero = Teclado.LeeCadena("G�nero: ");
	}
	
	public boolean verificaECivil() {
		return (eCivil.toLowerCase()!= "soltero" && eCivil.toLowerCase()!= "casado");
	}
	
	public void LeeEstadoCivil() {
		do {
			eCivil = Teclado.LeeCadena("Estado civil (Soltero/Casado): ");
			if(verificaECivil())
					System.out.println("Las �nicas opciones disponibles son (soltero/casado).");
		}while(verificaECivil());
	}
	
	public void CapturaTels() {
		int dato;
		if(tels.ValidaEspacio()) {
			dato = Teclado.LeeEntero("Tel�fono: ");
			tels.Insertar(dato);
		}
		else
			System.out.println("No hay espacio para ingresar un nuevo n�mero.");
	}
	
	public void CapturaEmpleado() {
		LeeClave();
		LeeNom();
		LeeGenero();
		LeeEdad();
		LeeCurp();
		LeeEstadoCivil();
		CapturaTels();
		dir.CapturaDireccion();
	}
	
	public void Listar() {
		System.out.println("Informaci�n del cliente "+numCuenta+":\n\tNombre: "+nombre+
							"\n\tG�nero: "+genero+"\n\tEdad: "+edad+"\n\tCURP: "+curp+
							"\n\tEstado civil: "+eCivil+"\n\tSaldo actual: "+saldo);
		System.out.println("\tTel�fono(s):");
		tels.Listar();
		System.out.println("\tDirecci�n:");
		dir.Listar();
	}
	
	public void Actualizar() {
		int opcion;
		Menu menu = new Menu();
		do {
			System.out.println("�Qu� desea modificar?");
			opcion = menu.ListaMenu("\t1)Nombre\n\t2)G�nero\n\t3)Edad\n\t4)Saldo\n\t5)Tel�fono(s)"+
					"\n\t6)Direcci�n\n\t7)CURP\n\t8)Estado civil\n\t9)Salir\nOpci�n: ", 9);
			switch(opcion)
			{
				case 1:
					LeeNom();
					break;
				case 2:
					LeeGenero();
					break;
				case 3:
					LeeEdad();
					break;
				case 4:
					ActualizaSaldo();
					break;
				case 5:
					ActualizaTels();
					break;
				case 6:
					dir.Actualizar();
					break;
				case 7:
					LeeCurp();
					break;
				case 8:
					LeeEstadoCivil();
					break;
			}
		}while(opcion != 9);
	}
	
	public void ActualizaSaldo() {
		int opcion;
		double cantidad;
		Menu menu = new Menu();
		do {
			opcion = menu.ListaMenu("1)Depositar\n2)Retirar\n3)Salir"+
									"\nOpcion: ", 3);
			switch(opcion)
			{
				case 1:
					do
					{	cantidad = Teclado.LeeDouble("Ingrese el monto que desea depositar: ");
						if(cantidad<0)
							System.out.println("ERROR: No es posible depositar dinero negativo.");
					}while(cantidad<0);
					saldo+=cantidad;
					System.out.println("�Se ha depositado $"+cantidad+" exitosamente!");
					break;
				case 2:
					do
					{	cantidad = Teclado.LeeDouble("Ingrese el monto que desea retirar: ");
						Math.abs(cantidad);
						if(cantidad>saldo)
							System.out.println("ERROR: No es posible retirar m�s dinero del "+
									"que posee el saldo actual: $"+saldo);			
					}while(cantidad>saldo);
					saldo-=cantidad;
					System.out.println("�Se ha retirado $"+cantidad+" exitosamente!");
					break;
			}
		}while(opcion != 3);
	}
	
	public void ActualizaTels() {
		int opcion,pos,dato;
		Menu menu = new Menu();
		do {
			System.out.println("�Qu� desea realizar?");
			opcion = menu.ListaMenu("\t1)Ingresar un nuevo n�mero\n\t2)Modificar\n\t3)Eliminar"+
									"\n\t4)Salir\nOpci�n: ", 4);
			switch(opcion)
			{
				case 1:
					CapturaTels();
					break;
				case 2:
					dato = Teclado.LeeEntero("�Qu� n� telefonico desea modificar?: ");
					pos = tels.Buscar(dato);
					if(pos != -1)
						tels.Actualizar(pos);
					break;
				case 3:
					dato = Teclado.LeeEntero("�Qu� n� telefonico desea eliminar?: ");
					pos = tels.Buscar(dato);
					if(pos != -1)
					{
						dato = tels.Borrar(pos);
						System.out.println("El tel�fono "+dato+" ha sido eliminado");
					}
					break;
			}
		}while(opcion != 4);
	}

	public int GetNumCuenta() {
		return numCuenta;
	}
	
	public String GetEstadoCivil() {
		return eCivil;
	}
	
	public int GetEdad() {
		return edad;
	}
	
	public double GetSaldo() {
		return saldo;
	}

}
