<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
</head>
<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="44%" align="left">[查询咨询学生]</td> 
    <td width="52%"align="right">
    	<!--<a href="listLog.html"><img src="${pageContext.request.contextPath}/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath}/images/button/add.gif" class="img"/></a>~-->
        
       <!-- <a href="#"><img src="${pageContext.request.contextPath}/images/button/close.gif" class="img"/></a>-->
       <a href="javascript:document.getElementById('queryForm').submit()"><img src="${pageContext.request.contextPath}/images/button/find.gif" /></a>
       <a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>    
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<s:form id="queryForm" action="zi_queryZiXun.action" method="post">
<table width="88%" border="0" class="emp_table" style="width:80%;">
  <tr>
    <td width="10%">学生名称：</td>
    <td><s:textfield name="ziName"></s:textfield>  </td>
  </tr>
  <tr>  
    <td>学生性别：</td>
    <td><s:select list="{'男','女'}" name="zisex" headerKey="" headerValue="---请选择----"/></td>
  </tr>	
  <tr>  
    <td >学生电话：</td>
    <td ><s:textfield name="zphone" /></td>
  </tr>	
  <tr>
    <td>学生qq：</td>
    <td ><s:textfield name="ziqq"/></td>
  </tr>
  <tr>
    <td>学生地址：</td>
    <td ><s:textfield name="addtre"/></td>
  </tr>
  <tr>
    <td>学生学校：</td>
    <td ><s:textfield name="zishoot"/></td>
  </tr>
  <tr>
    <td>学生年龄：</td>
    <td ><s:textfield name="ziage"/></td>
  </tr>
  <tr>
    <td>学生学历：</td>
    <td ><s:textfield name="xueli"/></td>
  </tr>
  <tr>
    <td>学生备注：</td>
    <td ><s:textfield name="beiZhu"/></td>
  </tr>
    <td>学生班级：</td>
    <td ><s:textfield name="banji"/></td>
</table>
</s:form>
</body>
</html>
