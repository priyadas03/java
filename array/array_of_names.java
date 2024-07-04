// import java.util.*;
// public class array_of_names {
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         System.out.print("enter number of names:");
//         int n=sc.nextInt();

//         String names[]=new String[n];
//         //input
//         for(int i=0;i<n;i++){
//             names[i]=sc.nextLine();
//         }
//         //output
//         for(int i=0;i<n;i++){
//             System.out.println("name "+ (i+1) +"is:   "+names[i]");
//         }
        
//     }
// }



import java.util.*;
public class array_of_names{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String names[]=new String[n];
        for(int i=1;i<=n;i++){
            names[i]=sc.nextLine();

        }

        for(int i=1;i<=n;i++){
            System.out.println("name"+(i+1)+"is: "+names[i]);
        }
    }
}
