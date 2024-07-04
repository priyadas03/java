import java.util.*;
public class max_and_min {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of digits:");
        int n=sc.nextInt();

        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
               
            }
        }
            System.out.println("minimum number is: "+min);
             System.out.println("maximum value is: "+max);
    }
}
