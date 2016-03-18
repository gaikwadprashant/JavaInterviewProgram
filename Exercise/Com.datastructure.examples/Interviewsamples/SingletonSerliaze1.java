package Interviewsamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerliaze1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7241838163605267786L;
	private int i =10;
	private volatile static SingletonSerliaze1 singleton = null;
	
	private SingletonSerliaze1(){}
	
	public static SingletonSerliaze1 getInstance(){
		if(null == singleton){
			//synchronized (SingletonSerliaze1.class) {
				singleton = new SingletonSerliaze1();
			//}
		}
		System.out.println("Hashcode for singleton is "+singleton.hashCode());
		return singleton;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	private Object readResolve(){
		//if(null == singleton){
			return singleton;
		//}
	}
	
	public static void main(String args[]) throws ClassNotFoundException{
		final SingletonSerliaze1 instanceOne = SingletonSerliaze1.getInstance();
		//SingletonSerliaze1 one = new SingletonSerliaze1();
		//System.out.println("Hashcode is "+one.hashCode());
		try {
			FileOutputStream fis = new FileOutputStream("serl.ser");
			ObjectOutputStream ois = new ObjectOutputStream(fis);
			ois.writeObject(instanceOne);
			ois.close();
			instanceOne.setI(200);
			//System.out.println("Before serliazation "+instanceOne.getI());
			FileInputStream ins = new FileInputStream("serl.ser");
			ObjectInputStream ios = new ObjectInputStream(ins);
			SingletonSerliaze1 instanceTwo = (SingletonSerliaze1)ios.readObject();
			ios.close();
			System.out.println("Before serliazation "+instanceOne.getI());
			System.out.println("Before serliazation "+instanceTwo.getI());
		} catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	
}
