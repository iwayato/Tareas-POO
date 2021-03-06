public abstract class DomoticDevice {
    
    public abstract String getHeader();
    private final int id;
    private int channel;

    public DomoticDevice(int id, int ch){
       this.id= id;
       channel= ch;
    }

    public int getChannel() {
        return channel;
    }

    public int getId() {
        return id;
    }
    
}
