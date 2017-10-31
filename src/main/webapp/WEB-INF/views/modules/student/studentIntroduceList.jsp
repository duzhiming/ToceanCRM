<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>转介绍管理</title>
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
		<li class="active"><a href="${ctx}/student/studentIntroduce/">转介绍列表</a></li>
		<shiro:hasPermission name="student:studentIntroduce:edit"><li><a href="${ctx}/student/studentIntroduce/form">转介绍添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="studentIntroduce" action="${ctx}/student/studentIntroduce/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>学员：</label>
				<form:input path="student" htmlEscape="false" maxlength="10" class="input-medium"/>
			</li>
			<li><label>介绍日期：</label>
				<input name="introdate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${studentIntroduce.introdate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>学员</th>
				<th>介绍日期</th>
				<th>介绍人编号</th>
				<shiro:hasPermission name="student:studentIntroduce:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="studentIntroduce">
			<tr>
				<td><a href="${ctx}/student/studentIntroduce/form?id=${studentIntroduce.id}">
					${studentIntroduce.student}
				</a></td>
				<td>
					<fmt:formatDate value="${studentIntroduce.introdate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${studentIntroduce.empname}
				</td>
				<shiro:hasPermission name="student:studentIntroduce:edit"><td>
    				<a href="${ctx}/student/studentIntroduce/form?id=${studentIntroduce.id}">修改</a>
					<a href="${ctx}/student/studentIntroduce/delete?id=${studentIntroduce.id}" onclick="return confirmx('确认要删除该转介绍吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>