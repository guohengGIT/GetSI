package hpe.web.servlet;

import hpe.bean.ComputerIformation;
import hpe.service.GetComputerService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "getComputerServlet", urlPatterns = { "/getComputerServlet" })
public class GetComputerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetComputerServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetComputerService gService = new GetComputerService();
		ComputerIformation cIformation = new ComputerIformation();
		cIformation = gService.property();
		request.setAttribute("cIformation", cIformation);
		request.getRequestDispatcher("getComputerInformation.jsp").forward(request, response);
	}

}
