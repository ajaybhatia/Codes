public class TestEdible {
	public static void main(String[] args) {
		Object[] objects = { 
			new Mango(),
			new Orange(),
			new Apple()
		};
		
		for(int i = 0; i < objects.length; i++)
			System.out.println(((Edible)objects[i]).howToEat());
	}
}