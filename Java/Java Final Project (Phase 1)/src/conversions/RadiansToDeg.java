package conversions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadiansToDeg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sideLength_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadiansToDeg frame = new RadiansToDeg();
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
	public RadiansToDeg() {
		setType(Type.UTILITY);
		setTitle("Radians to Degrees");
		setBounds(100, 100, 250, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_radians = new JLabel("Enter radians");
		lbl_radians.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_radians.setBounds(10, 10, 135, 17);
		contentPane.add(lbl_radians);
		
		sideLength_field = new JTextField();
		sideLength_field.setBounds(10, 40, 90, 20);
		contentPane.add(sideLength_field);
		sideLength_field.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.window);
		textPane.setBounds(10, 130, 90, 20);
		contentPane.add(textPane);
		
		JLabel lbl_degrees = new JLabel("Degrees");
		lbl_degrees.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_degrees.setBounds(10, 100, 135, 17);
		contentPane.add(lbl_degrees);
		
		JLabel lblNewLabel = new JLabel("rad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(110, 40, 90, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_inSquared = new JLabel("degrees");
		lbl_inSquared.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_inSquared.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_inSquared.setBounds(110, 130, 90, 17);
		contentPane.add(lbl_inSquared);
		
		JButton btnCalculateButton = new JButton("Calculate");
		btnCalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from side length field box and convert it from String to Double
				Double radians = Double.parseDouble(sideLength_field.getText());
				final Double pi = 3.14;
				Double degrees = radians * (180 / pi);
				textPane.setText(degrees.toString());
				
			}
		});
		btnCalculateButton.setBounds(10, 66, 89, 23);
		contentPane.add(btnCalculateButton);

	}
}
