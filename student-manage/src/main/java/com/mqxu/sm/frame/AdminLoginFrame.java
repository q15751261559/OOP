package com.mqxu.sm.frame;
import com.mqxu.sm.factory.ServiceFactory;
import com.mqxu.sm.utils.ResultEntity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdminLoginFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField loginText;
    private JButton loginButton;
    private JButton resetButton;
    private JPasswordField passwordField1;
    private JLabel LoginName;
    public AdminLoginFrame()
    {
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainPanel);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        loginButton.addActionListener(e -> {
            //获得输入的账号和密码，注意密码框组件的使用方法
            String account = loginText.getText().trim();
            String password = new String(passwordField1.getPassword()).trim();
            ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().adminLogin(account, password);
            JOptionPane.showMessageDialog(mainPanel, resultEntity.getMessage());
            if (resultEntity.getCode() == 0) {
                //关闭登录界面，进入主界面
                this.dispose();
                new MainPanel();
            } else {
                loginText.setText("");
                passwordField1.setText("");
            }
        });
        resetButton.addActionListener(e -> {
            loginText.setText("");
            passwordField1.setText("");
        });
    }

    public static void main(String[] args) {
        new AdminLoginFrame();
    }
}
