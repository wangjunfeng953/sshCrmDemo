<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
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
    <td width="39%" align="left">[员工管理]</td>
   
    <td width="57%"align="right">
       <a href="${pageContext.request.contextPath }/emp_saveUi.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >
  <tr class="henglan" style="font-weight:bold;">
    <td width="10%" align="center">编号</td>
    <td width="10%" align="center">员工姓名</td>
    <td width="6%" align="center">性别</td>
    <td width="12%" align="center">出生日期</td>
    <td width="12%" align="center">入职时间</td>
    <td width="15%" align="center">所属部门</td>
    <td width="10%" align="center">编辑</td>
    <td width="10%" align="center">删除</td>
  </tr>
<s:iterator var="e" id="i" value="list">
  <tr class="tabtd2">
    <td align="center">${i.eid}</td>
    <td align="center">${i.empName }</td>
    <td align="center">${i.esex }</td>
    <td align="center" >${i.birthday }</td>
    <td align="center">${i.entryDay }</td>
    <td align="center">${i.department.deptName}</td>
  	<td width="7%" align="center"><a href="${pageContext.request.contextPath }/emp_updateUi.action?eid=${i.eid}"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
  	<td width="7%" align="center"><a href="${pageContext.request.contextPath }/emp_delete.action?eid=${i.eid}"><img src="${pageContext.request.contextPath}/images/button/delete.gif" class="img"></a></td>
 	<!-- <td width="7%" align="center">
 		
 		<s:a action="emp_updateUi.action">
 			 <s:param name="eid" value="eid"></s:param>
 			 <img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"/>
 		</s:a> 
 	</td>-->
  </tr>
</s:iterator>  
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第<s:property  value="creePage"/>/<s:property  value="totaPage"/>页</span>
        <span>
        	<s:if test="creePage!=1">
        		<a href="${pageContext.request.contextPath}/emp_employPage.action?creePage=1">[首页]</a>&nbsp;&nbsp;
            	<a href="${pageContext.request.contextPath}/emp_employPage.action?creePage=<s:property value='creePage-1'/>">[上一页]</a>&nbsp;&nbsp;
        	</s:if>
        	<s:if test="creePage!=totaPage">
        		<a href="${pageContext.request.contextPath}/emp_employPage.action?creePage=<s:property value='creePage+1'/>">[下一页]</a>&nbsp;&nbsp;
            	<a href="${pageContext.request.contextPath}/emp_employPage.action?creePage=<s:property value="totaPage"/>">[尾页]</a>
        	</s:if>
        	
        </span>
    </td>
  </tr>
</table>
</body>
</html>