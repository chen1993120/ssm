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
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	//验证用户名
	function checkName(){
		var name=$("[name='name']").val();
		if(name.length==0){
			alert("姓名不能为空");
			return false;
		}
		return true;
	}

	//验证性别
	function checkGender(){
		var gender=$("[name='gender'] option:selected").val();
		if(gender==-1){
			alert("请选择性别");
			return false;
		}
		return true;
	};
	
	//验证年龄
	function checkAge(){
		var age=$("[name='age']").val();
		if(age.length==0){
			alert("年龄不能为空");
			return false;
		}
		return true;
	};
	
	//验证等级
	function checkRank(){
		var rank=$("[name='rank'] option:selected").val();
		if(rank==-1){
			alert("请选择等级");
			return false;
		}
		return true;
	}
	
	//验证部门
	function checkBuMen(){
		var bumen=$("[name='department'] option:selected").val();
		if(bumen==-1){
			alert("请选择部门");
			return false;
		}
		return true;
	}
	$(function(){
		$("tr :odd").css("background-color","red");
		
		
		
		$("#myform").submit(function(){
			if(checkName() && checkGender() && checkAge() && checkRank() && checkBuMen()){
				return true;
			} 
			return false;
		});
	})
</script>
</head>
<body>
	<form action="user/add" method="post" id="myform">
	<table cellpadding="0" cellspacing="0" border="1" width="50%">
		<tr><td colspan="2" style="text-align: center;">添加人员</td></tr>
		<tr>
			<td>姓名:</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>性别:</td>
			<td>
				<select name="gender">
					<option value="-1" selected="selected">请选择</option>
					<option value="0">女</option>
					<option value="1">男</option>
				</select>*
			</td>
		</tr>
		<tr>
			<td>年龄:</td>
			<td><input type="text" name="age"/></td>
		</tr>
		<tr>
			<td>等级:</td>
			<td>
				<select name="rank">
					<option value="-1">请选择</option>
					<option value="1">1级</option>
					<option value="2">2级</option>
					<option value="3">3级</option>
					<option value="4">4级</option>
					<option value="5">5级</option>
				</select>*
			</td>
		</tr>
		<tr>
			<td>部门:</td>
			<td>
				<select name="department">
					<option value="-1">请选择</option>
					<option value="研发部">研发部</option>
					<option value="开发部">开发部</option>
					<option value="测试部">测试部</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: center;"><input type="submit" value="提交"></td>
		</tr>
	</table>
	</form>
</body>
</html>