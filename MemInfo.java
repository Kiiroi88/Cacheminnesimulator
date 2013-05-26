/*
 * MemInfo.java
 * Written 2013 by M Koch
 * Copyright abandoned. This file is in the public domain.
 */
package testcachesim;

public class MemInfo {

	private CacheType type;
	private String hexAddress;
	private int decAddress;
	private String size;
	private Long timestamp;
	private int usageCounter;
	private int programCounter;
	private String type2;

	public MemInfo(CacheType type, String type2, String hexAddress, int decAddress, String size) {
		this.type = type;
		this.type2 = type2;
		this.hexAddress = hexAddress;
		this.decAddress = decAddress;
		this.size = size;
		this.timestamp = (long) 0;
		this.usageCounter = 0;
		this.programCounter = 0;

	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public CacheType getType() {
		return type;
	}

	public String getHexAddress() {
		return hexAddress;
	}

	public int getDecAddress() {
		return decAddress;
	}

	public String getSize() {
		return size;
	}

	public int getUsageCounter() {
		return usageCounter;
	}

	public void setUsageCounter(int counter) {
		this.usageCounter = counter;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getAdress() {
		return hexAddress;
	}
	public void incUsageCounter() {
		usageCounter++;
	}
	public void setProgramCounter(int programCounter) {
		this.programCounter = programCounter;
	}
	public int getProgramCounter() {
		return programCounter;
	}
}
