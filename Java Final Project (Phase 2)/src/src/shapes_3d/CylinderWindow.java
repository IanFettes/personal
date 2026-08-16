package shapes_3d;

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

public class CylinderWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField radiusField;
	private JTextField heightField;
	private JTextPane formulaField;

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
		setBounds(100, 100, 250, 329);
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
		outputPane.setBounds(10, 259, 90, 20);
		contentPane.add(outputPane);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 229, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel lengthUnit = new JLabel("in");
		lengthUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lengthUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lengthUnit.setBounds(67, 41, 90, 14);
		contentPane.add(lengthUnit);
		
		JLabel outputUnit = new JLabel("in^3");
		outputUnit.setHorizontalAlignment(SwingConstants.CENTER);
		outputUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outputUnit.setBounds(110, 259, 90, 14);
		contentPane.add(outputUnit);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from length field box and convert it from String to Double
				Double r = Double.parseDouble(radiusField.getText());
				Double h = Double.parseDouble(heightField.getText());
				final Double pi = 3.14;
				// A = (2pi * r * h) + (2pi (r^2))
				Double area = ((2 * pi) * r * h) + ((2*pi) * Math.pow(r, 2));
				outputPane.setText(area.toString());
				formulaField.setText("A = [2π * " + r + " * " + h + "]"
						+ " + [2π * (" + r + ")^2]");
			}
		});
		calculate.setBounds(135, 39, 89, 23);
		contentPane.add(calculate);
		
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
		
		JLabel formula = new JLabel("Formula");
		formula.setFont(new Font("Tahoma", Font.BOLD, 14));
		formula.setBounds(10, 137, 135, 17);
		contentPane.add(formula);
		
		formulaField = new JTextPane();
		formulaField.setBackground(SystemColor.window);
		formulaField.setBounds(10, 167, 214, 20);
		contentPane.add(formulaField);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radiusField.setText(null);
				heightField.setText(null);
				outputPane.setText(null);
				formulaField.setText(null);
			}
		});
		reset.setBounds(135, 82, 89, 23);
		contentPane.add(reset);

	}
}
