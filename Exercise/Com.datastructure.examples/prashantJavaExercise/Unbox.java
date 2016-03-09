package prashantJavaExercise;

class Shape {
    public Shape makeCopy() {
		return null;
        // code to make a copy of this Shape
    }
}

class Circle extends Shape {
   @Override
    public Circle makeCopy() {
		return null;
        // code to make a copy of a Circle
    }
}

public class Unbox {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape c = s.makeCopy();
    }
}
