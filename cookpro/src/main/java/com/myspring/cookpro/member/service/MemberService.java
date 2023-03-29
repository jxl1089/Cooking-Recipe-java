package com.myspring.cookpro.member.service;

import com.myspring.cookpro.member.dto.MemberDTO;

public interface MemberService {
	int addMember(MemberDTO member);
	int searchById(String id);
	boolean searchByEmail(String email);

}
