package lexical_analyzer;

public class Practice {
	public static void main(String[] args) {
		String str = "abc 	de ";

		// split 함수에 공백문자를 지정
		String[] strArray = str.split(" ");

		for(String s : strArray) {
			System.out.println(s);
			System.out.println(strArray.length);
			
		}
    }
}
