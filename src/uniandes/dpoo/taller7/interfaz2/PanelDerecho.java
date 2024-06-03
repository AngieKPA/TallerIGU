package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDerecho extends JPanel{
	
	private final static String NUEVO = "NUEVO";
	private final static String REINICIAR = "REINICIAR";
	private final static String  TOP = "TOP10";
	private final static String CAMBIARJUGADOR = "CAMBIAR JUGADOR";
	
	private JButton jButNuevo;
	private JButton jButReiniciar;
	private JButton jButTop;
	private JButton jButCambiarJugador;
	
	public PanelDerecho() {
		
		setLayout(new GridLayout(4,1));
		TitledBorder border = BorderFactory.createTitledBorder("Juego");
		border.setTitleColor(Color.BLUE);
		setBorder(border);


		jButNuevo = new JButton("Nuevo");
		jButReiniciar = new JButton("Reiniciar");
		jButTop = new JButton("Top 10");
		jButCambiarJugador = new JButton("Cambiar Jugador");
		

		
		add(jButNuevo);
		add(jButReiniciar);
		add(jButTop);
		add(jButCambiarJugador);
	}
}
