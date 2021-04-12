package phone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring, Ring, Ring!");
		IPhone iphoneX = new IPhone("X", 89, "AT&T", "Zinga!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneX.displayInfo();
		System.out.println(iphoneX.ring());
		System.out.println(iphoneX.unlock());
	}
}
