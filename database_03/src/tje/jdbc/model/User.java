package tje.jdbc.model;

public class User {
	
	@Override
	public String toString() {
		return "id=" + id + ", password=" + password + ", name=" + name + ", alias=" + alias + ", tel=" + tel;
	}

	private String id;
	private String password;
	private String name;
	private String alias;
	private String tel;
	
	public User() {}

	public User(String id) {
		this.id = id;
	}
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	
	public User(String id, String password, String name, String alias, String tel) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.alias = alias;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
