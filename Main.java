/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
