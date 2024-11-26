import com.google.gson.annotations.SerializedName;

public class Coins {
    @SerializedName("USD")
    private double USD;

    @SerializedName("ARS")
    private double ARS;

    @SerializedName("BRL")
    private double BRL;

    @SerializedName("COP")
    private double COP;

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getARS() {
        return ARS;
    }

    public void setARS(double ARS) {
        this.ARS = ARS;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getCOP() {
        return COP;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "USD=" + USD +
                ", ARS=" + ARS +
                ", BRL=" + BRL +
                ", COP=" + COP +
                '}';
    }
}
