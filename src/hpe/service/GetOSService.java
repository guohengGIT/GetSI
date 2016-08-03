package hpe.service;

import hpe.bean.OSIformation;

import org.hyperic.sigar.OperatingSystem;

public class GetOSService {
	public OSIformation os() {  
        OperatingSystem OS = OperatingSystem.getInstance();  
        // 操作系统内核类型如： 386、486、586等x86  
        OSIformation osIformation = new OSIformation();
        osIformation.setOsArch(OS.getArch());
        osIformation.setOsCpuEndian(OS.getCpuEndian());
        osIformation.setOsDataModel(OS.getDataModel());
        osIformation.setOsDescription(OS.getDescription());
        osIformation.setOsVendor(OS.getVendor());
        osIformation.setOsVendorCodeName(OS.getVendorCodeName());
        osIformation.setOsVendorName(OS.getVendorName());
        osIformation.setOsVendorVersion(OS.getVendorVersion());
        osIformation.setOsVersion(OS.getVersion());
        return osIformation;
    } 
}
