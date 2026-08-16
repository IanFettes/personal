package shapes_3d;

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
import java.awt.Toolkit;

public class CylinderWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField radiusField;
	private JTextField heightField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CylinderWindow frame = new CylinderWindow();
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
	public CylinderWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CylinderWindow.class.getResource("/resources/cylinder.png")));
		setTitle("Cylinder");
		setBounds(100, 100, 250, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_radius = new JLabel("Enter radius");
		lbl_radius.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_radius.setBounds(10, 24, 90, 17);
		contentPane.add(lbl_radius);
		
		radiusField = new JTextField();
		radiusField.setBounds(10, 40, 90, 20);
		contentPane.add(radiusField);
		radiusField.setColumns(10);
		
		JTextPane outputPane = new JTextPane();
		outputPane.setBackground(SystemColor.window);
		outputPane.setBounds(10, 158, 90, 20);
		contentPane.add(outputPane);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 128, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel lengthUnit = new JLabel("in");
		lengthUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lengthUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lengthUnit.setBounds(67, 41, 90, 14);
		contentPane.add(lengthUnit);
		
		JLabel outputUnit = new JLabel("in^3");
		outputUnit.setHorizontalAlignment(SwingConstants.CENTER);
		outputUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outputUnit.setBounds(110, 158, 90, 14);
		contentPane.add(outputUnit);
		
		JButton btnCalculateButton = new JButton("Calculate");
		btnCalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from length field box and convert it from String to Double
				Double converted_radiusField_txt = Double.parseDouble(radiusField.getText());
				Double converted_heightField_txt = Double.parseDouble(heightField.getText());
				final Double pi = 3.14;
				// A = (2pi * r * h) + (2pi (r^2))
				Double area = ((2 * pi) * converted_radiusField_txt * converted_heightField_txt) + ((2*pi) * Math.pow(converted_radiusField_txt, 2));
				outputPane.setText(area.toString());
			}
		});
		btnCalculateButton.setBounds(135, 60, 89, 23);
		contentPane.add(btnCalculateButton);
		
		heightField = new JTextField();
		heightField.setColumns(10);
		heightField.setBounds(10, 83, 90, 20);
		contentPane.add(heightField);
		
		JLabel lbl_sideLength_1 = new JLabel("Enter height");
		lbl_sideLength_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength_1.setBounds(10, 66, 90, 17);
		contentPane.add(lbl_sideLength_1);
		
		JLabel widthUnit = new JLabel("in");
		widthUnit.setHorizontalAlignment(SwingConstants.CENTER);
		widthUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		widthUnit.setBounds(67, 84, 90, 14);
		contentPane.add(widthUnit);

	}
}
