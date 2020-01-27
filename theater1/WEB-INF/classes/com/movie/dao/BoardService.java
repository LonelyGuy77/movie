package com.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.movie.dto.Qeustion_answerDTO;
import com.movie.dto.QuestionDTO;

public class BoardService {
	SqlSession sqlSession;

	
	
	
	// =================================질문===================================
	
	
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 질문글쓰기
	public void insertQuestion(QuestionDTO qdto) {
		sqlSession.insert("boardMapper.insertQuestion", qdto);
	}// end of insertquestion

	

	// 질문글 확인

	public QuestionDTO selectQuestionok(int no) {
		QuestionDTO dto = sqlSession.selectOne("boardMapper.selectQuestionok", no);
		System.out.println("디티오느느느느느느느느느느" + dto);
		return dto;
	}// end of selectquestionok

	// 페이징 리스트
	public List selectQuestion(int page) {
		// TODO Auto-generated method stub
		page = (page - 1) * 5;
		System.out.println(page);
		return sqlSession.selectList("boardMapper.selectQuestion", page);
	}// end of selectNewsList

	// 리스트 페이지 수
	public int countQuestion() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.countQuestion");
	}// end of selectAllCount
		// 유형별 검색 리스트

	public List<QuestionDTO> selectQuestionSerch(String kinds) {
		List<QuestionDTO> list = sqlSession.selectList("boardMapper.selectQuestionSerch", kinds);
		return list;
	}// end of QuestionSearch
		// 유형별 검색 리스트

	public List<QuestionDTO> selectQuestionSerch2(int page) {
		page = (page - 1) * 5;
		System.out.println(page);
		List<QuestionDTO> list = sqlSession.selectList("boardMapper.selectQuestion", page);
		return list;
	}// end of QuestionSearch
		// 검색 페이지 총 수

	public int countQuestionSerch() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.countQuestionSerch");
	}// end of selectAllCount

	// 삭제
	public int deleteQuestion(QuestionDTO qdto) {
		// TODO Auto-generated method stub
		return sqlSession.delete("boardMapper.deleteQuestion", qdto);
	}
	
	//답변여부 변경 
	public int updateQuestion(int no) {
		return sqlSession.update("boardMapper.updateQuestion", no);
	}// end of update
	
	
	
	// =================================답글===================================

	
	
	
	// 답글쓰기

	public int insertAnswer(Qeustion_answerDTO sdto) {
		return sqlSession.insert("boardMapper.insertAnswer", sdto);
	}// end of insertanswer


	// 답글확인
	public Qeustion_answerDTO selectAnswerok(int question_no) {
		Qeustion_answerDTO sdto = sqlSession.selectOne("boardMapper.selectAnswerok", question_no);
		return sdto;
	}// end of selectanswerok


	// 답글 수정
	public int updateAnswer(Qeustion_answerDTO adto) {
		// TODO Auto-generated method stub
		return sqlSession.update("boardMapper.updateAnswer", adto);
	}

	
	
	
	// =================================자주찾는글===================================

	
	
	// 자주찾는글 쓰기
	public void insertFrequencyQuestion(QuestionDTO fdto) {
		sqlSession.insert("boardMapper.insertFrequencyQuestion", fdto);
	}// end of frequency_question_insert
		// 자주찾는 글 리스트

	public List selectFrequencyQuestion(int page) {
		// TODO Auto-generated method stub
		page = (page - 1) * 5;
		System.out.println(page);
		return sqlSession.selectList("boardMapper.selectFrequencyQuestion", page);
	}// end of frequency_question_List


		// 자주찾는글 갯수

	public int countFrequencyQuestion() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.countFrequencyQuestion");
	}// end of selectAllCount

}// end of class
