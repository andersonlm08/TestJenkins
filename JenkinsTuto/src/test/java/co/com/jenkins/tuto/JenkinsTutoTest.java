package co.com.jenkins.tuto;

import org.junit.Test;
import static org.junit.Assert.*;


public class JenkinsTutoTest {
	
	@Test
	public void debeCalcularPrecioMultiploTres(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 6;
		int precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 10000);
	}
	
	@Test
	public void debeCalcularPrecioNoMultipoTres2(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 1;
		int precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 2000);
	}
	
	@Test
	public void debeCalcularPrecioNoMultipoTres7(){
		
		JenkinsTuto jenkinsTuto = new JenkinsTuto();
		int cantidad = 2;
		int precio = jenkinsTuto.calcularPrecio(cantidad);
		
		assertTrue("Precio correcto", precio == 4000);
	}
	
	

}
