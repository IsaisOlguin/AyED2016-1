class TestOrdenamientosDirectos{
  static int []A;
  static int []B;
  static int []C;
  static int max;
   
   public static void main(String []args){
      Ordenamientos ordena = new Ordenamientos();
      Inicializar();
      Imprimir();
      GeneraNumeros();
      ordena.Seleccion(B, max);
      Imprimir();
      ordena.Insercion(C, max);
      System.out.print(A);
      System.out.print(B);
      System.out.print(C);
   }
   
   
   
   public static void Inicializar(){
      do{
      max=Teclado.LeeEntero("Numero de elementos:");
      }while(max<1);
      A=new int[max];
   }
   
     
   public static void GeneraNumeros(){
      int i;
      for(i=0;i<A.length;i++)
         A[i]=(int) (Math.random()*100) ;
     
   }
   
    public static void Imprimir(){
      int i;
      System.out.println();
      for(i=0;i<A.length;i++)
         System.out.println("["+i+"]="+ A[i]) ;
   }

}
