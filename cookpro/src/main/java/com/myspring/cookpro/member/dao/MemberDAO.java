package com.myspring.cookpro.member.dao;

import com.myspring.cookpro.member.dto.MemberDTO;

public interface MemberDAO {
	int insertMember(MemberDTO member);
	int selectById(String id);
	boolean selectByEmail(String email);

}
