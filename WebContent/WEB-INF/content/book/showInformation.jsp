<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  

<rapid:override name="head">  
    <title>图书详细信息</title>
</rapid:override>  
<rapid:override name="content">  
<div class="col-md-4 col-sm-10 vertical-center table-responsive">
	<h1>The Detail Of Book ${ book.title }</h1>
	
	<table class="table table-bordered table-hover">
		<caption><h2>图书信息</h2></caption>
		<thead>		
			<tr>
				<th>ISBN</th>
				<th>出版商</th>
				<th>出版日期</th>
				<th>价格</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${book.ISBN}</td>
				<td>${book.publisher}</td>
				<td>${book.publishDate}</td>
				<td>${book.price}</td>
			</tr>
		</tbody>
	</table>
	<br>
	<br>
	<table class="table table-bordered table-hover">
		<caption><h2>作者信息</h2></caption>
		<thead>
			<tr>
				<th>姓名</th>
				<th>ID</th>
				<th>国籍</th>
				<th>年龄</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${author.name}</td>
				<td>${author.authorID}</td>
				<td>${author.country}</td>
				<td>${author.age}</td>
			</tr>
		</tbody>
	</table>
</div>
</rapid:override>  
   
<%@ include file="../../../base.jsp" %>  