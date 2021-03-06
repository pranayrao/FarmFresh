package com.farmfresh.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farmfresh.business.CustomerBO;
import com.farmfresh.connect.OracleConnection;
import com.farmfresh.dao.OracleDataDAO;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Fetching username and password;
		
				String customerId = request.getParameter("CustID");
				
				OracleConnection oracleConnection = new OracleConnection();
				Connection connection = oracleConnection.returnConnection();
				
				OracleDataDAO oracleDataDAO = new OracleDataDAO();
				List<CustomerBO> customerBOList = oracleDataDAO.returnCustomerValues(connection, customerId);
				
				RequestDispatcher requestDispatcher = null;
				if(customerBOList.size()>0){
					request.getSession().setAttribute("customerValues", customerBOList);
					requestDispatcher = request.getRequestDispatcher("CustomerResult.jsp");
				}
				else{
					requestDispatcher = request.getRequestDispatcher("Customer.jsp");
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
