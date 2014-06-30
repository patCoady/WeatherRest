
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
"population"
})
public class Sys {

@JsonProperty("population")
private Integer population;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("population")
public Integer getPopulation() {
return population;
}

@JsonProperty("population")
public void setPopulation(Integer population) {
this.population = population;
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