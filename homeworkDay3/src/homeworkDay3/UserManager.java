package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getEmail());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getEmail());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getEmail());
	}
}
