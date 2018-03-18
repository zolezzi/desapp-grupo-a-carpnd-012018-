package edu.unq.desapp.grupo_a.backend.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.unq.desapp.grupo_a.backend.model.Degree;

public class DegreeTest {

    @Test
    public void testAccessing(){
        Degree degree = new Degree("TPI");
        assertEquals(degree.getName(), "TPI");
    }

}
