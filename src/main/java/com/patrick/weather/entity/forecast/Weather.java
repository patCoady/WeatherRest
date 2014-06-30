
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
"main",
"description",
"icon"
})
public class Weather {

@JsonProperty("id")
private Integer id;
@JsonProperty("main")
private String main;
@JsonProperty("description")
private String description;
@JsonProperty("icon")
private String icon;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("main")
public String getMain() {
return main;
}

@JsonProperty("main")
public void setMain(String main) {
this.main = main;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("icon")
public String getIcon() {
return icon;
}

@JsonProperty("icon")
public void setIcon(String icon) {
this.icon = icon;
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
