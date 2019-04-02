<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
<STYLE>
.cla1 {
FONT-SIZE: 12px; COLOR: #4b4b4b; LINE-HEIGHT: 18px; TEXT-DECORATION: none
}
.login_msg{
	font-family:serif;
}
.login_msg .msg{
	background-color: #acf;
	font-family: 微软雅黑;
}
.login_msg .btn{
	background-color: #9be;
	width: 73px;
	font-size: 18px;
	font-family: 微软雅黑;
}
.register_title{
	font-size: 32px;
	font-family: 微软雅黑;
	color:#02d;
}
.login_msg_field{
	font-family: 微软雅黑;
}
</STYLE>

<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>
<META content="MSHTML 6.00.2600.0" name=GENERATOR></HEAD>
<BODY leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"  background="${pageContext.request.contextPath}/images/bgss.jpg">
<div ALIGN="center">
	<table border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1">
		<tr>
			<td height="93"></td>
			<td></td>
		</tr>
		<tr>
			<td><img style="border-radius: 25%; alt="crm" src="${pageContext.request.contextPath}/images/rigdht.png" width="530" height="412"></td>
			<td class="login_msg" width="400">
			
			
				<s:form cssClass="login_msg_field" namespace="/" action="emp_regist" method="post" >
				<s:fielderror cssStyle="color:red"></s:fielderror>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="register_title" style="font-weight: bolder; color: black; font-size: 40px;">新用户注册</span><br/><br/>
					用&nbsp;&nbsp;户&nbsp;&nbsp;名：<s:textfield cssClass="msg" name="loginName" id="loginName" onblur="a()"></s:textfield>
					<font color="red" id="f"></font>
					<br/>
					密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<s:password cssClass="msg" name="loginPwd"></s:password><br/>
					姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<s:textfield name="empName" cssClass="msg"></s:textfield><br/>
					性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：<s:select list="{'男','女','妖'}" name="esex"></s:select><br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input style="border-radius: 5px; background-color: black; color: white;" class="btn" type="submit" value=" 注册 "/>
					
					<input style="border-radius: 5px; background-color: black; color: white;" class="btn" type="button" value=" 取消 " onclick="javascript:history.go(-1)"/>
				</s:form>
			</td>
		</tr>
	</table>
</div>
</BODY>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function a(){
var loginName=$("#loginName").val();
//alert(loginName);
//使用ajax发送请求
$.post("emp_yan.action",{'loginName':loginName},roll);
function roll(d){
   //判断后台发过来的数据
   if(d==1){
      $("#f").html("用户名已存在!").css("color","red");
   }else{
   $("#f").html("用户名可以注册!").css("color","green");
   }
}
}
</script>
</HTML>