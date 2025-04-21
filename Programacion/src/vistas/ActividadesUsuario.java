package vistas;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class ActividadesUsuario extends JFrame{

	private JMenuBar menuBarActividad;
	private JScrollPane scrollActDisponibles;
	private JScrollPane scrollActInscritas;
//	private JList<Actividades> listActDisponibles;
//	private Jlist<Actividades> listActInscritas;
	
	
	
	
	public ActividadesUsuario() {
		
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		JScrollPane scrollActDisponible = new JScrollPane();
		getContentPane().add(scrollActDisponibles, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(121, 100, 333, 85);
		getContentPane().add(scrollPane);
		
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		scrollActDisponibles.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(121, 250, 333, 85);
		getContentPane().add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);		
		
		JLabel actividades = new JLabel("ACTIVIDADES");
		actividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		JLabel actividadesDisponibles = new JLabel("Actividades disponibles: ");
		actividadesDisponibles.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		JLabel actividadesInscritas = new JLabel("Actividades inscritas: ");
		actividadesInscritas.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		
		actividades.setBounds(121,11,158,52);
		actividadesDisponibles.setBounds(121,191,248,52);
		actividadesInscritas.setBounds(121,65,282,30);
		
		getContentPane().add(actividades);
		getContentPane().add(actividadesDisponibles);
		getContentPane().add(actividadesInscritas);
		
		JMenuBar menuBarActividad = new JMenuBar();
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 99, 360);
		getContentPane().add(menuBarActividad);
		
		JMenu menuActividad = new JMenu("Actividades");
		menuBarActividad.add(menuActividad);
		
		JMenu menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
		
		JLabel lblNomUsuario = new JLabel("UserName");
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomUsuario.setBounds(581, 11, 90, 31);
		getContentPane().add(lblNomUsuario);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		
	}
}