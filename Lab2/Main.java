package Lab2;
/**
 * Your Lab2 solution
 * @Author pree.t@cmu.ac.th
 */
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    // Note: We need to replace comma "," in the csv with "||" for the university name since it contains comma , you aslo can use my csv here.
    // If you stuck with Scanner .next method error, try with StringTokernizer class https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html

    public static void main(String args[]) throws IOException {
        Vector<UniData> myUni = new Vector<UniData>();
        System.out.println("Program start!");
       
        
        // Parsing a CSV file into Scanner class constructor  
        Scanner sc = new Scanner(new File("C:\\Users\\Pree\\SE212\\Lab1\\QS-World-University-Rankings-2017_full.csv"));  
        sc.useDelimiter(",");   //sets the delimiter pattern  

        // Skip the header 
        sc.nextLine();
        while (sc.hasNextLine()) {  
            UniData u = new UniData(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
            //System.out.println(u);
            myUni.add(u);
            sc.nextLine();
        }  // end while loop
        
        // Line 14"Nanyang Technological University, Singapore (NTU) Exception in thread "main" java.util.InputMismatchException
        sc.close();  //closes the scanner  

        // let insert new instance
        // UniData newUni = new UniData();
        // newUni.setCity("Chiang Mai");
        // myUni.add(newUni);

        // Convert uni name to lower case
        for (int i=0; i<myUni.size(); i++) {
            String res = myUni.elementAt(i).getUniName().toLowerCase();
            myUni.elementAt(i).setUniName(res);
        }

        // Replace empty score with zero
        for (int i=0; i<myUni.size(); i++) {
            if(myUni.elementAt(i).getScore().equals(""))
                myUni.elementAt(i).setScore("0");
        }

        // Round the university score

        for (int i=0; i<myUni.size(); i++) {
            double res = Math.round( Double.parseDouble( myUni.elementAt(i).getScore() ));
            myUni.elementAt(i).setScore(""+res);
        }


        // clean rank (401-444)
        // keep that in mind that iterate forward in the list using a for-loop and removing elements from it might cause us to skip a few elements.
        // so we are going to iterate backward. 
        System.out.println("size is: " + myUni.size());
        for (int i=myUni.size()-1; i >= 0; i--) {
             if( !onlyDigits(myUni.elementAt(i).getRank(), myUni.elementAt(i).getRank().length() ) ){
            
                 myUni.remove(i);
             }
         }
        System.out.println("After clean:" + myUni.size());

        // sort using comparable of custom object.
        Collections.sort(myUni);
        displayUniData(myUni);
  
        System.out.println("Program terminate properly!");
    } // end main

    public static Vector<UniData> cleanRank(Vector<UniData> myUni) {
        // iterate over the list
        for (int i=0; i<myUni.size(); i++) {
            if( !onlyDigits(myUni.elementAt(i).getRank(), myUni.elementAt(i).getRank().length() ) ){
                
                System.out.println("removing:" + myUni.elementAt(i));
                myUni.remove(i);
            }
        }
        return myUni;
    }// end method cleanRank

    public static boolean onlyDigits(String str, int n)
    {
 
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
          // If we reach here that means all, the characters were digits,therefore we return true
        return true;
    }

    public static void displayUniData(Vector<UniData> myUni) {
        for (int i=0; i<myUni.size(); i++) {
            System.out.println(myUni.elementAt(i));
        }
    }// end method displayUniData
}// end class Main