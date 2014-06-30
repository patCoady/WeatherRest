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
"all"
})
public class Clouds {

@JsonProperty("all")
private Integer all;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("all")
public Integer getAll() {
return all;
}

@JsonProperty("all")
public void setAll(Integer all) {
this.all = all;
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