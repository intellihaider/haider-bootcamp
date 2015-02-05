class Person{
	public String name;
	public String gender;
	public String address;
	public int age;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}

	@Override

	public String toString(){
		return name+"::"+gender+"::"+age+"::"+address;

	}

	public static void main(String...a){

		Person person = new Person();
		person.setAge(23);
		person.setName("Haider");
		person.setGender("Male");
		person.setAddress("Bareilly");

		System.out.println(person);
	}



}