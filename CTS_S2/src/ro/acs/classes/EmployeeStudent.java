package ro.acs.classes;

public class EmployeeStudent {
	int salaryPerHour;
	//int salary;
	int hours;

	public void reportHours(int hoursWorked) {
		hours+=hoursWorked;
		//salary=salaryPerHour*hours;
		
	}
	
	public int calculateSalary() {
		return salaryPerHour*hours;
	}
	//public int findMinInsideUnsortedArray(int [] v) throws Exception {
	public int findMinInsideUnsortedArray(int [] v) throws Exception {
		if(v==null || v.length==0 ) {
			throw new Exception("Vector is null");
		}
		int min=v[0];
		/*for(int i=1;i<v.length-1;i=i+2) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		for(int i=2;i<v.length;i=i+2) {
			if(min>v[i]) {
				min=v[i];
			}
		}*/
		
		for(int i=0;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}
	
	public String getExam(int numberExam) throws Exception {
	  String exams[]= {"OOP Exam", "Java Exam", "Data structure Exam", "C# Exam", "Statistics Exam"};
		if(numberExam>=exams.length)
			throw new Exception("exam must be in range 1 to 5");
		else 
			return exams[numberExam];
		/* switch (numberExam) {
	        case 1:
	            return "OOP Exam";
	        case 2:
	            return "Java Exam";
	        case 3:
	            return "Data structure Exam";
	        case 4:
	            return "C# Exam";
	        case 5:
	            return "Statistics Exam";
	        
	        default:
	            throw new Exception("exam must be in range 1 to 5");
	    }
	    */
	}



}




