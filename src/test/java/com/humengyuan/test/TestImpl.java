package com.humengyuan.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.humengyuan.bean.Columnl;
import com.humengyuan.mapper.ConMapper;

public class TestImpl {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取数据
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConMapper bean = ac.getBean(ConMapper.class);
		// 读取a.txt中的内容
		List<Object[]> readFile = IOUtils.readFile("a.txt", "\t");
		for (Object[] objects : readFile) {
			System.out.println(Arrays.toString(objects));
			/**
			 * a.id值要使用isNumber()工具方法判断是不是数字（3分） b. keywords
			 * 、description、公司名称、主营产品、地址要使用 hasText()方法判断有没有值。（3分） c.
			 * 注册资本要使用hasText()方法判断有没有值，并使用 isNumber()判断是不是数字（3分）
			 * d.年检日期为null，在前端必须显示为空，不能显示null（3分） c.
			 * 成立时间要使用hasText()方法判断有没有值,判断是不是日期 类型（3分）
			 * d.将集合对象中每个年检对象通过MyBatis保存到数据库。总共316 行，少一行扣2分，最多扣20分(6分)
			 * 
			 */
			if (StringUtil.isNumber(objects[0] + "")) {
				// id值要使用isNumber()工具方法判断是不是数字
				// 编号0 关键字1 描述2 公司名称3 主要产品4 地址5 注册资金6 成立时间7 年检状态8
				Columnl col = new Columnl(Integer.parseInt(objects[0] + ""), objects[1] + "", objects[2] + "",
						objects[3] + "", objects[4] + "", objects[5] + "", objects[6] + "", objects[7] + "",
						objects[8] + "", objects[9] + "", objects[10] + "");
				bean.addCol(col);
			}
		}
	}
}
