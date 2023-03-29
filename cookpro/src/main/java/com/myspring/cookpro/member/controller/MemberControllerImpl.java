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
<<<<<<< HEAD
		 // ∞°¿‘ »Æ¿Œ √¢&db¡ﬂ∫π »Æ¿Œ&¿Ã∏ﬁ¿œ¿Œ¡ıπ¯»£&∏µÁ«◊∏Ò¿‘∑¬
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		int result = memberService.addMember(member);
		
		out.print("<script>");
		if(result == 1) {
			out.print("alert('»∏ø¯∞°¿‘¿Ã øœ∑·µ«æ˙Ω¿¥œ¥Ÿ!');");
			out.print("location.href='"+request.getContextPath()+"/'");
		} else {
			out.print("alert('»∏ø¯∞°¿‘ø° Ω«∆–«œø¥Ω¿¥œ¥Ÿ. ¥ŸΩ√ Ω√µµ«ÿ¡÷ººø‰.');");
=======
		 // Í∞ÄÏûÖ ÌôïÏù∏ Ï∞Ω&dbÏ§ëÎ≥µ ÌôïÏù∏&Ïù¥Î©îÏùºÏù∏Ï¶ùÎ≤àÌò∏&Î™®Îì†Ìï≠Î™©ÏûÖÎ†•
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		int result = memberService.addMember(member);
		
		out.print("<script>");
		if(result == 1) {
			out.print("alert('ÌöåÏõêÍ∞ÄÏûÖÏù¥ ÏôÑÎ£åÎêòÏóàÏäµÎãàÎã§!');");
			out.print("location.href='"+request.getContextPath()+"/'");
		} else {
			out.print("alert('ÌöåÏõêÍ∞ÄÏûÖÏóê Ïã§Ìå®ÌïòÏòÄÏäµÎãàÎã§. Îã§Ïãú ÏãúÎèÑÌï¥Ï£ºÏÑ∏Ïöî.');");
>>>>>>> branch 'master' of https://github.com/jxl1089/Cooking-Recipe-java.git
			out.print("location.href='"+request.getContextPath()+"/member/memberForm.do'");
		}
		out.print("</script>");
		out.close();
	}
	
}
