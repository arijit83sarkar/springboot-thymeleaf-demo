package com.raven.springbootthymeleafdemo.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotivationController {
	@GetMapping("/motivation")
	public String motivation(Model _model) {
		String motivationString = "";
		Random random = new Random();
		int randomInt = random.nextInt(9); // random integers from 0 to 8

		switch (randomInt) {
		case 0:
			motivationString = "Inspiration does exist, but it must find you working. — Pablo Picasso";
			break;
		case 1:
			motivationString = "Success is stumbling from failure to failure with no loss of enthusiasm. — Winston Churchill";
			break;
		case 2:
			motivationString = "Keep your eyes on the stars, and your feet on the ground. — Theodore Roosevelt";
			break;
		case 3:
			motivationString = "Get a good idea and stay with it. Dog it, and work at it until it’s done right. — Walt Disney";
			break;
		case 4:
			motivationString = "Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence. — Helen Keller";
			break;
		case 5:
			motivationString = "Life is like riding a bicycle. To keep your balance you must keep moving. — Albert Einstein";
			break;
		case 6:
			motivationString = "I have never let my schooling interfere with my education. — Mark Twain";
			break;
		case 7:
			motivationString = "If you really want to do something, you'll find a way. If you don't, you'll find an excuse. — Jim Rohn";
			break;
		case 8:
			motivationString = "Be sure you put your feet in the right place, then stand firm. — Abraham Lincoln";
			break;
		}

		_model.addAttribute("motivationString", motivationString);

		return "motivation";
	}
}
