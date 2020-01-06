package com.humengyuan.test;

import com.bw.utils.StringUtil;

public class UtilsTest {
	public static void main(String[] args) {
/**
 *
b. keywords	、description、公司名称、主营产品、地址要使用
hasText()方法判断有没有值。（3分）
c. 注册资本要使用hasText()方法判断有没有值，并使用
isNumber()判断是不是数字（3分）
d.年检日期为null，在前端必须显示为空，不能显示null（3分）
c. 成立时间要使用hasText()方法判断有没有值,判断是不是日期
类型（3分）
   d.将集合对象中每个年检对象通过MyBatis保存到数据库。总共316
行，少一行扣2分，最多扣20分(6分)

 */
		// a.id值要使用isNumber()工具方法判断是不是数字（3分）
		System.out.println(StringUtil.isNumber("123"));
		//hasText()方法判断有没有值。
		System.out.println(StringUtil.isEmpty(" "));
		//c. 注册资本要使用hasText()方法判断有没有值，并使用isNumber()判断是不是数字
		
	}
}
