import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BuildingAscCountFloors implements ActionListener {
    public static String numberOfFloorsMessege = "Input the count of floors, which you want to have in the Building";
    @Override
    public void actionPerformed(ActionEvent e) {
        String messege = "The count of floors is set";
        Building.countOfFloors = Integer.parseInt(GuiElevator.textField2.getText());
        System.out.println(Building.countOfFloors);
        JOptionPane.showMessageDialog(null, messege, "", JOptionPane.CLOSED_OPTION);
        GuiElevator.isCountOfFloorSet = true;


    }
}