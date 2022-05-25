import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       GuiElevator guiElevator =new GuiElevator("SetNumberOfFloors", false);
       guiElevator.setVisible(true);
        GuiElevator.textField2.grabFocus();
        ;
        while (guiElevator.isCountOfFloorSet==false)
{
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
               guiElevator.setVisible(false);

        GuiElevator guiElevator1 = new GuiElevator("Building");
        guiElevator1.setVisible(true);
        GuiElevator guiElevator2=new GuiElevator();
        guiElevator2.setVisible(true);



    }
}
