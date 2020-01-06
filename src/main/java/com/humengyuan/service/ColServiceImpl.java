package com.humengyuan.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humengyuan.bean.Columnl;
import com.humengyuan.mapper.ConMapper;

@Service
public class ColServiceImpl implements ColService {

	@Autowired
	private ConMapper amapper;

	public List<Columnl> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return amapper.list(map);
	}

	public Columnl xian(int cid) {
		// TODO Auto-generated method stub
		return amapper.xian(cid);
	}

	public int upd(Columnl col) {
		// TODO Auto-generated method stub
		return amapper.upd(col);
	}

}
