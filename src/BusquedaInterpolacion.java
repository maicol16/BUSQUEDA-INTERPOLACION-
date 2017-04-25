import java.util.Scanner;
 

public class BusquedaInterpolacion
{
    public static int interpolationSearch(int[] sortedArray, int toFind)
    {
        int izquieda = 0;
        int derecha = sortedArray.length - 1;
        int mid;
        int izquierda = 0;
        while (sortedArray[izquierda] <= toFind && sortedArray[derecha] >= toFind) 
        {
            if (sortedArray[derecha] - sortedArray[izquierda] == 0)
                return (izquierda + derecha)/2;
          
             mid = izquierda + ((toFind - sortedArray[izquierda]) * (derecha - izquierda)) / (sortedArray[derecha] - sortedArray[izquierda]);  
 
             if (sortedArray[mid] < toFind)
                 izquierda = mid + 1;
             else if (sortedArray[mid] > toFind)
                 derecha = mid - 1;
             else
                 return mid;
        }
        if (sortedArray[izquierda] == toFind)
            return izquierda;
           
        else
            return -1; 
    }    
  
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Prueba de búsqueda de interpolación");
        int n, i;
    
        System.out.println("Introduzca el número de elementos enteros");
        n = scan.nextInt();
       
        int arr[] = new int[ n ];
        
        System.out.println("introdusca"+ n +"elementos enteros clasificados");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println("\nIntroduzca el elemento para buscar: : ");
        int key = scan.nextInt();
 
        int result = interpolationSearch(arr, key);
 
        if (result == -1)
            System.out.println("\n"+ key +" element not found");
        else
            System.out.println("elemento encontrado");
 
    }    
}

    
    

