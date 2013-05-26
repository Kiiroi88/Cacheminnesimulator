/*
 * CacheType.java
 * Written 2013 by M Koch
 * Copyright abandoned. This file is in the public domain.
 */
package testcachesim;

public enum CacheType {
		ICACHE, DCACHE, BOTH, IGNORE

	// 0. L�sning av data f�r att utf�ra en Load-instruktion.
	// 1. Skrivning av data f�r att utf�ra en Store-instruktion.
	// 2. Instruktionsh�mning.
	// 3. Escape Record (ska ignoreras av simulatorn).
	// 4. Flush Cache, som nollst�ller alla giltig-bitar i b�de
	// instruktionscache och datacache.

}
