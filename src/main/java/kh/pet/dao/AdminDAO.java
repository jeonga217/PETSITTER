package kh.pet.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.pet.dto.MemboardDto;

@Repository
public class AdminDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public int board_state(Map<String, Object> edit_date) {
		return mybatis.update("Admin.board_state",edit_date);
	}
	
}
