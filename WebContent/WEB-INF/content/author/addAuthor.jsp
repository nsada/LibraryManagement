<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
    
<rapid:override name="head">  
    <title>添加图书</title>
</rapid:override>

<rapid:override name="content">  
<div class="col-md-5 col-sm-9 vertical-center">
	<form role="form" action="addAuthorPro" method="post">
		<div class="form-gruop">
			<label for="name" class="col-sm-2 control-label">姓名</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入作者姓名" name="author.name"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="country" class="col-sm-2 control-label">国籍</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入作者国籍" name="author.country"/><br/>
			</div>
		</div>
		<div class="form-gruop">
			<label for="age" class="col-sm-2 control-label">年龄</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  placeholder="请输入作者年龄" name="author.age"/><br/>
			</div>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">添加作者</button>
	</form>
</div>
</rapid:override> 
<%@include file="../../../base.jsp"%> 