package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor //하나니까 자동주입쓰자.
public class BoardServiceImpl implements BoardService {


	private BoardMapper mapper;
	
	@Override
	public List<Board> getAll() {
		// TODO Auto-generated method stub
		return mapper.getListAll();
	}

	@Override
	public int register(Board board) {
		// TODO Auto-generated method stub
		return mapper.insert(board);
	}

}
