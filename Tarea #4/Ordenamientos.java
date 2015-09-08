class Ordenamientos{

   private void auxcambiaDatos(int[]A, int i, int j){
      int aux;
      aux=A[i];
      A[i]=A[j];
      A[j]=aux;
   
   }
   
   
   public void Intercambio(int[]A, int indice){
      int i,j;
      for(i=0;i<indice;i++)
         for(j=i+1;j<=indice;j++)
            if(A[i]>A[j])
               auxcambiaDatos(A,i,j);
      
      }
   
   
   public void Seleccion(int[]B, int indice){
      int im=0,i,j,aux;
      for(i=0;i<indice;i++){
         im=i;
         for(j=i+1;indice<=indice;j++)
            if(B[j]<B[im])
               im=j;
            if(i != im ){
               aux=B[i];
               B[i]=B[im];
               B[im]= aux;  
            }
      }
   
   }


   public void Insercion(int[]C, int indice){
      int i,j,aux;
      for(i=1;i<=indice;i++){
         j=i;
         aux=C[i];
         while(j>0&&C[j-1]>aux){
            C[j]=C[j-1];
            j--;
         }
      
      }
      
   }
   
   

}