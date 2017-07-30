
public class Application {
	public static void main(String[] args) {
		
		String Password = "";
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
		
		for(int i=0; i<13; i++){
			Password += text.charAt((int) Math.floor(Math.random()*text.length()));
		}
		System.out.println(Password);
	}
}
