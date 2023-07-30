package pe.conversor_monedas.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import pe.conversor_monedas.gui.LaminaCentral;

public class BotonCalcular extends AbstractAction {
	private float monto;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			transformar();
		} catch (NumberFormatException exc) {
			JOptionPane.showMessageDialog(null, "Solo se permiten CIFRAS");
		}
	}
	private void transformar() {
		monto = Float.parseFloat(LaminaCentral.getIngresoField().getText());
		if(LaminaCentral.isEstado()) {
			if(Float.toString(monto).length() <= 11) {
				monto = monto * (1/3.59f);
				DecimalFormat formato = new DecimalFormat("#.##");
				LaminaCentral.getSalidaField().setText(formato.format(monto) + " $");
				LaminaCentral.getSalidaField().setAlignmentX(SwingConstants.LEFT);
			}else {
				JOptionPane.showMessageDialog(null, "Introduzca un numero más corto");	
				LaminaCentral.getIngresoField().setText(null);
			}
		}else {
			if(Float.toString(monto).length() <= 11) {
				monto = monto * 3.59f;
				DecimalFormat formato = new DecimalFormat("#.##");
				LaminaCentral.getSalidaField().setText("S/. " + formato.format(monto) );
				LaminaCentral.getSalidaField().setAlignmentX(SwingConstants.LEFT);
			}else {
				JOptionPane.showMessageDialog(null, "Introduzca un numero más corto");	
				LaminaCentral.getIngresoField().setText(null);
			}
		}
	}
}
