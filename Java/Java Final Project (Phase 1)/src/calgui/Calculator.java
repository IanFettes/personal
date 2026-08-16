package calgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import shapes_2d.CircleWindow;
import shapes_2d.SquareWindow;
import shapes_2d.TriangleWindow;
import shapes_3d.PrismWindow;
import shapes_3d.CubeWindow;
import shapes_3d.CylinderWindow;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/resources/calc.png")));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_CircleButton = new JButton("Circle");
		btn_CircleButton.addActionListener(new ActionListener() {
			
			/** Links the action of pressing the "Circle" button
			 * to the opening of the corresponding window,
			 * which calculates the area of the circle
			 * with the input provided. 
			 */
			public void actionPerformed(ActionEvent e) { 
				CircleWindow circWindow = new CircleWindow();
				circWindow.setVisible(true);
			}
		});
		btn_CircleButton.setToolTipText("Calculate the area of a circle");
		btn_CircleButton.setBounds(20, 130, 150, 60);
		contentPane.add(btn_CircleButton);
		
		JButton btn_TriangleButton = new JButton("Triangle");
		btn_TriangleButton.addActionListener(new ActionListener() {
			
			/** Links the action of pressing the "Triangle" button
			 * to the opening of the corresponding window,
			 * which calculates the area of the triangle
			 * with the input provided. 
			 */
			public void actionPerformed(ActionEvent e) {
				TriangleWindow triWindow = new TriangleWindow();
				triWindow.setVisible(true);
			}
		});
		btn_TriangleButton.setToolTipText("Calculate the area of a triangle");
		btn_TriangleButton.setBounds(20, 260, 150, 60);
		contentPane.add(btn_TriangleButton);
		
		JButton btn_SquareButton = new JButton("Square");
		btn_SquareButton.addActionListener(new ActionListener() {
			/** Links the action of pressing the "Square" button
			 * to the opening of the corresponding window,
			 * which calculates the area of the square
			 * with the input provided. 
			 */
			public void actionPerformed(ActionEvent e) {
				SquareWindow sqWindow = new SquareWindow();
				sqWindow.setVisible(true);
			}
		});
		btn_SquareButton.setToolTipText("Calculate the area of a square");
		btn_SquareButton.setBounds(20, 390, 150, 60);
		contentPane.add(btn_SquareButton);
		
		JLabel lblNewLabel = new JLabel("2D Shapes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 60, 150, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lbldShapes = new JLabel("3D Shapes");
		lbldShapes.setHorizontalAlignment(SwingConstants.CENTER);
		lbldShapes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbldShapes.setBounds(200, 60, 150, 30);
		contentPane.add(lbldShapes);
		
		JButton btn_Cube = new JButton("Cube");
		btn_Cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CubeWindow cubeWindow = new CubeWindow();
				cubeWindow.setVisible(true);
			}
		});
		btn_Cube.setToolTipText("Calculate the area of a cube");
		btn_Cube.setBounds(200, 130, 150, 60);
		contentPane.add(btn_Cube);
		
		JButton btn_RectPrismButton = new JButton("Rectangular Prism");
		btn_RectPrismButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrismWindow prismWindow = new PrismWindow();
				prismWindow.setVisible(true);
			}
		});
		btn_RectPrismButton.setToolTipText("Calculate the area of a rectangular prism");
		btn_RectPrismButton.setBounds(200, 260, 150, 60);
		contentPane.add(btn_RectPrismButton);
		
		JButton btn_CylinderButton = new JButton("Cylinder");
		btn_CylinderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CylinderWindow cylinderWindow = new CylinderWindow();
				cylinderWindow.setVisible(true);
			}
		});
		btn_CylinderButton.setToolTipText("Calculate the area of a cylinder");
		btn_CylinderButton.setBounds(200, 390, 150, 60);
		contentPane.add(btn_CylinderButton);
		
		JLabel lbl_Description = new JLabel("Calculate the area of 2D and 3D shapes!");
		lbl_Description.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Description.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Description.setBounds(20, 10, 330, 30);
		contentPane.add(lbl_Description);
		
		JButton btn_conversionButton = new JButton("Conversions");
		btn_conversionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvCalculator conversionCalculator = new ConvCalculator();
				conversionCalculator.setVisible(true);
			}
		});
		btn_conversionButton.setBounds(223, 476, 161, 23);
		contentPane.add(btn_conversionButton);
		
		JButton btn_SlapjackButton = new JButton("Play Slapjack");
		btn_SlapjackButton.setBounds(9, 477, 161, 23);
		contentPane.add(btn_SlapjackButton);

	}
}
