import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main {

    public final double maxQuestion = 5;
    public static int question = 1;
    public static int correct = 0;
    public static JLabel questionLabel;
    public static JRadioButton ans1;
    public static JRadioButton ans2;
    public static JRadioButton ans3;
    public static JRadioButton ans4;
    public static JButton btn;
    public static JLabel imgLabel;
    public static boolean questionIsChecked = false;
    private JLabel congratsLbl;

    public static String[] questions = new String[] {
            "Какво е диалог?",
            "Кой е човека на снимката?",
            "Кои са софистите?",
            "Познайте човека на снимката?",
            "Какво е етиката?"
    };

    public static String[] answers1 = new String[] {
            "закуска",
            "учене",
            "разговор между 2 човека", //correct
            "въстание през Турското владичество"};

    public static String[] answers2 = new String[] {
            "Сократ", //correct
            "Платон",
            "Лудвиг Витгенщайн",
            "Протагор"};

    public static String[] answers3 = new String[] {
            "борци за свобода",
            "първите платени учители", //correct
            "рисуватели",
            "писатели"};

    public static String[] answers4 = new String[] {
            "Георги Раковски",
            "Алберт Камю",
            "Айнщайн",
            "Аристотел"}; //correct

    public static String[] answers5 = new String[] {
            "исторически момент",
            "спортна дейност",
            "вид хранене",
            "наука за морала"}; //correct

    private JFrame frame;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
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
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("\u0422\u0435\u0441\u0442 \u0424\u0438\u043B\u043E\u0441\u043E\u0444\u0438\u044F");
        frame.setBounds(100, 100, 800, 490);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        questionLabel = new JLabel("\u0412\u044A\u043F\u0440\u043E\u0441");
        questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        questionLabel.setBounds(35, 32, 666, 53);
        frame.getContentPane().add(questionLabel);

        imgLabel = new JLabel("");
        imgLabel.setVisible(false);
        imgLabel.setBounds(552, 76, 181, 275);
        frame.getContentPane().add(imgLabel);

        ans1 = new JRadioButton("Option1");
        buttonGroup.add(ans1);
        ans1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans1.setBounds(58, 149, 411, 38);
        frame.getContentPane().add(ans1);

        ans2 = new JRadioButton("Option2");
        buttonGroup.add(ans2);
        ans2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans2.setBounds(58, 190, 411, 38);
        frame.getContentPane().add(ans2);

        ans3 = new JRadioButton("Option3");
        buttonGroup.add(ans3);
        ans3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans3.setBounds(58, 232, 411, 38);
        frame.getContentPane().add(ans3);

        ans4 = new JRadioButton("Option4");
        buttonGroup.add(ans4);
        ans4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans4.setBounds(58, 273, 411, 38);
        frame.getContentPane().add(ans4);

        JLabel resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        resultLabel.setBounds(157, 182, 452, 46);
        frame.getContentPane().add(resultLabel);

        congratsLbl = new JLabel("Браво!");
        congratsLbl.setHorizontalAlignment(SwingConstants.CENTER);
        congratsLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
        congratsLbl.setBounds(175, 234, 132, 40);
        congratsLbl.setVisible(false);
        frame.getContentPane().add(congratsLbl);

        btn = new JButton("Check/Next/Finish");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(btn.getText() != "Finish") {
                    if(!questionIsChecked) {
                        CheckAnswer(question);
                    }
                    else {
                        CheckAnswer(question);
                        question++;
                    }
                }
                else {

                    questionLabel.setText("Вие приключихте теста!");

                    ans1.setVisible(false);
                    ans2.setVisible(false);
                    ans3.setVisible(false);
                    ans4.setVisible(false);
                    btn.setVisible(false);

                    double percent = correct / maxQuestion * 100;
                    resultLabel.setText("Резултат: " + correct + "/" + Math.round(maxQuestion) + " верни (" + percent + "%)");

                    if(correct == maxQuestion) {
                        congratsLbl.setVisible(true);
                        imgLabel.setVisible(true);
                        imgLabel.setIcon(new ImageIcon("C:\\Users\\user1\\Pictures\\Picture2.png"));
                    }
                }

            }
        });
        btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn.setBounds(302, 367, 166, 53);
        frame.getContentPane().add(btn);

        nextQuestion(0);
    }

    public void nextQuestion(int questionNum) {
        if(btn.getText() != "Finish") {
            String currentQuestion = questions[questionNum];
            String ans1Value = "";
            String ans2Value = "";
            String ans3Value = "";
            String ans4Value = "";

            questionLabel.setText(currentQuestion);

            switch(questionNum) {
                case 0:
                    ans1Value = answers1[0];
                    ans2Value = answers1[1];
                    ans3Value = answers1[2];
                    ans4Value = answers1[3];
                    break;
                case 1:
                    ans1Value = answers2[0];
                    ans2Value = answers2[1];
                    ans3Value = answers2[2];
                    ans4Value = answers2[3];
                    break;
                case 2:
                    ans1Value = answers3[0];
                    ans2Value = answers3[1];
                    ans3Value = answers3[2];
                    ans4Value = answers3[3];
                    break;
                case 3:
                    ans1Value = answers4[0];
                    ans2Value = answers4[1];
                    ans3Value = answers4[2];
                    ans4Value = answers4[3];
                    break;
                case 4:
                    ans1Value = answers5[0];
                    ans2Value = answers5[1];
                    ans3Value = answers5[2];
                    ans4Value = answers5[3];
                    break;
            }


            ans1.setText(ans1Value);
            ans2.setText(ans2Value);
            ans3.setText(ans3Value);
            ans4.setText(ans4Value);

            buttonGroup.clearSelection();
            ChangeButtonContext(questionNum);

            if(questionNum == 1) {
                imgLabel.setVisible(true);
                imgLabel.setIcon(new ImageIcon("C:\\Users\\user1\\Pictures\\Picture6.png"));
            }
            else if(questionNum == 3) {
                imgLabel.setVisible(true);
                imgLabel.setIcon(new ImageIcon("C:\\Users\\user1\\Pictures\\Picture5.jpg"));
            }
            else {
                imgLabel.setVisible(false);
            }

            questionIsChecked = false;
        }
    }

    public void ChangeButtonContext(int questionNum) {
        if(!questionIsChecked) {
            btn.setText("Check");
        }
        else {
            if (questionNum < maxQuestion) {
                btn.setText("Next");
            }
            else {
                btn.setText("Finish");
            }
        }
    }

    public void CheckAnswer(int questionNum) {
        switch(questionNum - 1) {
            case 0:
                if(ans3.isSelected() && btn.getText() == "Check") {
                    correct++;
                }

                ans1.setBackground(new Color(165, 42, 42));
                ans2.setBackground(new Color(165, 42, 42));
                ans3.setBackground(new Color(60, 179, 113));
                ans4.setBackground(new Color(165, 42, 42));

                break;
            case 1:
                if(ans1.isSelected() && btn.getText() == "Check") {
                    correct++;
                }
                ans1.setBackground(new Color(60, 179, 113));
                ans2.setBackground(new Color(165, 42, 42));
                ans3.setBackground(new Color(165, 42, 42));
                ans4.setBackground(new Color(165, 42, 42));

                break;
            case 2:
                if(ans2.isSelected() && btn.getText() == "Check") {
                    correct++;
                }
                ans1.setBackground(new Color(165, 42, 42));
                ans2.setBackground(new Color(60, 179, 113));
                ans3.setBackground(new Color(165, 42, 42));
                ans4.setBackground(new Color(165, 42, 42));

                break;
            case 3:
                if(ans4.isSelected() && btn.getText() == "Check") {
                    correct++;
                }
                ans1.setBackground(new Color(165, 42, 42));
                ans2.setBackground(new Color(165, 42, 42));
                ans3.setBackground(new Color(165, 42, 42));
                ans4.setBackground(new Color(60, 179, 113));
                break;
            case 4:
                if(ans4.isSelected() && btn.getText() == "Check") {
                    correct++;
                }
                ans1.setBackground(new Color(165, 42, 42));
                ans2.setBackground(new Color(165, 42, 42));
                ans3.setBackground(new Color(165, 42, 42));
                ans4.setBackground(new Color(60, 179, 113));
                break;
        }

        questionIsChecked = true;

        if(btn.getText() == "Next") {
            nextQuestion(questionNum);
            ClearColors();
        }
        ChangeButtonContext(questionNum);
    }

    public void ClearColors() {
        ans1.setBackground(new Color(240, 240, 240));
        ans2.setBackground(new Color(240, 240, 240));
        ans3.setBackground(new Color(240, 240, 240));
        ans4.setBackground(new Color(240, 240, 240));
    }
}