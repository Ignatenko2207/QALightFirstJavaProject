package ua.com.qalight.vovk;

public class User {

	private String userName;
	
	private String ureSurname;

	private Integer age;
	
	private int userId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUreSurname() {
		return ureSurname;
	}

	public void setUreSurname(String ureSurname) {
		this.ureSurname = ureSurname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
		
		
	}
	
	public static void showUserClassName() {
	
		System.out.println(User.class.getSimpleName());
		
}
		}
