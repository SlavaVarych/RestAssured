package TeamsResponseSerialisation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "area",
        "name",
        "shortName",
        "tla",
        "crestUrl",
        "address",
        "phone",
        "website",
        "email",
        "founded",
        "clubColors",
        "venue",
        "lastUpdated"
})
public class Team implements Serializable
{
    public Team(Integer id, Area_ area, String name, String shortName, String tla, Object crestUrl, String address, String phone, String website, String email, Integer founded, String clubColors, String venue, String lastUpdated) {
        this.id = id;
        this.area = area;
        this.name = name;
        this.shortName = shortName;
        this.tla = tla;
        this.crestUrl = crestUrl;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.founded = founded;
        this.clubColors = clubColors;
        this.venue = venue;
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("area")
    private Area_ area;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("crestUrl")
    private Object crestUrl;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("website")
    private String website;
    @JsonProperty("email")
    private String email;
    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("clubColors")
    private String clubColors;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    private final static long serialVersionUID = 2587962450198482863L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("area")
    public Area_ getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area_ area) {
        this.area = area;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    @JsonProperty("crestUrl")
    public Object getCrestUrl() {
        return crestUrl;
    }

    @JsonProperty("crestUrl")
    public void setCrestUrl(Object crestUrl) {
        this.crestUrl = crestUrl;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    @JsonProperty("clubColors")
    public String getClubColors() {
        return clubColors;
    }

    @JsonProperty("clubColors")
    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(area).append(name).append(shortName).append(tla).append(crestUrl).append(address).append(phone).append(website).append(email).append(founded).append(clubColors).append(venue).append(lastUpdated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return new EqualsBuilder().append(id, rhs.id).append(area, rhs.area).append(name, rhs.name).append(shortName, rhs.shortName).append(tla, rhs.tla).append(crestUrl, rhs.crestUrl).append(address, rhs.address).append(phone, rhs.phone).append(website, rhs.website).append(email, rhs.email).append(founded, rhs.founded).append(clubColors, rhs.clubColors).append(venue, rhs.venue).append(lastUpdated, rhs.lastUpdated).isEquals();
    }

}