package shapes_2d;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CircleWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputField;
	private JTextPane formulaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircleWindow frame = new CircleWindow();
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
	public CircleWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CircleWindow.class.getResource("/resources/circle.png")));
		setTitle("Circle");
		setBounds(100, 100, 252, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_radiusLabel = new JLabel("Enter radius.");
		lbl_radiusLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_radiusLabel.setBounds(10, 10, 135, 17);
		contentPane.add(lbl_radiusLabel);
		
		inputField = new JTextField();
		inputField.setBounds(10, 40, 90, 20);
		contentPane.add(inputField);
		inputField.setColumns(10);
		
		JTextPane areaField = new JTextPane();
		areaField.setBackground(SystemColor.window);
		areaField.setBounds(10, 220, 90, 20);
		contentPane.add(areaField);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 190, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel lblNewLabel = new JLabel("in");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(110, 40, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_inSquared = new JLabel("in^2");
		lbl_inSquared.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_inSquared.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_inSquared.setBounds(110, 220, 90, 14);
		contentPane.add(lbl_inSquared);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get text from radius field box and convert it from String to Double
				Double radius = Double.parseDouble(inputField.getText());
				Double output = 3.14 * Math.pow(radius, 2); // Evaluate A = pi * (r)^2
				areaField.setText(output.toString()); // Set output to text pane for user to view
				formulaField.setText("A = 3.14 * (" + radius + ")^2");
			}
		});
		calculate.setBounds(10, 66, 89, 23);
		contentPane.add(calculate);
		
		formulaField = new JTextPane();
		formulaField.setBackground(SystemColor.window);
		formulaField.setBounds(10, 120, 216, 20);
		contentPane.add(formulaField);
		
		JLabel lbl_area_1 = new JLabel("Formula");
		lbl_area_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area_1.setBounds(10, 100, 135, 17);
		contentPane.add(lbl_area_1);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaField.setText(null);
				formulaField.setText(null);
				inputField.setText(null);
			}
		});
		reset.setBounds(120, 65, 89, 23);
		contentPane.add(reset);
	}
}
