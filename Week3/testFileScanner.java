//Count Number of Lines in a File
import java.io.FileReader;//Contains File Object
import java.util.Scanner; //Contains Scanner Object
import java.io.*;//Exception definitions

public class testFileScanner{
  public static void main(String[] args){

     String myFileName = "input.txt";
     int lineCount = 0;
     try{
            FileReader myFile = new FileReader(myFileName);
            Scanner scanMyFile = new Scanner(myFile);
            while( scanMyFile.hasNextLine() ) {
                  String currLine = scanMyFile.nextLine();
                  lineCount = lineCount + 1;
        }
        scanMyFile.close();
     } catch(FileNotFoundException ex) {
           System.out.println("exception "+ex.getMessage()+" caught");
     }

     System.out.println("file "+myFileName+ " contains "+lineCount+ " lines.");
  }
}
