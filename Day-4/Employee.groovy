import Person;


class Employe{
	String name;
	String empId; 
	String company;
	double salary;
	int age;
	String department;

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
		return "${name} is a man aged ${age} who lives at Delhi. He works for ${company} with employee id "+empId+" and draws "+salary+" lots of money !!!!.";

	}
}



List employeeList= [new Employe(name:"Haider",age:24,salary:20.50,company:'Intelligrape',empId:'Ig15',department:'grails'),new Employe(name:"Ajay",age:26,salary:30000,company:'Intelligrape',empId:'Ig14',department:'cq'),new Employe(name:"Deepak",age:28,salary:40000,company:'Intelligrape',empId:'Ig13',department:'grails'),new Employe(name:"Ramesh",age:29,salary:60000,company:'Intelligrape',empId:'Ig12',department:'cq')];

		
		println employeeList

		println employeeList.findAll{it.salary<25000}

		println employeeList.min{it.age}.name

		println employeeList.max{it.age}.name

		println employeeList.max{it.salary}.name

		println employeeList.name

Range r1=0..40000;
Range r2=18..35;

		println employeeList.findAll{r1.contains(it.salary)}.name



		println employeeList.groupBy({it.department})

		println employeeList.findAll{r2.contains(it.age)}.name


		def groupByName = {
			def a=it.name.charAt(0);

			"Starts with ${a}"
		}

		println employeeList.groupBy(groupByName)