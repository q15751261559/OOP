package com.mqxu.sm.frame;

import com.mqxu.sm.entity.Department;
import com.mqxu.sm.factory.ServiceFactory;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import jdk.nashorn.internal.scripts.JO;
import sun.swing.table.DefaultTableCellHeaderRenderer;

import javax.script.ScriptContext;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.ws.Service;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.io.File;
import java.util.List;

public class MainPanel extends JFrame {
    private JPanel mainPanel;
    private JButton 院系管理Button;
    private JButton 班级管理Button;
    private JButton 学生管理Button;
    private JButton 奖惩管理Button;
    private JPanel centerPanel;
    private JPanel depPanel;
    private JPanel classPanel;
    private JPanel studentPanel;
    private JPanel rewardPanel;

    private final CardLayout c;

    public MainPanel(){
        init();
        c=new CardLayout();
        centerPanel.setLayout(c);
        院系管理Button.setOpaque(false);
        班级管理Button.setOpaque(false);
        学生管理Button.setOpaque(false);
        奖惩管理Button.setOpaque(false);
        centerPanel.add("1", depPanel);
        centerPanel.add("2", classPanel);
        centerPanel.add("3", studentPanel);
        centerPanel.add("4", rewardPanel);
        院系管理Button.addActionListener(e -> {
            c.show(centerPanel,"1");
        });
        班级管理Button.addActionListener(e -> {
            c.show(centerPanel,"2");
        });
        学生管理Button.addActionListener(e -> {
            c.show(centerPanel,"3");
        });
        奖惩管理Button.addActionListener(e -> {
            c.show(centerPanel,"4");
        });
        showDepartments();
    }

    private void init() {
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainPanel();
    }

    private void showDepartments(){
        //移除原有数据
        centerPanel.removeAll();
        //从Service层获取到所有院系列表
        List<Department> departmentList = ServiceFactory.getDepartmentServiceInstance().selectAll();
        //获取总数
        int len = departmentList.size();
        //根据院系总数删除行数（每行放4个）
        int row = len % 4 == 0 ? len / 4 : len / 4 + 1;
        //创建一个网格布局，每行4列，指定水平和垂直间距
        GridLayout gridLayout = new GridLayout(row, 4,  15, 15);
        centerPanel.setLayout(gridLayout);
        for (Department department : departmentList) {
            //给每个院系对象创建一个面板
            JPanel dePanel = new JPanel();
            //设置合适大小
            dePanel.setPreferredSize(new Dimension(200, 200));
            //将院系名称设置给面板标题
            dePanel.setBorder(BorderFactory.createTitledBorder(department.getDepartmentName()));
            dePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 10));
            JLabel nameLabel = new JLabel(department.getDepartmentName());
            //新建一个JLabel标签,用来放置院系logo，并指定大小
            JLabel logoLabel = new JLabel("<html><img src='" + department.getLogo() + "' width='500' height='500'/></html>");
            //占位空白标签
            JLabel blankLabel = new JLabel();
            //新建一个删除按钮
            JButton delBtn = new JButton("删除");

            //指令返回数据库
            delBtn.addActionListener(e -> {
                Integer id = department.getId();
                System.out.println(id);
                ServiceFactory.delectDepartmentSerivceInstance().delectDep(id);
                JOptionPane.showMessageDialog(null, "删除成功");
                showDepartments();
            });

            //院系名称标签加入院系面板
            dePanel.add(nameLabel);
//            按钮加入院系面板
            dePanel.add(delBtn);
            //图标标签加入院系面板
            dePanel.add(logoLabel);
            //院系面板加入主体内容面板
            centerPanel.add(dePanel);
            //刷新主体内容面板
            centerPanel.revalidate();
        }

    }
}
