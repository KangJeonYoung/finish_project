package com.kjy.service;

import java.util.List;

import com.kjy.domain.ReplyVO;
import com.kjy.domain.ReplyCompanyVO;
import com.kjy.domain.ReplyQuestionsVO;
import com.kjy.domain.ReplyTipVO;

public interface ReplyService {
	
	public void register(ReplyVO reply);
	public void company_register(ReplyCompanyVO reply);
	public void tip_register(ReplyTipVO reply);
	public void questions_register(ReplyQuestionsVO reply);
	
	
	public ReplyVO get(Long bno);
	public ReplyCompanyVO company_get(Long rno);
	public ReplyTipVO tip_get(Long rno);
	public ReplyQuestionsVO questions_get(Long rno);
	
	
	public boolean modify(ReplyVO reply);
	public boolean company_modify(ReplyCompanyVO reply);
	public boolean tip_modify(ReplyTipVO reply);
	public boolean questions_modify(ReplyQuestionsVO reply);
	
	
	public boolean remove(Long bno);
	public boolean company_remove(Long rno);
	public boolean tip_remove(Long rno);
	public boolean questions_remove(Long rno);
	
	
	public List<ReplyVO> getList();
	public List<ReplyCompanyVO> getList_company();
	public List<ReplyTipVO> getList_tip();
	public List<ReplyQuestionsVO> getList_questions();
	

}
