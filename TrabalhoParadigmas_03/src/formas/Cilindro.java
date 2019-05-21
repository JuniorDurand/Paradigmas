package formas;

public class Cilindro extends Circulo{
	protected double h;


	public Cilindro(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}

	public double getAltura() {
		return h;
	}

	public void setAltura(double h) {
		this.h = h;
	}
	
	public double calcArea() {
		return 2*super.calcArea() + h*super.calcCirc();
	}
	
	public double calcVolume() {
		return h*super.calcArea();
	}

	@Override
	public String toString() {
		return "Cilindro [Altura = " + h 
				+ ", Raio = " + r 
				+ ", x = " + x 
				+ ", y = " + y 
				+ ", Area = " + calcArea()
				+ ", Volume = " + calcVolume() + "]";
	}
	
	

	
	
	
}
