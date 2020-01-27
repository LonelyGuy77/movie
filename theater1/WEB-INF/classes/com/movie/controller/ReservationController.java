//package com.movie.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.movie.dao.BoardService;
//import com.movie.dto.QuestionDTO;
//
//
//@Controller
//public class ReservationController {
//	
//	@Autowired
//	BoardService BoardService;
//	
//	@RequestMapping(value = "/question.do", method = RequestMethod.GET)
//	public String insertgo() {
//		
//		return "question";
//			
//	}//end insertgo
//	
//	@RequestMapping(value = "/question.do", method = RequestMethod.POST)
//	public String insert(QuestionDTO questdto , Model model) {
//		BoardService.insertquestion(questdto);
//		
//		return List(model);
//	}//end insert
//	
//	
//	@RequestMapping(value = "/List.do", method = RequestMethod.GET)
//	public String List(Model model) {
//		List list = BoardService.selectquestion();
//		System.out.println("리스느느느는1!!!! :" + list );
//		model.addAttribute("list",list);
//		
//		return "List";
//		
//	}//end insert
//	
//}
