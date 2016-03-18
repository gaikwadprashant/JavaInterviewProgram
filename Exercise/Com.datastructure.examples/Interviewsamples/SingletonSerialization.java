package Interviewsamples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SingletonSerialization singletonSerialization = null;

	private SingletonSerialization() {
	}

	public static SingletonSerialization getInstance() {
		if (null == singletonSerialization) {
			synchronized (SingletonSerialization.class) {
				if (null == singletonSerialization) {
					singletonSerialization = new SingletonSerialization();
				}
			}
		}
		return singletonSerialization;
	}

	private void writeObject(ObjectOutputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultWriteObject();
		synchronized (SingletonSerialization.class) {
			if (singletonSerialization == null) {
				// re-initialize if needed
				singletonSerialization = this; // only if everything succeeds
			}
		}
	}

	// this function must not be called other than by the deserialization
	// runtime
	private Object readResolve() throws ObjectStreamException {
		assert(singletonSerialization != null);
		return singletonSerialization;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		assert(getInstance() == getInstance());
		ByteArrayOutputStream fis = new ByteArrayOutputStream();
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		System.out.println("Object before serialization is "+getInstance());
		ois.writeObject(getInstance());
		
		ByteArrayInputStream bis = new ByteArrayInputStream(fis.toByteArray());
		ObjectInputStream oiis = new ObjectInputStream(bis);
		SingletonSerialization singletonObj = (SingletonSerialization)oiis.readObject();
		System.out.println("Object after serialization is "+singletonObj);
		assert(singletonObj == getInstance());
	}

}
