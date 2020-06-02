package com.kjy.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

import com.kjy.domain.MemberVO;

public interface MemberMapper {

	
		public void insertSelectKey(MemberVO member);
		
		public String loginCheck(MemberVO member);

		public String getModel(String id);

		public int authInsert(MemberVO member);

		public int delete(MemberVO member);

		public List<MemberVO> getMember(String id);

		public int update(MemberVO member);

		public int idChk(MemberVO vo);

		public String getUser(String id);
		
}
