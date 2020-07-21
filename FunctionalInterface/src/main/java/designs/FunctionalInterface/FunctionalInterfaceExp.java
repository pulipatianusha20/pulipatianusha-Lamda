package designs.FunctionalInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface MyInterface {
    List<String> palindrome(List<String> list);
}
public class FunctionalInterfaceExp {
	public static void main(String args[]) {
		MyInterface ref = (list) -> {
            List<String> l=new ArrayList<String>();
            for(String str:list) {
            	String result = "";
            	for (int i = str.length()-1; i >= 0 ; i--) {
            		result += str.charAt(i);
            	}
            	if(str.equals(result)) {
            		l.add(result);
            	}
            }
            return l;
        };
        List<String> strList = Arrays.asList("aba", "aba", "aef","bcb", "bcde", "defg", "jk");
        List<String> str=ref.palindrome(strList);
        System.out.println(str);
	}
}
