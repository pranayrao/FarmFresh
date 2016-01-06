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
import com.farmfresh.business.FarmerBO;
import com.farmfresh.connect.OracleConnection;
import com.farmfresh.dao.OracleDataDAO;

/**
 * Servlet implementation class FarmerServlet
 */
@WebServlet("/FarmerServlet")
public class FarmerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String farmerID = request.getParameter("farmerID");
		
		OracleConnection oracleConnection = new OracleConnection();
		Connection connection = oracleConnection.returnConnection();
		
		OracleDataDAO oracleDataDAO = new OracleDataDAO();
		List<FarmerBO> farmerBOList = oracleDataDAO.returnFarmerValues(connection, farmerID);
		
		RequestDispatcher requestDispatcher = null;
		if(farmerBOList.size()>0){
			request.getSession().setAttribute("farmerValues", farmerBOList);
			requestDispatcher = request.getRequestDispatcher("FarmerResult.jsp");
		}
		else{
			requestDispatcher = request.getRequestDispatcher("Farmer.jsp");
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
