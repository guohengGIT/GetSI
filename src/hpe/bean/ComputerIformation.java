package hpe.bean;

public class ComputerIformation {
	private String userName;
	private String computerName;
	private String userDomain;
	private String hostip;
	private long jvmtotalMemory;
	private long jvmfreeMemory;
	private String javaversion;
	private String osname;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getUserDomain() {
		return userDomain;
	}
	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}
	public long getJvmtotalMemory() {
		return jvmtotalMemory;
	}
	public void setJvmtotalMemory(long jvmtotalMemory) {
		this.jvmtotalMemory = jvmtotalMemory;
	}
	public long getJvmfreeMemory() {
		return jvmfreeMemory;
	}
	public void setJvmfreeMemory(long jvmfreeMemory) {
		this.jvmfreeMemory = jvmfreeMemory;
	}
	public String getJavaversion() {
		return javaversion;
	}
	public void setJavaversion(String javaversion) {
		this.javaversion = javaversion;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getHostip() {
		return hostip;
	}
	public void setHostip(String hostip) {
		this.hostip = hostip;
	}
	
}
