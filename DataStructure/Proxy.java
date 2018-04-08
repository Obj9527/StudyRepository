
public class Proxy implements Sourceable{
	private Sourse sourse;
	
	public Proxy() {
		super();
		this.sourse = new Sourse();
	}
		
	@Override
	public void method() {
		before();
		sourse.method();
		after();
	}

	private void after() {
		System.out.println("after proxy");
	}

	private void before() {
		System.out.println("before proxy");
	}

}
