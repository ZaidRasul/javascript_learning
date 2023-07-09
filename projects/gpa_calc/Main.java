import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame f1 = new JFrame("Grades ");

        f1.setBounds(100,100,750,500);
        f1.setVisible(true);


        //Subjects
        JLabel l1_s1 = new JLabel("Subject 1 ");
        l1_s1.setBounds(30,60,100,30);
        JLabel l2_s2 = new JLabel("Subject 2 ");
        l2_s2.setBounds(30,100,100,30);
        JLabel l3_s3 = new JLabel("Subject 3 ");
        l3_s3.setBounds(30,130,100,30);
        JLabel l4_s4 = new JLabel("Subject 4 ");
        l4_s4.setBounds(30,170,100,30);
        JLabel l5_s5 = new JLabel("Subject 5 ");
        l5_s5.setBounds(30,210,100,30);
        JLabel l6_gpa = new JLabel("GPA ");
        l6_gpa.setBounds(30,260,100,30);

        //Text fields to enter obtained marks
        JTextField tf1_ob_s1 = new JTextField();
        tf1_ob_s1.setBounds(90,60,100,30);
        JTextField tf2_ob_s2 = new JTextField();
        tf2_ob_s2.setBounds(90,100,100,30);
        JTextField tf3_ob_s3 = new JTextField();
        tf3_ob_s3.setBounds(90,130,100,30);
        JTextField tf4_ob_s4 = new JTextField();
        tf4_ob_s4.setBounds(90,170,100,30);
        JTextField tf5_ob_s5 = new JTextField();
        tf5_ob_s5.setBounds(90,210,100,30);

        JTextField tf6_gpa = new JTextField();
        tf6_gpa.setBounds(90,260,100,30);

        //JTextField tf7_grade

        //Text fields to enter obtained marks
        JTextField tf1_t_s1 = new JTextField();
        tf1_t_s1.setBounds(200,60,100,30);
        JTextField tf2_t_s2 = new JTextField();
        tf2_t_s2.setBounds(200,100,100,30);
        JTextField tf3_t_s3 = new JTextField();
        tf3_t_s3.setBounds(200,130,100,30);
        JTextField tf4_t_s4 = new JTextField();
        tf4_t_s4.setBounds(200,170,100,30);
        JTextField tf5_t_s5 = new JTextField();
        tf5_t_s5.setBounds(200,210,100,30);


        JButton b1_cal = new JButton("Calculate");
        b1_cal.setBounds(200,260,100,30);

        b1_cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int s1_marks = Integer.parseInt(tf1_ob_s1.getText());
                double s1_grade = 0,s2_grade=0,s3_grade=0,s4_grade=0,s5_grade=0;

                if (s1_marks < 100 & s1_marks > 85) {
                    s1_grade = 4;
                } else if (s1_marks <= 85 && s1_marks > 81) {
                    s1_grade = 3.7;

                } else if (s1_marks <= 81 && s1_marks > 78) {
                    s1_grade = 3.5;
                } else if (s1_marks <= 78 && s1_marks > 72) {
                    s1_grade = 3.3;
                } else if (s1_marks <= 72 && s1_marks > 68) {
                    s1_grade = 2.9;
                }  else if (s1_marks <= 68 && s1_marks > 62) {
                    s1_grade = 2.5;
                }   else if (s1_marks <= 62&& s1_marks > 53) {
                    s1_grade = 2.2;
                } else if (s1_marks <53) {
                    s1_grade = 0;
                }



                int s2_marks = Integer.parseInt(tf2_ob_s2.getText());
                if (s2_marks < 100 & s2_marks > 85) {
                    s2_grade = 4;
                } else if (s2_marks <= 85 && s2_marks > 81) {
                    s2_grade = 3.7;

                } else if (s2_marks <= 81 && s2_marks > 78) {
                    s2_grade = 3.5;
                } else if (s2_marks <= 78 && s2_marks > 72) {
                    s2_grade = 3.3;
                } else if (s2_marks <= 72 && s2_marks > 68) {
                    s2_grade = 2.9;
                }  else if (s2_marks <= 68 && s2_marks > 62) {
                    s2_grade = 2.5;
                }   else if (s2_marks <= 62 && s2_marks > 53) {
                    s2_grade = 2.2;
                } else if (s2_marks <53) {
                    s2_grade = 0;
                }


                int s3_marks = Integer.parseInt(tf3_ob_s3.getText());
                if (s3_marks < 100 & s3_marks > 85) {
                    s3_grade = 4;
                } else if (s3_marks <= 85 && s3_marks > 81) {
                    s3_grade = 3.7;

                } else if (s3_marks <= 81 && s3_marks > 78) {
                    s3_grade = 3.5;
                } else if (s3_marks <= 78 && s3_marks > 72) {
                    s3_grade = 3.3;
                } else if (s3_marks <= 72 && s3_marks > 68) {
                    s3_grade = 2.9;
                }  else if (s3_marks <= 68 && s3_marks > 62) {
                    s3_grade = 2.5;
                }   else if (s3_marks <= 62&& s3_marks > 53) {
                    s3_grade = 2.2;
                } else if (s3_marks <53) {
                    s3_grade = 0;
                }

                int s4_marks = Integer.parseInt(tf4_ob_s4.getText());
                if (s4_marks < 100 & s4_marks > 85) {
                    s4_grade = 4;
                } else if (s4_marks <= 85 && s4_marks > 81) {
                    s4_grade = 3.7;
                } else if (s4_marks <= 81 && s4_marks > 78) {
                    s4_grade = 3.5;
                } else if (s4_marks <= 78 && s4_marks > 72) {
                    s4_grade = 3.3;
                } else if (s4_marks <= 72 && s4_marks > 68) {
                    s4_grade = 2.9;
                }  else if (s4_marks <= 68 && s4_marks > 62) {
                    s4_grade = 2.5;
                }   else if (s4_marks <= 62&& s4_marks > 53) {
                    s4_grade = 2.2;
                } else if (s4_marks <53) {
                    s4_grade = 0;
                }


                int s5_marks = Integer.parseInt(tf5_ob_s5.getText());
                if (s5_marks < 100 & s5_marks > 85) {
                    s5_grade = 4;
                } else if (s5_marks <= 85 && s5_marks > 81) {
                    s5_grade = 3.7;

                } else if (s5_marks <= 81 && s5_marks > 78) {
                    s5_grade = 3.5;
                } else if (s5_marks <= 78 && s5_marks > 72) {
                    s5_grade = 3.3;
                } else if (s5_marks <= 72 && s5_marks > 68) {
                    s5_grade = 2.9;
                }  else if (s5_marks <= 68 && s5_marks > 62) {
                    s5_grade = 2.5;
                }   else if (s5_marks <= 62&& s5_marks > 53) {
                    s5_grade = 2.2;
                } else if (s5_marks <53) {
                    s5_grade = 0;
                }

                //Asssigning a grade to each subject
                tf1_t_s1.setText(String.valueOf(s1_grade));
                tf2_t_s2.setText(String.valueOf(s2_grade));
                tf3_t_s3.setText(String.valueOf(s3_grade));
                tf4_t_s4.setText(String.valueOf(s4_grade));
                tf5_t_s5.setText(String.valueOf(s5_grade));

                int gpa = (int) ((s1_grade+s2_grade+s3_grade+s4_grade+s5_grade)/5);
                tf6_gpa.setText(String.valueOf(gpa));
            }
        });

        //adding subject label
        f1.add(l1_s1);
        f1.add(l2_s2);
        f1.add(l3_s3);
        f1.add(l4_s4);
        f1.add(l5_s5);
        f1.add(l6_gpa);

        //adding textfield to enter obtained marks
        f1.add(tf1_ob_s1);
        f1.add(tf2_ob_s2);
        f1.add(tf3_ob_s3);
        f1.add(tf4_ob_s4);
        f1.add(tf5_ob_s5);

        //adding textfield to enter total marks
        f1.add(tf1_t_s1);
        f1.add(tf2_t_s2);
        f1.add(tf3_t_s3);
        f1.add(tf4_t_s4);
        f1.add(tf5_t_s5);

        //gpa field
        tf6_gpa.setEditable(false);
        f1.add(tf6_gpa);

        f1.add(b1_cal);

        f1.setLayout(null);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}