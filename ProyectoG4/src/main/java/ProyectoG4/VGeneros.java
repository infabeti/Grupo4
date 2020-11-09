package ProyectoG4;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class VGeneros extends JFrame {

	private JPanel contentPane;
	private JTextField textField_codigo;
	private JTable table_sabado;
	private JTable table_domingo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VGeneros frame = new VGeneros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VGeneros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\EWorkspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));
		setFocusTraversalPolicyProvider(true);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setName("");
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField_codigo = new JTextField();
		textField_codigo.setHorizontalAlignment(SwingConstants.CENTER);
		textField_codigo.setBounds(160, 121, 41, 41);
		textField_codigo.setName("");
		textField_codigo.setColumns(10);
		
		JLabel lbl_codDeseado = new JLabel("C\u00F3digo deseado:");
		lbl_codDeseado.setBounds(15, 129, 135, 20);
		lbl_codDeseado.setName("");
		lbl_codDeseado.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setName("");
		lbl_logo.setSize(90, 92);
		lbl_logo.setLocation(5,5);
		lbl_logo.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));  
		
		JLabel lbl_codigos = new JLabel("C\u00D3DIGOS:");
		lbl_codigos.setBounds(15, 163, 126, 44);
		lbl_codigos.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lbl_drama = new JLabel("1.- DRAMA");
		lbl_drama.setBounds(15, 205, 105, 34);
		lbl_drama.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_comedia = new JLabel("2.- COMEDIA");
		lbl_comedia.setBounds(15, 245, 105, 34);
		lbl_comedia.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_terror = new JLabel("3.- TERROR");
		lbl_terror.setBounds(15, 285, 105, 34);
		lbl_terror.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_cienciaf = new JLabel("4.- CIENCIA FICCI\u00D3N");
		lbl_cienciaf.setBounds(15, 325, 186, 34);
		lbl_cienciaf.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.setLayout(null);
		contentPane.add(lbl_logo);
		contentPane.add(lbl_codDeseado);
		contentPane.add(textField_codigo);
		contentPane.add(lbl_codigos);
		contentPane.add(lbl_drama);
		contentPane.add(lbl_comedia);
		contentPane.add(lbl_terror);
		contentPane.add(lbl_cienciaf);
		
		JLabel lbl_sabado = new JLabel("S\u00C1BADO");
		lbl_sabado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_sabado.setBounds(325, 129, 78, 20);
		contentPane.add(lbl_sabado);
		
		JLabel lbl_domingo = new JLabel("DOMINGO");
		lbl_domingo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_domingo.setBounds(573, 132, 81, 14);
		contentPane.add(lbl_domingo);
		
		table_sabado = new JTable();
		table_sabado.setRowSelectionAllowed(false);
		table_sabado.setSelectionForeground(Color.LIGHT_GRAY);
		table_sabado.setRowHeight(50);
		table_sabado.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table_sabado.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Horas", "Pel\u00EDculas"
			}
		));
		table_sabado.getColumnModel().getColumn(0).setPreferredWidth(60);
		table_sabado.getColumnModel().getColumn(1).setPreferredWidth(125);
		table_sabado.setBounds(258, 165, 220, 250);
		contentPane.add(table_sabado);
		
		table_domingo = new JTable();
		table_domingo.setRowSelectionAllowed(false);
		table_domingo.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Horas", "Pel\u00EDculas"
			}
		));
		table_domingo.getColumnModel().getColumn(0).setPreferredWidth(60);
		table_domingo.getColumnModel().getColumn(1).setPreferredWidth(125);
		table_domingo.setRowHeight(50);
		table_domingo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table_domingo.setBounds(505, 165, 220, 250);
		contentPane.add(table_domingo);
		
		JRadioButton rdbtn_sabado = new JRadioButton("S\u00E1bado");
		rdbtn_sabado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroup.add(rdbtn_sabado);
		rdbtn_sabado.setBounds(11, 366, 78, 23);
		rdbtn_sabado.setBackground(new Color (156, 196, 236));
		contentPane.add(rdbtn_sabado);
		
		JRadioButton rdbtn_domingo = new JRadioButton("Domingo");
		rdbtn_domingo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroup.add(rdbtn_domingo);
		rdbtn_domingo.setBounds(11, 392, 90, 23);
		rdbtn_domingo.setBackground(new Color (156, 196, 236));
		contentPane.add(rdbtn_domingo);
		
		JButton btn_ir = new JButton("Ir");
		btn_ir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_ir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ir.setMargin(new Insets(2, 2, 2, 2));
		btn_ir.setBounds(207, 124, 41, 34);
		contentPane.add(btn_ir);
		
		JTextArea txtr_porfa = new JTextArea();
		txtr_porfa.setForeground(Color.RED);
		txtr_porfa.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtr_porfa.setDisabledTextColor(Color.RED);
		txtr_porfa.setText("*Por favor, \r\nseleccione una\r\nopcion");
		txtr_porfa.setBounds(107, 368, 126, 71);
		txtr_porfa.setBackground(new Color (156, 196, 236));
		contentPane.add(txtr_porfa);
	}
}
