//Tarea #3 Estructura y Programacion de computadoras   Olguin Cabrera Armando Isais c/ colaboracion
//Metodo de solución: Devolucion de arreglos            Fecha de entrega: 2 de Septiempre de 2015

//Modificar la clase ArregloEnteros para que se pueda listar, actualizar y borrar todos los datos repetidos. 



class ArregloEnteros{

      //ATRIBUTOS*********************
      private int []arreglo;
      private int indice;
      
      
      //CONSTRUCTORES*****************
      public ArregloEnteros(int max){
         arreglo = new int[max];
         indice = -1;
      
      }
      
      //METODOS***********************
      
      public boolean ValidaEspacio(){
            return (indice < arreglo.length-1);
      }
      
      
      public void Insertar(int dato){
         System.out.println("Dame un dato:\n");
         arreglo [++ indice] = dato;

      }
      
      
      public void Listar(){
           int i;
           for(i=0; i<=indice; i++)
               System.out.println("[" + i + "]"+ arreglo[i]+"\n");
            System.out.println();
      }
    
    
      
      
      public int Buscar (int dato){
         for (int i=0; i<=indice; i++)
            if (dato == arreglo[i])
               return i;
         
          System.out.println("Error: no existe el dato dentro de este arreglo\n");
          return -1;
          
          
          
      }
      
      public void Actualizar(int pos, int dato){
         int contar;
         arreglo[pos]=Teclado.LeeEntero("Dame nuevo dato: ");
         for(contar=0; contar<=indice; contar++)
               if(arreglo[contar]==dato)
               arreglo[contar]=arreglo[pos];
     }   
      
      
      
      public int Borrar(int pos, int dato){
         int contar, aux = arreglo[pos];
         for(contar=0; contar<=indice; contar++)
            if(arreglo[contar]==dato)
               arreglo[contar]=arreglo[indice];
         indice--;
      return aux;
      }
     
        
     
       public void Listar(int pos,int dato){
          int contar;
          for(contar=0; contar<=indice; contar++)
               System.out.print(arreglo[contar] + "\t");
       System.out.println();
      }
      
      
      
      public void Ordenar(){
            int i, cambios, temp;
               do{
                  cambios = 0;
                  for(i = 0;i<indice;i++){
                   if(arreglo[i]>arreglo[i+1]){
                    temp = arreglo[i+1];
                    arreglo[i+1] = arreglo[i];
                    arreglo[i] = temp;
                    cambios = cambios +1;
                   }
                  }
                 }
                while(cambios!=0);
}                   
                         
      


}