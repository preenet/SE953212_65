package Lab2;
/**
 * Your Lab2 solution
 * @Author pree.t@cmu.ac.th
 */
public class UniData implements Comparable <UniData> {
    
    private String year, score, uniName, link, city, country, logo, rank;

    public UniData() {

    }// default constructor

    public UniData(String year, String rank, String uniName, String  score, String link, String country, String city, String logo) {
        this.year = year;
        this.rank = rank;
        this.uniName = uniName;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.logo = logo;

    }// end overload constructor

    public String  getYear() {
        return this.year;
    }
    public void setYear(String x) {
        this.year = x;
    }

    public String getUniName() {
        return this.uniName;
    }

    public void setUniName(String x) {
        this.uniName = x;
    }

    public String getRank() {
        //return Integer.parseInt( this.rank );
        return this.rank;
    }

    public String  getScore() {
        return this.score;
    }

    public void setScore(String  x) {
        this.score = x;
    }

    public void setRank(String x) {
        this.rank = x;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String x) {
        this.link = x;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String x) {
        this.logo = x;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String x) {
        this.country = x;
    }

    public String getCity() {
        return this.country;
    }

    public void setCity(String x) {
        this.city = x;
    }

    public String toString() {
        return "[" + this.year + ", " + this.rank + ", " + this.uniName + ", " + this.score + ", " 
        + this.link + ", " + this.country + ", " + this.city + ", " + this.logo + "]";

    }// override method toString

    public int compareTo( UniData o) {
        if(Double.parseDouble(this.getScore()) > Double.parseDouble(o.getScore()))
            return 1;
        return -1;
    }// end override method compareTo
}// end class UniData
