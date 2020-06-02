package com.kjy.mapper;

import java.util.List;

import com.kjy.domain.BoardCompanyVO;
import com.kjy.domain.BoardNoticeVO;
import com.kjy.domain.BoardQuestionsVO;
import com.kjy.domain.BoardTipVO;

//import org.apache.ibatis.annotations.Select;

import com.kjy.domain.BoardVO;

public interface BoardMapper {

		/* 리스트 company, tip, questions, notice */ 
		public List<BoardCompanyVO> getList_Company();
		public List<BoardVO> getList();
		public List<BoardTipVO> getList_Tip();
		public List<BoardQuestionsVO> getList_Questions();
		public List<BoardNoticeVO> getList_Notice();
		
		
		public void insert(BoardVO board);
		
		
		/* 게시글 처리 company, tip, questions, notice */ 
		public void insertSelectKey(BoardVO board);
		public void insertCB(BoardCompanyVO board);
		public void insertTip(BoardTipVO board);
		public void insertQuestions(BoardQuestionsVO board);
		public void insertNotice(BoardNoticeVO board);
		
		
		/* 상세보기 처리 company, tip, questions, notice */ 
		public BoardVO read(Long bno);
		public BoardCompanyVO read_company(Long bno);
		public BoardTipVO read_tip(Long bno);
		public BoardQuestionsVO read_questions(Long bno);
		public BoardNoticeVO read_notice(Long bno);
		
		
		/* 삭제 처리 company, tip, questions, notice */ 
		public int delete(Long bno);
		public int company_delete(Long bno);
		public int tip_delete(Long bno);
		public int questions_delete(Long bno);
		public int notice_delete(Long bno);
		
		
		/* 수정 처리 company, tip, questions, notice */ 
		public int update(BoardVO board);
		public int company_update(BoardCompanyVO board);
		public int tip_update(BoardTipVO board);
		public int questions_update(BoardQuestionsVO board);
		public int notice_update(BoardNoticeVO board);
		


}
