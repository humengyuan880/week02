package com.humengyuan.service;

import java.util.List;
import java.util.Map;

import com.humengyuan.bean.Columnl;

public interface ColService {
	// 查询所有
	public List<Columnl> list(Map<String, Object> map);

	// 回显
	public Columnl xian(int cid);

	public int upd(Columnl col);
}
