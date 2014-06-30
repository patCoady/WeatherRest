package com.patrick.weather.entity;

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
"message",
"country",
"sunrise",
"sunset"
})
public class Sys {

@JsonProperty("message")
private Double message;
@JsonProperty("country")
private String country;
@JsonProperty("sunrise")
private Integer sunrise;
@JsonProperty("sunset")
private Integer sunset;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("message")
public Double getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(Double message) {
this.message = message;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("sunrise")
public Integer getSunrise() {
return sunrise;
}

@JsonProperty("sunrise")
public void setSunrise(Integer sunrise) {
this.sunrise = sunrise;
}

@JsonProperty("sunset")
public Integer getSunset() {
return sunset;
}

@JsonProperty("sunset")
public void setSunset(Integer sunset) {
this.sunset = sunset;
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