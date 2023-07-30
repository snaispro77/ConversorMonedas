package pe.conversor_monedas.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class LaminaGeneral extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon background;
	
	public LaminaGeneral() {
		setLayout(new BorderLayout());
		
		background = new ImageIcon("src/pe/conversor_monedas/img/bg.jpg");
		
		add(new LaminaSuperior(),BorderLayout.NORTH);
		add(new LaminaInferior(),BorderLayout.SOUTH);
		add(new LaminaCentral(),BorderLayout.CENTER);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
		Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 0, 0, 150), 50, getHeight(), new Color(0, 0, 0, 20));
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
	}
}
