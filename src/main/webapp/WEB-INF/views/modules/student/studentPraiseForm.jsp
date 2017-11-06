<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>学生表扬管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/student/studentPraise/">学生表扬列表</a></li>
		<li class="active"><a href="${ctx}/student/studentPraise/form?id=${studentPraise.id}">学生表扬<shiro:hasPermission name="student:studentPraise:edit">${not empty studentPraise.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="student:studentPraise:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="studentPraise" action="${ctx}/student/studentPraise/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>
	<div class="control-group">
		<table id="contentTable" class="table table-striped table-bordered">
			<thead>
			<tr>
				<th>基本资料</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>
					<label>学员：</label>
				</td>
				<td>
					<form:input path="student.name" htmlEscape="false" maxlength="20" class="input-xlarge "/>
					<span class="help-inline"><font color="red">*</font> </span>
				</td>
				<td>
					<label>学员编号：</label>
				</td>
				<td>
					<form:input path="student.id" htmlEscape="false" maxlength="20" class="input-xlarge "/>
					<span class="help-inline"><font color="red">*</font> </span>
				</td>
			</tr>
			<tr>
				<td>
					<label>表扬方式：</label>
				</td>
				<td>
					<form:textarea path="praiseway" htmlEscape="false" rows="4" maxlength="20" class="input-xxlarge "/></td>
				<td>
					<label>表扬原因：</label>
				</td>
				<td>
					<form:textarea path="reason" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
				</td>
			</tr>
			<tr>
				<td>
					<label>登记人：</label>
				</td>
				<td>
						<form:input path="booker" htmlEscape="false" maxlength="10" class="input-xlarge "/>
				<td>
					<label>登记时间：</label>
				</td>
				<td>
					<input name="bookdate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
						   value="<fmt:formatDate value="${studentPraise.bookdate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
						   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>综合素质加分：</label>
				</td>
				<td>
					<form:input path="score" htmlEscape="false" class="input-xlarge required"/>
					<span class="help-inline"><font color="red">*</font> </span>
				<td>
					<label>受表扬时间：</label>
				</td>
				<td>
					<input name="praisedate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
						   value="<fmt:formatDate value="${studentPraise.praisedate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
						   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
				</td>
			</tr>
			</tbody>
		</table>
	</div>

		<table id="confirmTable" class="table table-striped table-bordered">
			<thead>
			<tr>
				<th>确认资料</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>
					<label>确认人：</label>
				</td>
				<td>
					<form:input path="confirmer" htmlEscape="false" maxlength="10" class="input-xlarge "/>
				</td>
				<td>
					<label>确认时间：</label>
				</td>
				<td>
					<input name="confirmdate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
						   value="<fmt:formatDate value="${studentPraise.confirmdate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
						   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>批准：</label>
				</td>
				<td>
					<form:input path="approve" htmlEscape="false" maxlength="10" class="input-xlarge "/>
				</td>
				<td>
					<label>状态：</label>
				</td>
				<td>
					<form:input path="status" htmlEscape="false" maxlength="10" class="input-xlarge "/>
				</td>
			</tr>
			<tr>
				<td>
					<label>建议：</label>
				</td>
				<td>
					<form:textarea path="opinion" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
				</td>
				<td>
					<label>备注信息：</label>
				</td>
				<td>
					<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
				</td>
			</tr>
			</tbody>
		</table>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="student:studentPraise:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>