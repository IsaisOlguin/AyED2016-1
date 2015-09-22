class Arreglo{
	//ATRIBUTOS
	private int []arreglo;
	private int indice;
	
	//CONSRUCTORES
	public Arreglo(int max){
		arreglo = new int[max];
		indice = -1;
	}
	
	//METODOS
	public boolean ValidaEspacio(){
		return (indice < arreglo.length-1);
	}
	
	public void Insertar(int dato) {
		arreglo[++indice]=dato;
	}

	public void Listar() {
		for (int i=0; i<=indice; i++)
			System.out.print("["+i+"]="+arreglo[i]+"\t");
	   System.out.println();
	}

	public void Listar(int pos) {
		System.out.println("["+pos+"]="+arreglo[pos]);
	}


	public int Buscar(int dato){
		for(int i=0; i<=indice; i++)
			if (dato== arreglo[i])
				return i;
		System.out.println("Error: no existe el dato...");
		return -1;
	}
	public void Actualizar(int pos) {
		arreglo[pos]= Teclado.LeeEntero("Dame numero: ");
	}
	public int Borrar(int pos){
		int aux= arreglo[pos];
		arreglo[pos] = arreglo[indice];
		indice--;
		return aux;
	}



}