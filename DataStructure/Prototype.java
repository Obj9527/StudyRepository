import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable{
	private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObject object;
	
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		ObjectOutputStream ooStrem = new ObjectOutputStream(boStream);
		ooStrem.writeObject(this);
		
		ByteArrayInputStream biStream = new ByteArrayInputStream(boStream.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(biStream);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObject() {
		return object;
	}

	public void setObject(SerializableObject object) {
		this.object = object;
	}
}

class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L;  
}  
