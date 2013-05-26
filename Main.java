/*
 * Main.java
 * Written 2013 by M Koch
 * Copyright abandoned. This file is in the public domain.
 */
package testcachesim;

import java.util.ArrayList;

/**
 * 
 * @author Magnus
 */
public class Main {
	public static void main(String[] args) {
		ReadFileL n = new ReadFileL();
		try {
			ArrayList<MemInfo> ret = n.readFileL();
			
			for (MemInfo m : ret) {
				System.out.println(m.getAdress());
				
			}
			
			CacheSimulator sim = new CacheSimulator();
			sim.simulateFull(ret);
		} catch (CouldNotReadLinesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
