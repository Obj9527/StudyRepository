
public class Decorator implements Sourceable{
	private Sourceable sourse;
	
	public Decorator(Sourceable sourse) {
		// TODO Auto-generated constructor stub
		this.sourse = sourse;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("befor decorator");
		sourse.method();
		System.out.println("after decorator");
	}
	
}
