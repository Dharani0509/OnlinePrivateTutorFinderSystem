package com.optfs.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optfs.entity.Parent;
import com.optfs.exceptions.NullEmailFoundException;
import com.optfs.exceptions.NullUserFound;
import com.optfs.repository.ParentRepository;
import com.optfs.service.ParentService;

@SpringBootTest
class ParentServiceImplTest{
	
	@Autowired
	ParentRepository parentRepo;
	
	@Autowired
	ParentService parentService;
		
	@Test
	void saveParentWithNoEmail() throws NullEmailFoundException {
		Parent p = new Parent(001,"Test","User","","pass@123");
		
		assertThrows(NullEmailFoundException.class, () -> parentService.registerParent(p) );
				
	}
	
	@Test
	void getParentById() throws NullUserFound {
		
		assertThrows(NullUserFound.class, () -> parentService.getParentById(0) );
				
	}
	
	@Test
	void updateParent() throws NullUserFound {
		Parent p = new Parent(000,"Test","User","","pass@123");
		
		
		assertThrows(NullUserFound.class, () -> parentService.updateParent(p));
				
	}
	
	@Test
	//@Disabled
	void deleteParent() throws NullUserFound {
		Parent p = new Parent(001,"Test","User","","pass@123");
		
		
		assertThrows(NullUserFound.class, () -> parentService.deleteParent(p));
				
	}
	

}