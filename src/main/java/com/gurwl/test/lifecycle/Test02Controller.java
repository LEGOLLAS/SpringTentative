package com.gurwl.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02/")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> movie() {
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		
		map.put("rate", 15);
		map.put("director", "봉준호");
		map.put("time", 131);
		map.put("title", "기생충");
		
		list.add(map);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("rate", 0);
		map2.put("director", "로베르트 베니니");
		map2.put("time", 116);
		map2.put("title", "인생은 아름다워");
		
		list.add(map2);
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("rate", 12);
		map3.put("director", "크리스토퍼 놀란");
		map3.put("time", 147);
		map3.put("title", "인셉션");
		
		list.add(map3);
		
		Map<String, Object> map4 = new HashMap<>();
		map4.put("rate", 19);
		map4.put("director", "윤종빈");
		map4.put("time", 133);
		map4.put("title", "범죄와의 전쟁");
		
		list.add(map4);
		
		Map<String, Object> map5 = new HashMap<>();
		map5.put("rate", 15);
		map5.put("director", "프란시스 로렌스");
		map5.put("time", 137);
		map5.put("title", "헝거게임");
		
		list.add(map5);
		
		return list;
		
	}
	
	
	@RequestMapping("/2")
	public List<Board> board() {
		Board board = new Board(
				"안녕하세요 가입인사 드립니다.", 
				"hagulu", 
				"안녕하세요. 가입했어요, 앞으로도 잘 부탁드립니다.");
		
		List<Board> list = new ArrayList<>();
		
		list.add(board);
		
		Board board2 = new Board(
				"헐대박", 
				"bada", 
				"오늘 목요일이 있어");
		
		list.add(board2);
		
		return list;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Board> responseEntity() {
		Board board = new Board(
				"안녕하세요 가입인사 드립니다.", 
				"hagulu", 
				"안녕하세요. 가입했어요, 앞으로도 잘 부탁드립니다.");
		
		ResponseEntity<Board> entity = new ResponseEntity(board, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
