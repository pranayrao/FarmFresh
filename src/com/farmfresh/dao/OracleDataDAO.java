package com.farmfresh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.farmfresh.business.CustomerBO;
import com.farmfresh.business.FarmerBO;
import com.farmfresh.business.InvoiceBO;
import com.farmfresh.business.LineItemBO;
import com.farmfresh.business.OrderBO;
import com.farmfresh.business.PaymentBO;
import com.farmfresh.business.ShippingBO;

public class OracleDataDAO {


	public List<LineItemBO> returnLineItemValues(Connection connection, String orderId){
		List<LineItemBO> lineItemBOList = new ArrayList<LineItemBO>();
		String sqlQuery = "select * from Order_T where Ordr_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(0, orderId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				LineItemBO lineItemBO = new LineItemBO();
				
				if(resultSet.next()){
					lineItemBO.setLineItemDescription(resultSet.getString(0));
					lineItemBO.setLineItemId(resultSet.getString(1));
					lineItemBO.setLineItemQty(resultSet.getString(2));
					lineItemBO.setLineOrderId(resultSet.getString(3));
					lineItemBOList.add(lineItemBO);
				}
			}
			return lineItemBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}

	public List<OrderBO> returnOrderValues(Connection connection, String orderId){
		List<OrderBO> orderBOList = new ArrayList<OrderBO>();
		String sqlQuery = "select * from Order_T where Ordr_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, orderId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				OrderBO orderBO = new OrderBO();
				
				if(resultSet.next()){
					System.out.println("hihello");
					orderBO.setOrderAmount(resultSet.getString(5));
					orderBO.setOrderCustomerId(resultSet.getString(6));
					orderBO.setOrderId(resultSet.getString(1));
					orderBO.setOrderDeliveryDt(resultSet.getString(2));
					orderBO.setOrderDate(resultSet.getString(3));
					orderBOList.add(orderBO);
				}
			}
			return orderBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}

	public List<ShippingBO> returnShippingValues(Connection connection, String shipmentId){
		List<ShippingBO> shippingBOList = new ArrayList<ShippingBO>();
		String sqlQuery = "select * from Shipment_T where Shipment_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, shipmentId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				ShippingBO shippingBO = new ShippingBO();
				if(resultSet.next()){
					shippingBO.setShippingDt(resultSet.getString(2));
					shippingBO.setShippingID(resultSet.getString(1));
					shippingBO.setShippingOrderId(resultSet.getString(3));
					
					shippingBOList.add(shippingBO);
				}
			}
			return shippingBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public List<CustomerBO> returnCustomerValues(Connection connection, String customerId){
		List<CustomerBO> customerBOList = new ArrayList<CustomerBO>();
		String sqlQuery = "select * from Customer_T where Cust_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, customerId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				CustomerBO customerBO = new CustomerBO();
				if(resultSet.next()){
					customerBO.setCustomerId(resultSet.getString(1));
					customerBO.setCustomerAddress(resultSet.getString(3));
					customerBO.setCustomerName(resultSet.getString(2));
					customerBO.setCustomerPhone(resultSet.getString(4));
										
					customerBOList.add(customerBO);
					System.out.println(customerBOList.toString());
				}
			}
			return customerBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}
	
	public List<FarmerBO> returnFarmerValues(Connection connection, String farmerId){
		List<FarmerBO> farmerBOList = new ArrayList<FarmerBO>();
		String sqlQuery = "select * from Farmer_T where Farmer_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, farmerId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				FarmerBO farmerBO = new FarmerBO();
				if(resultSet.next()){
					farmerBO.setFarmerId(resultSet.getString(1));
					farmerBO.setFarmerAddress(resultSet.getString(3));
					farmerBO.setFarmerName(resultSet.getString(2));
					farmerBO.setFarmerPhone(resultSet.getString(4));
					farmerBOList.add(farmerBO);
				}
			}
			return farmerBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}

	
	public boolean returnLoginResult(Connection connection, String userName, String password){

		boolean isLoginSuccessful = false;
		String sqlQuery = "select * from Login_T where user_id = ? and pass_id=?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(1, userName);
				preparedStatement.setString(2, password);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()){
					isLoginSuccessful = true;
				}
			}
			return isLoginSuccessful;
		}
		catch(Exception e){
			e.printStackTrace();
			return isLoginSuccessful;
		}

	}
	

	public List<InvoiceBO> returnInvoiceValues(Connection connection, String shipmentId){
		List<InvoiceBO> invoiceBOList = new ArrayList<InvoiceBO>();
		String sqlQuery = "select * from Invoice_T where Shipment_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(0, shipmentId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				InvoiceBO invoiceBO = new InvoiceBO();
				if(resultSet.next()){
					invoiceBO.setInvoiceBillAmt(resultSet.getString(0));
					invoiceBO.setInvoiceID(resultSet.getString(1));
					invoiceBO.setInvoiceShipmentId(resultSet.getString(2));
					invoiceBO.setInvoiceTax(resultSet.getString(3));
					invoiceBO.setInvoiceTotalAmt(resultSet.getString(4));
										
					invoiceBOList.add(invoiceBO);
				}
			}
			return invoiceBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}
	public List<PaymentBO> returnPaymentValues(Connection connection, String invoiceId){
		List<PaymentBO> paymentBOList = new ArrayList<PaymentBO>();
		String sqlQuery = "select * from Payment_T where Invoice_ID = ?";
		try{
			if(connection != null){

				//fetching values from DB
				PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
				preparedStatement.setString(0, invoiceId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				PaymentBO paymentBO = new PaymentBO();
				if(resultSet.next()){
					paymentBO.setPaymentID(resultSet.getString(0));
					paymentBO.setPaymentAmount(resultSet.getString(1));
					paymentBO.setPaymentInvoiceId(resultSet.getString(2));
					paymentBO.setPaymentTransDate(resultSet.getString(3));
					paymentBO.setPaymentMode(resultSet.getString(4));
										
					paymentBOList.add(paymentBO);
				}
			}
			return paymentBOList;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}
}
