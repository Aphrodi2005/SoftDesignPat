public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    // Constructor to initialize Server object with RAM, HDD, and CPU details.
    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    // Implementing abstract methods from the Computer class to provide specific details for a Server.
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}