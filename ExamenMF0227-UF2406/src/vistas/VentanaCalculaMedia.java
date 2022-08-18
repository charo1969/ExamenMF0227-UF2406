package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtUf2404;
	private JTextField txtUf2405;
	private JTextField txtUf2406;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setTitle("Calcula Media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][111.00][121.00][grow][][73.00,grow]", "[grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 2 1 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2404:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 2,alignx trailing");
		
		txtUf2404 = new JTextField();
		txtUf2404.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUf2404, "cell 2 2,growx");
		txtUf2404.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF2405:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 3 2,alignx trailing");
		
		txtUf2405 = new JTextField();
		txtUf2405.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUf2405, "cell 4 2,growx");
		txtUf2405.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("UF2406:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 5 2,alignx trailing");
		
		txtUf2406 = new JTextField();
		txtUf2406.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUf2406, "cell 6 2,growx");
		txtUf2406.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValidarCalcular();
			}
		});
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnCalcular, "cell 3 4,alignx center");
		
		JLabel lblNewLabel_4 = new JLabel("Nota Media:");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4, "cell 1 6,alignx left");
		
		JLabel lblNewLabel_6 = new JLabel("0.0");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_6, "cell 2 6");
		
		JLabel lblNewLabel_5 = new JLabel("Resultado:");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5, "cell 1 7,alignx left");
		
		JLabel lblNewLabel_7 = new JLabel("No calculado aún");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_7, "cell 2 7 2 1");
	}

	protected void ValidarCalcular() {
		String nombre = txtNombre.getText();
		String uf2404 = txtUf2404.getText();
		String uf2405 = txtUf2405.getText();
		String uf2406 = txtUf2406.getText();
		
		
		
		
	}

}
