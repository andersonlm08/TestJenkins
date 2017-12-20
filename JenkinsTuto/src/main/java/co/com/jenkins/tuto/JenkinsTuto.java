package co.com.jenkins.tuto;

public class JenkinsTuto {

	public int calcularPrecio(int cantidad) {
		int precio = 0;
		int modulo = modulo(cantidad);
		
		if(modulo == 0 ){
			 precio = (cantidad/3) * 5000;
		}else{
			if((cantidad/3)>1){
				
			}
			return modulo * 2000;
		}
		
		return precio;
	}
	
	private int modulo(int cantidad){		
		return cantidad % 3;
	}
}
