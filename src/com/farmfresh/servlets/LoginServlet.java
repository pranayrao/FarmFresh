package com.farmfresh.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmfresh.connect.OracleConnection;
import com.farmfresh.dao.OracleDataDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//Fetching username and password;
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		OracleConnection oracleConnection = new OracleConnection();
		Connection connection = oracleConnection.returnConnection();
		
		OracleDataDAO oracleDataDAO = new OracleDataDAO();
		boolean loginResult = oracleDataDAO.returnLoginResult(connection, userName, password);
		
		Boolean session = (Boolean)request.getSession().getAttribute("session");
		
		RequestDispatcher requestDispatcher = null;
		if(loginResult && session){
			requestDispatcher = request.getRequestDispatcher("main.jsp");
			request.getSession().setAttribute("session", true);
		}
		else{
			requestDispatcher = request.getRequestDispatcher("login.jsp");
		}
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
