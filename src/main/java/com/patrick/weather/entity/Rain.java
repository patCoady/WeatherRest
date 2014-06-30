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
"3h"
})
public class Rain {

@JsonProperty("3h")
private Integer _3h;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("3h")
public Integer get3h() {
return _3h;
}

@JsonProperty("3h")
public void set3h(Integer _3h) {
this._3h = _3h;
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