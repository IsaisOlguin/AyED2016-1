class PruebaArreglo{

	public static void main(String []args){
		//variables locales
		int dato, pos, max,max_s, max_t, opcion;
		ArregloEmpleado miarreglo;//aqui se declara la variable de tipo arreglo
		Empleado empleado;
		Menu menu= new Menu();

		max = Teclado.LeeEntero("Dame el tamaño del arreglo: ");
		miarreglo= new ArregloEmpleado(max); //aqui se crea el objeto Arreglo
		max_s = Teclado.LeeEntero("Dame num max sueldos: ");
		max_t = Teclado.LeeEntero("Dame nummax tels: ");

		do {
			opcion = menu.ListaMenu("1)Insertar2)Listar\n3)Actualizar\n4)Buscar\n5)Borrar\n6)Ordenar\n7)Salir\nOpcion:",7);
			switch (opcion) {
				case 1: if (miarreglo.ValidaEspacio()){ 
								empleado = new Empleado(max_s, max_t);
								empleado.CapturaEmpleado();
								miarreglo.Insertar(empleado);
							}
							else
								System.out.println("No existe espacio en el arreglo...");
						break;
				case 2: miarreglo.Listar();			
						break;
						
			   case 3: dato = Teclado.LeeEntero("Dame la clave del empleado para actualizar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Actualizar(pos);
						  break;	
			   case 4: dato = Teclado.LeeEntero("Dame la clave del empleado a buscar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Listar(pos);
						  break;
				case 5: dato = Teclado.LeeEntero("Dame la clave del empleado a borrar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1){
						  		empleado= miarreglo.Borrar(pos);
								System.out.println("El empleado eliminado es: ");
								empleado.Listar();
								}
						  break;
			   case 6: miarreglo.Ordenar();
						  break;

			}
		}while (opcion != 7);


	}
}