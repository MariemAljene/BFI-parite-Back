package com.bfi.meriam.produits.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfi.meriam.produits.entities.Journal;
import com.bfi.meriam.produits.service.JournalService; 
@RequestMapping("/journal")
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class JournalController { 
	@Autowired  
	JournalService JS ; 
	@PostMapping ("/addJournal")  
	public void AddJournal(@RequestBody Journal J)
	{
JS.addJournal(J);
	}
	
	
	@GetMapping("/getJournal")
	public List<Journal> getJournal(){
		return JS.ListerJournal();		
	}
	@DeleteMapping("/deleteJournal")
	public void deleteStudent(@RequestParam Integer id) {
		JS.DeleteJournal(id);
	}
	@PutMapping("/updateJournal")
	public Journal updateJournal(@RequestBody Journal journal) {
		return  JS.UpdateJournal(journal);
	}
}
