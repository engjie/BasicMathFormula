package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 16019641 on 16/7/2018.
 */

public class MathItem {
    private String Area;
    private String Volume;

    public MathItem(String area, String volume) {
        Area = area;
        Volume = volume;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public String getArea() {

        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }
}
