package com.humengyuan.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.humengyuan.bean.Columnl;

public interface ConMapper {

	void addCol(Columnl col);

	// 查询所有
	public List<Columnl> list(Map<String, Object> map);

	// 回显
	public Columnl xian(int cid);

	public int upd(Columnl col);

}
