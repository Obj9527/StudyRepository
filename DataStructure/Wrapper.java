
public class Wrapper implements Targetable{
	private Sourse sourse;
	
	public Wrapper(Sourse sourse) {
		// TODO Auto-generated constructor stub
		this.sourse = sourse;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		sourse.method();		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is method2");
	}

}
