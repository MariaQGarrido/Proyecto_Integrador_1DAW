package vistas;

import javax.swing.*;

import Control.menuActividadUSR;
import Control.menuDatosPersonalesUSR;
import modelo.Actividad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class ActividadesUsuario extends JFrame{

	private JMenuBar menuBarActividad;
	private JScrollPane scrollActDisponibles;
	private JScrollPane scrollActInscritas;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JList<Actividad> listActDisponibles;
	private JList<Actividad> listActInscritas;
	
	
	
	public ActividadesUsuario() {
		
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		scrollActDisponibles = new JScrollPane();
		scrollActDisponibles.setLocation(131, 252);
		scrollActDisponibles.setSize(300, 97);
		getContentPane().add(scrollActDisponibles);
		
		listActDisponibles = new JList<Actividad>();
		scrollActDisponibles.setViewportView(listActDisponibles);
		listActDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollActInscritas = new JScrollPane();
		scrollActInscritas.setSize(300, 97);
		scrollActInscritas.setLocation(131, 101);
		getContentPane().add(scrollActInscritas);
		
		listActInscritas = new JList<Actividad>();
		scrollActInscritas.setViewportView(listActInscritas);
		listActDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		JLabel actividades = new JLabel("ACTIVIDADES");
		actividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		JLabel actividadesDisponibles = new JLabel("Actividades disponibles: ");
		actividadesDisponibles.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		JLabel actividadesInscritas = new JLabel("Actividades inscritas: ");
		actividadesInscritas.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		
		actividades.setBounds(121,11,158,52);
		actividadesDisponibles.setBounds(121,191,248,52);
		actividadesInscritas.setBounds(121,65,282,30);
		
		getContentPane().add(actividades);
		getContentPane().add(actividadesDisponibles);
		getContentPane().add(actividadesInscritas);
		
		menuBarActividad = new JMenuBar();
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 99, 360);
		getContentPane().add(menuBarActividad);
		
		menuActividad = new JMenu("Actividades");
		menuActividad.addMouseListener(new menuActividadUSR(this));		
		menuActividad.setBackground(new Color(255, 255, 255));
		menuBarActividad.add(menuActividad);
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new menuDatosPersonalesUSR(this));	
		JLabel lblNomUsuario = new JLabel("UserName");
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomUsuario.setBounds(581, 11, 90, 31);
		getContentPane().add(lblNomUsuario);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
		
		
	}
}