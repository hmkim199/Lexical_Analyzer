package lexical_analyzer;

public class Practice {
	public static void main(String[] args) {
		String str = "abc 	de ";

		// split �Լ��� ���鹮�ڸ� ����
		String[] strArray = str.split(" ");

		for(String s : strArray) {
			System.out.println(s);
			System.out.println(strArray.length);
			
		}
    }
}
