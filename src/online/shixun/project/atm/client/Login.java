/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * ATM 登录功能界面
 */
public class Login extends BaseFrame implements ActionListener {

    JTextField txtAccountName = new JTextField(30);

    JPasswordField txtAccountPassword = new JPasswordField(30);

    JLabel labAccountName = new JLabel("请输入账户名称：");

    JLabel labAccountPassword = new JLabel("请输入账户密码：");

    public Login() {
        super("ATM 登录");

        // 初始化界面控件
        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.add(txtAccountName);
        panel.add(txtAccountPassword);
        panel.add(labAccountName);
        panel.add(labAccountPassword);

        labAccountName.setBounds(150, 140, 150, 30);
        labAccountName.setFont(labelFont);
        labAccountName.setForeground(labelColor);

        txtAccountName.setBounds(270, 140, 120, 30);

        labAccountPassword.setBounds(150, 180, 150, 30);
        labAccountPassword.setFont(labelFont);
        labAccountPassword.setForeground(labelColor);

        txtAccountPassword.setBounds(270, 180, 120, 30);

        panel.add(super.renderConfirmButton());

        setContentPane(panel);
        setLayout(this);
    }

    /**
     * 控件点击事件
     */
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object source = e.getSource();
        // 确认按钮
        if (source == btnConfirm) {
            // 账户名称
            String accountName = txtAccountName.getText().trim();
            // 账户密码
            String accountPassword = new String(txtAccountPassword.getPassword()).trim();
            //判断账户名称 和 账户密码是否为空
            if ((accountName.length() == 0 || accountPassword.length() == 0)) {
                JOptionPane.showMessageDialog(null, "账户名称或密码不可以为空！", "注意", JOptionPane.WARNING_MESSAGE);
            } else {
                System.out.println("AccountName/AccountPassword:" + accountName + "/" + accountPassword);

                // 进入ATM 主界面
                Main mainPanel = new Main();
                dispose();

                //创建一个 ATM 客户端
                //ATMClient client = ATMClientFactory.getATMClient();

                //执行ATM登录
                //AccountDTO account = client.login(accountName, accountPassword);

                // 登录成功
                /*
                if (account.getStatus() == 0) {
                    //登录成功后，将当前账户信息保存到 ATMContext 中，供其它功能使用
                    ATMContext.setCurrentAccount(account);
                    // 进入ATM 主界面
                    Main mainPanel = new Main();
                    dispose();
                } else {// 登录失败
                    JOptionPane.showMessageDialog(null, account.getMessage(), "注意", JOptionPane.WARNING_MESSAGE);
                }
                */
            }
        }

    }

    public static void main(String[] args) {
        Login panel = new Login();
        panel.setLayout(panel);
    }
}
