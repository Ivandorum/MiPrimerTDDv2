
public class Coche {

	public int velocidad;

	public void acelerar_Ivan(int aceleracion) {
		velocidad+=aceleracion;
	}

	public void decelerar_Ivan(int deceleracion) {
		velocidad-=deceleracion;
		if (velocidad<0)velocidad=0;
	}
}
