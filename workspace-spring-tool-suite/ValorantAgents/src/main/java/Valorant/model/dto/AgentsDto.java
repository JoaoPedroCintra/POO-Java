package Valorant.model.dto;


public class AgentsDto {
	
	private Long id;
	private String name;
	private String category;
	private String skills;
	
	public AgentsDto() {
		
	}
	
	public AgentsDto(Long id, String name, String category, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.skills = skills;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
	
}
