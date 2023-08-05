package movie_purchasing;

public class Movie {
	private int id,pay;
	private String name,language,type;
	
	public Movie(int id,String name,String language,String type,int pay) {
		this.id=id;
		this.name=name;
		this.language=language;
		this.type=type;
		this.pay=pay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void print() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.language);
		System.out.println(this.pay);
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", pay=" + pay + ", name=" + name + ", language=" + language + ", type=" + type
				+ "]";
	}
	

}
