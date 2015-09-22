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
      
      
      public void Actualizar (int pos) {
         arreglo[pos] = Teclado.LeeEntero("Dame el dato\n");
      } 
      
      public int Borrar(int pos){
         int aux = arreglo [pos];
         arreglo[pos] = arreglo[indice];
         indice--;
         return aux;
      }
     

      public int Buscar (int dato){
         for (int i=0; i<=indice; i++){
            if (dato == arreglo[i]){
       
            }
               return i;
       
             
           }    
          System.out.println("Error: no existe el dato dentro de este arreglo\n");
          return -1;
          
          
      
          
      }
        
     
       public void Listar(int pos){
       System.out.println("[" + pos + "]"+ arreglo[pos]+"\n"); 

            }
                   
                          
      }





