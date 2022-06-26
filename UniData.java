/**
 * Lab 1 Solution
 * @author pree.t
 */
public class UniData {
    
    private int year, rank;
    private double score;
    String uniName, link, city, country, logo;

    public UniData() {

    }// default constructor

    public UniData(int year, int rank, String uniName, double score, String link, String country, String city, String logo) {
        this.year = year;
        this.rank = rank;
        this.uniName = uniName;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.logo = logo;

    }// end overload constructor

    public int getYear() {
        return this.year;
    }
    public void setYear(int x) {
        this.year = x;
    }

    public String getUniName() {
        return this.uniName;
    }

    public void setUniName() {

    }

    public String toString() {

    }// override method toString
}// end class UniData
