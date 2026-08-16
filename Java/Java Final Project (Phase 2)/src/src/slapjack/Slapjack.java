package slapjack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Slapjack extends JFrame {
	
	static Card c1 = new Card();
	
	JLabel deck, houseImage;
	JLabel whoScored;
	JLabel player1PointsCounter, player2PointsCounter;
	Integer player_1Points = 0;
	Integer player_2Points = 0;
	boolean slap_pressed, draw_pressed;
	JButton slapButton, drawButton;
	
	boolean p1Scored;
	boolean enter_pressed;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slapjack frame = new Slapjack();
					frame.setVisible(true);
					frame.setFocusable(true);
					frame.requestFocusInWindow(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Slapjack() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Slapjack.class.getResource("/resources/slapjack icon.jpg")));
		drawButton = new JButton("Draw");
		addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER && !p1Scored) {
					enter_pressed = true;
					
					if (enter_pressed && c1.randomRank == 11) {
						whoScored.setText("Player 1 scored!");
						whoScored.setVisible(true);
						player_1Points++;
						player1PointsCounter.setText("Points: " + player_1Points);
						slapButton.setEnabled(false);
					}
				}
			}
			
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					enter_pressed = false;
				}
			}
		});

		setResizable(false);
		setBounds(100, 100, 700, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Slapjack");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 19));
		title.setBounds(67, 34, 550, 23);
		contentPane.add(title);
		
		JLabel lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPlayer1.setBounds(67, 94, 550, 23);
		contentPane.add(lblPlayer1);
		
		player1PointsCounter = new JLabel("Points: 0");
		player1PointsCounter.setHorizontalAlignment(SwingConstants.CENTER);
		player1PointsCounter.setFont(new Font("Tahoma", Font.PLAIN, 19));
		player1PointsCounter.setBounds(67, 117, 550, 23);
		contentPane.add(player1PointsCounter);
		
		JLabel lblPlayer = new JLabel("Player 2");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPlayer.setBounds(78, 555, 550, 23);
		contentPane.add(lblPlayer);
		
		player2PointsCounter = new JLabel("Points: 0");
		player2PointsCounter.setHorizontalAlignment(SwingConstants.CENTER);
		player2PointsCounter.setFont(new Font("Tahoma", Font.PLAIN, 19));
		player2PointsCounter.setBounds(78, 583, 550, 23);
		contentPane.add(player2PointsCounter);
		
		JButton drawButton = new JButton("Draw");
		drawButton.setFocusable(false); // Not allowed to focus so KeyListener can work
		drawButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				deck.setIcon(new ImageIcon(Slapjack.class.getResource(c1.getCard().toString())));
				slapButton.setEnabled(true);
				whoScored.setVisible(false);
				slap_pressed = false;
				draw_pressed = true;
				p1Scored = false;
			}
		});


		drawButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		drawButton.setBounds(220, 479, 126, 65);
		contentPane.add(drawButton);
		
		deck = new JLabel("");
		deck.setIcon(null);
		deck.setBounds(259, 152, 171, 257);
		contentPane.add(deck);
		
		slapButton = new JButton("SLAP");
		slapButton.setFocusable(false); // Not allowed to focus so KeyListener can work
		slapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slap_pressed = true;
				draw_pressed = false;
				
				if (slap_pressed && c1.randomRank == 11) {
					whoScored.setText("Player 2 scored!");
					whoScored.setVisible(true);
					slapButton.setEnabled(false);
					player_2Points++;
					p1Scored = true;
				}
				player2PointsCounter.setText("Points: " + player_2Points.toString());
			}
		});

		slapButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		slapButton.setBounds(348, 479, 126, 65);
		contentPane.add(slapButton);
		
		whoScored = new JLabel("___ scored!");
		whoScored.setHorizontalAlignment(SwingConstants.CENTER);
		whoScored.setFont(new Font("Tahoma", Font.PLAIN, 19));
		whoScored.setBounds(0, 267, 200, 23);
		contentPane.add(whoScored);
		whoScored.setVisible(false);
	}
}