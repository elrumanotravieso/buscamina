package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import control.Densidad;
import control.NumeroMinas;
import control.NumeroDeMinas;

public class PantallaInicial extends JPanel {
	public PantallaInicial() {
		setForeground(Color.RED);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblBuscaminas = new JLabel("BUSCAMINAS");
		lblBuscaminas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBuscaminas.setBounds(164, 32, 136, 14);
		add(lblBuscaminas);
		
		JLabel lblNumeroDeMinas = new JLabel("Numero De Minas");
		lblNumeroDeMinas.setForeground(Color.BLACK);
		lblNumeroDeMinas.setBackground(Color.RED);
		lblNumeroDeMinas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroDeMinas.setBounds(50, 107, 127, 19);
		add(lblNumeroDeMinas);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setBounds(176, 194, 89, 23);
		add(btnJugar);
		
		JComboBox Dificultad = new JComboBox();
		Dificultad.setModel(new DefaultComboBoxModel(Densidad.values()));
		Dificultad.setBounds(174, 137, 89, 31);
		add(Dificultad);
		
		JLabel lblDificultad = new JLabel("Dificultad");
		lblDificultad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDificultad.setBounds(76, 140, 88, 23);
		add(lblDificultad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(NumeroDeMinas.values()));
		comboBox.setBounds(173, 107, 92, 20);
		add(comboBox);
	}
}
