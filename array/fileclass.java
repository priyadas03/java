import java.io.*;

public class fileclass {
    public static void main(String[] args) {
        String data="we are appending data to a file.";
        File file=new File("C:\\Users\\PRIYA\\Downloads\\input.txt");
        try{
            FileWriter fw=new FileWriter(file,true);
            fw.write(data);
            fw.close();
            System.out.println("Data appended to the file successfully.");
        }
        catch (IOException e){
            System.out.println("An error occurred while appending to the file.");
        }
    }
    
}
