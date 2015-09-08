class TestOrdenamientosDirectos{
  int []A;
  int []B;
  int []C;
  int max;
   
   public static void main(String []args){
      Ordenamientos ordena = new Ordenamientos();
      Inicializar();
      GeneraNumeros();
      Imprimir();
      ordena.Intercambio(i);
      ordena.Seleccion();
      ordena.Insercion();
      Imprimir();
   }
   
   
   
   public static void Inicializar(){
      do{
      max=Teclado.LeeEntero("Numero de elementos:");
      }while(max<1);
      A=B=C=new int[max];
   }
   
     
   public static void GeneraNumeros(){
      int i;
      for(i=0;i<A.length;i++)
         A[i]=B[i]=C[i]=(int) (Math.random()*100) ;
   }
   
    public static void Imprimir(){
      int i;
      System.out.println();
      for(i=0;i<A.length;i++)
         System.out.println("["+i+"]="+ A[i]) ;
   }





}