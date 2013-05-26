/*
 * CacheSimulator.java
 * Written 2013 by M Koch
 * Copyright abandoned. This file is in the public domain.
 */
package testcachesim;

import java.util.ArrayList;
import java.util.HashMap;

public class CacheSimulator {
	private HashMap<String, MemInfo> iCacheMinne;
	private HashMap<String, MemInfo> dCacheMinne;

	public CacheSimulator() {
		// TODO Auto-generated constructor stub
	}

	public void simulateFull(ArrayList<MemInfo> workList) {

		iCacheMinne = new HashMap<>();
		dCacheMinne = new HashMap<>();

		for (MemInfo memInfo : workList) {
			CacheType type = memInfo.getType();

			switch (type) {
			case DCACHE:
				simulateDCache(memInfo);
				break;
			case ICACHE:
				simulateICache(memInfo);
				break;
			case IGNORE:

				break;
			case BOTH:

				break;

			default:
				System.out.println("Unknown Cache Type!");
				break;
			}

		}

	}

	private void simulateICache(MemInfo memInfo) {
		String hexAddress = memInfo.getHexAddress();
		if (iCacheMinne.containsKey(hexAddress)) {
			System.out.println("HIT!");
		} else {
			System.out.println("MISS!");
			if (iCacheMinne.size() < 10) {
				memInfo.incUsageCounter();
				iCacheMinne.put(hexAddress, memInfo);
			} else {

			}
		}

	}

	private void simulateDCache(MemInfo memInfo) {
		String hexAddress = memInfo.getHexAddress();
		if (dCacheMinne.containsKey(hexAddress)) {
			System.out.println("HIT!");
		} else {
			System.out.println("MISS!");
			if (dCacheMinne.size() < 10) {
				memInfo.incUsageCounter();
				dCacheMinne.put(hexAddress, memInfo);

			}
		}
	}

}
