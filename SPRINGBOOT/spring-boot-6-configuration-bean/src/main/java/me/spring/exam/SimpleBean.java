package me.spring.exam;

/**
 * Một class cơ bản, không sử dụng `@Component`
 */
public class SimpleBean {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a simple bean, name: " + username;
	}

	public SimpleBean(String name) {
		setUsername(name);
	}
}
