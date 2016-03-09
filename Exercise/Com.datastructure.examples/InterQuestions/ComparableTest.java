package InterQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		Name n1= new Name("prashant","gaikwad");
		Name n2= new Name("pradip","gaikwadr");
		Name n3= new Name("chandu","raut");
		Name n4= new Name("prakash","khedkar");
		Name n5= new Name("shri","bhai");
		
		List<Name> nameList = new ArrayList<Name>();
		nameList.add(n1); nameList.add(n2); nameList.add(n3); nameList.add(n4); nameList.add(n5);
		System.out.println("Before sort "+nameList);
		Collections.sort(nameList);
		System.out.println("Sorted list "+nameList);
	}

}

class Name implements Comparable<Name> {

	String firstName, lastName;

	public Name(String firstName, String lastName) {
		if (firstName == null || lastName == null)
            throw new NullPointerException();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.firstName.equals(firstName) && n.lastName.equals(lastName);
	}

	public int hashCode() {
		return 31 * firstName.hashCode() + lastName.hashCode();
	}

	public String toString() {
		return firstName + "   " + lastName;
	}

	public int compareTo(Name n) {
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}