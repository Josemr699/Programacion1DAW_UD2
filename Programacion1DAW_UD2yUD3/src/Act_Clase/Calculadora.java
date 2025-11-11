package Act_Clase;

public class Calculadora {
	
	private double n1;
	private double n2;
	private String operador;
	
	public Calculadora(double n1, double n2, String operador) {
		this.n1 = n1;
		this.n2 = n2;
		setOperador(operador);
	}
	
	public double getN1() {
		return n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public String getOperador() {
		return operador;
	}
	
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public void setOperador(String operador) {
		if(!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
			throw new IllegalArgumentException("Introduce un operador correcto.");
		}
		
		this.operador = operador;
	}
	
	public void calcularIfElse() {
		if(operador.equals("+")) {
			System.out.println(n1+n2);
		}else if(operador.equals("-")) {
			System.out.println(n1-n2);
		}else if(operador.equals("*")) {
			System.out.println(n1*n2);
		}else if(operador.equals("/")) {
			System.out.println(n1/n2);
		}else {
			System.out.println("Introduce un operador correcto");
		}
	}
		
		public void calcularSwitch() {
			switch(operador) {
			case "+" -> System.out.println(n1+n2);
			case "-" -> System.out.println(n1-n2);
			case "*" -> System.out.println(n1*n2);
			case "/" -> System.out.println(n1/n2);
			default -> System.out.println("Introduce un operador correcto");
			}
	}

}
