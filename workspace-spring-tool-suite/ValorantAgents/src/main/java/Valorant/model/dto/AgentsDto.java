// Valter Gomes e João Pedro Cintra 	4ºADS_M
package Valorant.model.dto;


public class AgentsDto {
	
	private Long id;
	private String name;
	private String category;
	private String q;
	private String e;
	private String c;
	private String x;
	
	public AgentsDto() {
		
	}

	public AgentsDto(Long id, String name, String category, String q, String e, String c, String x) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.q = q;
		this.e = e;
		this.c = c;
		this.x = x;
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

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	

	
}
