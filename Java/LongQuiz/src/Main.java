import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Main {

    public final int maxQuestion = 20;
    public static int question = 0;
    public static int correct = 0;
    public static JLabel lblQuestion;
    public static JRadioButton ans1;
    public static JRadioButton ans2;
    public static JRadioButton ans3;
    public static JRadioButton ans4;
    public static JButton btn;

    public static String[] questions = new String[] {
            "Кой е авторът на 'Майце си'?",
            "Кой елемент е с наименованието 'фенол'?",
            "Колко е сумата на числата 36 и 33?",
            "Кой владетел е известен с 6-те си жени?",
            "Коя е столицата на Франция?",
            "Кога е създадено НАТО?",
            "Колко е 2х2?",
            "Какво означава 'философия'?",
            "Какво означава еукариотна клетка?",
            "Кой е Христо Стоичков?",
            "Кога е създаден първия компютър?",
            "Коя религия е създадена от пророка Мохамед?",
            "Думата „нирвана“ означава:",
            "Броят на населението в света е?",
            "Какво означава 'watermelon'?",
            "Коя е най-голямата държава в света?",
            "Коя е най-дългата река в България?",
            "Какво означава 'chicken'?",
            "Кой е Валери Божинов?",
            "Кой е авторът на 'Мазна'"};
    public static String[] answers1 = new String[] {
            "Иван Вазов",
            "Христо Ботев", //correct
            "Христо Стоичков",
            "Георги Бенковски"};
    public static String[] answers2 = new String[] {
            "NaOH",
            "HCl",
            "C6H5OH", //correct
            "KOH"};
    public static String[] answers3 = new String[] {
            "69", //correct
            "20",
            "100",
            "3"};
    public static String[] answers4 = new String[] {
            "Карл Велики",
            "Иван Шишман",
            "Хан Аспарух",
            "Хенри VIII"}; //correct
    public static String[] answers5 = new String[] {
            "София",
            "Вашингтон",
            "Париж", //correct
            "Барселона"};
    public static String[] answers6 = new String[] {
            "1947",
            "1948",
            "1949", //correct
            "1950"};
    public static String[] answers7 = new String[] {
            "4", //correct
            "13",
            "69",
            "420"};
    public static String[] answers8 = new String[] {
            "математика",
            "закуска",
            "любов към кебабчета",
            "любов към мъдростта"}; //correct
    public static String[] answers9 = new String[] {
            "клетка с кюфте",
            "клетка в затвора",
            "клетка с ядро", //correct
            "любовна клетка"};
    public static String[] answers10 = new String[] {
            "футболист", //correct
            "създателя на България",
            "велик математик",
            "известен писател"};
    public static String[] answers11 = new String[] {
            "1991", //correct
            "2023",
            "1111",
            "1491"};
    public static String[] answers12 = new String[] {
            "християнство",
            "ислям", //correct
            "будизъм",
            "юдаизъм"};
    public static String[] answers13 = new String[] {
            "желание",
            "прераждане",
            "познание",
            "просветление"}; //correct
    public static String[] answers14 = new String[] {
            "100 души",
            "26 души",
            "8.5 млрд. души", //correct
            "400 млрд. души"};
    public static String[] answers15 = new String[] {
            "уча",
            "диня", //correct
            "краставичка",
            "работно място"};
    public static String[] answers16 = new String[] {
            "САЩ",
            "Русия", //correct
            "България",
            "Будапеща"};
    public static String[] answers17 = new String[] {
            "Искър", //correct
            "Нил",
            "Амазонка",
            "Марица"};
    public static String[] answers18 = new String[] {
            "несесер",
            "къща",
            "училище",
            "кокошка"}; //correct
    public static String[] answers19 = new String[] {
            "идиот",
            "химик",
            "най-мъдрия човек на света", //correct
            "синът на Албърт Айнщайн"};
    public static String[] answers20 = new String[] {
            "Лудвиг ван Бетовен",
            "Димофф", //correct
            "Моцарт",
            "Цецка Цачева"};

    private JFrame frame;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JLabel resultLabel;
    private JLabel congratsLbl;

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
    public void initialize() {

        frame = new JFrame();
        frame.setTitle("Тест - Изходно ниво");
        frame.setBounds(100, 100, 519, 348);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblQuestion = new JLabel("въпрос");
        lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblQuestion.setBounds(27, 31, 441, 51);
        frame.getContentPane().add(lblQuestion);

        ans1 = new JRadioButton("ans1");
        buttonGroup.add(ans1);
        ans1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans1.setBounds(27, 111, 251, 31);
        frame.getContentPane().add(ans1);

        ans2 = new JRadioButton("ans2");
        buttonGroup.add(ans2);
        ans2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans2.setBounds(27, 145, 251, 31);
        frame.getContentPane().add(ans2);

        ans3 = new JRadioButton("ans3");
        buttonGroup.add(ans3);
        ans3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans3.setBounds(27, 179, 251, 31);
        frame.getContentPane().add(ans3);

        ans4 = new JRadioButton("ans4");
        buttonGroup.add(ans4);
        ans4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ans4.setBounds(27, 213, 251, 31);
        frame.getContentPane().add(ans4);

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        resultLabel.setBounds(62, 131, 359, 63);
        frame.getContentPane().add(resultLabel);

        congratsLbl = new JLabel("Браво!");
        congratsLbl.setHorizontalAlignment(SwingConstants.CENTER);
        congratsLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
        congratsLbl.setBounds(175, 234, 132, 40);
        congratsLbl.setVisible(false);
        frame.getContentPane().add(congratsLbl);

        btn = new JButton("next/finish\r\n");
        btn.setBackground(new Color(255, 255, 255));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                question++;
                if(question < maxQuestion) {
                    nextQuestion(question);
                }
                else {
                    CheckAnswer(maxQuestion);

                    lblQuestion.setText("Вие приключихте теста!");

                    ans1.setVisible(false);
                    ans2.setVisible(false);
                    ans3.setVisible(false);
                    ans4.setVisible(false);
                    btn.setVisible(false);

                    double percent = correct / maxQuestion * 100;
                    resultLabel.setText("Резултат: " + correct + "/" + maxQuestion + " верни (" + percent + "%)");

                    if(correct == maxQuestion) {
                        congratsLbl.setVisible(true);
                    }
                }

                //System.out.println(correct);
            }
        });
        btn.setBounds(352, 250, 116, 40);
        frame.getContentPane().add(btn);

        nextQuestion(0);
    }

    public void nextQuestion(int questionNum) {
        String currentQuestion = questions[questionNum];
        String ans1Value = "";
        String ans2Value = "";
        String ans3Value = "";
        String ans4Value = "";

        lblQuestion.setText(currentQuestion);

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
            case 5:
                ans1Value = answers6[0];
                ans2Value = answers6[1];
                ans3Value = answers6[2];
                ans4Value = answers6[3];
                break;
            case 6:
                ans1Value = answers7[0];
                ans2Value = answers7[1];
                ans3Value = answers7[2];
                ans4Value = answers7[3];
                break;
            case 7:
                ans1Value = answers8[0];
                ans2Value = answers8[1];
                ans3Value = answers8[2];
                ans4Value = answers8[3];
                break;
            case 8:
                ans1Value = answers9[0];
                ans2Value = answers9[1];
                ans3Value = answers9[2];
                ans4Value = answers9[3];
                break;
            case 9:
                ans1Value = answers10[0];
                ans2Value = answers10[1];
                ans3Value = answers10[2];
                ans4Value = answers10[3];
                break;
            case 10:
                ans1Value = answers11[0];
                ans2Value = answers11[1];
                ans3Value = answers11[2];
                ans4Value = answers11[3];
                break;
            case 11:
                ans1Value = answers12[0];
                ans2Value = answers12[1];
                ans3Value = answers12[2];
                ans4Value = answers12[3];
                break;
            case 12:
                ans1Value = answers13[0];
                ans2Value = answers13[1];
                ans3Value = answers13[2];
                ans4Value = answers13[3];
                break;
            case 13:
                ans1Value = answers14[0];
                ans2Value = answers14[1];
                ans3Value = answers14[2];
                ans4Value = answers14[3];
                break;
            case 14:
                ans1Value = answers15[0];
                ans2Value = answers15[1];
                ans3Value = answers15[2];
                ans4Value = answers15[3];
                break;
            case 15:
                ans1Value = answers16[0];
                ans2Value = answers16[1];
                ans3Value = answers16[2];
                ans4Value = answers16[3];
                break;
            case 16:
                ans1Value = answers17[0];
                ans2Value = answers17[1];
                ans3Value = answers17[2];
                ans4Value = answers17[3];
                break;
            case 17:
                ans1Value = answers18[0];
                ans2Value = answers18[1];
                ans3Value = answers18[2];
                ans4Value = answers18[3];
                break;
            case 18:
                ans1Value = answers19[0];
                ans2Value = answers19[1];
                ans3Value = answers19[2];
                ans4Value = answers19[3];
                break;
            case 19:
                ans1Value = answers20[0];
                ans2Value = answers20[1];
                ans3Value = answers20[2];
                ans4Value = answers20[3];
                break;
        }

        ans1.setText(ans1Value);
        ans2.setText(ans2Value);
        ans3.setText(ans3Value);
        ans4.setText(ans4Value);

        CheckAnswer(question);

        buttonGroup.clearSelection();

        ChangeButtonContext(questionNum);
    }

    public void ChangeButtonContext(int questionNum) {
        if (questionNum < maxQuestion - 1) {
            btn.setText("Next");
        }
        else {
            btn.setText("Finish");
        }
    }

    public void CheckAnswer(int questionNum) {
        switch(questionNum - 1) {
            case 0:
                if(ans2.isSelected()) {
                    correct++;
                }
                break;
            case 1:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 2:
                if(ans1.isSelected()) {
                    correct++;
                }
                break;
            case 3:
                if(ans4.isSelected()) {
                    correct++;
                }
                break;
            case 4:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 5:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 6:
                if(ans1.isSelected()) {
                    correct++;
                }
                break;
            case 7:
                if(ans4.isSelected()) {
                    correct++;
                }
                break;
            case 8:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 9:
                if(ans1.isSelected()) {
                    correct++;
                }
                break;
            case 10:
                if(ans1.isSelected()) {
                    correct++;
                }
                break;
            case 11:
                if(ans2.isSelected()) {
                    correct++;
                }
                break;
            case 12:
                if(ans4.isSelected()) {
                    correct++;
                }
                break;
            case 13:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 14:
                if(ans2.isSelected()) {
                    correct++;
                }
                break;
            case 15:
                if(ans2.isSelected()) {
                    correct++;
                }
                break;
            case 16:
                if(ans1.isSelected()) {
                    correct++;
                }
                break;
            case 17:
                if(ans4.isSelected()) {
                    correct++;
                }
                break;
            case 18:
                if(ans3.isSelected()) {
                    correct++;
                }
                break;
            case 19:
                if(ans2.isSelected()) {
                    correct++;
                }
                break;
        }
    }
}
