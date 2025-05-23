package com.jamonasiatico.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
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
import com.jamonasiatico.control.MenuDatosPersonalesUsuarioListener;
import com.jamonasiatico.modelo.Actividad;
import com.jamonasiatico.modelo.BBDD;




public class ActividadesUsuario extends JFrame{

	private JMenuBar menuBarActividad;
	private JScrollPane scrollActDisponibles;
	private JScrollPane scrollActInscritas;
	private JMenu menuActividad;
	private JMenu menuDatosPersonales;
	private JList<Actividad> listActDisponibles;
	private JList<Actividad> listActInscritas;
	private BBDD bbdd = new BBDD();
	
	
	public ActividadesUsuario() {
		
		
		// 1) configura JFrame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(253, 251, 159));
		getContentPane().setForeground(new Color(0, 0, 0));
		
		scrollActDisponibles = new JScrollPane();
		scrollActDisponibles.setLocation(131, 252);
		scrollActDisponibles.setSize(540, 97);
		getContentPane().add(scrollActDisponibles);
		
		listActDisponibles = new JList<Actividad>();
		scrollActDisponibles.setViewportView(listActDisponibles);
		listActDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		DefaultListModel<Actividad> modeloLista = new DefaultListModel<Actividad>();
		bbdd.traerActividades();
		modeloLista.addAll(ListenerCrearActividad.actividades);
		
		listActDisponibles.setModel(modeloLista);
		listActDisponibles.addMouseListener(new MouseAdapter() {
			
		       public void mouseClicked(MouseEvent e) {
		    	   int index = listActDisponibles.locationToIndex(e.getPoint());
		           if (index != -1) { 
		        	   ListenerCrearActividad.actividad = listActDisponibles.getModel().getElementAt(index);
		        	   
		        	   new InformacionActividadUsuarioInscribir();
		           }
		       }
			});
		
		scrollActInscritas = new JScrollPane();
		scrollActInscritas.setSize(540, 97);
		scrollActInscritas.setLocation(131, 101);
		getContentPane().add(scrollActInscritas);
		
		listActInscritas = new JList<Actividad>();
		scrollActInscritas.setViewportView(listActInscritas);
		listActDisponibles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		DefaultListModel<Actividad> modeloListaInscritas = new DefaultListModel<Actividad>();
		bbdd.traerActInscritas(ListenerLogin.usuario.getIdUsuario());
		modeloListaInscritas.addAll(ListenerCrearActividad.actividadesInscritas);
		
		listActInscritas.setModel(modeloListaInscritas);
		listActInscritas.addMouseListener(new MouseAdapter() {
			
		       public void mouseClicked(MouseEvent e) {
		    	   int index = listActInscritas.locationToIndex(e.getPoint());
		           if (index != -1) { 
		        	   ListenerCrearActividad.actividad = listActInscritas.getModel().getElementAt(index);
		        	   
		        	   new InformacionActividadUsuarioBaja();
		           }
		       }
			});
		
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
		menuActividad.setBackground(new Color(255, 255, 255));
		menuBarActividad.add(menuActividad);
		
		menuDatosPersonales = new JMenu("Datos Personales");
		menuDatosPersonales.addMouseListener(new MenuDatosPersonalesUsuarioListener(this));
		menuBarActividad.add(menuDatosPersonales);
		
		JLabel lblNomUsuario = new JLabel(ListenerLogin.usuario.getMatricula());
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomUsuario.setBounds(581, 11, 90, 31);
		getContentPane().add(lblNomUsuario);
		
		setSize(695, 397);
		setLocationRelativeTo(null);
	}

	public void HacerVisible(){
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
	 * @return the scrollActDisponibles
	 */
	public JScrollPane getScrollActDisponibles() {
		return scrollActDisponibles;
	}



	/**
	 * @param scrollActDisponibles the scrollActDisponibles to set
	 */
	public void setScrollActDisponibles(JScrollPane scrollActDisponibles) {
		this.scrollActDisponibles = scrollActDisponibles;
	}



	/**
	 * @return the scrollActInscritas
	 */
	public JScrollPane getScrollActInscritas() {
		return scrollActInscritas;
	}



	/**
	 * @param scrollActInscritas the scrollActInscritas to set
	 */
	public void setScrollActInscritas(JScrollPane scrollActInscritas) {
		this.scrollActInscritas = scrollActInscritas;
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
	 * @return the listActDisponibles
	 */
	public JList<Actividad> getListActDisponibles() {
		return listActDisponibles;
	}



	/**
	 * @param listActDisponibles the listActDisponibles to set
	 */
	public void setListActDisponibles(JList<Actividad> listActDisponibles) {
		this.listActDisponibles = listActDisponibles;
	}



	/**
	 * @return the listActInscritas
	 */
	public JList<Actividad> getListActInscritas() {
		return listActInscritas;
	}



	/**
	 * @param listActInscritas the listActInscritas to set
	 */
	public void setListActInscritas(JList<Actividad> listActInscritas) {
		this.listActInscritas = listActInscritas;
	}
}