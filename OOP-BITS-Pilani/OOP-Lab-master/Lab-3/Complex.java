public class Complex {
	double realPart;
	double imaginaryPart;
	
	public Complex() {
		this.realPart = 0.00;
		this.imaginaryPart = 0.00;
	}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex(double...c) {
		this.realPart = c[0];
		
		if(c.length == 1) {
			this.imaginaryPart = 0.00;
		}
		
		else {
			this.imaginaryPart = c[1];
		}
	}
	
	public Complex add(Complex other) {
		return new Complex((this.realPart+other.realPart), (this.imaginaryPart+other.imaginaryPart));
	}
	
	public Complex subtract(Complex other) {
		return new Complex((this.realPart-other.realPart), (this.imaginaryPart-other.imaginaryPart));
	}
	
	public Complex multiply(Complex y) {
		Complex x = this;
		return new Complex((x.realPart*y.realPart - x.imaginaryPart*y.imaginaryPart), (x.realPart*y.imaginaryPart + x.imaginaryPart*y.realPart));
	}
	
	public Complex divide(Complex y) {
		Complex x = this;
		
		Complex conj = new Complex(y.realPart, (-1)*y.imaginaryPart);
		Complex num = x.multiply(conj);
		
		double den = (y.multiply(conj)).realPart;
		num.realPart = num.realPart/den;
		num.imaginaryPart = num.imaginaryPart/den;
		
		return num;
	}
	
	public String toString() {
		return this.realPart+" + "+this.imaginaryPart+" i\n";
	}
}