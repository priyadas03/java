import java.util.*;
public class helloworld{
public static void main(String args[]) {
Set<String> namesSet =new TreeSet<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter first name: ");
String str1=sc.nextLine();
namesSet.add(str1);
System.out.println("Enter second name: ");
String str2=sc.nextLine();
namesSet.add(str2);
namesSet.add("xyz");
System.out.println("namesSet = "+namesSet);
namesSet.add("xyz");
System.out.println("namesSet = "+namesSet);
namesSet.remove(str2);
System.out.println("namesSet = "+namesSet);}}