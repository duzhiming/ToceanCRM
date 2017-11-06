<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>学员转介绍管理</title>
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
		<li class="active"><a href="${ctx}/student/studentIntroduce/">学员转介绍列表</a></li>
		<shiro:hasPermission name="student:studentIntroduce:edit"><li><a href="${ctx}/student/studentIntroduce/form">学员转介绍添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="studentIntroduce" action="${ctx}/student/studentIntroduce/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="btns"><input id="btnDelete" class="btn btn-primary" type="submit" value="删除"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr><th><input type="checkbox" name="selAll" onclick=""/></th>
				<th>序号</th>
				<th>学生编号</th>
				<th>介绍日期</th>
				<th>介绍学员姓名</th>
				<th>介绍学员班级</th>
				<th>经手人</th>
				<shiro:hasPermission name="student:studentIntroduce:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="studentIntroduce">
			<tr>
				<td><input type="checkbox" name="selOne" /></td>
				<td>
						1
				</td>
				<td>
						${studentIntroduce.student.id}
				</td>
				<td>
					<fmt:formatDate value="${studentIntroduce.introdate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
						${studentIntroduce.student.name}
				</td>
				<td>
						${studentIntroduce.student.classes.name}
				</td>
				<td>
						${studentIntroduce.employee.name}
				</td>
				<shiro:hasPermission name="student:studentIntroduce:edit"><td>
    				<a href="${ctx}/student/studentIntroduce/form?id=${studentIntroduce.id}">修改</a>
					<a href="${ctx}/student/studentIntroduce/delete?id=${studentIntroduce.id}" onclick="return confirmx('确认要删除该学员转介绍吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>