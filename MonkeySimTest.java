import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.*;

import java.util.*;


public class MonkeySimTest {
	
	 //Testing the Refactored getFirstMonkey method and esuring the same result as old getFirstMonkey method for one Monkey
	 @Test
     public void testgetFirstMonkeyMethod() {
     List<Monkey> ml = new ArrayList<Monkey>();
     ml.add(new Monkey());
     assertEquals(MonkeySim.getFirstMonkey(ml), MonkeySim.getFirstMonkeyNew(ml));
    }

     //Testing the Refactored getFirstMonkey method and esuring the same result as old getFirstMonkey method for Max Monkeys
	 @Test
     public void testgetFirstMonkeyMethod10() {
     List<Monkey> ml = new ArrayList<Monkey>();
     for (int i = 0; i < Integer.MAX_VALUE; i++) {
     	ml.add(new Monkey());
     }
     assertEquals(MonkeySim.getFirstMonkey(ml), MonkeySim.getFirstMonkeyNew(ml));
    }

     //Testing the Refactored getFirstMonkey method and esuring the same result as old getFirstMonkey method for 0 Monkeys
	 @Test
     public void testgetFirstMonkeyMethod0() {
     List<Monkey> ml = new ArrayList<Monkey>();
     for (int i = 0; i < 0; i++) {
     	ml.add(new Monkey());
     }
     assertEquals(MonkeySim.getFirstMonkey(ml), MonkeySim.getFirstMonkeyNew(ml));
    }

    //Testing the Refactored teststringifyResults method and esuring the same result as old teststringifyResults method
    @Test
    public void teststringifyResults() {
    MonkeySim s1 = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(s1.stringifyResults(1,m1,m2), s1.stringifyResultsNew(1,m1,m2));
    }

    //Testing the Refactored teststringifyResults method and esuring the same result as old teststringifyResults method - Max_Value
    @Test
    public void teststringifyResultsMax() {
    MonkeySim s1 = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(s1.stringifyResults(Integer.MAX_VALUE,m1,m2), s1.stringifyResultsNew(Integer.MAX_VALUE,m1,m2));
    }

    //Testing the Refactored teststringifyResults method and esuring the same result as old teststringifyResults method - Min_Value
    @Test
    public void teststringifyResultsMin() {
    MonkeySim s1 = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(s1.stringifyResults(Integer.MIN_VALUE,m1,m2), s1.stringifyResultsNew(Integer.MIN_VALUE,m1,m2));
    }

    //Testing the Refactored teststringifyResults method and esuring the same result as old teststringifyResults method - 0
    @Test
    public void teststringifyResults0() {
    MonkeySim s1 = new MonkeySim();
    Monkey m1 = new Monkey();
    Monkey m2 = new Monkey();
    assertEquals(s1.stringifyResults(0,m1,m2), s1.stringifyResultsNew(0,m1,m2));
    }
}