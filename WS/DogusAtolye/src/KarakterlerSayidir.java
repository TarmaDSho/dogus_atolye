
public class KarakterlerSayidir {

	public static void main(String[] args) {
		char ch = 'C';
		int i = ch;
		System.out.println(ch);
		System.out.println(i);
		ch++;
		System.out.println(ch);
		/*
		for (char c = 0; c < 64_000; c++) {
			System.out.print(c + " ");
			if ((c + 1) % 50 == 0)
				System.out.println();
		}
		*/
		System.out.println("He \\ said \"Java is fun\"");
		
		Integer o = 5;
		
		String s = "Merhaba";
		s += " java";
		
		String s1 = s;
		
		s = s.toUpperCase();
		
		System.out.println(s);

	}

}
