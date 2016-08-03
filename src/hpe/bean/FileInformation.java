package hpe.bean;

public class FileInformation {
	private String devName;
	private long devFlag;
	private String devSysTypeName;
	private String devType;
	private long devTotalSpace;
	private long devFreeSpace;
	private long vevUsedSpace;
	private double devUsePercent;
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	
	public long getDevFlag() {
		return devFlag;
	}
	public void setDevFlag(long devFlag) {
		this.devFlag = devFlag;
	}
	public String getDevSysTypeName() {
		return devSysTypeName;
	}
	public void setDevSysTypeName(String devSysTypeName) {
		this.devSysTypeName = devSysTypeName;
	}
	public String getDevType() {
		return devType;
	}
	public void setDevType(String devType) {
		this.devType = devType;
	}
	public long getDevTotalSpace() {
		return devTotalSpace;
	}
	public void setDevTotalSpace(long devTotalSpace) {
		this.devTotalSpace = devTotalSpace;
	}
	public long getDevFreeSpace() {
		return devFreeSpace;
	}
	public void setDevFreeSpace(long devFreeSpace) {
		this.devFreeSpace = devFreeSpace;
	}
	public long getVevUsedSpace() {
		return vevUsedSpace;
	}
	public void setVevUsedSpace(long vevUsedSpace) {
		this.vevUsedSpace = vevUsedSpace;
	}
	public double getDevUsePercent() {
		return devUsePercent;
	}
	public void setDevUsePercent(double devUsePercent) {
		this.devUsePercent = devUsePercent;
	}
	
}
