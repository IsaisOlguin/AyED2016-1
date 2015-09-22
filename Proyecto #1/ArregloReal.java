class ArregloReal{

      //ATRIBUTOS*********************
      private double []arreglo;
      private int indice;
      
      
      //CONSTRUCTORES*****************
      public ArregloReal(int max){
         arreglo = new double[max];
         indice = -1;
      
      }
      
      //METODOS***********************
      
      public boolean ValidaEspacio(){
            return (indice < arreglo.length-1);
      }
      
      
      public void Insertar(double dato){
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
      
      public double Borrar(int pos){
         double aux = arreglo [pos];
         arreglo[pos] = arreglo[indice];
         indice--;
         return aux;
      }
     

      public double Buscar (double dato){
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





