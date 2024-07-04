import java.io.*;
class file_output{
    public static void main(String args[]){
        FileOutputStream file=null;
        byte b[]={'x','y','z'};
        try{
            file=new FileOutputStream("C:\\Users\\PRIYA\\Downloads\\input.txt");
            
            file.write(b);
            file.close();
        }
        catch(Exception e){System.out.println(e);}
    }
} 
    
