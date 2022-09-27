package co09_dto;

class Friend{
	private String name;
	private String phone;
	private int age;
	
	public Friend() {
	}
	
	public Friend(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
}

public class MyFriend {
	public static void main(String[] args) {
		Friend f1 = new Friend("tom", "123", 11);
		Friend f2 = new Friend("sam", "234", 33);
		
		System.out.println(f1.getAge());
		
		celebrateBirthday(f1);
		
		System.out.println(f1.getAge());
	}

	private static void celebrateBirthday(Friend friend) {
		System.out.println(friend.getName() + "아, happy 생일, 아모르 파티~~~~");
		
		friend.setAge(friend.getAge()+1);
	}
}
