package vistas;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.*;

import Control.ListenerNuevaActividad;
import Control.menuActividadMon;
import Control.menuDatosPersonalesMon;
import modelo.Actividad;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ActividadMonitor extends JFrame{
	
	private JMenuBar menuBarActividad;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JScrollPane scrollListaAct;
	private JList<Actividad> listaActividades;
	private JButton btnNuevaActividad;
	
	
	public ActividadMonitor() {
	
	// Color de fondo de la vista
	getContentPane().setBackground(new Color(247, 202, 136));
	
	// 1) configura JFrame
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	
	menuBarActividad = new JMenuBar();
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
	
	JLabel lblListActividades = new JLabel("Lista Actividades");
	listaActividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
	listaActividades.setBounds(307, 59, 200, 30);
	getContentPane().add(listaActividades);
	
	scrollListaAct = new JScrollPane();
	scrollListaAct.setBounds(179, 120, 421, 156);
	getContentPane().add(scrollListaAct);
	
	listaActividades = new JList<Actividad>();
	scrollListaAct.setViewportView(listaActividades);
	listaActividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	btnNuevaActividad = new JButton("Nueva actividad");
	btnNuevaActividad.addActionListener(new ListenerNuevaActividad(this));
	btnNuevaActividad.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnNuevaActividad.setBounds(327, 307, 148, 30);
	getContentPane().add(btnNuevaActividad);
	
	
	setSize(695, 397);
	setLocationRelativeTo(null);
	}
}
