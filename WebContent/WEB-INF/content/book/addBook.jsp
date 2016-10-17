<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
    
<rapid:override name="head">  
    <title>添加图书</title>
</rapid:override>

<rapid:override name="content">  
<div class="col-md-5 col-sm-9 vertical-center">
	<form role="form" action="addBookPro" method="post">
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
			<label for="isbn" class="col-sm-2 control-label">ISBN</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入ISBN码" name="book.ISBN"/><br/>
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

		<button class="btn btn-lg btn-primary btn-block" type="submit">添加图书</button>		
	</form>
</div>
</rapid:override> 
<%@include file="../../../base.jsp"%> 