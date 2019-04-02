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
    <td width="39%" align="left">[在校学生管理]</td>
   
    <td width="57%"align="right">
       <a href="${pageContext.request.contextPath}/in_queryzai.action"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
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

    <td width="10%" align="center">姓名</td>
    <td width="10%" align="center">姓别</td>
    <td width="10%" align="center">班级</td>
    <td width="10%" align="center">QQ</td>
    <td width="10%" align="center">联系电话</td>
  	<td width="5%" align="center">编辑</td>
  	<td width="5%" align="center">查看</td>
  </tr>
<s:iterator var="i" value="list">
  <tr class="tabtd1">
    <td align="center"><s:property  value="#i.ziName"/> </td>
    <td align="center"><s:property  value="#i.zisex"/></td>
    <td align="center"><s:property  value="#i.classLie.cbName"/></td>
    <td align="center"><s:property  value="#i.ziqq"/></td>
    <td align="center"><s:property  value="#i.zphone"/></td>
  	<td align="center"><a href="${pageContext.request.contextPath}/in_inupdateUi.action?zid=<s:property  value='#i.zid'/>"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"></a></td>
	<td align="center"><a href="${pageContext.request.contextPath}/in_inupdateUis.action?zid=<s:property  value='#i.zid'/>"><img src="${pageContext.request.contextPath}/images/button/view.gif" class="img"></a></td>
  </tr>
</s:iterator>
  
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第<s:property value="creePage" />/<s:property value="totaPage" />页</span>
        <span>
        	<s:if test="creePage!=1">
        		<a href="${pageContext.request.contextPath}/in_StuPage.action?creePage=1">[首页]</a>&nbsp;&nbsp;
            	<a href="${pageContext.request.contextPath}/in_StuPage.action?creePage=<s:property value='creePage-1'/>">[上一页]</a>&nbsp;&nbsp;
        	</s:if>
        	<s:if test="creePage!=totaPage">
        		<a href="${pageContext.request.contextPath}/in_StuPage.action?creePage=<s:property value='creePage+1'/>">[下一页]</a>&nbsp;&nbsp;
            	
        	</s:if>
        	<a href="${pageContext.request.contextPath}/in_StuPage.action?creePage=<s:property value="totaPage"/>">[尾页]</a>
            
        </span>
    </td>
  </tr>
</table>
</body>
</html>
