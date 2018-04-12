package root.maven.models;

public class Person {
	private String name;
	private String data;

	public Person() {
		super();
	}
	
	public Person(String name, String data) {
		super();
		this.name = name;
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", data=" + data + "]";
	}
	
	
	
}
