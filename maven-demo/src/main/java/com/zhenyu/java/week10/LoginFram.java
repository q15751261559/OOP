package com.zhenyu.java.week10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFram {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topPanel;
    private JPanel buttonPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginbtn;

    public LoginFram() {
        loginbtn.addActionListener(e -> {
            if("admin".equals(accountField.getText())&&"123456".equals(new String(passwordField.getPassword()))){
                JOptionPane.showMessageDialog(null,"登录成功");

            }
            else{
                JOptionPane.showMessageDialog(null,"账号或者密码错误");
            }
        });
    }

    private void createUIComponents() {
int i=111;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFram");
        frame.setContentPane(new LoginFram().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.getExtendedState();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
