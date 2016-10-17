<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
    
<rapid:override name="head">  
    <title>查找作者</title>
</rapid:override>
<rapid:override name="content">
<div class="col-md-4 col-sm-10 vertical-center">  
	<form role="form" action="searchBooksOfAuthor" method="post">
		<div class="form-gruop">
			<label for="authorname" class="col-sm-4 control-label">待查找的作者名</label>
			<div class="col-sm-8">
				<input type="text" class="form-control"  placeholder="请输入作者姓名" name="authorname"/>
			</div>
		</div>		
		<button type="submit" class="btn btn-default btn-primary button-center">搜索</button>
	</form>
</div>
</rapid:override>

<%@ include file="../../../base.jsp" %>  