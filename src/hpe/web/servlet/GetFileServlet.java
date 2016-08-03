package hpe.web.servlet;

import hpe.bean.FileInformation;
import hpe.service.GetFileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "getFileServlet", urlPatterns = { "/getFileServlet" })
public class GetFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetFileServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetFileService gService = new GetFileService();
		List<FileInformation> list = new ArrayList<FileInformation>();
		try {
			list = gService.file();
			request.setAttribute("list", list);
			request.getRequestDispatcher("getFileInformation.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
