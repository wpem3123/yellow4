package site.metacoding.yellow4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
		@GetMapping("/yellow4")
		public String index() {
			return "index";
		}
}
