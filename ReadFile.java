package cachesimulator;

import java.io.*;
import java.util.*;
/**
 *
 * @author Magnus
 */
public class ReadFile {
   
    private Scanner x;
    
    public void openFile() {
        try{
            filelocation y = new filelocation();
            x = new Scanner(new File(y.fileLocation()));
        }
        catch(Exception e) {
            System.out.println("Could not find file");
        }
    }

   
    public void readFile (){
        
//      0. Läsning av data för att utföra en Load-instruktion.
//      1. Skrivning av data för att utföra en Store-instruktion.
//      2. Instruktionshämning.
//      3. Escape Record (ska ignoreras av simulatorn).
//      4. Flush Cache, som nollställer alla giltig-bitar i både instruktionscache och datacache.
       
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            
            System.out.printf( "%s %s %s\n", a,b,c);
        }
    }
    public void closeFile(){
        x.close();
    }
    
}

