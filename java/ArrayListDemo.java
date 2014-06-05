import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add('A');
		list.add("BCA");
		list.add("Mcleodganj");
		list.add("Manchurian");
		list.add(3.1415);
		list.add("Paneer Pakoda");
		
		list.add(5, "Palampur");
		
		list.remove("BCA");
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
