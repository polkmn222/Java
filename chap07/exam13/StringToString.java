package exam13;

class Friend {
	
	private String name;
	
	Friend(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "제 이름은 " + name + " 입니다.";
	}
}



public class StringToString {

	public static void main(String[] args) {
		
//		String name = new String("세종대왕");
		String name = ("세종대왕");
		
		System.out.println(name); //String type
		
		Friend friend1 = new Friend("홍길동");
		Friend friend2 = new Friend("이순신");
		
		System.out.println(friend1); // 참조변수
		System.out.println(friend2);
		
	}

}


// System.out.println();
//	public class System {
//		static PrintStream = out;
//	
//			System() {
//				out = new PrintStream();
//			}
//	
//		void println() {
//		
//		}
//}
