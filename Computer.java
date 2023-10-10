public abstract class Computer {

    // Abstract methods to get RAM, HDD, and CPU details, which must be implemented by subclasses.
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    // Override toString() method to provide a string representation of the computer's configuration.
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}