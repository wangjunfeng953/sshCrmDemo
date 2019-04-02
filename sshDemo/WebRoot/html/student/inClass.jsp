<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/jquery-1.3.1.js" type="text/javascript"></script>
</head>
<body class="emp_body" >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="44%" align="left">[入学编班]</td>
   
    <td width="52%"align="right">
       <a href="javascript:document.getElementById('inClassForm').submit()"><img src="${pageContext.request.contextPath}/images/button/save.gif" /></a>
       <a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>
<div id="jiben">
	<table width="88%" class="emp_table">
   	  	<tr>
        	<td colspan="6"><br />将<s:property value="%{model.ziName}"/>编入班级：</td>
      	</tr>
  	  	<tr>
   			<td colspan="6" align="left">
   			<s:form action="zi_inClassCG.action" id="inClassForm" method="post">
	   			<s:hidden  name="zid" value="%{model.zid}"/>
	   			<table width="73%" class="emp_table" style="width:50%; border:1px solid #CCC; margin-left:0" align="left">
		   			<tr>
				        <td width="7%" align="center">&nbsp;</td>
				        <td width="20%" align="center">班级名称</td>
				        <td width="21%" align="center">开班时间</td>
				        <td width="34%" align="center">已报人数</td>
		      		</tr>
		      		<s:iterator var="v" value="list">
						<tr>
						  <td align="center"><input type="radio" name="bid" value="<s:property value='#v.bid'/>"/></td>
						  <td align="center"><s:property value="#v.cbName"/>  </td>
						  <td align="center"><s:date name="#v.intoDay" format="yyyy-MM-dd" /></td>
						  <td align="center"><s:property value="#v.clNum"/>  </td>
						</tr>
					</s:iterator>
		      	</table>
		      </s:form>	
      		</td>
    	</tr>
	</table>
</div>
</body>
</html>
