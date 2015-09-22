class Menu {
	public int ListaMenu(String texto,int opc_max) {
		int opcion;
		do{	
			opcion = Teclado.LeeEntero(texto);
			if (opcion >opc_max || opcion<1)
				System.out.println("Error: opcion no valida...."); 
		}while(opcion >opc_max || opcion<1);
		
		return opcion;
	}
}