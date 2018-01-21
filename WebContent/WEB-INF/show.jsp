<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	//获得绝对路径
	var path="${pageContext.request.contextPath}";
	$(function(){
		//隔行变色
		$("tr:odd").css("background-color","red");
		
		$("#insert").click(function(){
			window.location.href=path+"/user/add";
		});
	})
	
	//删除
	function  del(dome) {
		if(window.confirm("确定要删吗？删除后无法恢复")){
			var id=$(dome).parent().parent().find("td").first().text();
			window.location.href=path+"/user/del?id="+id;
		}
		return false;
	}
</script>
<style type="text/css">

</style>
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="o" cellspacing="0" width="50%">
		<tr><td colspan="7">人员列表</td></tr>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>等级</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="lis">
			<tr>
				<td>${lis.id }</td>
				<td>${lis.name }</td>
				<td>${lis.gender==0?"女":"男" }</td>
				<td>${lis.age }</td>
				<td>${lis.rank==1?"1级":lis.rank==2?"2级":lis.rank==3?"3级":lis.rank==4?"4级":"5级" }</td>
				<td>${lis.department }</td>
				<td><a href="javaScript:void(0);" onclick="del(this);">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<div style="width: 50%; text-align: center;"><br/><input type="button" value="添加人员" id="insert"/></div>
	<c:if test="${not empty addMsg }">
		<script type="text/javascript">alert("${addMsg}")</script>
	</c:if>
	<c:if test="${not empty delMsg }">
		<script type="text/javascript">alert("${delMsg}")</script>
	</c:if>
	<c:remove var="addMsg"/>
	<c:remove var="delMsg"/>
</body>
</html>