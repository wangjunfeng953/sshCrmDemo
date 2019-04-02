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
       <a href="${pageContext.request.contextPath }/cla_saveUi.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
       <a href="${pageContext.request.contextPath }/cla_queryCategoryUi.action"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
      
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
    <td width="14%" align="center">名称</td>
    <td width="33%" align="center">简介</td>
    <td width="13%" align="center">总学时</td>
    <td width="18%" align="center">收费标准</td>
	<td width="11%" align="center">编辑</td>
	<td width="11%" align="center">删除</td>
  </tr>
<s:iterator id="i" value="list">
  <tr class="tabtd1">
    <td align="center">${i.cateName}</td>
    <td align="center">${i.intrdJie}</td>
    <td align="center">${i.xuetime}</td>
    <td align="center">${i.xuePrice}</td>
  	<td width="11%" align="center"><a href="${pageContext.request.contextPath }/cla_updateUi.action?cid=${i.cid}"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
  	<td width="11%" align="center"><a href="${pageContext.request.contextPath }/cla_delete.action?cid=${i.cid}"><img src="${pageContext.request.contextPath}/images/button/delete.gif" class="img"></a></td>
  </tr>
</s:iterator> 
</table>
</body>
</html>
