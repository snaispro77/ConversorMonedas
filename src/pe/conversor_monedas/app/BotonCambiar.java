package pe.conversor_monedas.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pe.conversor_monedas.gui.LaminaCentral;
import pe.conversor_monedas.gui.LaminaSuperior;

public class BotonCambiar implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(LaminaCentral.isEstado()) {
			LaminaSuperior.setSubtitulo("--- Dolares a Soles ---");
			LaminaCentral.setEstado(false);
		}
		else {
			LaminaSuperior.setSubtitulo("--- Soles a Dolares ---");
			LaminaCentral.setEstado(true);
		}
		
		LaminaCentral.getIngresoField().setText(null);
		LaminaCentral.getSalidaField().setText(null);
	}
}
