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
"temp",
"pressure",
"humidity",
"temp_min",
"temp_max"
})
public class Main {

@JsonProperty("temp")
private Double temp;
@JsonProperty("pressure")
private Integer pressure;
@JsonProperty("humidity")
private Integer humidity;
@JsonProperty("temp_min")
private Double temp_min;
@JsonProperty("temp_max")
private Double temp_max;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("temp")
public Double getTemp() {
return temp;
}

@JsonProperty("temp")
public void setTemp(Double temp) {
this.temp = temp;
}

@JsonProperty("pressure")
public Integer getPressure() {
return pressure;
}

@JsonProperty("pressure")
public void setPressure(Integer pressure) {
this.pressure = pressure;
}

@JsonProperty("humidity")
public Integer getHumidity() {
return humidity;
}

@JsonProperty("humidity")
public void setHumidity(Integer humidity) {
this.humidity = humidity;
}

@JsonProperty("temp_min")
public Double getTemp_min() {
return temp_min;
}

@JsonProperty("temp_min")
public void setTemp_min(Double temp_min) {
this.temp_min = temp_min;
}

@JsonProperty("temp_max")
public Double getTemp_max() {
return temp_max;
}

@JsonProperty("temp_max")
public void setTemp_max(Double temp_max) {
this.temp_max = temp_max;
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
