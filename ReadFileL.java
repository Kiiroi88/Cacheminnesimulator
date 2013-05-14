/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcachesim;

import java.io.*;
import java.util.ArrayList;

/**
 * 
 * @author Magnus
 */
public class ReadFileL {
	private ArrayList<MemInfo> arrayList = new ArrayList<>();

	public ArrayList<MemInfo> readFileL() throws CouldNotReadLinesException {

		String x;
		String y;
		String z;
		FileLocation l = new FileLocation();

		try {

			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream(l.getFileLocation());
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				String[] tokens = strLine.split("\\s+");
				x = tokens[0];
				y = tokens[1];
				if (tokens.length < 3) // if there are less then 3 words
					z = "4"; // set z(size) to 4
				else
					z = tokens[2];

				// Validating Input
				xValidation(convertX(x));
				yDivValidation(hexaToDecimal(y), zValidation(convertZ(z)));

				CacheType type = null;
				if (x.equals("0") || x.equals("1")) {
					type = CacheType.DCACHE;
				} else if (x.equals("2")) {
					type = CacheType.ICACHE;
				} else if (x.equals("3")) {
					type = CacheType.IGNORE;
				} else if (x.equals("4")) {
					type = CacheType.BOTH;
				}

				MemInfo m1 = new MemInfo(type, y, hexaToDecimal(y), z);
				arrayList.add(m1);

				System.out.printf("%s %s %s\n", x, y, z);

			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();

			throw new CouldNotReadLinesException();
		}

		return arrayList;

	}

	public void printArray() {
		for (MemInfo m : arrayList) {
			System.out.println(m.getAdress());

		}
	}

	// Validate
	private int convertX(String x) { // Converts x to Int

		int xInt = Integer.valueOf(x);
		return xInt;

	}

	private int convertZ(String z) { // Converts z to Int and if comment set to
										// 4
		if ("1".equals(z) || "2".equals(z) || "4".equals(z) || "8".equals(z)) {
			int zInt = Integer.valueOf(z);
			return zInt;
		} else {
			int zInt = 4;
			return zInt;
		}

	}

	private int hexaToDecimal(String y) { // Converts y Hexadecimal to Decimal

		int yIntDeciform = Integer.parseInt(y, 16);
		System.out.println("Hex value is " + yIntDeciform + " of " + y);
		return yIntDeciform;
	}

	private void xValidation(int xInt) {
		// 0. Läsning av data för att utföra en Load-instruktion.
		// 1. Skrivning av data för att utföra en Store-instruktion.
		// 2. Instruktionshämning.
		// 3. Escape Record (ska ignoreras av simulatorn).
		// 4. Flush Cache, som nollställer alla giltig-bitar i både
		// instruktionscache och datacache.
		if (xInt == 0 || xInt == 1 || xInt == 2 || xInt == 3 || xInt == 4)
			System.out.println("x OK!");
		else
			System.err.println("Big fucking error!");
	}

	private int zValidation(int zInt) { // Validates that Z actually is the
										// correct number
		if (1 == zInt || 2 == zInt || 4 == zInt || 8 == zInt) {

			System.out.println("z OK!");
			return zInt;
		} else {
			System.out.println("Super mega action error!");
			throw new RuntimeException();
		}

	}

	private void yDivValidation(int yIntDeciform, int zInt) { // Validates that
																// y is
																// divisible by
																// z
		if (yIntDeciform % zInt == 0)
			System.out.println(yIntDeciform + " is a multiple of " + zInt);

		else {
			System.out.println(yIntDeciform + " hkfwehjkis a not multiple of "
					+ zInt + " hex ");
			throw new RuntimeException();
		}

	}
}
