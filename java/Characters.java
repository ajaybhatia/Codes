public class Characters {
	public static void main(String[] args) {	
		for (int j = 0; j < args.length; j++) {
			String value = args[j];
			for (int i = 0; i < value.length(); i++) {
				char ch = value.charAt(i); 
				if (ch >= 'a' && ch <= 'z')
					ch -= 32;
				else if (ch >= 'A' && ch <= 'Z')
					ch += 32;
				
				System.out.print((char)ch);
			}
		
			System.out.print(' ');	
		}
		
		System.out.println();
	}
}

