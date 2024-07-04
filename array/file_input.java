import java.io.*;
class file_input{
    public static void main(String args[]){
        FileInputStream file=null;
        try{
            file=new FileInputStream("C:\\Users\\PRIYA\\Downloads\\input.txt");
            int ch;
            while((ch=file.read())!= -1)
            System.out.print((char)ch);
            file.close();
        }
        catch(Exception e){System.out.print(e);}
    }
}