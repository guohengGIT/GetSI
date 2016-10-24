package hpe.web.servlet;

import hpe.bean.OSIformation;
import hpe.service.GetOSService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "getOSServlet", urlPatterns = { "/getOSServlet" })
public class GetOSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetOSServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetOSService gService = new GetOSService();
		OSIformation osIformation = gService.os();
		request.setAttribute("osIformation", osIformation);
		
		request.getRequestDispatcher("getOSInformation.jsp").forward(request, response);
		
//		System.out.println(request.getHeaderNames());
//		System.out.println(request.getUserPrincipal());
//		System.out.println(request.getLocalName());
//		System.out.println(request.getRemoteAddr());
//		System.out.println(request.getRemoteHost());
//		System.out.println(request.getRemoteUser());
//		System.out.println(request.getServerName());
//		System.out.println(request.getReader());
	
	}

}
