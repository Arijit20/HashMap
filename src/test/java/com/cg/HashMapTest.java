
package com.cg;

import org.junit.Test;

import com.cg.Node;

import static org.junit.Assert.*;

import org.junit.Assert;

public class HashMapTest {
	  @Test
	   public void givenSentenceReturnFrequency() {
		   String sentence = "To be or not to be";
		   HashMap<String, Integer> hashMap = new HashMap<>();
		   String[] words = sentence.toLowerCase().split(" ");
		   for(String word : words) {
			   Integer value = hashMap.get(word);
			   if(value == null) value = 1;
			   else value = value + 1;
			   hashMap.add(word, value);
		   }
		   int frequency = hashMap.get("to");
		   System.out.println(hashMap);
		   Assert.assertEquals(2, frequency);
	   }
}
