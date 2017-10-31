/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 学生管理Entity
 * @author duzhiming
 * @version 2017-10-31
 */
public class StudentInfo extends DataEntity<StudentInfo> {
	
	private static final long serialVersionUID = 1L;
	private Long userid;		// 学生编号
	private String code;		// 学号
	private String name;		// 姓名
	private String cname;		// 班级
	private String studenttype;		// 学生类型
	private String sex;		// 性别
	private String birthplace;		// 出生地
	private Date birthday;		// 出生日期
	private String married;		// 婚姻情况
	private String school;		// 学校
	private String department;		// 部门
	private String collegemajor;		// 专业
	private String schoolrecord;		// 学历
	private String graduatedate;		// 毕业学校
	private String telephone;		// 入学联系电话
	private String gtelephone;		// 毕业联系电话
	private String email;		// email
	private String qq;		// qq
	private String msn;		// msn
	private String homephone;		// 家庭电话
	private String homeaddress;		// 家庭地址
	private String credentialno;		// 出勤号
	private String guardian;		// 监护人
	private String guardianphone;		// 监护人联系电话
	private String relation;		// 与本人关系
	private String urgencyperson;		// 紧急联系人
	private String urgencyphone;		// 紧急联系人电话
	private String traincompany;		// 原参加培训的公司
	private String traintime;		// 培训时间
	private String traincontext;		// 培训内容
	private String oldcompany;		// 原工作单位
	private String oldheadship;		// 原单位职位
	private Integer oldsalary;		// 原单位薪水
	private String familybackgroud;		// 家庭背景
	private String parentstatus;		// 父母状况
	private String jobdesign;		// 职业规划
	private String target;		// 期望目标
	private String hobby;		// 爱好
	private String economy;		// 经济能力
	private Double qulityscore;		// 职业素质基础分
	private Double skillscore;		// 技术能力基础分
	private String innerheadship;		// 班级职务
	private Date daneigraduatedate;		// 达内毕业时间
	private String pic;		// 照片
	private String picfilename;		// 照片名
	private String resume;		// 简历
	private String resumefilename;		// 简历名
	private String repayedcredit;		// 贷款情况
	private String careerexclamation;		// 就业感言
	private String company;		// 公司
	private Integer salary;		// 薪水
	private String returnvist;		// 回访记录
	private String other;		// 备注
	private Long classesId;		// classes_id
	private String teacherevaluation;		// 班主任评价
	private String pmevaluation;		// 项目经理评价
	private Double firstwritten;		// 第一次考试成绩
	private Double secondwritten;		// 第二次考试成绩
	private Double thirdwritten;		// 第三次考试成绩
	private Double scjp;		// SCJP考试成绩
	private Double firstpoll;		// 第一次项目考核成绩
	private Double secondpoll;		// 第二次项目考核成绩
	private Double thirdpoll;		// 第三次项目考核成绩
	private Long fileId;		// file_id
	
	public StudentInfo() {
		super();
	}

	public StudentInfo(String id){
		super(id);
	}

	@NotNull(message="学生编号不能为空")
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	@Length(min=0, max=20, message="学号长度必须介于 0 和 20 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=20, message="姓名长度必须介于 0 和 20 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=20, message="班级长度必须介于 0 和 20 之间")
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Length(min=0, max=20, message="学生类型长度必须介于 0 和 20 之间")
	public String getStudenttype() {
		return studenttype;
	}

	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
	
	@Length(min=0, max=10, message="性别长度必须介于 0 和 10 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=100, message="出生地长度必须介于 0 和 100 之间")
	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Length(min=0, max=10, message="婚姻情况长度必须介于 0 和 10 之间")
	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}
	
	@Length(min=0, max=50, message="学校长度必须介于 0 和 50 之间")
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Length(min=0, max=20, message="部门长度必须介于 0 和 20 之间")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Length(min=0, max=20, message="专业长度必须介于 0 和 20 之间")
	public String getCollegemajor() {
		return collegemajor;
	}

	public void setCollegemajor(String collegemajor) {
		this.collegemajor = collegemajor;
	}
	
	@Length(min=0, max=10, message="学历长度必须介于 0 和 10 之间")
	public String getSchoolrecord() {
		return schoolrecord;
	}

	public void setSchoolrecord(String schoolrecord) {
		this.schoolrecord = schoolrecord;
	}
	
	@Length(min=0, max=10, message="毕业学校长度必须介于 0 和 10 之间")
	public String getGraduatedate() {
		return graduatedate;
	}

	public void setGraduatedate(String graduatedate) {
		this.graduatedate = graduatedate;
	}
	
	@Length(min=0, max=50, message="入学联系电话长度必须介于 0 和 50 之间")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Length(min=0, max=50, message="毕业联系电话长度必须介于 0 和 50 之间")
	public String getGtelephone() {
		return gtelephone;
	}

	public void setGtelephone(String gtelephone) {
		this.gtelephone = gtelephone;
	}
	
	@Length(min=0, max=50, message="email长度必须介于 0 和 50 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=50, message="qq长度必须介于 0 和 50 之间")
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	
	@Length(min=0, max=50, message="msn长度必须介于 0 和 50 之间")
	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}
	
	@Length(min=0, max=50, message="家庭电话长度必须介于 0 和 50 之间")
	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	
	@Length(min=0, max=50, message="家庭地址长度必须介于 0 和 50 之间")
	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}
	
	@Length(min=0, max=50, message="出勤号长度必须介于 0 和 50 之间")
	public String getCredentialno() {
		return credentialno;
	}

	public void setCredentialno(String credentialno) {
		this.credentialno = credentialno;
	}
	
	@Length(min=0, max=10, message="监护人长度必须介于 0 和 10 之间")
	public String getGuardian() {
		return guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	
	@Length(min=0, max=50, message="监护人联系电话长度必须介于 0 和 50 之间")
	public String getGuardianphone() {
		return guardianphone;
	}

	public void setGuardianphone(String guardianphone) {
		this.guardianphone = guardianphone;
	}
	
	@Length(min=0, max=10, message="与本人关系长度必须介于 0 和 10 之间")
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	@Length(min=0, max=20, message="紧急联系人长度必须介于 0 和 20 之间")
	public String getUrgencyperson() {
		return urgencyperson;
	}

	public void setUrgencyperson(String urgencyperson) {
		this.urgencyperson = urgencyperson;
	}
	
	@Length(min=0, max=20, message="紧急联系人电话长度必须介于 0 和 20 之间")
	public String getUrgencyphone() {
		return urgencyphone;
	}

	public void setUrgencyphone(String urgencyphone) {
		this.urgencyphone = urgencyphone;
	}
	
	@Length(min=0, max=50, message="原参加培训的公司长度必须介于 0 和 50 之间")
	public String getTraincompany() {
		return traincompany;
	}

	public void setTraincompany(String traincompany) {
		this.traincompany = traincompany;
	}
	
	@Length(min=0, max=255, message="培训时间长度必须介于 0 和 255 之间")
	public String getTraintime() {
		return traintime;
	}

	public void setTraintime(String traintime) {
		this.traintime = traintime;
	}
	
	@Length(min=0, max=50, message="培训内容长度必须介于 0 和 50 之间")
	public String getTraincontext() {
		return traincontext;
	}

	public void setTraincontext(String traincontext) {
		this.traincontext = traincontext;
	}
	
	@Length(min=0, max=50, message="原工作单位长度必须介于 0 和 50 之间")
	public String getOldcompany() {
		return oldcompany;
	}

	public void setOldcompany(String oldcompany) {
		this.oldcompany = oldcompany;
	}
	
	@Length(min=0, max=20, message="原单位职位长度必须介于 0 和 20 之间")
	public String getOldheadship() {
		return oldheadship;
	}

	public void setOldheadship(String oldheadship) {
		this.oldheadship = oldheadship;
	}
	
	public Integer getOldsalary() {
		return oldsalary;
	}

	public void setOldsalary(Integer oldsalary) {
		this.oldsalary = oldsalary;
	}
	
	@Length(min=0, max=255, message="家庭背景长度必须介于 0 和 255 之间")
	public String getFamilybackgroud() {
		return familybackgroud;
	}

	public void setFamilybackgroud(String familybackgroud) {
		this.familybackgroud = familybackgroud;
	}
	
	@Length(min=0, max=255, message="父母状况长度必须介于 0 和 255 之间")
	public String getParentstatus() {
		return parentstatus;
	}

	public void setParentstatus(String parentstatus) {
		this.parentstatus = parentstatus;
	}
	
	@Length(min=0, max=255, message="职业规划长度必须介于 0 和 255 之间")
	public String getJobdesign() {
		return jobdesign;
	}

	public void setJobdesign(String jobdesign) {
		this.jobdesign = jobdesign;
	}
	
	@Length(min=0, max=255, message="期望目标长度必须介于 0 和 255 之间")
	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	@Length(min=0, max=255, message="爱好长度必须介于 0 和 255 之间")
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Length(min=0, max=50, message="经济能力长度必须介于 0 和 50 之间")
	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}
	
	@NotNull(message="职业素质基础分不能为空")
	public Double getQulityscore() {
		return qulityscore;
	}

	public void setQulityscore(Double qulityscore) {
		this.qulityscore = qulityscore;
	}
	
	@NotNull(message="技术能力基础分不能为空")
	public Double getSkillscore() {
		return skillscore;
	}

	public void setSkillscore(Double skillscore) {
		this.skillscore = skillscore;
	}
	
	@Length(min=0, max=20, message="班级职务长度必须介于 0 和 20 之间")
	public String getInnerheadship() {
		return innerheadship;
	}

	public void setInnerheadship(String innerheadship) {
		this.innerheadship = innerheadship;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDaneigraduatedate() {
		return daneigraduatedate;
	}

	public void setDaneigraduatedate(Date daneigraduatedate) {
		this.daneigraduatedate = daneigraduatedate;
	}
	
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	@Length(min=0, max=255, message="照片名长度必须介于 0 和 255 之间")
	public String getPicfilename() {
		return picfilename;
	}

	public void setPicfilename(String picfilename) {
		this.picfilename = picfilename;
	}
	
	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	@Length(min=0, max=255, message="简历名长度必须介于 0 和 255 之间")
	public String getResumefilename() {
		return resumefilename;
	}

	public void setResumefilename(String resumefilename) {
		this.resumefilename = resumefilename;
	}
	
	@Length(min=0, max=1, message="贷款情况长度必须介于 0 和 1 之间")
	public String getRepayedcredit() {
		return repayedcredit;
	}

	public void setRepayedcredit(String repayedcredit) {
		this.repayedcredit = repayedcredit;
	}
	
	public String getCareerexclamation() {
		return careerexclamation;
	}

	public void setCareerexclamation(String careerexclamation) {
		this.careerexclamation = careerexclamation;
	}
	
	@Length(min=0, max=20, message="公司长度必须介于 0 和 20 之间")
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String getReturnvist() {
		return returnvist;
	}

	public void setReturnvist(String returnvist) {
		this.returnvist = returnvist;
	}
	
	@Length(min=0, max=255, message="备注长度必须介于 0 和 255 之间")
	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	public Long getClassesId() {
		return classesId;
	}

	public void setClassesId(Long classesId) {
		this.classesId = classesId;
	}
	
	public String getTeacherevaluation() {
		return teacherevaluation;
	}

	public void setTeacherevaluation(String teacherevaluation) {
		this.teacherevaluation = teacherevaluation;
	}
	
	public String getPmevaluation() {
		return pmevaluation;
	}

	public void setPmevaluation(String pmevaluation) {
		this.pmevaluation = pmevaluation;
	}
	
	public Double getFirstwritten() {
		return firstwritten;
	}

	public void setFirstwritten(Double firstwritten) {
		this.firstwritten = firstwritten;
	}
	
	public Double getSecondwritten() {
		return secondwritten;
	}

	public void setSecondwritten(Double secondwritten) {
		this.secondwritten = secondwritten;
	}
	
	public Double getThirdwritten() {
		return thirdwritten;
	}

	public void setThirdwritten(Double thirdwritten) {
		this.thirdwritten = thirdwritten;
	}
	
	public Double getScjp() {
		return scjp;
	}

	public void setScjp(Double scjp) {
		this.scjp = scjp;
	}
	
	public Double getFirstpoll() {
		return firstpoll;
	}

	public void setFirstpoll(Double firstpoll) {
		this.firstpoll = firstpoll;
	}
	
	public Double getSecondpoll() {
		return secondpoll;
	}

	public void setSecondpoll(Double secondpoll) {
		this.secondpoll = secondpoll;
	}
	
	public Double getThirdpoll() {
		return thirdpoll;
	}

	public void setThirdpoll(Double thirdpoll) {
		this.thirdpoll = thirdpoll;
	}
	
	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	
}