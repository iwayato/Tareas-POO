public class Lamp {

    public String header;
    private int channel;
    private short r,g,b;
    private LampState state;
    private final int id;
    private static int nextId = 0;

    public Lamp (int ch){
        channel = ch;
        state = LampState.OFF;
        r = 255;
        g = 255;
        b = 255;
    }

    {
        id = nextId++;
    }

    public int getChannel(){
        return channel;
    }

    public void changePowerState(){
        if(state == LampState.ON){
            state = LampState.OFF;
        }
        else{
            state = LampState.ON;
        }
    }

    public String getHeader(){
        String header = "L" + id + "R\t" + "L" + id + "G\t" + "L" + id + "B";
        return header;
    }
    
    public String toString(){
        if (state == LampState.ON)
            return r + "\t" + g + "\t" + b;
        else
            return "0\t0\t0";
    }
}
