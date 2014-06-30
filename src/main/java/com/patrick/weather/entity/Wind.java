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
"speed",
"deg",
"var_beg",
"var_end"
})
public class Wind {

@JsonProperty("speed")
private Double speed;
@JsonProperty("deg")
private Integer deg;
@JsonProperty("var_beg")
private Integer var_beg;
@JsonProperty("var_end")
private Integer var_end;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("speed")
public Double getSpeed() {
return speed;
}

@JsonProperty("speed")
public void setSpeed(Double speed) {
this.speed = speed;
}

@JsonProperty("deg")
public Integer getDeg() {
return deg;
}

@JsonProperty("deg")
public void setDeg(Integer deg) {
this.deg = deg;
}

@JsonProperty("var_beg")
public Integer getVar_beg() {
return var_beg;
}

@JsonProperty("var_beg")
public void setVar_beg(Integer var_beg) {
this.var_beg = var_beg;
}

@JsonProperty("var_end")
public Integer getVar_end() {
return var_end;
}

@JsonProperty("var_end")
public void setVar_end(Integer var_end) {
this.var_end = var_end;
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