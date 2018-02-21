package springbootmvc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/nn")
@Controller
public class NNController extends BaseController {

	@RequestMapping("/getinfo")
	public String test() {

		return fn.test();
	}
}