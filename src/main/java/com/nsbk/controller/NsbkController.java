package com.nsbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsbk.entity.Former;
import com.nsbk.service.NsbkService;

@RestController
@RequestMapping("/nsbk")
public class NsbkController {

	@Autowired
	NsbkService nsbkService;
	
	@PostMapping("/former")
	public Former createFormer(@RequestBody Former former) {

		return nsbkService.saveFormer(former);

	}
	
	@GetMapping("/former/{formerId}")
	public Former fetchFormer(@PathVariable int formerId) {
		
		return nsbkService.getFormer(formerId);
	}
	
	@GetMapping("/formers")
	public List<Former> getAllFormer(){
		
		return nsbkService.getAllFormer();
		
	}

}
