public class Test {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);
        remoteControl.setCommand(0,onCommand,offCommand);
        //……other

        remoteControl.onButtonWasPushed(0);

        remoteControl.offButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();

    }
}
