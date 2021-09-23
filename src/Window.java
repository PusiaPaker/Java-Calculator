import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window extends JFrame {
    void numLogic(JLabel Label, JButton Button, String num){
        Button.addActionListener(e -> {
            if(Components.LABEL_TEXT.equals("0")) Components.LABEL_TEXT = "";
            Components.LABEL_TEXT += num;
            Label.setText(Components.LABEL_TEXT);
        });
    }

    public Window(){
        setSize(Components.SCREEN_SIZE);
        setMinimumSize(Components.SCREEN_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(((int)Components.DISPLAY_SIZE.getWidth()/2)-(Components.WIDTH/2),((int)Components.DISPLAY_SIZE.getHeight()/2)-(Components.HEIGHT/2));
        getContentPane().setBackground(Components.BG_COLOR);
        setIconImage(Components.ICON.getImage());
        setTitle(Components.TITLE_TEXT);


        //  SETS THE OUTPUT FOR THE FRAME
        JLabel Label = new JLabel(Components.LABEL_TEXT);
        Label.setSize(230,50);
        Label.setLocation(20, 10);
        Label.setFont(Components.LABEL_FONT);
        Label.setHorizontalAlignment(SwingConstants.RIGHT);

        //  SETS THE BORDER FOR THE OUTPUT LABEL
        Border blackLine = BorderFactory.createLineBorder(Color.black, 2);
        JLabel border = new JLabel("");
        border.setSize(250,50);
        border.setLocation(10, 10);
        border.setHorizontalAlignment(SwingConstants.RIGHT);
        border.setBorder(blackLine);

        add(border);
        add(Label);

        //      Creates A Menu Bar With Exit
        JMenuBar Bar = new JMenuBar();
        JMenu Menu = new JMenu("Menu");
        JMenuItem Exit = new JMenuItem("Exit");
        JMenuItem Clear = new JMenuItem("Clear");
        Menu.add(Clear);
        Menu.add(Exit);
        Bar.add(Menu);
        setJMenuBar(Bar);
        Clear.addActionListener(e -> {
            Components.LABEL_TEXT = "0";
            Components.numOne = 0f;
            Components.numResult = 0f;
            Label.setText(Components.LABEL_TEXT);
        });
        Exit.addActionListener(e -> System.exit(0));

        JButton BUTTON_0 = new JButton("0");
        JButton BUTTON_1 = new JButton("1");
        JButton BUTTON_2 = new JButton("2");
        JButton BUTTON_3 = new JButton("3");
        JButton BUTTON_4 = new JButton("4");
        JButton BUTTON_5 = new JButton("5");
        JButton BUTTON_6 = new JButton("6");
        JButton BUTTON_7 = new JButton("7");
        JButton BUTTON_8 = new JButton("8");
        JButton BUTTON_9 = new JButton("9");
        JButton BUTTON_PERIOD = new JButton(".");

        BUTTON_0.setSize(110, 50);
        BUTTON_0.setMinimumSize(new Dimension(110, 50));
        BUTTON_1.setSize(Components.BUTTON_SIZE);
        BUTTON_1.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_2.setSize(Components.BUTTON_SIZE);
        BUTTON_2.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_3.setSize(Components.BUTTON_SIZE);
        BUTTON_3.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_4.setSize(Components.BUTTON_SIZE);
        BUTTON_4.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_5.setSize(Components.BUTTON_SIZE);
        BUTTON_5.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_6.setSize(Components.BUTTON_SIZE);
        BUTTON_6.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_7.setSize(Components.BUTTON_SIZE);
        BUTTON_7.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_8.setSize(Components.BUTTON_SIZE);
        BUTTON_8.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_9.setSize(Components.BUTTON_SIZE);
        BUTTON_9.setMinimumSize(Components.BUTTON_SIZE);
        BUTTON_PERIOD.setSize(Components.BUTTON_SIZE);
        BUTTON_PERIOD.setMinimumSize(Components.BUTTON_SIZE);

        BUTTON_7.setLocation(10, 70);
        BUTTON_8.setLocation(Components.LOCATION_X +10, 70);
        BUTTON_9.setLocation(Components.LOCATION_X*2+10, 70);
        BUTTON_4.setLocation(10, Components.LOCATION_Y+70);
        BUTTON_5.setLocation(Components.LOCATION_X+10, Components.LOCATION_Y+70);
        BUTTON_6.setLocation(Components.LOCATION_X*2+10, Components.LOCATION_Y+70);
        BUTTON_1.setLocation(10, Components.LOCATION_Y*2+70);
        BUTTON_2.setLocation(Components.LOCATION_X+10, Components.LOCATION_Y*2+70);
        BUTTON_3.setLocation(Components.LOCATION_X*2+10, Components.LOCATION_Y*2+70);
        BUTTON_0.setLocation(10, Components.LOCATION_Y*3+70);
        BUTTON_PERIOD.setLocation(Components.LOCATION_X*2+10, Components.LOCATION_Y*3+70);


        BUTTON_0.addActionListener(e -> {
            if(!Components.LABEL_TEXT.equals("0")) Components.LABEL_TEXT += "0";
            Label.setText(Components.LABEL_TEXT);
        });
        BUTTON_PERIOD.addActionListener(e -> {
            Components.LABEL_TEXT += ".";
            Label.setText(Components.LABEL_TEXT);
        });
        numLogic(Label, BUTTON_1, "1");
        numLogic(Label, BUTTON_2, "2");
        numLogic(Label, BUTTON_3, "3");
        numLogic(Label, BUTTON_4, "4");
        numLogic(Label, BUTTON_5, "5");
        numLogic(Label, BUTTON_6, "6");
        numLogic(Label, BUTTON_7, "7");
        numLogic(Label, BUTTON_8, "8");
        numLogic(Label, BUTTON_9, "9");


        add(BUTTON_0);
        add(BUTTON_1);
        add(BUTTON_2);
        add(BUTTON_3);
        add(BUTTON_4);
        add(BUTTON_5);
        add(BUTTON_6);
        add(BUTTON_7);
        add(BUTTON_8);
        add(BUTTON_9);
        add(BUTTON_PERIOD);

        JButton mathAddition = new JButton("+");
        JButton mathSubtraction = new JButton("-");
        JButton mathMultiplication = new JButton("X");
        JButton mathDivision = new JButton("/");
        JButton mathEquals = new JButton("=");

        mathAddition.setSize(Components.MATH_BUTTON_SIZE);
        mathAddition.setMinimumSize(Components.MATH_BUTTON_SIZE);
        mathSubtraction.setSize(Components.MATH_BUTTON_SIZE);
        mathSubtraction.setMinimumSize(Components.MATH_BUTTON_SIZE);
        mathMultiplication.setSize(Components.MATH_BUTTON_SIZE);
        mathMultiplication.setMinimumSize(Components.MATH_BUTTON_SIZE);
        mathDivision.setSize(Components.MATH_BUTTON_SIZE);
        mathDivision.setMinimumSize(Components.MATH_BUTTON_SIZE);
        mathEquals.setSize(new Dimension(70, 50));
        mathEquals.setMinimumSize(new Dimension(70, 50));

        mathAddition.setLocation(Components.LOCATION_X*3+10, 45+25);
        mathSubtraction.setLocation(Components.LOCATION_X*3+10, 45*2+25);
        mathMultiplication.setLocation(Components.LOCATION_X*3+10, 45*3+25);
        mathDivision.setLocation(Components.LOCATION_X*3+10, 45*4+25);
        mathEquals.setLocation(Components.LOCATION_X*3+10, 45*5+25);


        // Program LOGIC
        mathAddition.addActionListener(e -> {
            if(Components.numOne == 0f){
                Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                Components.numResult += Components.numOne;
            }
            Components.numOne = 0f;
            Components.LABEL_TEXT = "0";
            Components.LAST_OPERATION = "ADD";
            Label.setText(Components.LABEL_TEXT);
        });

        mathSubtraction.addActionListener(e -> {
            if(Components.numOne == 0f){
                Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                Components.numResult -= Components.numOne;
            }
            Components.numOne = 0f;
            Components.LABEL_TEXT = "0";
            Components.LAST_OPERATION = "SUB";
            Label.setText(Components.LABEL_TEXT);
        });

        mathMultiplication.addActionListener(e -> {
            if(Components.numResult == 0f) Components.numResult = 1f;

            if(Components.numOne == 0f){
                Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                Components.numResult *= Components.numOne;
            }
            Components.numOne = 0f;
            Components.LABEL_TEXT = "0";
            Components.LAST_OPERATION = "MUL";
            Label.setText(Components.LABEL_TEXT);
        });

        mathDivision.addActionListener(e -> {
            if(Components.numResult == 0f) Components.numResult = 1f;
            if(Components.numOne == 0f){
                Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                Components.numResult = Components.numOne / Components.numResult;
            }
            Components.numOne = 0f;
            Components.LABEL_TEXT = "0";
            Components.LAST_OPERATION = "DIV";
            Label.setText(Components.LABEL_TEXT);
        });

        mathEquals.addActionListener(e -> {
            switch (Components.LAST_OPERATION) {
                case "ADD" -> {
                    Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                    Components.numResult += Components.numOne;
                }
                case "SUB" -> {
                    Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                    Components.numResult -= Components.numOne;
                }
                case "MUL" -> {
                    Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                    Components.numResult *= Components.numOne;
                }
                case "DIV" -> {
                    Components.numOne = Double.parseDouble(Components.LABEL_TEXT);
                    Components.numResult /= Components.numOne;
                }
            }
            Components.LABEL_TEXT = String.valueOf(Math.round(Components.numResult*10000000f)/10000000f);
            Label.setText(Components.LABEL_TEXT);
        });


        add(mathAddition);
        add(mathSubtraction);
        add(mathMultiplication);
        add(mathDivision);
        add(mathEquals);

        setAlwaysOnTop(true);
        setLayout(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

}
