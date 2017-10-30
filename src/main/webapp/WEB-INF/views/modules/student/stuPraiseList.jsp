<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>表扬管理</title>
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
		<li class="active"><a href="${ctx}/student/stuPraise/">表扬列表</a></li>
		<shiro:hasPermission name="student:stuPraise:edit"><li><a href="${ctx}/student/stuPraise/form">表扬添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="stuPraise" action="${ctx}/student/stuPraise/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>表扬时间</th>
				<th>原因</th>
				<th>分数</th>
				<shiro:hasPermission name="student:stuPraise:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="stuPraise">
			<tr>
				<td>
						${stuPraise.student.id}
				</td>
				<td><a href="${ctx}/student/stuPraise/form?id=${stuPraise.id}">
						${stuPraise.student.name}
				</a></td>
				<td>
						${stuPraise.student.cname}
				</td>
				<td>
					<fmt:formatDate value="${stuPraise.praisedate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${stuPraise.reason}
				</td>
				<td>
					${stuPraise.score}
				</td>
				<shiro:hasPermission name="student:stuPraise:edit"><td>
    				<a href="${ctx}/student/stuPraise/form?id=${stuPraise.id}">修改</a>
					<a href="${ctx}/student/stuPraise/delete?id=${stuPraise.id}" onclick="return confirmx('确认要删除该表扬吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>