package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.Board;
import org.zerock.domain.PageParam;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor //하나니까 자동주입쓰자.
public class BoardServiceImpl implements BoardService {


	private BoardMapper mapper;
	

	@Override
	public int register(Board board) {
		// TODO Auto-generated method stub
		return mapper.insert(board);
	}

	@Override
	public List<Board> getList(PageParam param) {
		// TODO Auto-generated method stub
		return mapper.getList(param);
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return mapper.count();
	}

	@Override
	public Board get(PageParam param) {
		// TODO Auto-generated method stub
		return mapper.get(param);
	}

	@Override
	public int remove(PageParam param) {
		// TODO Auto-generated method stub
		return mapper.delete(param);
	}

	@Override
	public int modify(Board board) {
		// TODO Auto-generated method stub
		return mapper.update(board);
	}

}
