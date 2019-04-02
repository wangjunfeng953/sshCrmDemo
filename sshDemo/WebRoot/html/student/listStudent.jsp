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
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="33%" align="left">[咨询学生管理]</td>
   
    <td width="63%"align="right">
        <a class="butbg"  href="${pageContext.request.contextPath }/zi_addZiStudentUi.action"><img src="${pageContext.request.contextPath}/images/button/tianjia.gif" /></a>
        <a class="butbg"  href="${pageContext.request.contextPath }/zi_gaojiUi.action"><img src="${pageContext.request.contextPath}/images/button/gaojichaxun.gif" /></a>
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
	<td width="8%" align="center">姓名</td>
	<td width="6%" align="center">性别</td>
	<td width="9%" align="center">电话</td>
	<td width="11%" align="center">QQ </td>
	<td width="15%" align="center">班级意向</td>
	<td width="8%" align="center">编辑</td>
	<td width="8%" align="center">删除</td>
	<td width="8%" align="center">入学编班</td>
  </tr>
<s:iterator var="i" value="list">
  <tr class="tabtd1">
    <td align="center"><s:property  value="#i.ziName"/> </td>
    <td align="center"><s:property  value="#i.zisex"/></td>
    <td align="center"><s:property  value="#i.zphone"/></td>
    <td align="center"><s:property  value="#i.ziqq"/></td>
    <td align="center"><s:property  value="#i.classLie.cbName"/></td>
	<td align="center"><a href="${pageContext.request.contextPath }/zi_stuUpdateUis.action?zid=<s:property  value='#i.zid'/>"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"/></a></td>
	<td align="center"><a href="${pageContext.request.contextPath }/zi_deleteZi.action?zid=<s:property  value='#i.zid'/>"><img src="${pageContext.request.contextPath}/images/button/delete.gif" class="img"/></a></td>
	<td align="center"><a href="${pageContext.request.contextPath }/zi_inClassUi.action?zid=<s:property  value='#i.zid'/>"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"/></a></td>
  </tr>
</s:iterator>
</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第<s:property  value="creePage"/>/<s:property  value="totaPage"/>页</span>
        <span>
        	<s:if test="creePage!=1">
        		<a href="${pageContext.request.contextPath}/zi_findzixunByPage.action?creePage=1">[首页]</a>&nbsp;&nbsp;
            	<a href="${pageContext.request.contextPath}/zi_findzixunByPage.action?creePage=<s:property value='creePage-1'/>">[上一页]</a>&nbsp;&nbsp;
        	</s:if>
        	<s:if test="creePage!=totaPage">
        		<a href="${pageContext.request.contextPath}/zi_findzixunByPage.action?creePage=<s:property value='creePage+1'/>">[下一页]</a>&nbsp;&nbsp;
            	<a href="${pageContext.request.contextPath}/zi_findzixunByPage.action?creePage=<s:property value="totaPage"/>">[尾页]</a>
        	</s:if>
        </span>
    </td>
  </tr>
</table>
</body>
</html>
