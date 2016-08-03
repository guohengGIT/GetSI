package hpe.service;

import hpe.bean.CPUIformation;

import java.util.ArrayList;
import java.util.List;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class GetCPUIService {
//	 @SuppressWarnings("unused")
	public List<CPUIformation> cpu() throws SigarException {  
		 Sigar sigar = new Sigar();  
//		 System.out.println("before this");
	        CpuInfo infos[] = sigar.getCpuInfoList();
//	        System.out.println("after this");
	        CpuPerc cpuList[] = null;  
	        cpuList = sigar.getCpuPercList(); 
			List<CPUIformation> list = new ArrayList<>();
	        for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用  
	        	CPUIformation cpuIformation = new CPUIformation();
	            CpuInfo info = infos[i];  
	            cpuIformation.setCpuMHz(info.getMhz());
	            cpuIformation.setCpuVendor(info.getVendor());
	            cpuIformation.setCpuModel(info.getModel());
	            cpuIformation.setCpuCacheSize(info.getCacheSize());
	            cpuIformation.setCpuUser(CpuPerc.format(cpuList[i].getUser()));
	            cpuIformation.setCpuSys(CpuPerc.format(cpuList[i].getSys()));
	            cpuIformation.setCpuWait(CpuPerc.format(cpuList[i].getWait()));
	            cpuIformation.setCpuNice(CpuPerc.format(cpuList[i].getNice()));
	            cpuIformation.setCpuIdle(CpuPerc.format(cpuList[i].getIdle()));
	            cpuIformation.setCpuCombined(CpuPerc.format(cpuList[i].getCombined()));
	            list.add(cpuIformation);
	        }
//	        System.out.println("service");
	        
	        return list;
	        
	}      
}
