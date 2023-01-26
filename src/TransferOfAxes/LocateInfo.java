package TransferOfAxes;





/**
 *
 * 定位的几个基本信息
 */

public class LocateInfo {
    /**
     * 经度
     */
    private double longitude;
    /**
     * 维度
     */
    private double Latitude;
    /**
     * 是否在中国
     */
    private boolean isChina;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public boolean isChina() {
        return isChina;
    }

    public void setChina(boolean china) {
        isChina = china;
    }
}
