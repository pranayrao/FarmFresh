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

import com.farmfresh.business.OrderBO;
import com.farmfresh.business.ShippingBO;
import com.farmfresh.connect.OracleConnection;
import com.farmfresh.dao.OracleDataDAO;

/**
 * Servlet implementation class ShipmentServlet
 */
@WebServlet("/ShipmentServlet")
public class ShipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShipmentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String shipmentId = request.getParameter("shipmentID");

		OracleConnection oracleConnection = new OracleConnection();
		Connection connection = oracleConnection.returnConnection();

		OracleDataDAO oracleDataDAO = new OracleDataDAO();
		List<ShippingBO> shipmentBOList = oracleDataDAO.returnShippingValues(connection, shipmentId);

		RequestDispatcher requestDispatcher = null;
		if(shipmentBOList.size()>0){
			request.getSession().setAttribute("shippingValues", shipmentBOList);
			requestDispatcher = request.getRequestDispatcher("ShipmentResult.jsp");
		}
		else{
			requestDispatcher = request.getRequestDispatcher("Shipping.jsp");
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
