class multicatch {
    public static void main(String args[]){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
            int arr[]={10,20,30};
            System.out.println(arr[6]);
            String str=null;
            System.out.println(str.length());
            String s="xyz";
            int i=Integer.parseInt(s);
        }
        catch(NullPointerException e){
            System.out.println("number is mismatched");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bound exception occurs");
        }
        catch(ArithmeticException b){
            System.out.println("Arithmatic exception");
        }
        catch(NumberFormatException c){
            System.out.println("Number exception");
            
        }
    }
}
