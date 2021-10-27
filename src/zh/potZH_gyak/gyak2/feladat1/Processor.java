package zh.potZH_gyak.gyak2.feladat1;

public class Processor {
    private final String description;

    public Processor(String description) {
        this.description = description;
    }

    public boolean isIntel() {
        return description.toLowerCase().contains("intel");
    }

    public boolean isAmd() {
        return description.toLowerCase().contains("amd");
    }

    public double getClockSpeed() {
        if (this.isIntel()) {
            String[] data = description.split(" ");
            String clockSpeed = data[data.length - 1];
            clockSpeed = clockSpeed.toLowerCase().replace("ghz", "");
            return Double.parseDouble(clockSpeed);
        }
        return -1;
    }

    public int cmpClockSpeed(Processor otherProcessor){
        if (this.isAmd() || otherProcessor.isAmd()){
            return -2;
        }else{
            return Double.compare(this.getClockSpeed(), otherProcessor.getClockSpeed());
        }
    }

    @Override
    public String toString() {
        return description;
    }

}
