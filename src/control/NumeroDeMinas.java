package control;

public enum NumeroDeMinas {
	diez(10), veinte(20), treinta(30);
	private int valor;

	private NumeroDeMinas(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
}
