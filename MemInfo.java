package testcachesim;

public class MemInfo {

	private CacheType type;
	private String hexAddress;
	private int decAddress;
	private String size;
	private Long timestamp;
	private int usageCounter;
	private int programCounter;

	public MemInfo(CacheType type, String hexAddress, int decAddress, String size) {
		this.type = type;
		this.hexAddress = hexAddress;
		this.decAddress = decAddress;
		this.size = size;
		this.timestamp = (long) 0;
		this.usageCounter = 0;
		this.programCounter = 0;

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
