public class ArraySort {
    public static void main (String args[]){
        int[] arr = {59,173,2,819,563};
        int temp, i, j;
        for(i = 0; i < arr.length; i++)
        {
            for(j = i+ 1; j < arr.length; j++)
            {
                if(arr[i]> arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    
}
