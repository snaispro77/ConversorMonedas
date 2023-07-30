package pe.conversor_monedas.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LaminaSuperior extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	private static JLabel subtitulo;
	
	public LaminaSuperior() {
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(new Insets(10, 0, 0, 0)));
		setOpaque(false);
		
		titulo = new JLabel("Conversor de Monedas");
		subtitulo = new JLabel("--- Soles a Dolares ---");
		
		titulo.setFont(new Font("Rem",Font.BOLD,38));
		titulo.setForeground(Color.white);
		
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		subtitulo.setFont(new Font("Sans", 3,28));
		subtitulo.setForeground(new Color(241, 196, 15));
		
		add(titulo,BorderLayout.NORTH);
		add(subtitulo,BorderLayout.SOUTH);
	}
	
	public static void setSubtitulo(String s) {
		subtitulo.setText(s);
	}
}
