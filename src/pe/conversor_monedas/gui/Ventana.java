package pe.conversor_monedas.gui;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public Ventana() {
		setTitle("Conversor de monedas - By snais");
		setBounds(680,320,550,400);
		
		ImageIcon icono = new ImageIcon("src/pe/conversor_monedas/img/gaa.png");
		
		setIconImage(icono.getImage());
		
		setFont(new Font("Roboto",1,20));
		setResizable(false);
		
		add(new LaminaGeneral());
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
