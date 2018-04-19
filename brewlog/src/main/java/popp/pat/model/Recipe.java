package popp.pat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {
	private Integer id;
	private Float original_gravity;
	private Float final_gravity;
	private String name;
	private String description;
	private String style;
	
	public Recipe() {
		
	}
	
	public Recipe(Integer id, Float original_gravity, Float final_gravity, String name, String description, String style) {
		this.id = id;
		this.original_gravity = original_gravity;
		this.final_gravity = final_gravity;
		this.name = name;
		this.description = description;
		this.style = style;
	}
	
	@Id
	@Column(name="Id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="original_gravity")
	public Float getOriginal_gravity() {
		return original_gravity;
	}
	public void setOriginal_gravity(Float original_gravity) {
		this.original_gravity = original_gravity;
	}

	@Column(name="final_gravity")
	public Float getFinal_gravity() {
		return final_gravity;
	}
	public void setFinal_gravity(Float final_gravity) {
		this.final_gravity = final_gravity;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "style")
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
}
