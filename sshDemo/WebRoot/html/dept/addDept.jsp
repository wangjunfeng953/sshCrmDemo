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
    <td width="44%" align="left">[添加部门]</td>
   
    <td width="52%"align="right">
       <a href="javascript:document.getElementById('saveForm').submit()"><img src="${pageContext.request.contextPath}/images/button/save.gif" /></a>
       <a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<s:form action="dept_save.action" id="saveForm" method="post">
<table width="88%" border="0" class="emp_table" style="width:80%;">
 <tr>
    <td>部门名称：</td>
    <td><s:textfield name="deptName"></s:textfield></td>
  </tr>
 <tr>
    <td width="10%">部门介绍：</td>
    <td></td>
  </tr>
   <tr>
    <td width="10%"></td>
    <td >
    	<s:textarea name="introduce" cols="50" rows="5"></s:textarea>
    </td>
  </tr>
</table>
</s:form>
</body>
</html>