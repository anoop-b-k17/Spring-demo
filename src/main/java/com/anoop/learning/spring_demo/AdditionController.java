package com.anoop.learning.spring_demo;

import lombok.extern.slf4j.Slf4j;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AdditionController {

	@Value("${db.id}")
	private String dbId;

	@PostConstruct
	public void initialize() {
		log.info("================================>Loaded db.id from the active profile: {}", dbId);
	}

	@GetMapping("/add")
	public int add(@RequestParam int first, @RequestParam int second) {
		int result = first + second;
		log.info("Adding numbers: first={}, second={}, result={}", first, second, result);
		return result;
	}
}
