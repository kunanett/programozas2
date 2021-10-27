package zh.potZH_gyak.gyak1.feladat1;

public class Monitor {

    private final int width;
    private final int height;

    public Monitor(String size) {
        String[] sizes = size.split("x");
        this.width = Integer.parseInt(sizes[0].strip());
        this.height = Integer.parseInt(sizes[1].strip());
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNumberOfPixels() {
        return this.height * this.width;
    }

    public boolean isFullHD() {
        return width == 1920 && height == 1080;
    }

    public double getRatio() {
        return (double) width / height;
    }

    public int compare(Monitor otherMonitor){
        /*if (this.getNumberOfPixels() == otherMonitor.getNumberOfPixels()){
            return 0;
        }else if(this.getNumberOfPixels() < otherMonitor.getNumberOfPixels()) {
            return -1;
        }else {
            return 1;
        }*/
        return Integer.compare(this.getNumberOfPixels(), otherMonitor.getNumberOfPixels());
    }

    @Override
    public String toString() {
        return String.format("Monitor(%dx%d)", this.width, this.height);
    }
}
