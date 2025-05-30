package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

import com.jamonasiatico.control.ListenerCrearActividad;
import com.jamonasiatico.control.ListenerLogin;
import com.jamonasiatico.control.ListenerNuevaActividad;
import com.jamonasiatico.control.MenuDatosPersonalesMonitorListener;
import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;


public class ActividadMonitor extends JFrame{
	
	private JMenuBar menuBarActividad;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JScrollPane scrollListaAct;
	private JList<Actividad> listaActividades;
	private JButton btnNuevaActividad;
	private BBDD bbdd = new BBDD();
	
	
	public ActividadMonitor() {
		// Color de fondo de la vista
		getContentPane().setBackground(new Color(247, 202, 136));

		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);


		menuBarActividad = new JMenuBar();
		menuBarActividad.setLayout (new GridLayout(0,1));
		menuBarActividad.setBounds(0, 0, 110, 360);
		getContentPane().add(menuBarActividad);

		menuActividad = new JMenu("Actividades");
		menuActividad.setBackground(new Color(255, 255, 128));
		menuBarActividad.add(menuActividad);

		menuDatosPersonales = new JMenu("Datos Personales");
		menuBarActividad.add(menuDatosPersonales);
		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesMonitorListener(this));

		JLabel lblNombreUsr = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNombreUsr.setBounds(566, 11, 105, 37);
		lblNombreUsr.setForeground(new Color(0, 0, 0));
		lblNombreUsr.setFont(new Font("Dialog", Font.PLAIN, 20));
		getContentPane().add(lblNombreUsr);


		JLabel lblListActividades = new JLabel("Lista Actividades");
		lblListActividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblListActividades.setBounds(327,84, 161, 25);
		getContentPane().add(lblListActividades);

		scrollListaAct = new JScrollPane();
		scrollListaAct.setBounds(179, 120, 421, 156);
		getContentPane().add(scrollListaAct);


		listaActividades = new JList<Actividad>();
		listaActividades.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		listaActividades.setBounds(307, 59, 200, 30);
		scrollListaAct.setViewportView(listaActividades);
		listaActividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		DefaultListModel<Actividad> modeloLista = new DefaultListModel<Actividad>();
		bbdd.traerActividadesMonitor();
		modeloLista.addAll(ListenerCrearActividad.actividades);

		listaActividades.setModel(modeloLista);
	
		listaActividades.addMouseListener(new MouseAdapter() {
		
       public void mouseClicked(MouseEvent e) {
    	   int index = listaActividades.locationToIndex(e.getPoint());
           if (index != -1) { 
        	   ListenerCrearActividad.actividad = listaActividades.getModel().getElementAt(index);
        	   dispose();
        	   new InformacionActividadMonitor();
			   }
		   }
		});
	
	
		btnNuevaActividad = new JButton("Nueva actividad");
		btnNuevaActividad.addActionListener(new ListenerNuevaActividad(this));
		btnNuevaActividad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNuevaActividad.setBounds(327, 307, 148, 30);
		getContentPane().add(btnNuevaActividad);


		setSize(695, 397);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	
	// Getters y Setters
	
	/**
	 * @return the menuBarActividad
	 */
	public JMenuBar getMenuBarActividad() {
		return menuBarActividad;
	}


	/**
	 * @param menuBarActividad the menuBarActividad to set
	 */
	public void setMenuBarActividad(JMenuBar menuBarActividad) {
		this.menuBarActividad = menuBarActividad;
	}


	/**
	 * @return the menuActividad
	 */
	public JMenu getMenuActividad() {
		return menuActividad;
	}


	/**
	 * @param menuActividad the menuActividad to set
	 */
	public void setMenuActividad(JMenu menuActividad) {
		this.menuActividad = menuActividad;
	}


	/**
	 * @return the menuDatosPersonales
	 */
	public JMenu getMenuDatosPersonales() {
		return menuDatosPersonales;
	}


	/**
	 * @param menuDatosPersonales the menuDatosPersonales to set
	 */
	public void setMenuDatosPersonales(JMenu menuDatosPersonales) {
		this.menuDatosPersonales = menuDatosPersonales;
	}


	/**
	 * @return the scrollListaAct
	 */
	public JScrollPane getScrollListaAct() {
		return scrollListaAct;
	}


	/**
	 * @param scrollListaAct the scrollListaAct to set
	 */
	public void setScrollListaAct(JScrollPane scrollListaAct) {
		this.scrollListaAct = scrollListaAct;
	}


	/**
	 * @return the listaActividades
	 */
	public JList<Actividad> getListaActividades() {
		return listaActividades;
	}


	/**
	 * @param listaActividades the listaActividades to set
	 */
	public void setListaActividades(JList<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}


	/**
	 * @return the btnNuevaActividad
	 */
	public JButton getBtnNuevaActividad() {
		return btnNuevaActividad;
	}


	/**
	 * @param btnNuevaActividad the btnNuevaActividad to set
	 */
	public void setBtnNuevaActividad(JButton btnNuevaActividad) {
		this.btnNuevaActividad = btnNuevaActividad;
	}

}
