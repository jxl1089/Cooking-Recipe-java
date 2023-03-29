package com.myspring.cookpro.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.cookpro.member.dto.MemberDTO;
import com.myspring.cookpro.member.service.MemberService;

@Controller
public class MemberControllerImpl {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/")
	public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "main";
	}
	
	@RequestMapping("/member/*Form.do")
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String) request.getAttribute("viewName");
		
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}
	
//	@RequestMapping(value="/member/search.do", method = RequestMethod.GET)
//	public ModelAndView search(@RequestParam("id") String id, @RequestParam("email") String email,
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println(id);
//		if(id != null) {
//			int result = memberService.searchById(id);
//			System.out.println("result: "+result);
//
//			
//			if(result) {
//				rAttr.addAttribute("msg", "success");
//			} else {
//				rAttr.addAttribute("msg", "fail");
//			}
//		}
//		
//		if(email != null) {
//			boolean result = memberService.searchByEmail(email);
//			
//			if(result) {
//				rAttr.addAttribute("msg", "success");
//			} else {
//				rAttr.addAttribute("msg", "fail");
//			}
//		}
//			ModelAndView mav = new ModelAndView("/member/memberForm");
//			return mav;
//	}
	
	@RequestMapping(value = "/member/addMember.do", method = RequestMethod.POST)
	public void addMember(@ModelAttribute("member") MemberDTO member,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		 // 가입 확인 창&db중복 확인&이메일인증번호&모든항목입력
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		int result = memberService.addMember(member);
		
		out.print("<script>");
		if(result == 1) {
			out.print("alert('회원가입이 완료되었습니다!');");
			out.print("location.href='"+request.getContextPath()+"/'");
		} else {
			out.print("alert('회원가입에 실패하였습니다. 다시 시도해주세요.');");
			out.print("location.href='"+request.getContextPath()+"/member/memberForm.do'");
		}
		out.print("</script>");
		out.close();
	}
	
}
