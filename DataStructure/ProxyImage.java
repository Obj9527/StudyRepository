
public class ProxyImage implements Imageable{
	private RealImage rI;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if (rI == null) {
			rI = new RealImage(fileName);
		}
		rI.display();
	}
}
