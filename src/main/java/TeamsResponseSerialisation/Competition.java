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
        "code",
        "plan",
        "lastUpdated"
})
public class Competition implements Serializable
{
    public Competition(Integer id, Area area, String name, String code, String plan, String lastUpdated) {
        this.id = id;
        this.area = area;
        this.name = name;
        this.code = code;
        this.plan = plan;
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("area")
    private Area area;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    private final static long serialVersionUID = 5645008236594685804L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area area) {
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(String plan) {
        this.plan = plan;
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
        return new HashCodeBuilder().append(id).append(area).append(name).append(code).append(plan).append(lastUpdated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Competition) == false) {
            return false;
        }
        Competition rhs = ((Competition) other);
        return new EqualsBuilder().append(id, rhs.id).append(area, rhs.area).append(name, rhs.name).append(code, rhs.code).append(plan, rhs.plan).append(lastUpdated, rhs.lastUpdated).isEquals();
    }

}