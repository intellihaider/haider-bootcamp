import Person;


class Employe{
	String empId; 
	String company;
	int salary;

	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}

	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setEmpId(String empId){
		this.empId=empId;
	}
	public String getEmpId(){
		return empId;
	}
	@Override
	public String toString(){
		return "Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id "+empId+" and draws "+salary+" lots of money !!!!.";

	}
}

Employe employee = new Employe();
		employee.salary=230000;
		employee.@empId='IG2001';

		println employee
