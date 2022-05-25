import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiElevator extends JFrame {
    private JLabel label = new JLabel("Information");
    public static JTextField textField = new JTextField("", 1);
    public static JTextField textField2 = new JTextField("", 1);
    private JLabel label2 = new JLabel("Input");
    public static JButton button = new JButton("Accept");
    private JLabel label3 = new JLabel("Elevator");
    private JLabel label4 = new JLabel("Floor");
    public static ArrayList<JRadioButton> floorsList = new ArrayList<JRadioButton>();
    public static ArrayList<JRadioButton> elevatorList = new ArrayList<JRadioButton>();

    public static boolean isCountOfFloorSet;

    public GuiElevator(String tytle) {
        this.setBounds(700, 200, 200, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(10, 2, 3, 3));
        container.add(label3);
        container.add(label4);
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group1=new ButtonGroup();
        for (int i = Building.countOfFloors; i > 0; i--) {

            JRadioButton elevator = new JRadioButton("Floor"+i);
            JRadioButton floor = new JRadioButton("Floor" + i);
            group.add(floor);
            group1.add(elevator);
            floor.addActionListener(new BuildingSetNumberOfFloor());

            container.add(elevator);
            container.add(floor);
            floor.setSelected(true);
            elevator.setSelected(true);
            floorsList.add(floor);
            elevatorList.add(elevator);

        }
        textField.setText("");
        textField2.setText("");

            }

    public GuiElevator() {
        super("Elevator");
        this.setBounds(300, 200, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 3, 3));
        container.add(textField);
        container.add(textField2);

        button.addActionListener(new ElevatorListener());
        container.add(button);

    }

    public GuiElevator(String tytle, boolean isCountOfFloorSet) {
        super("");
        this.setBounds(200, 200, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 3, 3));
        container.add(textField);
        textField.setText(BuildingAscCountFloors.numberOfFloorsMessege);
        container.add(textField2);
        textField.setEnabled(true);
        button.addActionListener(new BuildingAscCountFloors());
        container.add(button);
        button.getAction();
               }

//    class ButtonEventListenerAscCountFloors implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String messege = "The count of floors is set";
//            Building.countOfFloors = Integer.parseInt(textField2.getText());
//            System.out.println(Building.countOfFloors);
//            JOptionPane.showMessageDialog(null, messege, "", JOptionPane.PLAIN_MESSAGE);
//            isCountOfFloorSet = true;
//
//        }
//    }

//    class ButtonEventListenerSetCountFloors implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String messege="";
//            int i = Building.countOfFloors;
//            for (JRadioButton list : elevatorList) {
//
//                if (list.isSelected()) {
//                    Building.numberOfWishedFloor = i;
//                    break;
//                }
//                i--;
//            }
//
//            System.out.println(Building.numberOfWishedFloor);
//            JOptionPane.showMessageDialog(null, messege, "", JOptionPane.PLAIN_MESSAGE);
//            isCountOfFloorSet = true;
//
//        }
//    }

//    class ButtonEventListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            textField.setText(textField2.getText());
//        }
//    }
}
