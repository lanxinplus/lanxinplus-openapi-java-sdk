/*
 * LanXin+ OpenAPI
 * LanXin+ OpenAPI Platform
 *
 * 
 *
 * NOTE: This class is auto generated by LanXin+(https://openapi.lanxin.cn).
 * https://openapi.lanxin.cn
 * Do not edit the class manually.
 */


package cn.lanxin.models;

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

/**
 * V1TagsCreateRequestBody
 */

public class V1TagsCreateRequestBody {
  public static final String SERIALIZED_NAME_TAG_GROUP_ID = "tagGroupId";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_ID)
  private String tagGroupId;

  public static final String SERIALIZED_NAME_TAG_NAME = "tagName";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;


  public V1TagsCreateRequestBody tagGroupId(String tagGroupId) {
    
    this.tagGroupId = tagGroupId;
    return this;
  }

   /**
   * Get tagGroupId
   * @return tagGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagGroupId() {
    return tagGroupId;
  }


  public void setTagGroupId(String tagGroupId) {
    this.tagGroupId = tagGroupId;
  }


  public V1TagsCreateRequestBody tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagsCreateRequestBody v1TagsCreateRequestBody = (V1TagsCreateRequestBody) o;
    return Objects.equals(this.tagGroupId, v1TagsCreateRequestBody.tagGroupId) &&
        Objects.equals(this.tagName, v1TagsCreateRequestBody.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagGroupId, tagName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagsCreateRequestBody {\n");
    sb.append("    tagGroupId: ").append(toIndentedString(tagGroupId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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

}

