import java.util.*;

public class linear_search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of digits in array:");
        int n=sc.nextInt();

        int number[]=new int[n];
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.print("enter key: ");
        int key=sc.nextInt();

        for(int i=0;i<number.length;i++){
            if(key==number[i]){
                System.out.println("key is present at the index: "+i);
                
            }
            
        }

    }
}
