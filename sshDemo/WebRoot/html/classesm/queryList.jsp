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

<body background="${pageContext.request.contextPath}/images/bgss.jpg">
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="39%" align="left">[课程类别]</td>
   
    <td width="57%"align="right">
       <a href="${pageContext.request.contextPath }/ban_saveUi.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
       <a href="${pageContext.request.contextPath }/ban_queryClassUi.action"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>
<table width="97%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
    <td width="14%" align="center">班级名称</td>
    <td width="33%" align="center">入学时间</td>
    <td width="13%" align="center">毕业时间</td>
    <td width="18%" align="center">是否入学</td>
	<td width="11%" align="center">班级人数</td>
	<td width="11%" align="center">科目</td>
  </tr>
<s:iterator id="i" value="list">
  <tr class="tabtd1">
    <td align="center">${i.cbName}</td>
    <td align="center">${i.intoDay}</td>
    <td align="center">${i.outDay}</td>
    <td align="center">${i.statZ}</td>
    <td align="center">${i.clNum}</td>
    <td align="center">${i.categoryB.cateName}</td>
  </tr>
</s:iterator> 
</table>
</body>
</html>
