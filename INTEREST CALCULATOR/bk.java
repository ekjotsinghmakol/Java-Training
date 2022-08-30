package bankingsystem;

public class bk {

	float p, r, t;
	int age;
	String gender;
	
	
//	si =(p*r*t)/100;
	
	public bk(float p, float r, float t, int age, String gender){
		super();
		this.p = p;
		this.r = r;
		this.t = t;
		this.age = age;
		this.gender = gender;
	}

	public float getP() {
		return p;
	}

	public void setP(float p) {
		this.p = p;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getT() {
		return t;
	}

	public void setT(float t) {
		this.t = t;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	
}
