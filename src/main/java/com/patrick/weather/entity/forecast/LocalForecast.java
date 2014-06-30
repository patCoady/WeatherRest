
package com.patrick.weather.entity.forecast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
/*@JsonInclude(JsonInclude.Include.NON_NULL)*/
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"cod",
"message",
"city",
"cnt",
"list"
})
public class LocalForecast {

@JsonProperty("cod")
private String cod;
@JsonProperty("message")
private Double message;
@JsonProperty("city")
private City city;
@JsonProperty("cnt")
private Integer cnt;
@JsonProperty("list")
private java.util.List<com.patrick.weather.entity.forecast.List> list = new ArrayList<com.patrick.weather.entity.forecast.List>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("cod")
public String getCod() {
return cod;
}

@JsonProperty("cod")
public void setCod(String cod) {
this.cod = cod;
}

@JsonProperty("message")
public Double getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(Double message) {
this.message = message;
}

@JsonProperty("city")
public City getCity() {
return city;
}

@JsonProperty("city")
public void setCity(City city) {
this.city = city;
}

@JsonProperty("cnt")
public Integer getCnt() {
return cnt;
}

@JsonProperty("cnt")
public void setCnt(Integer cnt) {
this.cnt = cnt;
}

@JsonProperty("list")
public java.util.List<com.patrick.weather.entity.forecast.List> getList() {
return (java.util.List<com.patrick.weather.entity.forecast.List>) list;
}

@JsonProperty("list")
public void setList(java.util.List<com.patrick.weather.entity.forecast.List> list) {
this.list = list;
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