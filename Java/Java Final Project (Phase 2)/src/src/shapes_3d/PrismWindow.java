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

public class PrismWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField widthField;
	private JTextField heightField;
	private JTextPane formulaField;
	private JTextField lengthField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrismWindow frame = new PrismWindow();
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
	public PrismWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrismWindow.class.getResource("/resources/rectPrism.png")));
		setTitle("Prism");
		setBounds(100, 100, 299, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel width = new JLabel("Enter width");
		width.setFont(new Font("Tahoma", Font.PLAIN, 14));
		width.setBounds(10, 73, 90, 17);
		contentPane.add(width);
		
		widthField = new JTextField();
		widthField.setBounds(10, 89, 90, 20);
		contentPane.add(widthField);
		widthField.setColumns(10);
		
		JTextPane outputPane = new JTextPane();
		outputPane.setBackground(SystemColor.window);
		outputPane.setBounds(10, 266, 90, 20);
		contentPane.add(outputPane);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 236, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel lengthUnit = new JLabel("in");
		lengthUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lengthUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lengthUnit.setBounds(67, 90, 90, 14);
		contentPane.add(lengthUnit);
		
		JLabel outputUnit = new JLabel("in^2");
		outputUnit.setHorizontalAlignment(SwingConstants.CENTER);
		outputUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outputUnit.setBounds(110, 266, 90, 14);
		contentPane.add(outputUnit);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from length field box and convert it from String to Double
				Double l = Double.parseDouble(lengthField.getText());
				Double w = Double.parseDouble(widthField.getText());
				Double h = Double.parseDouble(heightField.getText());
				Double lw = l * w;
				Double hl = h * l;
				Double hw = h * w;
				// A = 2 (lw + hl + hw)
				Double area = 2 * (lw + hl + hw);
				outputPane.setText(area.toString());
				formulaField.setText("2 * [(" + l + " * " + w + ") + (" + h + " * " + l + ")"
						+ " + (" + h + " * " + w + ")]");
			}
		});
		calculate.setBounds(135, 66, 89, 23);
		contentPane.add(calculate);
		
		heightField = new JTextField();
		heightField.setColumns(10);
		heightField.setBounds(10, 132, 90, 20);
		contentPane.add(heightField);
		
		JLabel lbl_sideLength_1 = new JLabel("Enter height");
		lbl_sideLength_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength_1.setBounds(10, 115, 90, 17);
		contentPane.add(lbl_sideLength_1);
		
		JLabel widthUnit = new JLabel("in");
		widthUnit.setHorizontalAlignment(SwingConstants.CENTER);
		widthUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		widthUnit.setBounds(67, 133, 90, 14);
		contentPane.add(widthUnit);
		
		JLabel formula = new JLabel("Formula");
		formula.setFont(new Font("Tahoma", Font.BOLD, 14));
		formula.setBounds(10, 163, 135, 17);
		contentPane.add(formula);
		
		formulaField = new JTextPane();
		formulaField.setBackground(SystemColor.window);
		formulaField.setBounds(10, 193, 263, 20);
		contentPane.add(formulaField);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lengthField.setText(null);
				widthField.setText(null);
				heightField.setText(null);
				formulaField.setText(null);
				
			}
		});
		reset.setBounds(135, 109, 89, 23);
		contentPane.add(reset);
		
		JLabel length = new JLabel("Enter length");
		length.setFont(new Font("Tahoma", Font.PLAIN, 14));
		length.setBounds(10, 25, 90, 17);
		contentPane.add(length);
		
		lengthField = new JTextField();
		lengthField.setColumns(10);
		lengthField.setBounds(10, 42, 90, 20);
		contentPane.add(lengthField);
		
		JLabel widthUnit_1 = new JLabel("in");
		widthUnit_1.setHorizontalAlignment(SwingConstants.CENTER);
		widthUnit_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		widthUnit_1.setBounds(67, 43, 90, 14);
		contentPane.add(widthUnit_1);

	}
}
