package formas;

public class Circulo extends Ponto{
	protected double r;

	public Circulo(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double calcArea() {
		return Math.PI*Math.pow(r, 2);
	}
	
	public double calcCirc(){
		return 2*Math.PI*r;
	}

	@Override
	public String toString() {
		return "Circulo [Raio=" + r 
				+ ", x=" + x 
				+ ", y=" + y 
				+", Area =" + calcArea()
				+ ", Circunferencia =" + calcCirc() 
				+   "]";
	}
	
	
	
}
