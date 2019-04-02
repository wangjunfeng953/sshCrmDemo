<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.datepick.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.datepick-zh-CN.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery.datepick.css" type="text/css"/>
<script type="text/javascript">
	$(function(){
		$("#intoDay").datepick({dateFormat: 'yy-mm-dd'});
		$("#outDay").datepick({dateFormat: 'yy-mm-dd'});
	})

</script>
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
    <td width="44%" align="left">[添加班级]</td>
   
    <td width="52%"align="right">
    	<!--<a href="listLog.html"><img src="${pageContext.request.contextPath}/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath}/images/button/add.gif" class="img"/></a>~-->
        
       <!-- <a href="#"><img src="${pageContext.request.contextPath}/images/button/close.gif" class="img"/></a>-->
       <a href="javascript:document.getElementById('updateForm').submit()"><img src="${pageContext.request.contextPath}/images/button/save.gif" /></a>
       <a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<s:form id="updateForm" action="ban_update.action" method="post">
<s:hidden  name="bid" value="%{model.bid}"/>
<table width="88%" border="0" class="emp_table" style="width:80%;">
  <tr>
    <td width="10%">班级名称：</td>
    <td width="20%"><s:textfield name="cbName" value="%{model.cbName}"/></td>
    <td width="8%">所属类别：</td>
    <td width="62%">
	<s:select value="%{model.categoryB.cid}" list="list" listKey="cid" listValue="cateName" name="categoryB.cid" headerKey="" headerValue="----请选择-----"></s:select>
	</td>
  </tr>
  <tr>
    <td>开课时间：</td>
    <td><s:textfield id="intoDay" name="intoDay" value="%{model.intoDay}"/>  </td>
    <td>结业时间：</td>
    <td><s:textfield id="outDay" name="outDay" value="%{model.outDay}"/></td>
  </tr>
  <tr>
    <td>状态：</td>
    <td>
    	<s:select list="#{'1':'未开课','2':'已开课','3':'已结课'}" name="statZ" value="%{model.statZ}"></s:select>
    </td>
    <td>人数</td>
    <td><s:textfield name="clNum" value="%{model.clNum}"/> </td>
  </tr>
</table>
</s:form>
</body>
</html>
