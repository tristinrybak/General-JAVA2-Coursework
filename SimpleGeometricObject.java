//Tristin Rybak
//Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an
//answer is entered again.
public class SimpleGeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  public SimpleGeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with the specified color
    *  and filled value */
  public SimpleGeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
}

class Triangle extends SimpleGeometricObject{
	    private double side1;
	    private double side2;
	    private double side3;

		public Triangle(){//create default circle
		side1 = 1;
		side2 = 1;
		side3 = 1;
		}

		public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		}

		public double getside1() {
			return side1;
		}

		public double getside2() {
			return side2;
		}

		public double getside3() {
			return side3;
		}

		public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		 return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}

		public double getPerimeter(){
				return (side1 + side2 + side3);
		}

		public String toString(){
			return ("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
		}

}