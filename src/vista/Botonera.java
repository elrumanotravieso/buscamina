package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Botonera extends JPanel {
	public JButton[][] botones;

	public Botonera(int filas, int columnas) {
		GridLayout layoutBotonera= new GridLayout(4,4);
		layoutBotonera.setHgap(-2);
		layoutBotonera.setVgap(-2);
		layoutBotonera.setColumns(columnas);
		layoutBotonera.setRows(filas);
		setLayout(layoutBotonera);
		iniciarBotonera(filas,columnas);
	}

	private void iniciarBotonera(int filas,int columnas) {
		this.botones=new JButton[filas][columnas];
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones.length; j++) {
				this.botones[i][j]=new JButton();
				this.botones[i][j].setName(String.valueOf(i)+ " " +String.valueOf(j));
				this.add(this.botones[i][j]);
			}
		}
		
	}

}
