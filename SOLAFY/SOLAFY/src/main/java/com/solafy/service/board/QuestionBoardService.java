package com.solafy.service.board;

import java.util.List;

import com.solafy.model.QuestionBoardDto;

/**
 * 
 * @FileName QuestionBoardService.java
 * @Project SOLAFY
 * @Date 2020. 12. 14.
 * @author 이주희
 *
 * @변경이력
 */

public interface QuestionBoardService {

	/**
	 * 질문 게시판에 질문을 등록
	 * 
	 * @param qDto - QuestionBoardDto 타입
	 * @return boolean, 등록 성공 시 true 반환
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public boolean createQuestion(QuestionBoardDto qDto) throws Exception;

	/**
	 * 질문 게시판의 모든 질문 글을 반환
	 * 
	 * @return QuestionBoardDto의 List 반환 - 질문글번호, 제목, uid, 등록시간, 별명 포함
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public List<QuestionBoardDto> selectAllQuestions() throws Exception;

	/**
	 * 질문 글의 번호로 검색하여 dto 하나 반환
	 * 
	 * @param articleNo - int, 질문 글의 번호
	 * @return QuestionBoardDto 객체 하나 반환 - 질문글번호, 제목, 내용, uid, 포인트, 등록시간, 문제번호, 별명
	 *         포함
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public QuestionBoardDto selectQuestionsByArticleNo(int articleNo) throws Exception;

	/**
	 * keyword가 제목에 포함되어 있는 질문 글들을 반환
	 * 
	 * @param keyword - String, 검색 키워드
	 * @return QuestionBoardDto의 List 반환 - 질문글번호, 제목, uid, 등록시간, 문제번호, 별명 포함
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public List<QuestionBoardDto> selectQuestionsByTitle(String keyword) throws Exception;

	/**
	 * 동일한 uid가 작성한 질문 글만 반환
	 * 
	 * @param uid - String, nickname
	 * @return QuestionBoardDto의 List 반환 - 질문글번호, 제목, uid, 등록시간, 문제번호, 별명 포함
	 * @throws Exception
	 * 
	 * @변경이력
	 * 20-12-28 uid 검색에서 별명 검색으로 변경
	 */
	public List<QuestionBoardDto> selectQuestionsByWriter(String nickname) throws Exception;

	/**
	 * 문제 번호로 검색, 한 문제에 대한 질문글들을 반환
	 * 
	 * @param problemNo - int, 문제 번호
	 * @return QuestionBoardDto의 List 반환- 질문글번호, 제목, uid, 등록시간, 문제번호, 별명 포함
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public List<QuestionBoardDto> selectQuestionsByProblemNo(int problemNo) throws Exception;

	/**
	 * 질문 글 수정
	 * 
	 * @param qDto - QuestionBoardDto, 수정할 내용 포함 - 제목, 내용, 등록시간만 수정
	 * @return boolean, 정상적으로 수정되었을 경우 true 반환
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public boolean updateQuestion(QuestionBoardDto qDto) throws Exception;

	/**
	 * 질문 글 삭제
	 * 
	 * @param articleNo - int, 질문 글 번호
	 * @return boolean, 정상적으로 수정되었을 경우 true 반환
	 * @throws Exception
	 * 
	 * @변경이력
	 */
	public boolean deleteQuestion(int articleNo) throws Exception;

}
