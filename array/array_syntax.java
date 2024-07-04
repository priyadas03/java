import java.util.*;

public class array_syntax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int numbers[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }









        //int[] marks=new int [3];
        //int marks[]={97,98,90};


        // marks[0]=97;
        // marks[1]=42;
        // marks[2]=78;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // for(int i=0;i<3;i++){
    //     System.out.println(marks[i]);
    // }
    }
}
