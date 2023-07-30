package pe.conversor_monedas.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import pe.conversor_monedas.app.BotonCalcular;

public class LaminaInferior extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton calcular;

	public LaminaInferior() {
		calcular = new JButton("Calcular");
		
		calcular.setFont(new Font("monospaced",1,20));
		calcular.setPreferredSize(new Dimension(150,45));
		
		setOpaque(false);
		setBorder(new EmptyBorder(new Insets(0, 0, 20, 0)));
		add(calcular);
		
	}
}
