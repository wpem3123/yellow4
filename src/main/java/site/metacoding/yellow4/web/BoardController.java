
package site.metacoding.yellow4.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow4.domain.Board;

@Controller
public class BoardController {
	
	@GetMapping("/board")
	public String getBoard(Model model) {
		// 더미 데이터 만들기 
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1,"스프링1강","컨트롤러 배우기"));
		boardList.add(new Board(2,"스프링2강","템플릿 엔진 배우기"));
		boardList.add(new Board(3,"스프링3강","디비 연결 하기"));
		
		model.addAttribute("boards",boardList);
		return "board/list";
	}
	
	@GetMapping("/board/{id}")
	public String getBoardOne(@PathVariable Integer id,Model model) {
		// 더미 데이터 
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1,"스프링1강","컨트롤러 배우기"));
		boardList.add(new Board(2,"스프링2강","템플릿 엔진 배우기"));
		boardList.add(new Board(3,"스프링3강","디비 연결 하기"));
		
		if(id == 1) {
			model.addAttribute("board",boardList.get(0));
		}
		if(id == 2) {
			model.addAttribute("board",boardList.get(1));
		}
		if(id == 3) {
			model.addAttribute("board",boardList.get(2));
		}
		return "board/detail";
	}
}
