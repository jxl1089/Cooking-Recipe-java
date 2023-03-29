package com.myspring.cookpro.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.cookpro.member.dao.MemberDAO;
import com.myspring.cookpro.member.dto.MemberDTO;


@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public int addMember(MemberDTO member) {
		// TODO Auto-generated method stub
		return memberDAO.insertMember(member);
	}

	@Override
	public int searchById(String id) {
		// TODO Auto-generated method stub
		return memberDAO.selectById(id);
	}

	@Override
	public boolean searchByEmail(String email) {
		// TODO Auto-generated method stub
		return memberDAO.selectByEmail(email);
	}

}
