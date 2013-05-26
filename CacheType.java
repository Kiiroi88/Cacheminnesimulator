/*
 * CacheType.java
 * Written 2013 by M Koch
 * Copyright abandoned. This file is in the public domain.
 */
package testcachesim;

public enum CacheType {
		ICACHE, DCACHE, BOTH, IGNORE

	// 0. Läsning av data för att utföra en Load-instruktion.
	// 1. Skrivning av data för att utföra en Store-instruktion.
	// 2. Instruktionshämning.
	// 3. Escape Record (ska ignoreras av simulatorn).
	// 4. Flush Cache, som nollställer alla giltig-bitar i både
	// instruktionscache och datacache.

}
