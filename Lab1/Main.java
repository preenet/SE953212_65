package Lab1;
/**
 * Your Lab1 solution
 * @Author pree.t
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    // We need to replace comma "," in the csv with "||" 

    public static void main(String args[]) throws IOException {
        Vector<UniData> myUni = new Vector<UniData>();
        System.out.println("Program start!");
       
        
        // Parsing a CSV file into Scanner class constructor  
        Scanner sc = new Scanner(new File("C:\\Users\\Pree\\SE212\\QS-World-University-Rankings-2017.csv"));  
        sc.useDelimiter(",");   //sets the delimiter pattern  

        // Skip the header 
        sc.nextLine();
        while (sc.hasNextLine()) {  
            UniData u = new UniData(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
            System.out.println(u);
            sc.nextLine();
        }  // end while loop
        
        // Line 14"Nanyang Technological University, Singapore (NTU) Exception in thread "main" java.util.InputMismatchException
        sc.close();  //closes the scanner  

        // let insert new instance
        UniData newUni = new UniData();
        newUni.setCity("Chiang Mai");
        myUni.add(newUni);
        System.out.println("Program terminate properly!");
    } // end main
}// end class Main