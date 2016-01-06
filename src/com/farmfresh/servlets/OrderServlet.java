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
import com.farmfresh.business.OrderBO;
import com.farmfresh.connect.OracleConnection;
import com.farmfresh.dao.OracleDataDAO;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String orderId = request.getParameter("orderId");
		
		OracleConnection oracleConnection = new OracleConnection();
		Connection connection = oracleConnection.returnConnection();
		
		OracleDataDAO oracleDataDAO = new OracleDataDAO();
		List<OrderBO> orderBOList = oracleDataDAO.returnOrderValues(connection, orderId);
		
		RequestDispatcher requestDispatcher = null;
		if(orderBOList.size()>0){
			request.getSession().setAttribute("orderValues", orderBOList);
			requestDispatcher = request.getRequestDispatcher("OrderResult.jsp");
		}
		else{
			requestDispatcher = request.getRequestDispatcher("Order.jsp");
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
