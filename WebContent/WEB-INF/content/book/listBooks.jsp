<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
<%@ taglib prefix="s" uri="/struts-tags" %>


<rapid:override name="head">  
    <title>查看所有图书</title>
</rapid:override>
<rapid:override name="content">

<div class="col-md-9 col-sm-11 table-center table-responsive">
	<table class="table table-bordered table-hover ">
		<caption><h1>图书列表</h1></caption>
		<thead>
			<tr>
				<th>ISBN</th>
				<th>书名</th>
				<th>作者ID</th>
				<th>出版商</th>
				<th>出版日期</th>
				<th>价格</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="books" var="b">
				<tr>
					<td>${b.ISBN}</td>				
					 
					<td><a href='<s:url action="showInformation"><s:param name="ISBN" value="#b.ISBN"/></s:url>'>${b.title}</a></td>
					
					<td>${b.authorID}</td>
					<td>${b.publisher}</td>
					<td>${b.publishDate}</td>
					<td>${b.price}</td>
					 
					<td>
						<a href='<s:url action="delBook"><s:param name="ISBN" value="#b.ISBN"/></s:url>'><input type="button" value="删除"/></a>
						<a href='<s:url action="updateBookForm"><s:param name="ISBN" value="#b.ISBN"/></s:url>'><input type="button" value="更新"/></a>
					</td>
				</tr>			
			</s:iterator>
		</tbody>
	</table>
</div>

</rapid:override>

<%@include file="../../../base.jsp"%>  