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

public class TriangleWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField aField;
	private JTextField bField;
	private JTextPane formulaOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriangleWindow frame = new TriangleWindow();
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
	public TriangleWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TriangleWindow.class.getResource("/resources/triangle.png")));
		setTitle("Triangle");
		setBounds(100, 100, 250, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_sideLength = new JLabel("Enter a");
		lbl_sideLength.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength.setBounds(10, 24, 90, 17);
		contentPane.add(lbl_sideLength);
		
		aField = new JTextField();
		aField.setBounds(10, 40, 90, 20);
		contentPane.add(aField);
		aField.setColumns(10);
		
		JTextPane outputPane = new JTextPane();
		outputPane.setBackground(SystemColor.window);
		outputPane.setBounds(10, 251, 90, 20);
		contentPane.add(outputPane);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 221, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel bUnit_1 = new JLabel("in");
		bUnit_1.setHorizontalAlignment(SwingConstants.CENTER);
		bUnit_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bUnit_1.setBounds(67, 41, 90, 14);
		contentPane.add(bUnit_1);
		
		JLabel outputUnit = new JLabel("in^2");
		outputUnit.setHorizontalAlignment(SwingConstants.CENTER);
		outputUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		outputUnit.setBounds(110, 251, 90, 14);
		contentPane.add(outputUnit);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from length field box and convert it from String to Double
				Double l = Double.parseDouble(aField.getText());
				Double w = Double.parseDouble(bField.getText());
				Double area = (l * w) / 2;
				formulaOutput.setText("A = (" + l + " * " + w + ") / 2");
				outputPane.setText(area.toString());
			}
		});
		calculate.setBounds(135, 39, 89, 23);
		contentPane.add(calculate);
		
		bField = new JTextField();
		bField.setColumns(10);
		bField.setBounds(10, 83, 90, 20);
		contentPane.add(bField);
		
		JLabel lbl_sideLength_1 = new JLabel("Enter b");
		lbl_sideLength_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength_1.setBounds(10, 66, 90, 17);
		contentPane.add(lbl_sideLength_1);
		
		JLabel bUnit = new JLabel("in");
		bUnit.setHorizontalAlignment(SwingConstants.CENTER);
		bUnit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bUnit.setBounds(67, 84, 90, 14);
		contentPane.add(bUnit);
		
		JLabel formula = new JLabel("Formula");
		formula.setFont(new Font("Tahoma", Font.BOLD, 14));
		formula.setBounds(10, 126, 135, 17);
		contentPane.add(formula);
		
		formulaOutput = new JTextPane();
		formulaOutput.setBackground(SystemColor.window);
		formulaOutput.setBounds(10, 156, 214, 20);
		contentPane.add(formulaOutput);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaOutput.setText(null);
				outputPane.setText(null);
				aField.setText(null);
				bField.setText(null);
			}
		});
		reset.setBounds(135, 82, 89, 23);
		contentPane.add(reset);

	}
}
