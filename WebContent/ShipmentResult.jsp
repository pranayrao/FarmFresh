<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping Result</title>
<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.imagetable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}
table.imagetable th {
	background:#b5cfd2 url('cell-green.jpg');
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
table.imagetable td {
	background:#dcddc0 url('cell-grey.jpg');
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
</style>

</head>
<body>

<table border=1 class="imagetable" >
<th>Shipment ID</th>
<th>Shipment Date</th>
<th>Order ID</th>


<tr>
<td>${shippingValues[0].shippingID}</td>
<td>${shippingValues[0].shippingDt}</td>
<td>${shippingValues[0].shippingOrderId}</td>
</tr>


</table>
</body>
</html>