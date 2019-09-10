package th.ac.utcc.cpe.u1810711102020;

public class sortingSubjectArray {
	private subject [] element;
	private int eSize;

	
	public sortingSubjectArray (int size) {
		if(size > 0)
			this.element = new subject[size];
		else
			this.element = new subject[10];
		
		eSize = 0;
		
	}

	public void bubbleSort() {
		int out, in;
		
		for(out = eSize - 1; out > 0 ; out--) {
			for(in = 0; in < out ; in++) {
				if(this.element[in].getCode().compareTo(this.element[in + 1].getCode())>0) {
					subject temp = this.element[in];
					this.element[in] = this.element[in + 1];
					this.element[in + 1] = temp;
				}
			}
		}
	}
	
	public void insert(subject e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for( int i=0; i < eSize; i++ ) {
			System.out.println(this.element[i].getCode()+" : "+this.element[i].getName());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		sortingSubjectArray sortingSubject = new sortingSubjectArray(3);
		
		subject s1 = new subject("Mathematic for Engineering");
		s1.setCode("NG101");
		s1.setGrade("C");
		s1.setUnit(3);
		
		subject s2 = new subject("Data Structures & Algorithms");
		s2.setCode("NC252");
		s2.setGrade("A");
		s2.setUnit(3);
		
		subject s3 = new subject("Physics for Engineering");
		s3.setCode("NG104");
		s3.setGrade("D");
		s3.setUnit(3);
		
		sortingSubject.insert(s1);
		sortingSubject.insert(s2);
		sortingSubject.insert(s3);
		System.out.println("Before Sorting");
		sortingSubject.show();

		sortingSubject.bubbleSort();
		
		System.out.println("After Sorting");
		sortingSubject.show();
		
	}

}
