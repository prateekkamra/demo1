package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo;

@RestController
public class DemoController {
	
	@Autowired
	DemoRepository demoRepo;
	
	@GetMapping("/demo")
	public String demo() {
		return "DEMO SUCCESS";
	}
	
	@PostMapping("/add")
	public Demo addDemo(@RequestBody Demo demo) {
		return demoRepo.save(demo);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Demo> getOneDemo(@PathVariable String id) {
		return demoRepo.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<Demo> getAllDemo(){
		return demoRepo.findAll();
	}
	
	@PutMapping("update")
	public Demo updateDemo(@RequestBody Demo demo) {
		return demoRepo.save(demo);
	}
	
	@DeleteMapping("/delete")
	public void deleteDemo(@RequestBody Demo demo) {
		demoRepo.delete(demo);
	}
}
