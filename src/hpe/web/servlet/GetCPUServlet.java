package hpe.web.servlet;

import hpe.bean.CPUIformation;
import hpe.service.GetCPUIService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hyperic.sigar.SigarException;


@WebServlet(name = "getCPUServlet", urlPatterns = { "/getCPUServlet" })
public class GetCPUServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetCPUServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetCPUIService getcpui = new GetCPUIService();
		List<CPUIformation> list = new ArrayList<CPUIformation>();
		try {
			list = getcpui.cpu();
//			System.out.println("get");
			request.setAttribute("list", list);
//			System.out.println("after");
			request.getRequestDispatcher("getCPUInformation.jsp").forward(request, response);
		} catch (SigarException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
