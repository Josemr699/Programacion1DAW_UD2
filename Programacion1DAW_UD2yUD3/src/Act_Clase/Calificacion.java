package Act_Clase;

public class Calificacion {
	
	private int nota;
	
	public Calificacion(int nota) {
		this.nota = nota;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public void mostrarResultadoIfElse() {
		if(nota>=0 && nota<=4) {
			System.out.println("INSUFICIENTE");
		}else if(nota == 5) {
			System.out.println("SUFICIENTE");
		}else if(nota == 6) {
			System.out.println("BIEN");
		}else if(nota>=7 && nota<=8) {
			System.out.println("NOTABLE");
		}else if(nota>=9 && nota<=10) {
			System.out.println("SOBRESALIENTE");
		}else {
			System.out.println("Introduce una nota del 0 al 10");
		}
	}
	
	public void mostrarResultadoSwitch() {
		switch(nota) {
		case 0,1,2,3,4 -> System.out.println("INSUFICIENTE");
		case 5 -> System.out.println("SUFICIENTE");
		case 6 -> System.out.println("BIEN");
		case 7,8 -> System.out.println("NOTABLE");
		case 9,10 -> System.out.println("SOBRESALIENTE");
		default -> System.out.println("Introduce una nota del 0 al 10");
		}
		
			
	}

}
