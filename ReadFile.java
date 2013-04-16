package cachesimulator;

import java.io.*;
import java.util.*;
/**
 *
 * @author Magnus
 */
public class ReadFile {
   
    public String x;
    public String y;
    public String z;
    public int zInt;
    public int xInt;
    public int yIntDeciform;
    private Scanner a;
    
    public void openFile() {
        try{
            filelocation f = new filelocation();
            a = new Scanner(new File(f.fileLocation()));
        }
        catch(Exception e) {
            System.out.println("Could not find file");
        }
    }

   
    public void readFile (){
               
        while(a.hasNext()){
            x = a.next();
            y = a.next();
            z = a.next();
            
           //Gör om Hexadecimal till decimal tal
            hexaToDecimal();   
           
            //Kontroll av z och y
            //Decimal ska delas med 1,2,4 och 8 beroende på c.
            zInt = Integer.parseInt(z);
            xInt = Integer.parseInt(x);
            xValidation();
            zValidation();
            yValidation();
                        
            System.out.printf( "%s %s %s\n", x,y,z);
        }
    }
    public void closeFile(){
        a.close();
    }
    
    //FUNKTIONER
    public int hexaToDecimal() {
         //Gör om Hexadecimal till decimal tal
            String hexNumber = y;
            yIntDeciform = Integer.parseInt(hexNumber, 16);
            System.out.println("Hex value is " + yIntDeciform);
        return yIntDeciform;
    }
    public void xValidation(){
//      0. Läsning av data för att utföra en Load-instruktion.
//      1. Skrivning av data för att utföra en Store-instruktion.
//      2. Instruktionshämning.
//      3. Escape Record (ska ignoreras av simulatorn).
//      4. Flush Cache, som nollställer alla giltig-bitar i både instruktionscache och datacache.
        if(xInt == 0 || xInt == 1 || xInt == 2 || xInt == 3 ||xInt == 4)
            System.out.println("x OK!");
        else
            System.out.println("Big fucking error!");      
    }
    public void zValidation(){
       if(zInt == 1 ||zInt == 2 || zInt == 4 || zInt == 8)
                System.out.println("z OK!");
            else
                System.out.println("Super mega action error!");              
    }
    public void yValidation() {
        if(yIntDeciform % zInt == 0)
            System.out.println(yIntDeciform + " is a multiple of " +zInt);
        else
            System.out.println(yIntDeciform + " is a not multiple of " + zInt);
    }
}

