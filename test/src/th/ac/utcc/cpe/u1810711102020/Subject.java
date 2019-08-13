package th.ac.utcc.cpe.u1810711102020;

public class Subject {
	private String code;
	private String name;
	private String grade;
	private float unit;
	void setCode(String code){
		this.code = code;
	}
	String getCode(){
		return code;
	}
	void setName(String code){
		this.name = name;
	}
	String getName(){
		return name;
	}
	void setGrade(String code){
		this.grade = grade;
	}
	String getGrade(){
		return grade;
	}
	void setUnit(float code){
		this.unit = unit;
	}
	float getUnit(){
		return unit;
	}
	public String toString(){
		return "Code: "+ code + 
				", Name: " + name +
				", Unit: " + unit +
				", Grade: " + grade;
	}
	

}
