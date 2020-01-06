<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="upd" method="post"></form>
	编号
	<input type="text" name="cid" value="Columnl.cid">
	<br> 关键字
	<input type="text" name="czi" value="Columnl.czi">
	<br> 描述
	<input type="text" name="cmiaos" value="Columnl.cmiaos">
	<br> 公司名称
	<input type="text" name="cname" value="Columnl.cname">
	<br> 主营产品
	<input type="text" name="cshangp" value="Columnl.cshangp">
	<br> 地址
	<input type="text" name="cadd" value="Columnl.cadd">
	<br> 注册资本
	<input type="text" name="czhuc" value="Columnl.czhuc">
	<br> 成立时间
	<input type="text" name="ctime" value="Columnl.ctime">
	<br> 年检日期
	<input type="text" name="yaertime" value="Columnl.yaertime">
	<br> 年检状态
	<input type="text" name="ctai" value="Columnl.ctai">
	<br> 备注
	<input type="text" name="cbeiz" value="Columnl.cbeiz">
	<br>

	<input type="submit" value="审核通过">
</body>
</html>