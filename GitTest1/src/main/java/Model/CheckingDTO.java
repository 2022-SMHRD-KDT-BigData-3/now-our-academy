package Model;

public class CheckingDTO {
	private String id;
	private String checkday;
	private int weigth;
	private int blood;
	private int bsugar;
	public CheckingDTO(String id,String checkday, int weigth, int blood, int bsugar, int height) {
		super();
		this.id=id;
		this.checkday = checkday;
		this.weigth = weigth;
		this.blood = blood;
		this.bsugar = bsugar;
		this.height = height;
	}
	private int act;
	private int height;
	private int age;
	
	public CheckingDTO(String id, int weigth, int blood, int bsugar, int act, int height, int age) {
		super();
		this.id = id;
		this.weigth = weigth;
		this.blood = blood;
		this.bsugar = bsugar;
		this.act = act;
		this.height = height;
		this.age = age;
	}


	public CheckingDTO(String id, String checkday, int weigth, int blood, int bsugar, int height, int age, int act) {
		super();
		this.id = id;
		this.checkday = checkday;
		this.weigth = weigth;
		this.blood = blood;
		this.bsugar = bsugar;
		this.act = act;
		this.height = height;
		this.age = age;
	}

	public CheckingDTO(String id, int weigth, int blood, int bsugar, int act) {
		super();
		this.id = id;
		this.weigth = weigth;
		this.blood = blood;
		this.bsugar = bsugar;
		this.act = act;
		this.height = height;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCheckday() {
		return checkday;
	}
	public void setCheckday(String checkday) {
		this.checkday = checkday;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getBsugar() {
		return bsugar;
	}
	public void setBsugar(int bsugar) {
		this.bsugar = bsugar;
	}
	public int getAct() {
		return act;
	}
	public void setAct(int act) {
		this.act = act;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
