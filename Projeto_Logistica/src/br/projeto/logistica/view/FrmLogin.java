package br.projeto.logistica.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

import br.projeto.logistica.controller.FuncionarioController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin window = new FrmLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame("Nome do sistema");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 516, 317);
		frame.setDefaultCloseOperation(JFrame.DEFAULT_CURSOR);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDaAplicao = new JLabel("NOME DO SISTEMA");
		lblNomeDaAplicao.setBounds(42, 26, 162, 32);
		frame.getContentPane().add(lblNomeDaAplicao);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setBounds(64, 100, 62, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(64, 144, 50, 14);
		frame.getContentPane().add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(118, 97, 180, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(118, 141, 143, 20);
		frame.getContentPane().add(txtSenha);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/img-login.png")));
		lblImg.setBounds(352, 62, 104, 115);
		frame.getContentPane().add(lblImg);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(32, 217, 104, 34);
		frame.getContentPane().add(btnSair);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(364, 218, 104, 33);
		frame.getContentPane().add(btnEntrar);
		
		FuncionarioController fControle = new FuncionarioController(txtUsuario, txtSenha);
		btnEntrar.addActionListener(fControle);
	}

}
