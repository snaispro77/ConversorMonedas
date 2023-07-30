package pe.conversor_monedas.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import pe.conversor_monedas.app.BotonCalcular;
import pe.conversor_monedas.app.BotonCambiar;

public class LaminaCentral extends JPanel{

	private static final long serialVersionUID = 1L;
	private static JTextField ingreso,salida;
	private static boolean estado;
	private JLabel ingresoEtiqueta,salidaEtiqueta;
	private JButton cambiar;
	private final Icon icono = new ImageIcon("src/pe/conversor_monedas/img/switch.png");
	
	
	public LaminaCentral() {

		setLayout(null);
		
		ingreso = new JTextField();
		salida = new JTextField();
		estado = true;
		
		cambiar = new JButton(icono);
		cambiar.setBounds(250,90,30,30);
		Font fuentePrincipal = new Font("Sans",0,24);
		
		ingresoEtiqueta = new JLabel("Ingrese monto:");
		salidaEtiqueta = new JLabel("Resultado:");
		
		ingresoEtiqueta.setFont(new Font("Monospaced",3,24));
		salidaEtiqueta.setFont(new Font("Monospaced",3,24));
		
		ingreso.setBounds(50,80,140,50);
		salida.setBounds(330,80,170,50);
		
		ingreso.setFont(fuentePrincipal);
		salida.setFont(fuentePrincipal);
		
		ingreso.setMargin(new Insets(0, 7, 0, 0));
		salida.setMargin(new Insets(0, 7, 0, 0));
		
		salida.setEditable(false);
		
		ingresoEtiqueta.setBounds(30,20,200,50);
		salidaEtiqueta.setBounds(340,20,200,50);
		
		ingresoEtiqueta.setForeground(new Color(253, 131, 255));
		salidaEtiqueta.setForeground(Color.CYAN);
		
		setOpaque(false);
		
		add(ingreso);
		add(ingresoEtiqueta);
		add(salida);
		add(salidaEtiqueta);
		add(cambiar);
		
		cambiar.addActionListener(new BotonCambiar());
		
		ingreso.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_DOWN_MASK), "calcular");
		
		ingreso.getActionMap().put("calcular", new BotonCalcular());
		
	}
	
	public static JTextField getIngresoField() {
		return ingreso;
	}
	public static JTextField getSalidaField() {
		return salida;
	}
	public static boolean isEstado() {
		return estado;
	}
	public static void setEstado(boolean b) {
		estado = b;
	}
}
