import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	public void test_crear_coche_Ivan() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_acelerar_un_coche_su_velocidad_aumenta_Ivan() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_Ivan(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_disminuye_Ivan() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar_Ivan(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	

}
