<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>学生管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/student/studentInfo/">学生列表</a></li>
		<shiro:hasPermission name="student:studentInfo:edit"><li><a href="${ctx}/student/studentInfo/form">学生添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="studentInfo" action="${ctx}/student/studentInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>姓名：</label>
				<form:input path="name" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li><label>班级：</label>
				<form:input path="cname" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>性别</th>
				<th>学历</th>
				<th>入学联系电话</th>
				<th>毕业联系电话</th>
				<shiro:hasPermission name="student:studentInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="studentInfo">
			<tr>
				<td><a href="${ctx}/student/studentInfo/form?id=${studentInfo.id}">
					${studentInfo.code}
				</a></td>
				<td>
					${studentInfo.name}
				</td>
				<td>
					${studentInfo.cname}
				</td>
				<td>
					${studentInfo.sex}
				</td>
				<td>
					${studentInfo.collegemajor}
				</td>
				<td>
					${studentInfo.telephone}
				</td>
				<td>
					${studentInfo.gtelephone}
				</td>
				<shiro:hasPermission name="student:studentInfo:edit"><td>
    				<a href="${ctx}/student/studentInfo/form?id=${studentInfo.id}">修改</a>
					<a href="${ctx}/student/studentInfo/delete?id=${studentInfo.id}" onclick="return confirmx('确认要删除该学生吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>