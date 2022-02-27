package practiceMyself.aboutStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class StreamCollectPractice {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
					new User("a", 10, "male"),
					new User("b", 11, "male"),
					new User("c", 12, "female"),
					new User("d", 13, "female")
				);
		
		Supplier<Map<String, Integer>> container =  new Supplier<>() {
			@Override
			public Map<String, Integer> get() {
				return new HashMap<String, Integer>();
			}
		};
		
		BiConsumer<Map<String, Integer>, User> putInContainer = new BiConsumer<>() {

			@Override
			public void accept(Map<String, Integer> map, User user) {
				map.put(user.getName(), user.getAge());
			}
		};
		
		BiConsumer<Map<String, Integer>, Map<String, Integer>> connectContainer = (map1,  map2) -> map1.putAll(map2) ;
		
		
		Map<String, Integer> resultMap = users.stream().collect(container, putInContainer, connectContainer);
		System.out.println(resultMap);
				
		
		
	}

}


class User{
	private String name;
	private Integer age;
	private String sex;
	
	public User() {
	}
	
	public User(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
	
}