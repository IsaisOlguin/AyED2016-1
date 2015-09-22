class ArregloCliente{
	//ATRIBUTOS
	private Cliente []arreglo;
	private int indice;
	
	//CONSRUCTORES
	public ArregloCliente(int max){
		arreglo = new Cliente[max];
		indice = -1;
	}
	
	//METODOS
	public boolean ValidaEspacio(){
		return (indice < arreglo.length-1);
	}
	
	public void Insertar(Cliente dato) {
		arreglo[++indice]=dato;
	}

	public void Listar() {
		for (int i=0; i<=indice; i++)
			arreglo[i].Listar();
	   System.out.println();
	}

	public void Listar(int pos) {
		arreglo[pos].Listar();
	}

	public int Buscar(int dato){
		for(int i=0; i<=indice; i++)
			if (dato== arreglo[i].GetClave())
				return i;
		System.out.println("Error: no existe el dato...");
		return -1;
	}
	public void Actualizar(int pos) {
		arreglo[pos].Actualizar();
	}
	public Cliente Borrar(int pos){
		Cliente aux= arreglo[pos];
		arreglo[pos] = arreglo[indice];
		indice--;
		return aux;
	}

   public void Ordenar(){
	   Ordenamientos orden = new Ordenamientos();
		orden.SortInsercion(arreglo,indice); 
	}
}
