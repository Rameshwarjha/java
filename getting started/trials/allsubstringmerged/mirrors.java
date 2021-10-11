import java.util.*;

public class mirrors {
    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int arr[] =  new int[num];

        for(int i=0; i<num ; i++){

            arr[i] = scn.nextInt();


        }

        int n = scn.nextInt();

        for (int i = 0; i < arr.length; i++)   
{  
     for (int j = i + 1; j < arr.length; j++)   
         {  
            int tmp = 0;  
              if (arr[i] > arr[j])   
                   {  
                      tmp = arr[i];  
                      arr[i] = arr[j];  
                     arr[j] = tmp;  
                  }  
}
}


        int k= num-n;

        for(int i=k ; i<num ;i++){
            System.out.print(arr[i] +" ");
        }



    }

}
