package edu.unq.desapp.grupo_a.backend.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.unq.desapp.grupo_a.backend.service.DegreeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "test")
@ContextConfiguration({ "/META-INF/spring-persistence-context.xml", "/META-INF/spring-services-context.xml" })
public class DegreeServiceTest {
	
    @Autowired
    private DegreeService degreeService;
    
    @Test
    public void testGetDegreeName(){
    	assertEquals("Tecnicatura Universitaria en Programacion Informatica", "Tecnicatura Universitaria en Programacion Informatica");
    
    }
    

}
