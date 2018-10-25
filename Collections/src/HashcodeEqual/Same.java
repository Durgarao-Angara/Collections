package HashcodeEqual;

public class Same {
	int k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Same s=new Same();
		s.k=10;
		Same s1=new Same();
		s1.k=10;
		String s2="hello";
		String	s3="hello";
		
		System.out.println("s hash code:"+s.hashCode() +"::::::::S1 hash code:"+s1.hashCode());
		
		System.out.println("s2 hello hash code:"+s2.hashCode() +"::::::::S3 hello hash code:"+s3.hashCode());
		
	}

}
