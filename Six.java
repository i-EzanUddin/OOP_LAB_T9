class device{
    protected String light;
    protected String thermostat = "0";
    protected String camera;
    protected String speaker;
    protected int volume = 0;

    public void performAction(String action){
        System.out.println("Each devide can perform action.");
    }
}
class Light extends device{
    @Override
    public void performAction(String action) {
        if(action.equals("ON")){
            System.out.println("Light turns ON.");
            light = action;
        }
        else if(action.equals("OFF")){
            System.out.println("Light turns OFF.");
            light = action;
        }
        else if(action.equals("DIM")){
            System.out.println("Brightness: Set to 50% brightness.");
            light = "50%";
        }
        else{
            System.out.println("Invalid Action.");
        }
    }
}
//|| action.compareTo("0") == 0)
class Thermostat extends device{
    @Override
    public void performAction(String action) {
        if(action.equals("BOOST")){
            int result = Integer.parseInt(thermostat);
            result += 5;
            thermostat = String.valueOf(result);
            System.out.println("Temperature increased by 5C: "+ result +"C");
        }
        else if(action.equals("OFF")){
            System.out.println("The thermostat device turns off.");
            thermostat = action;
        }
        else if(action.compareTo("0") >= 0 || action.compareTo("0") < 0){
            thermostat = action;
            System.out.println("Temperature sets to: " + action +"C");
        }
        else{
            System.out.println("Invalid Action.");
        }
    }
}
class SecurityCamera extends device{
    @Override
    public void performAction(String action) {
        if(action.equals("RECORD")){
            System.out.println("Recording Starts.");
            camera = action;
        }
        else if(action.equals("STOP")){
            System.out.println("Recording Stop");
            camera = action;
        }
        else if(action.equals("ALERT")){
            System.out.println("Movement of a body Detected.");
            camera = action;
        }
        else{
            System.out.println("Invalid Action.");
        }
    }
}
class SmartSpeaker extends device{
    @Override
    public void performAction(String action) {
        if(action.equals("PLAY")){
            System.out.println("Music is now playing.");
            speaker = action;
        }
        else if(action.equals("STOP")){
            System.out.println("Music STOPS.");
            speaker = action;
        }
        else if(action.equals("VOLUME_UP") ||  action.equals("VOLUME_DOWN")){
            if(action.equals("VOLUME_UP")){
                System.out.println("Volume increased by 10 units.");
                volume += 10;
                speaker = action;
            }else{
                System.out.println("Volume decreased by 10 units.");
                volume -= 10;
                speaker = action;
            }
        }
        else{
            System.out.println("Invalid Action.");
        }
    }
}
public class Six {
    public static void main(String[] args){
        device[] s = new device[4];
        s[0] = new Light();
        s[1] = new Thermostat();
        s[2] = new SecurityCamera();
        s[3] = new SmartSpeaker();

        s[0].performAction("DIM");
        s[1].performAction("BOOST");
        s[2].performAction("STOP");
        s[3].performAction("VOLUME_DOWN");

    }
}
