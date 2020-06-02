package com.kjy.service;

import java.util.List;

import com.kjy.domain.MemberVO;

public interface MemberService {
	
	public void register(MemberVO member);
	
	public String LoginCheck(MemberVO member);

	public String getModel(String id);

	public boolean authInsert(MemberVO member);

	public boolean remove(MemberVO member);

	public List<MemberVO> getMember(String id);

	public boolean modify(MemberVO member);

	public int idChk(MemberVO vo);

	public String getUser(String id);

}
