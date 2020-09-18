import javax.swing.*;

/*
* TANKAR
* En loop som hela tiden kollar om man har fyllt i alla fällt
* och håller "send-knappen" enable(false) tills man har fyllt
* i alla fält.
*
* */

public class EmailClient extends JFrame {
    private JFrame jFrame;
    private JTextField serverField,usernameField, passwordField,
            fromField, toField, subjectField, messegeField;
    private JLabel serverLabel, usernameLabel, passwordLabel,
            fromLabel, toLabel, subjectLabel;
    private JButton sendBtn;

    public EmailClient(){
        this.jFrame = this;
        this.setTitle("Email client");
        sendBtn = new JButton("Send");
        serverField = new JTextField();
        usernameField = new JTextField();
        passwordField = new JTextField();
        fromField = new JTextField();
        toField = new JTextField();
        subjectField = new JTextField();
        messegeField = new JTextField();
        serverLabel = new JLabel("Server");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        fromLabel = new JLabel("From");
        toLabel = new JLabel("To");
        subjectLabel = new JLabel("Subject");


        // -------- SET BOUNDS ------------
        serverLabel.setBounds(10,10,80, 20);
        usernameLabel.setBounds(10,40,80, 20);
        passwordLabel.setBounds(10,70,80, 20);
        serverField.setBounds(100,10,100,20);
        usernameField.setBounds(100,40,100,20);
        passwordField.setBounds(100,70,100,20);

        fromLabel.setBounds(10, 130, 100, 20);
        toLabel.setBounds(10, 160, 100, 20);
        subjectLabel.setBounds(10, 190, 100, 20);
        fromField.setBounds(100,130, 100, 20);
        toField.setBounds(100,160, 100, 20);
        subjectField.setBounds(100,190, 100, 20);



        // ----------- ADD ----------------

        this.add(serverLabel);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(serverField);
        this.add(usernameField);
        this.add(passwordField);
        this.add(fromLabel);
        this.add(toLabel);
        this.add(subjectLabel);
        this.add(fromField);
        this.add(toField);
        this.add(subjectField);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);


    }

// -------------- MAIN ---------------------------
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
    }
}
