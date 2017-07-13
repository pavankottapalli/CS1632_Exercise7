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

   //Testing the Refactored getFirstMonkey method and esuring the same result as old getFirstMonkey method for 10 Monkeys
	 @Test
     public void testgetFirstMonkeyMethod10() {
     List<Monkey> ml = new ArrayList<Monkey>();
     for (int i = 0; i < 10; i++) {
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

   
}