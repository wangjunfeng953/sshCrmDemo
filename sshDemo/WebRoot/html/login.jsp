<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
}
.login_msg .btn{
	background-color: #9be;
	width: 73px;
	font-size: 18px;
	font-family: 微软雅黑;
}
</STYLE>

<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>
<META content="MSHTML 6.00.2600.0" name=GENERATOR></HEAD>
<BODY leftMargin=0 topMargin=0 marginwidth="0" marginheight="0" background="${pageContext.request.contextPath}/images/bgss.jpg">
<div ALIGN="center">
	<table  border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1">
		<tr>
			<td height="93"></td>
			<td></td>
		</tr>
		<tr>
			<td><img style="border-radius: 25%; alt="crm" src="${pageContext.request.contextPath}/images/rigdht.png"  width="530" height="412"></td>
			<td class="login_msg" width="400" style="border: 5px solid black; border-radius:25%;">
				<font color="red"><s:actionerror/></font>
				<font color="red"><s:fielderror></s:fielderror></font>
				<s:form action="emp_login.action" method="post" theme="simple" style="border:5px;">
				<font color="red" id="f"></font>
				<s:div style="border-radius: 105px 105px 0 0; background-color: black; position: relative; height: 120px; width: 400px; top: -50px;"  >
				<br/><br/><br/><br/><br/>
				<p align="center" style="font-weight: bolder; top: -55px;  position: relative;  color: white;font-size: 40px;"><em>欢迎使用CRM系统</em></p>
				<br/><br/><br/><br/><br/><br/><br/><br/>
				</s:div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用&nbsp;户&nbsp;名：<!-- <input class="msg" type="text"> -->
					&nbsp;&nbsp;<s:textfield style="position: absolute; z-index: 20;" name="loginName" cssClass="msg"></s:textfield><br/><br/><br/><br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;码：<!-- <input class="msg" type="text"> -->
					&nbsp;&nbsp;<s:password style="position: absolute; z-index: 20;" name="loginPwd" cssClass="msg"></s:password><br/><br/><br/><br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;<input style="position: absolute; z-index: 20; border-radius: 5px; background-color: black; color: white;" class="btn" type="submit" value=" 登录 " />
					
					<input style="position: relative; z-index: 20;left:100px; border-radius: 5px; background-color: black; color: white;" class="btn" type="button" value=" 注册 " onclick="document.location='${pageContext.request.contextPath}/emp_registUI.action'"/></br>
				<br/><br/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property  value="shifou"/>
				</s:form>
			</td>
		</tr>
	</table>
</div>
</BODY>
</HTML>
