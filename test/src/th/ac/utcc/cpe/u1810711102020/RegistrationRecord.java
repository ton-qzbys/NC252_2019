package th.ac.utcc.cpe.u1810711102020;

public class RegistrationRecord {
	private Student student;
	private Subject [] subjects;
	private int count = 0;
	public RegistrationRecord(){
		student = new Student();
		subjects = new Subject[10];
		for (int i=0; i < 10; i++){
			subjects[i] = new Subject();
		}
		
	}
	public RegistrationRecord(int n){
		student = new Student();
		subjects = new Subject[n];
		for (int i=0; i < n; i++){
			subjects[i] = new Subject();
		}
		
	}
	public void addSubjects(Subject s){
		if(count < subjects.length - 1){
			subjects[count] = s;
			count++;
		}
	}
	public void display(){
		for(int i = 0;i < count;i++){
			System.out.println("Subject 1 : "+subjects[i].toString());
		}
	}
}
