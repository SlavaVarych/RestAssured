package TeamsResponseSerialisation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "filters",
        "competition",
        "season",
        "teams"
})
public class Example implements Serializable
{

    public Example(Integer count, Filters filters, Competition competition, Season season, List<Team> teams) {
        this.count = count;
        this.filters = filters;
        this.competition = competition;
        this.season = season;
        this.teams = teams;
    }

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("competition")
    private Competition competition;
    @JsonProperty("season")
    private Season season;
    @JsonProperty("teams")
    private List<Team> teams = new ArrayList<Team>();
    private final static long serialVersionUID = 6127361314782626719L;

    @JsonProperty("count")
        public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("competition")
    public Competition getCompetition() {
        return competition;
    }

    @JsonProperty("competition")
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @JsonProperty("season")
    public Season getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Season season) {
        this.season = season;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(filters).append(competition).append(season).append(teams).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(count, rhs.count).append(filters, rhs.filters).append(competition, rhs.competition).append(season, rhs.season).append(teams, rhs.teams).isEquals();
    }

}
