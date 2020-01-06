package com.humengyuan.bean;

public class Columnl {

	private Integer cid;// 编号
	private String czi;// 关键字
	private String cmiaos;// 描述
	private String cname;// 公司名称
	private String cshangp;// 主营产品
	private String cadd;// 地址
	private String czhuc;// 注册资本
	private String ctime;// 成立时间
	private String yaertime;// 年检日期```
	private String ctai;// 年检状态
	private String cbeiz;// 备注````
	//编号0  关键字1  描述2  公司名称3 主要产品4 地址5 注册资金6  成立时间7    年检状态 8 备注 9   年检状态10
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCzi() {
		return czi;
	}

	public void setCzi(String czi) {
		this.czi = czi;
	}

	public String getCmiaos() {
		return cmiaos;
	}

	public void setCmiaos(String cmiaos) {
		this.cmiaos = cmiaos;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCshangp() {
		return cshangp;
	}

	public void setCshangp(String cshangp) {
		this.cshangp = cshangp;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public String getCzhuc() {
		return czhuc;
	}

	public void setCzhuc(String czhuc) {
		this.czhuc = czhuc;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getYaertime() {
		return yaertime;
	}

	public void setYaertime(String yaertime) {
		this.yaertime = yaertime;
	}

	public String getCtai() {
		return ctai;
	}

	public void setCtai(String ctai) {
		this.ctai = ctai;
	}

	public String getCbeiz() {
		return cbeiz;
	}

	public void setCbeiz(String cbeiz) {
		this.cbeiz = cbeiz;
	}

	@Override
	public String toString() {
		return "Column [cid=" + cid + ", czi=" + czi + ", cmiaos=" + cmiaos + ", cname=" + cname + ", cshangp="
				+ cshangp + ", cadd=" + cadd + ", czhuc=" + czhuc + ", ctime=" + ctime + ", yaertime=" + yaertime
				+ ", ctai=" + ctai + ", cbeiz=" + cbeiz + "]";
	}

	public Columnl(Integer cid, String czi, String cmiaos, String cname, String cshangp, String cadd, String czhuc,
			String ctime, String yaertime, String ctai, String cbeiz) {
		super();
		this.cid = cid;
		this.czi = czi;
		this.cmiaos = cmiaos;
		this.cname = cname;
		this.cshangp = cshangp;
		this.cadd = cadd;
		this.czhuc = czhuc;
		this.ctime = ctime;
		this.yaertime = yaertime;
		this.ctai = ctai;
		this.cbeiz = cbeiz;
	}

	public Columnl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
