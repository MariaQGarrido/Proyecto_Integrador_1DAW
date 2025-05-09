package vistas;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.*;

import Control.menuActividadMon;
import Control.menuDatosPersonalesMon;

import java.awt.Font;
public class ActividadMonitor extends JFrame{
	
	private JMenuBar menuActividadBar;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JScrollPane scrollListaAct;
//	private JList<Actividades>i;
	private JButton btnNuevaActividad;
	private JButton btnEditar;
	private JButton btnBorrarActividad;
	
	
	public ActividadMonitor() {
	
	// Color de fondo de la vista
	getContentPane().setBackground(new Color(247, 202, 136));
	
	// 1) configura JFrame
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	
	JMenuBar menuBarActividad = new JMenuBar();
	menuBarActividad.setLayout (new GridLayout(0,1));
	menuBarActividad.setBounds(0, 0, 99, 360);
	getContentPane().add(menuBarActividad);
	
	menuActividad = new JMenu("Actividades");
	menuBarActividad.add(menuActividad);
	menuActividad.addMouseListener(new menuActividadMon(this));
	
	menuDatosPersonales = new JMenu("Datos Personales");
	menuBarActividad.add(menuDatosPersonales);
	menuDatosPersonales.addMouseListener(new menuDatosPersonalesMon(this));
	
	JLabel nombreUsuario = new JLabel("UserName");
	nombreUsuario.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
	nombreUsuario.setBounds(571, 11, 100, 30);
	getContentPane().add(nombreUsuario);
	
	JLabel listaActividades = new JLabel("Lista Actividades");
	listaActividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
	listaActividades.setBounds(307, 59, 200, 30);
	getContentPane().add(listaActividades);
	
	JScrollPane scrollListaAct = new JScrollPane();
	scrollListaAct.setBounds(179, 120, 421, 156);
	getContentPane().add(scrollListaAct);
	
	JList listActividades = new JList();
	scrollListaAct.setViewportView(listActividades);
	
	JButton btnNuevaActividad = new JButton("Nueva actividad");
	btnNuevaActividad.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnNuevaActividad.setBounds(327, 307, 148, 30);
	getContentPane().add(btnNuevaActividad);
	
	
	setSize(695, 397);
	setLocationRelativeTo(null);
	}
}
