package Testcases;

import java.util.HashMap;
import java.util.Map;

public class BrowserTest {

	public static void main(String[] args) {
		
		String str="My Name Is Vishal Chaudhary";
		Map<Character, Integer> charMap =new HashMap<Character,Integer>();
		char strArray[]=  str.toCharArray();
		
		for(char c: strArray)
		{
			if(charMap.containsKey(c))
				 charMap.put(c ,charMap.get(c)+1);
			else
			  charMap.put(c, 1);
			
		}
		System.out.println(str + charMap);
	}

}
