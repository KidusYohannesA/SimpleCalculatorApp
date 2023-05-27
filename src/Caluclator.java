import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caluclator {
    private int num1, num2, result;
    private String operation;
    private JPanel Calculator;
    private JTextField Title;
    private JButton equalbutton;
    private JButton a8Button;
    private JButton a4Button;
    private JButton AddButton;
    private JButton SubButton;
    private JButton Button1a;
    private JButton a5Button;
    private JButton a9Button;
    private JButton dButton;
    private JButton a2Button;
    private JButton a6Button;
    private JButton oButton;
    private JButton xButton;
    private JButton button14;
    private JButton button15;
    private JButton Clearbutton;
    private JButton backButton;
    private JButton button1;

    public Caluclator() {
        Button1a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + Button1a.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a2Button.getText());
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + button14.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a6Button.getText());
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + button15.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + a9Button.getText());
            }
        });
        oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText(Title.getText() + oButton.getText());
            }
        });
        // operations
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(Title.getText());
                operation = "+";
                Title.setText("");
            }
        });
        SubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(Title.getText());
                operation = "-";
                Title.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(Title.getText());
                operation = "*";
                Title.setText("");
            }
        });
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(Title.getText());
                operation = "/";
                Title.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText("-" + Title.getText());
            }
        });
        Clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText("");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(Title.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(Title.getText());
                    str.deleteCharAt(Title.getText().length()  - 1);
                    backspace = String.valueOf(str);
                    Title.setText(backspace);
                }
            }
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Integer.parseInt(Title.getText());

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        Title.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = num1 - num2;
                        Title.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = num1 * num2;
                        Title.setText(String.valueOf(result));
                        break;
                    case "/":
                        if(num2 < 1) {
                            Title.setText("DNE");
                            break;
                        }
                        result = num1 / num2;
                        Title.setText(String.valueOf(result));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Caluclator");
        frame.setContentPane(new Caluclator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
