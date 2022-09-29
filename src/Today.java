import java.util.Arrays;
import java.util.Scanner;

public class Today
{
	
	
   public static void selectionSort(int[] elements)
   {
	   Scanner scan = new Scanner(System.in); 

		
      for (int j = 0; j < elements.length - 1; j++)
      {
         int minIndex = j;
         
        
         for (int k = j + 1; k < elements.length; k++)
         {
            if (elements[k] < elements[minIndex])
            {
               minIndex = k;
            }
         }
         int temp = elements[j];
         elements[j] = elements[minIndex];
         elements[minIndex] = temp;
       }
   }

   public static void main(String[] args)
   {
	   System.out.println("Enter the numbers to be sorted");
	   int[] arr1 = {4, 1, 10, -3, 12, 12, 4, 2, 6, 8};
      System.out.println(Arrays.toString(arr1));
      selectionSort(arr1);
      System.out.println(Arrays.toString(arr1));
   }
}
