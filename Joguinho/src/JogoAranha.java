import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoAranha extends JFrame {
	ImageIcon iconParede = new ImageIcon(getClass().getResource("parede.jpg"));
	ImageIcon iconSpiderMexendo = new ImageIcon(getClass().getResource("SpiderMexendo.gif"));
	ImageIcon iconSpiderParado = new ImageIcon(getClass().getResource("SpiderParado.png"));

	JLabel lparede = new JLabel(iconParede);
	JLabel lspider = new JLabel(iconSpiderParado);

	int posSpiderx = 300;
	int posSpidery = 150;
//Teste
	public JogoAranha() {
		editarJanela();
		editarComponentes();
		addMovimento();
	}

	public void addMovimento() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				lspider.setIcon(iconSpiderParado);

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println(e.getKeyCode()); --> Esta linha serve para
				// pegar o código da tecla presionada.
				lspider.setIcon(iconSpiderMexendo);
				
				if (e.getKeyCode() == 38) {
					posSpidery -= 10;				}
				if (e.getKeyCode() == 40) {
					posSpidery += 10;
				}
				if (e.getKeyCode() == 37) {
					posSpiderx -= 10;
				}
				if (e.getKeyCode() == 39) {
					posSpiderx += 10;
				}
				lspider.setBounds(posSpiderx, posSpidery, 103, 202);

			}
		});
	}

	public void editarComponentes() {
		lparede.setBounds(0, 0, 800, 600);
		lspider.setBounds(posSpiderx, posSpidery, 103, 202);
	}

	public void editarJanela() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lspider);
		add(lparede);
	}

	public static void main(String[] args) {
		new JogoAranha();

	}

}
