package com.solafy.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solafy.mapper.board.FreeReplyMapper;
import com.solafy.model.FreeReplyDto;

/**
* @FileName : FreeReplyServiceImpl.java
* @Project : SOLAFY
* @Date : 2020. 12. 20
* @작성자 : BUMSEOK SEO

* @변경이력 :
* 2020-12-20(BEOMSEOK SEO) : create, update, delete메서드 return 조건문 간소화
* @프로그램 설명 :
*/
@Service
public class FreeReplyServiceImpl implements FreeReplyService{

	@Autowired
	private FreeReplyMapper freeReplyMapper;
	
	@Override
	public boolean createReply(FreeReplyDto freeReplyDto) {
		int result = freeReplyMapper.createReply(freeReplyDto);
		return result == 1;
	}

	@Override
	public List<FreeReplyDto> selectReplies(int articleNo) {
		List<FreeReplyDto> list = freeReplyMapper.selectReplies(articleNo);
		return list;
	}

	@Override
	public boolean updateReply(FreeReplyDto freeReplyDto) {
		int result = freeReplyMapper.updateReply(freeReplyDto);
		return result == 1;
	}

	@Override
	public boolean deleteReply(FreeReplyDto freeReplyDto) {
		int result = freeReplyMapper.deleteReply(freeReplyDto);
		return result == 1;
	}

}
