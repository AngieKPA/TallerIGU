package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class PanelSuperior extends JPanel {
	
	private JLabel tamaño;
	private JComboBox lista;
	
	private JLabel dificultad;
	private JRadioButton JButtonFacil;
	private JRadioButton JButtonMedio;
	private JRadioButton JButtonDificil;
	
	public PanelSuperior() {
		
		setLayout(new FlowLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Configuraciones");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		tamaño = new JLabel("Tamaño");
		
		lista = new JComboBox<>(new String[]{"5x5", "6x6", "7x7", "8x8", "9x9", "10x10"});
		
		dificultad = new JLabel("Dificultad");
		JButtonFacil = new JRadioButton("Facil");
		JButtonMedio = new JRadioButton("Medio");
		JButtonDificil = new JRadioButton("Dificil");
		
		
		
		add(tamaño, null);
		add(lista,null);
		add(dificultad,null);
		
		ButtonGroup groupButtons = new ButtonGroup();
		groupButtons.add(JButtonFacil);
		groupButtons.add(JButtonMedio);
		groupButtons.add(JButtonDificil);
		
		
		add(JButtonFacil);
        add(JButtonMedio);
        add(JButtonDificil);
	}

}
