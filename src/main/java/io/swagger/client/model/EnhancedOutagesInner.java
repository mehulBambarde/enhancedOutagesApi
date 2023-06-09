/*
 * Interview Tests Mock API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * EnhancedOutagesInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-12T19:38:32.340663737Z[GMT]")
public class EnhancedOutagesInner {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("begin")
  private OffsetDateTime begin = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  public EnhancedOutagesInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The device ID the outage pertains to
   * @return id
  **/
  @Schema(example = "44c02564-a229-4f51-8ded-cc7bcb202566", required = true, description = "The device ID the outage pertains to")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EnhancedOutagesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the device the outage pertains to
   * @return name
  **/
  @Schema(example = "Partridge", required = true, description = "The display name of the device the outage pertains to")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnhancedOutagesInner begin(OffsetDateTime begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Outage begin date time
   * @return begin
  **/
  @Schema(example = "2022-01-01T00:00Z", required = true, description = "Outage begin date time")
  public OffsetDateTime getBegin() {
    return begin;
  }

  public void setBegin(OffsetDateTime begin) {
    this.begin = begin;
  }

  public EnhancedOutagesInner end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Outage end date time
   * @return end
  **/
  @Schema(example = "2022-01-02T12:01:59.123Z", required = true, description = "Outage end date time")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedOutagesInner enhancedOutagesInner = (EnhancedOutagesInner) o;
    return Objects.equals(this.id, enhancedOutagesInner.id) &&
        Objects.equals(this.name, enhancedOutagesInner.name) &&
        Objects.equals(this.begin, enhancedOutagesInner.begin) &&
        Objects.equals(this.end, enhancedOutagesInner.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, begin, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedOutagesInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
