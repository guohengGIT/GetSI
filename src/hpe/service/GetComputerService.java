package hpe.service;

import hpe.bean.ComputerIformation;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;

public class GetComputerService {
//	@SuppressWarnings("unused")
	public ComputerIformation property() throws UnknownHostException {  
        Runtime r = Runtime.getRuntime();  
        Properties props = System.getProperties();  
        InetAddress addr;  
        addr = InetAddress.getLocalHost();  
         
        Map<String, String> map = System.getenv();  
        
        String userName = map.get("USERNAME");// 获取用户名  
        String computerName = map.get("COMPUTERNAME");// 获取计算机名  
        String userDomain = map.get("USERDOMAIN");// 获取计算机域名  
        String ip = addr.getHostAddress(); 
        long jvmTotalMemory = r.totalMemory()/1024;
        long jvmFreeMemory = r.freeMemory()/1024;
        String jvmVersion = props.getProperty("java.version");
        String osName = props.getProperty("os.name");
        ComputerIformation cIformation = new ComputerIformation();
        cIformation.setUserName(userName);
        cIformation.setComputerName(computerName);
        cIformation.setUserDomain(userDomain);
        cIformation.setHostip(ip);
        cIformation.setJvmtotalMemory(jvmTotalMemory);
        cIformation.setJvmfreeMemory(jvmFreeMemory);
        cIformation.setJavaversion(jvmVersion);
        cIformation.setOsname(osName);
        
        return cIformation;
    }
}
