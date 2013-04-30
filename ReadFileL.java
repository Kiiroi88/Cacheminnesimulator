/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcachesim;
import java.io.*;
/**
 *
 * @author Magnus
 */
public class ReadFileL {
    
private String x;
private String y;
private String z;
private int zInt;
private int xInt;
private int yIntDeciform;

    public void readFileL() {
        try{
            filelocation l = new filelocation();
  // Open the file that is the first 
  // command line parameter
            FileInputStream fstream = new FileInputStream(l.fileLocation());
  // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
  //Read File Line By Line
                 while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
                    String [] tokens = strLine.split("\\s+");
                    x = tokens[0];
                    y = tokens[1];
                    if (tokens.length < 3)  //if there are less then 3 words 
                        z = "4";            // set z(size) to 4 
                    else
                        z = tokens[2];      
                        
                
                    
                    //Gör om Hexadecimal till decimal tal
                     hexaToDecimal();   
           
                    //Kontroll av z och y
                    //Decimal ska delas med 1,2,4 och 8 beroende på c.
                    
                     xInt = Integer.valueOf(x);
                    
                    xValidation();
                    zValidation();
                    
                    yDivValidation();
                        
                                     
                   System.out.printf( "%s %s %s\n", x, y, z);
               
                 }
  //Close the input stream
                 in.close();
            }
                 catch (Exception e){//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                    e.printStackTrace();
                }
  }
     //FUNKTIONER
    private int hexaToDecimal() {
         //Gör om Hexadecimal till decimal tal
            String hexNumber = y;
            yIntDeciform = Integer.parseInt(hexNumber, 16);
            System.out.println("Hex value is " + yIntDeciform);
        return yIntDeciform;
    }
    private void xValidation(){
//      0. Läsning av data för att utföra en Load-instruktion.
//      1. Skrivning av data för att utföra en Store-instruktion.
//      2. Instruktionshämning.
//      3. Escape Record (ska ignoreras av simulatorn).
//      4. Flush Cache, som nollställer alla giltig-bitar i både instruktionscache och datacache.
        if(xInt == 0 || xInt == 1 || xInt == 2 || xInt == 3 ||xInt == 4)
            System.out.println("x OK!");
        else
            System.err.println("Big fucking error!");      
    }
    private void zValidation(){
       if("1".equals(z) ||"2".equals(z) || "4".equals(z) || "8".equals(z)){
           zInt = Integer.valueOf(z);     
           System.out.println("z OK!");
       }
       else
           System.err.println("Super mega action error!");              
    }
  
    private void yDivValidation() {
        if(yIntDeciform % zInt == 0)
            System.out.println(yIntDeciform + " is a multiple of " +zInt);
        
        else {
            System.out.println(yIntDeciform + " hkfwehjkis a not multiple of " + zInt + " hex " + y);
        throw new RuntimeException();
        }
                    
    }
}
