package HashcodeEqual;

public class CheckObject {

	public String name;
	

	public CheckObject(String name) {
		super();
		this.name = name;
	}

//check the without comment the hashcode and equals and with comment these methods.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckObject c1=new CheckObject("hello");
		CheckObject c2=new CheckObject("hello");
        System.out.println(c1.equals(c2));
     

	}

/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckObject other = (CheckObject) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	

}
