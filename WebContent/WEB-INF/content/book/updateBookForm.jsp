<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  

<rapid:override name="head">  
    <title>更新图书信息</title>
</rapid:override>  
<rapid:override name="content"> 
	<%String isbn = request.getParameter("ISBN");%>
<div class="col-md-5 col-sm-9 vertical-center">
	<h2>请更新ISBN=<%=isbn%>的图书信息:</h2>
	<br/>
	<form role="form" action="updateBook" method="post">		
		<div class="form-gruop">
			<label for="title" class="col-sm-2 control-label">书名</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入标题" name="book.title"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="authorname" class="col-sm-2 control-label">作者</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入作者姓名" name="authorname"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="publisher" class="col-sm-2 control-label">出版商</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入出版商" name="book.publisher"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="publishDate" class="col-sm-2 control-label">出版日期</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入出版日期" name="book.publishDate"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="publishDate" class="col-sm-2 control-label">价格</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入价格" name="book.price"/><br/>
			</div>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">确认更新</button>	
		<input type="hidden" name="ISBN" value="<%=isbn%>" />
	</form>
</div>
</rapid:override>
<%@include file="../../../base.jsp"%> 