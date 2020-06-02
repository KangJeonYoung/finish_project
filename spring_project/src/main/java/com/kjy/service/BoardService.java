package com.kjy.service;

import java.util.List;

import com.kjy.domain.BoardCompanyVO;
import com.kjy.domain.BoardNoticeVO;
import com.kjy.domain.BoardQuestionsVO;
import com.kjy.domain.BoardTipVO;
import com.kjy.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	public void cb_register(BoardCompanyVO board);
	public void tip_register(BoardTipVO board);
	public void questions_register(BoardQuestionsVO board);
	public void notice_register(BoardNoticeVO board);
	
	
	public BoardVO get(Long bno);
	public BoardCompanyVO get_comapny(Long bno);
	public BoardTipVO get_tip(Long bno);
	public BoardQuestionsVO get_questions(Long bno);
	public BoardNoticeVO get_notice(Long bno);
	
	
	public boolean modify(BoardVO board);
	public boolean company_modify(BoardCompanyVO board);
	public boolean tip_modify(BoardTipVO board);
	public boolean questions_modify(BoardQuestionsVO board);
	public boolean notice_modify(BoardNoticeVO board);
	
	
	public boolean remove(Long bno);
	public boolean company_remove(Long bno);
	public boolean tip_remove(Long bno);
	public boolean questions_remove(Long bno);
	public boolean notice_remove(Long bno);
	
	
	public List<BoardVO> getList();
	public List<BoardCompanyVO> getList_Company();
	public List<BoardTipVO> getTipList();
	public List<BoardQuestionsVO> getQuestionsList();
	public List<BoardNoticeVO> getNoticeList();



}
