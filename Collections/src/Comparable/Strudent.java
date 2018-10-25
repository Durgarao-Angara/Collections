package Comparable;

public class Strudent implements Comparable<Strudent> {
	public String StName;
	public int sNo;
	public String sclass;

	public Strudent(String stName, int sNo, String sclass) {

		this.StName = stName;
		this.sNo = sNo;
		this.sclass = sclass;
	}

	@Override
	public int compareTo(Strudent s) {
		// TODO Auto-generated method stub
		
		/* * if(sNo==s.sNo) { return 0; } if(sNo>s.sNo) { return 1; } else return
		 * -1;
		 
		
		 * int namesort=o1.getName().compareTo(o2.getName()); if(namesort!=0){
		 * return namesort; } else if((o1.getAge()-o2.getAge())!=0) { return
		 * o1.getAge()-o2.getAge(); }
		 */
		if ((sNo - s.sNo) != 0)
			return sNo - s.sNo;
		else
			return StName.compareTo(s.StName);

	}

}
