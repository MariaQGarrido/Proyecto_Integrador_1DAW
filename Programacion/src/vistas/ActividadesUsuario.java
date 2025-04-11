package vistas;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class ActividadesUsuario extends JFrame{

	private JMenuBar menuBar;
	private JLabel actividades;
	private JLabel actividadesDisponibles;
	private JLabel actividadesInscritas;
	private JScrollPane scrollActDisponibles;
	private JScrollPane scrollActInscritas;
//	private JList<Actividades> listActDisponibles;
//	private Jlist<Actividades> listActInscritas;
	
	
	
	
	public ActividadesUsuario() {
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JScrollPane scrollActDisponible = new JScrollPane();
		getContentPane().add(scrollActDisponibles, BorderLayout.CENTER);
		
		
		JList list = new JList();
		scrollActDisponibles.setViewportView(list);
		getContentPane().add(list);

	}
}