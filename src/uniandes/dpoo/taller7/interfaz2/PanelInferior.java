package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInferior extends JPanel{
	
	private JLabel jugadas;
	private JTextField txtJugadas;
	private JLabel jugador;
	private JTextField txtJugador;	
	
	
	public PanelInferior() {
		
		setLayout(new GridLayout(1,4));
		TitledBorder border = BorderFactory.createTitledBorder("Datos");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		jugadas = new JLabel("Jugadas");
		txtJugadas = new JTextField();
		jugador = new JLabel("Jugador");
		txtJugador = new JTextField();
		
		
		add(jugadas);
		add(txtJugadas);
		add(jugador);
		add(txtJugador);
		}
}
