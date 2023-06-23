package mbuchatskyi.user;

import java.util.Objects;

public class User {
	private String name;
	private int age;
	
	private User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static User createUser(String name, int age) {
		return new User(name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name = " + name + ", age = " + age + "]";
	}
	
	
}
