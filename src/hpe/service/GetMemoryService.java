package hpe.service;

import hpe.bean.MemoryIformation;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;

public class GetMemoryService {
	public MemoryIformation memory() throws SigarException {  
        Sigar sigar = new Sigar();  
        Mem mem = sigar.getMem();  
//        // 内存总量  
//        System.out.println("内存总量:    " + mem.getTotal() / 1024L + "K av");  
//        // 当前内存使用量  
//        System.out.println("当前内存使用量:    " + mem.getUsed() / 1024L + "K used");  
//        // 当前内存剩余量  
//        System.out.println("当前内存剩余量:    " + mem.getFree() / 1024L + "K free");  
        long total = mem.getTotal() / 1024L ;
        long used = mem.getUsed() / 1024L ;
        long free = mem.getFree() / 1024L ;
        MemoryIformation memoryIformation = new MemoryIformation();
        memoryIformation.setMemoryTotal(total);
        memoryIformation.setMemoryUsed(used);
        memoryIformation.setMemoryFree(free);
        Swap swap = sigar.getSwap();
        long exchange_area_total = swap.getTotal() / 1024L;
        long exchange_area_used = swap.getUsed() / 1024L;
        long exchange_area_free = swap.getFree() / 1024L;
        memoryIformation.setExchange_area_total(exchange_area_total);
        memoryIformation.setExchange_area_used(exchange_area_used);
        memoryIformation.setExchange_area_free(exchange_area_free);
        return memoryIformation;
    }  
}
