
package com.patrick.weather.entity.forecast;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


/*@JsonInclude(JsonInclude.Include.NON_NULL)*/
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"id",
"name",
"coord",
"country",
"population",
"sys"
})
public class City {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("coord")
private Coord coord;
@JsonProperty("country")
private String country;
@JsonProperty("population")
private Integer population;
@JsonProperty("sys")
private Sys sys;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("coord")
public Coord getCoord() {
return coord;
}

@JsonProperty("coord")
public void setCoord(Coord coord) {
this.coord = coord;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("population")
public Integer getPopulation() {
return population;
}

@JsonProperty("population")
public void setPopulation(Integer population) {
this.population = population;
}

@JsonProperty("sys")
public Sys getSys() {
return sys;
}

@JsonProperty("sys")
public void setSys(Sys sys) {
this.sys = sys;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}