package com.kjy.mapper;

import java.util.List;

import com.kjy.domain.ReplyCompanyVO;
import com.kjy.domain.ReplyQuestionsVO;
import com.kjy.domain.ReplyTipVO;

//import org.apache.ibatis.annotations.Select;

import com.kjy.domain.ReplyVO;

public interface ReplyMapper {
	
		/* 댓글 리스트 company, tip, questions*/ 
		public List<ReplyVO> getList();
		public List<ReplyCompanyVO> getList_company();
		public List<ReplyTipVO> getList_Tip();
		public List<ReplyQuestionsVO> getList_Questions();
		
		
		public void insert(ReplyVO reply);
		
		
		/* 댓글 입력 처리 company, tip, questions*/ 
		public void insertSelectKey(ReplyVO reply);
		public void company_insertSelectKey(ReplyCompanyVO reply);
		public void tip_insertSelectKey(ReplyTipVO reply);
		public void questions_insertSelectKey(ReplyQuestionsVO reply);
		
		
		/* 댓글 수정시 읽기 처리 company, tip, questions*/ 
		public ReplyVO read(Long rno);
		public ReplyCompanyVO company_read(Long rno);
		public ReplyTipVO tip_read(Long rno);
		public ReplyQuestionsVO questions_read(Long rno);
		
		
		/* 댓글 삭제 처리 company, tip, questions*/ 
		public int delete(Long rno);
		public int company_delete(Long rno);
		public int tip_delete(Long rno);
		public int questions_delete(Long rno);
		
		
		/* 댓글 수정 처리 company, tip, questions*/ 
		public int update(ReplyVO reply);
		public int company_update(ReplyCompanyVO reply);
		public int tip_update(ReplyTipVO reply);
		public int questions_update(ReplyQuestionsVO reply);

		
}
