package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import uniandes.dpoo.taller7.interfaz2.PanelDerecho;
import uniandes.dpoo.taller7.interfaz2.PanelInferior;
import uniandes.dpoo.taller7.interfaz2.PanelSuperior;
import uniandes.dpoo.taller7.interfaz3.PanelTablero;
/*Venm*/
public class InterfazLightsOut extends JFrame{
	private PanelTablero panelTablero;
	private PanelDerecho panelDerecho;
	private PanelInferior panelInferior;
	private PanelSuperior panelSuperior;
	
	public static void main(String[] arg) {
		
		InterfazLightsOut interfaz = new InterfazLightsOut ();
		interfaz.setVisible(true);
	}

public InterfazLightsOut() {	
	setTitle("Juego de LightsOut");
	setSize(700,450);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout( ) );
	
	panelTablero = new PanelTablero();
	panelDerecho = new PanelDerecho();
	panelInferior = new PanelInferior();
	panelSuperior = new PanelSuperior();
	
	add(panelTablero, BorderLayout.CENTER);
	add(panelInferior, BorderLayout.SOUTH);
	add(panelDerecho, BorderLayout.EAST);
	add(panelSuperior, BorderLayout.NORTH);
	}
}
