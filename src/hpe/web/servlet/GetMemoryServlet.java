package hpe.web.servlet;

import hpe.bean.MemoryIformation;
import hpe.service.GetMemoryService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hyperic.sigar.SigarException;

@WebServlet(name = "getMemoryServlet", urlPatterns = { "/getMemoryServlet" })
public class GetMemoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetMemoryServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetMemoryService getmemory = new GetMemoryService();
		MemoryIformation memory = new MemoryIformation();
		try {
			memory = getmemory.memory();
			request.setAttribute("memory", memory);
			request.getRequestDispatcher("getMemoryIformation.jsp").forward(request, response);
		} catch (SigarException e) {
			e.printStackTrace();
		}
	}

}
