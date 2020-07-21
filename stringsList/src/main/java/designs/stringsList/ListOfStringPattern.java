package designs.stringsList;

import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors;

public class ListOfStringPattern {
	public static List<String> stringPatternList(List<String> list){
		List<String> count = list.stream().filter(x -> x.startsWith("a")).filter(x -> x.length()<=3).collect(Collectors.toList());
		return count;
	}
	public static void main(String args[]) {
		List<String> strList = Arrays.asList("abc", "abcd", "aef","bcd", "bcde", "defg", "jk"); 
		List<String> str=stringPatternList(strList);
		System.out.println(str);

	}
}