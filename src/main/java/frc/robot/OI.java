package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.ArmDown;
import frc.robot.commands.ArmUp;
import frc.robot.commands.GoOut;
import frc.robot.commands.Hang;
// import edu.wpi.first.wpilibj.buttons.Button;
// import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.TakeIn;
import edu.wpi.first.wpilibj2.command.button.*;

public class OI {

    Joystick logi = new Joystick(0);
    Joystick gamePad = new Joystick(1);
    private final Button btnOut = new JoystickButton(logi, 1);
    private final Button btnIn = new JoystickButton(logi, 2);
    private final Button btnHang = new JoystickButton(logi, 3);
    private final Button btnArmDown = new JoystickButton(logi, 4);
    private final Button btn5 = new JoystickButton(logi, 5);
    private final Button btnArmUp = new JoystickButton(logi, 6);
    private final Button btn7 = new JoystickButton(logi, 7);

    // private final Button btn = new JoystickButton(gamePad, 1); //A
    // private final Button btn2 = new JoystickButton(gamePad, 2); //B
    // private final Button btn3 = new JoystickButton(gamePad, 3); //X
    // private final Button btn4 = new JoystickButton(gamePad, 4); //Y
    // private final Button btn5 = new JoystickButton(gamePad, 5); //Left Bumper
    // private final Button btn6 = new JoystickButton(gamePad, 6); //Right Bumper

    public OI() {
        btnIn.whileHeld(new TakeIn());
        btnOut.whileHeld(new GoOut());
        btnHang.whileHeld(new Hang());
        btnArmUp.whileHeld(new ArmUp());
        btnArmDown.whileHeld(new ArmDown());
    }

    public boolean getInBut() {
        return btnIn.get();
    }

    public boolean getOutBut() {
        return btnOut.get();
    }

    public boolean getHangBut() {
        return btnHang.get();
    }

    public boolean getArmUpBut() {
        return btnArmUp.get();
    }

    public boolean getArmDownBut() {
        return btnArmDown.get();
    }

    public Joystick getLogi() {
        return logi;
    }
}