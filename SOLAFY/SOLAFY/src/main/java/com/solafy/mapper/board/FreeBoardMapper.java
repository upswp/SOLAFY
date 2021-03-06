package com.solafy.mapper.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.solafy.model.FreeBoardDto;

/**
* @FileName : FreeBoardMapper.java
* @Project : SOLAFY
* @Date : 2020. 12. 20
* @작성자 : BUMSEOK SEO

* @변경이력 :
* @프로그램 설명 : 자유게시판 Mapper
*/
@Mapper
public interface FreeBoardMapper {

	/**
	* @param freeBoardDto
	* @return boolean, 성공적으로 등록 되었을 경우 true 반환
	* @Method 설명 : 자유게시판에 게시글 등록
	* @변경이력 :
	*/
	public int createArticle(FreeBoardDto freeBoardDto);
	
	/**
	 * @return List<FreeBoardDto>
	 * @Method 설명 : 자유게시판의 모든 공지들을 반환
	 * @변경이력 :
	 * 2020-12-28(BEOMSEOK SEOK) : 공지사항 우선순위 표시 필요성에 따른 해당 메서드 추가
	 */
	public List<FreeBoardDto> selectAllNotices();
	
	/**
	* @return List<FreeBoardDto>
	* @Method 설명 : 자유게시판의 모든 게시글들을 반환
	* @변경이력 :
	* 2020-12-28(BEOMSEOK SEO) : selectArticles에서 selectAllArticles로 메서드명 변경
	*/
	public List<FreeBoardDto> selectAllArticles();


	/**
	* @param ArticleNo
	* @return FreeBoardDto(해당 번호에 해당하는 게시글)
	* @Method 설명 : 입력한 게시를 번호에 해당하는 게시글 반환
	* @변경이력 :
	*/
	public FreeBoardDto selectArticleByArticleNo(int ArticleNo);

	/**
	* @param title
	* @return List<FreeBoardDto>
	* @Method 설명 : 입력한 키워드를 포함하는 제목의 게시글 반환
	* @변경이력 :
	*/
	public List<FreeBoardDto> selectArticleByTitle(String title);

	/**
	* @param nickname
	* @return List<FreeBoardDto>
	* @Method 설명 : 입력한 닉네임와 일치하는 작성자의 게시글 반환
	* @변경이력 :
	*
	*/
	public List<FreeBoardDto> selectArticleByNickname(String nickname);

	// TODO: 공지사항 검색이 필요할지?
	// public FreeBoardDto selectNotice( ArticleNo);

	/**
	* @param 수정 사항이 반영된 freeBoardDto
	* @return int, 정상적으로 수정 되었을 경우 1, 그렇지 않을 경우 0 반환
	* @Method 설명 : 자유게시판 게시글 수정
	* @변경이력 :
	*/
	public int updateArticle(FreeBoardDto freeBoardDto);

	/**
	* @param ArticleNo
	* @return int, 정상적으로 삭제 되었을 경우 1, 그렇지 않을 경우 0 반환
	* @Method 설명 : 자유게시판 게시글 삭제
	* @변경이력 :
	*/
	public int deleteArticle(int ArticleNo);
}
