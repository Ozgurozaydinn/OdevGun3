package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getEmail());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getEmail());
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: " + user.getEmail());
	}
}
