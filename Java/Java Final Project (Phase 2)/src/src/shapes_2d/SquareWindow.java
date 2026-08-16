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

public class SquareWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputField;
	private JTextPane formula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareWindow frame = new SquareWindow();
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
	public SquareWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SquareWindow.class.getResource("/resources/square.png")));
		setTitle("Square");
		setBounds(100, 100, 250, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_sideLength = new JLabel("Enter side length.");
		lbl_sideLength.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength.setBounds(10, 10, 135, 17);
		contentPane.add(lbl_sideLength);
		
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

				// Get text from side length field box and convert it from String to Double
				Double sideLength = Double.parseDouble(inputField.getText());
				Double area = Math.pow(sideLength, 2); // Square it
				areaField.setText(area.toString()); // Set squared number to text pane for user to view
				formula.setText("A = (" + sideLength + ")^2");
			}
		});
		calculate.setBounds(10, 66, 89, 23);
		contentPane.add(calculate);
		
		JLabel formulaTitle = new JLabel("Formula");
		formulaTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		formulaTitle.setBounds(10, 121, 135, 17);
		contentPane.add(formulaTitle);
		
		formula = new JTextPane();
		formula.setBackground(SystemColor.window);
		formula.setBounds(10, 151, 214, 20);
		contentPane.add(formula);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formula.setText(null);
				inputField.setText(null);
				areaField.setText(null);
			}
		});
		reset.setBounds(135, 66, 89, 23);
		contentPane.add(reset);

	}
}
