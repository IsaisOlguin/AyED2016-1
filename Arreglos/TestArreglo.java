//Tarea #3 Estructura y Programacion de computadoras   Olguin Cabrera Armando Isais c/ colaboracion
//Metodo de solución: Devolucion de arreglos            Fecha de entrega: 2 de Septiempre de 2015

//Modificar la clase ArregloEnteros para que se pueda listar, actualizar y borrar todos los datos repetidos. 



class TestArreglo{

   public static int ListaMenu(){
          int opcion;
          do {
            opcion = Teclado.LeeEntero("1.- Insertar\n2.- Actualizar\n3.- Borrar\n4.- Listar\n5.- Buscar");
            if  (opcion<1 || opcion >7)
               System.out.println("Opcion no valida :'( ");
          
          
          }while(opcion <1 || opcion >7);  
          return  opcion;
      
      
      }
 
 
   public static void main (String []args){
      //variables locales
      int  opcion, dato, max, pos;
      ArregloEnteros miarreglo; //Aquí se crea la variable que será un objeto
      
      max = Teclado.LeeEntero("Teclea el tamaño maximo del arreglo:");
      miarreglo= new ArregloEnteros(max); //aqui se crea el objeto de tipo ArregloEnteros
      
      
      do {
         opcion = ListaMenu();
         switch (opcion) {
         
            	case 1: if (miarreglo.ValidaEspacio()){
         		           dato= Teclado.LeeEntero("Dame un valor\n");
         		           miarreglo.Insertar (dato);
         
                       }
                       else
                          System.out.println ("Error: no hay espacio en el arreglo\n");
                     break;
                  
               case 2: dato= Teclado.LeeEntero("Dato para actualizar\n");
                       pos = miarreglo.Buscar(dato);
                       if (pos != -1) 
                           miarreglo.Actualizar(pos, dato);
                     break;
                     
               case 3: dato= Teclado.LeeEntero("Dato para eliminar\n");
                       pos = miarreglo.Buscar(dato);
                       if (pos != -1) 
                           dato = miarreglo.Borrar(pos,dato);
                     break;
                     
               case 4: miarreglo.Listar();
                     break;
                   
               case 5: dato= Teclado.LeeEntero("Dato para buscar\n");
                      pos = miarreglo.Buscar(dato);
                        if(pos != -1)
                         miarreglo.Listar();
                     break;
                     
              case 6: miarreglo.Ordenar();
                     break;

                     }

    
         }while(opcion != 7);

}

}
       
  