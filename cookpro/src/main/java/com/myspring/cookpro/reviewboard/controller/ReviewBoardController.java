package com.myspring.cookpro.reviewboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface ReviewBoardController {

<<<<<<< HEAD
	public ModelAndView review_listArticles(HttpServletRequest request,
=======
	public ModelAndView review_listArticles(HttpServletRequest reuqest,
>>>>>>> branch 'master' of https://github.com/jxl1089/Cooking-Recipe-java.git
			HttpServletResponse response) throws Exception;
	public ResponseEntity review_addNewArticle(MultipartHttpServletRequest multipartRequest,
			HttpServletResponse response) throws Exception;
	public ModelAndView review_form(HttpServletRequest request, 
			HttpServletResponse response) throws Exception;
	public ModelAndView review_viewArticle(@RequestParam("review_articleNo") int articleNo, 
			HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ResponseEntity review_modArticle(MultipartHttpServletRequest multipartRequest, 
			HttpServletResponse response) throws Exception;
	public ResponseEntity review_removeArticle(@RequestParam("review_articleNo") int articleNo,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
}
