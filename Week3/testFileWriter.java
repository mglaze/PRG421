//Writes a line to a file
import java.io.PrintWriter;
import java.util.Scanner;
public class testFileWriter{
  public static void main(String[] args){
    String myFileName = "output.txt";
    try{
       PrintWriter myOutFile =new PrintWriter(myFileName);
       myOutFile.print("hello, my little file, ");
       myOutFile.println("I will print a line in you!");
       myOutFile.close();
    } catch(Exception ex) {
       System.out.println("exception "+ex.getMessage()+" caught");
    }
  }
}
