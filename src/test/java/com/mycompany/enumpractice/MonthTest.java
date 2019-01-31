/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enumpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kona
 */
public class MonthTest {
    
    public MonthTest() {
    }
    
    @Test
    public void parseTest(){
        
        //All Month full name check
        assertNotNull(Month.parse("JANUARY"));
        assertNotNull(Month.parse("FEBRUARY"));
        assertNotNull(Month.parse("MARCH"));
        assertNotNull(Month.parse("APRIL"));
        assertNotNull(Month.parse("MAY"));
        assertNotNull(Month.parse("JUNE"));
        assertNotNull(Month.parse("JULY"));
        assertNotNull(Month.parse("AUGUST"));
        assertNotNull(Month.parse("SEPTEMBER"));
        assertNotNull(Month.parse("OCTOBER"));
        assertNotNull(Month.parse("NOVEMBER"));
        assertNotNull(Month.parse("DECEMBER"));
        
        //All Month short name check       
        assertNotNull(Month.parse("JAN"));
        assertNotNull(Month.parse("FEB"));
        assertNotNull(Month.parse("MAR"));
        assertNotNull(Month.parse("APR"));
        assertNotNull(Month.parse("MAY"));
        assertNotNull(Month.parse("JUN"));
        assertNotNull(Month.parse("JUL"));
        assertNotNull(Month.parse("AUG"));
        assertNotNull(Month.parse("SEP"));
        assertNotNull(Month.parse("OCT"));
        assertNotNull(Month.parse("NOV"));
        assertNotNull(Month.parse("DEC"));
        
        //CaseSentivity check
        assertNotNull(Month.parse("NovEmbER"));
        assertNotNull(Month.parse("deCeMBEr"));
        
        //invalid input not taken check
        assertNull(Month.parse("AP"));
        assertNull(Month.parse("Marc"));

    }
    
    @Test
    public void getDaysInMonthTest(){
        
        assertSame(31, Month.JANUARY.getDaysInMonth());
        assertSame(28, Month.FEBRUARY.getDaysInMonth());
        assertSame(31, Month.MARCH.getDaysInMonth());
        assertSame(30, Month.APRIL.getDaysInMonth());
        assertSame(31, Month.MAY.getDaysInMonth());
        assertSame(30, Month.JUNE.getDaysInMonth());
        assertSame(31, Month.JULY.getDaysInMonth());
        assertSame(31, Month.AUGUST.getDaysInMonth());
        assertSame(30, Month.SEPTEMBER.getDaysInMonth());
        assertSame(31, Month.OCTOBER.getDaysInMonth());
        assertSame(30, Month.NOVEMBER.getDaysInMonth());
        assertSame(31, Month.DECEMBER.getDaysInMonth());
       
        assertNotSame(23, Month.APRIL.getDaysInMonth());
        assertNotSame(31, Month.FEBRUARY.getDaysInMonth());
        
      
    }
    

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}


}
