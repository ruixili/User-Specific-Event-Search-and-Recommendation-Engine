package rpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VisitHistory
 */
@WebServlet("/visithistory")
public class VisitHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// allow access only if session exists
    	HttpSession session = request.getSession(false);
		if (session == null) {
			response.setStatus(403);
			return;
		}
		String userId=session.getAttribute("user_id").toString();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// allow access only if session exists
    	HttpSession session = request.getSession(false);
		if (session == null) {
			response.setStatus(403);
			return;
		}
		String userId=session.getAttribute("user_id").toString();
	}

}
