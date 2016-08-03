package hpe.service;

import hpe.bean.FileInformation;

import java.util.ArrayList;
import java.util.List;

import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Sigar;

public class GetFileService {
	@SuppressWarnings("unused")
	public List<FileInformation> file() throws Exception {  
        Sigar sigar = new Sigar();  
        FileSystem fslist[] = sigar.getFileSystemList(); 
        List<FileInformation> list = new ArrayList<FileInformation>();
        for (int i = 0; i < fslist.length; i++) {  
            FileSystem fs = fslist[i];  
            FileInformation fInformation = new FileInformation();
            fInformation.setDevName(fs.getDevName());
            fInformation.setDevFlag(fs.getFlags());
            fInformation.setDevSysTypeName(fs.getSysTypeName());
            fInformation.setDevType(fs.getTypeName());
            switch (fs.getType()) {  
                case 0: // TYPE_UNKNOWN ：未知  
                    break;  
                case 1: // TYPE_NONE  
                    break;  
                case 2: // TYPE_LOCAL_DISK : 本地硬盘  
                    FileSystemUsage usage = sigar.getFileSystemUsage(fs.getDirName());  
                    fInformation.setDevTotalSpace(usage.getTotal());
                    fInformation.setDevFreeSpace(usage.getFree());
                    fInformation.setVevUsedSpace(usage.getUsed());
                    double usePercent = usage.getUsePercent() * 100D;
                    fInformation.setDevUsePercent(usePercent);
                    list.add(fInformation);
//                    System.out.println(fs.getDevName() + "总大小:    " + usage.getTotal() + "KB");  
//                    System.out.println(fs.getDevName() + "剩余大小:    " + usage.getFree() + "KB");  
//                    System.out.println(fs.getDevName() + "已经使用量:    " + usage.getUsed() + "KB");  
//                    double usePercent = usage.getUsePercent() * 100D;  
//                    System.out.println(fs.getDevName() + "资源的利用率:    " + usePercent + "%");  
                    break;  
                case 3:// TYPE_NETWORK ：网络  
                    break;  
                case 4:// TYPE_RAM_DISK ：闪存  
                    break;  
                case 5:// TYPE_CDROM ：光驱  
                    break;  
                case 6:// TYPE_SWAP ：页面交换  
                    break;  
            }  
  
        }  
        return list;  
    }  
}
