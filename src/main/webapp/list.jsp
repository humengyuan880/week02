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
	<tr>
		<td colspan="10">
			<form action="list" method="post">
				关键字：<input type="text" name="czi"> 描述<input type="text"
					name="cmiaos"> 公司名称：<input type="text" name="cname"><br>
				地址：<input type="text" name="cadd"> 主营产品：<input type="text"
					name="cshangp"> 注册资本：<input type="text" name="begina">
				至<input type="text" name="enda"> 成立时间：<input type="text"
					name="start"> 至<input type="text" name="end"> <input
					type="submit" value="查询">
			</form>
		</td>
	</tr>

	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本(万元)</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pp.list}" var="a">
			<tr>
				<td>${a.cid}</td>
				<td>${a.czi}</td>
				<td>${a.cmiaos}</td>
				<td>${a.cname}</td>
				<td>${a.cshangp}</td>
				<td>${a.cadd}</td>
				<td>${a.czhuc}</td>
				<td>${a.ctime}</td>
				<td>${a.yaertime}</td>
				<td>${a.ctai}</td>
				<td>${a.cbeiz}</td>
				<td><a href="showlook?cid=${a.cid}"><input type="button"
						value="年检审核"></a></td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan="10"><a href="?pageNum=${pp.prePage}"> <<< </a> <c:forEach
					begin="1" end="${pp.pages}" step="1" var="p">
					<a href="?pageNum=${p}">${p}</a>
				</c:forEach> <a href="list?pageNum=${pp.nextPage}"> >>> </a></td>
		</tr>
	</table>

</body>
</html>