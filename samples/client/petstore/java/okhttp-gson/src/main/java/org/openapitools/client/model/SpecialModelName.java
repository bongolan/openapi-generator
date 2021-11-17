/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * SpecialModelName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpecialModelName {
  public static final String SERIALIZED_NAME_$_SPECIAL_PROPERTY_NAME = "$special[property.name]";
  @SerializedName(SERIALIZED_NAME_$_SPECIAL_PROPERTY_NAME)
  private Long $specialPropertyName;

  public SpecialModelName() { 
  }

  public SpecialModelName $specialPropertyName(Long $specialPropertyName) {
    
    this.$specialPropertyName = $specialPropertyName;
    return this;
  }

   /**
   * Get $specialPropertyName
   * @return $specialPropertyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long get$SpecialPropertyName() {
    return $specialPropertyName;
  }


  public void set$SpecialPropertyName(Long $specialPropertyName) {
    this.$specialPropertyName = $specialPropertyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialModelName $specialModelName = (SpecialModelName) o;
    return Objects.equals(this.$specialPropertyName, $specialModelName.$specialPropertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash($specialPropertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialModelName {\n");
    sb.append("    $specialPropertyName: ").append(toIndentedString($specialPropertyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("$special[property.name]");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomDeserializer implements JsonDeserializer<SpecialModelName> {
    @Override
    public SpecialModelName deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!SpecialModelName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `SpecialModelName` properties");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return new Gson().fromJson(json, SpecialModelName.class);
    }
  }
}
