package Kodlama.io.Devs.odev.entities.conctretes;

public class ProgrammingLanguage {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}