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
import java.util.ArrayList;
import java.util.List;

/**
 * V1TagGroupsFetchData
 */

public class V1TagGroupsFetchData {
  public static final String SERIALIZED_NAME_TAG_GROUP_IDS = "tagGroupIds";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_IDS)
  private List<String> tagGroupIds = null;


  public V1TagGroupsFetchData tagGroupIds(List<String> tagGroupIds) {
    
    this.tagGroupIds = tagGroupIds;
    return this;
  }

  public V1TagGroupsFetchData addTagGroupIdsItem(String tagGroupIdsItem) {
    if (this.tagGroupIds == null) {
      this.tagGroupIds = new ArrayList<String>();
    }
    this.tagGroupIds.add(tagGroupIdsItem);
    return this;
  }

   /**
   * Get tagGroupIds
   * @return tagGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTagGroupIds() {
    return tagGroupIds;
  }


  public void setTagGroupIds(List<String> tagGroupIds) {
    this.tagGroupIds = tagGroupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagGroupsFetchData v1TagGroupsFetchData = (V1TagGroupsFetchData) o;
    return Objects.equals(this.tagGroupIds, v1TagGroupsFetchData.tagGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagGroupsFetchData {\n");
    sb.append("    tagGroupIds: ").append(toIndentedString(tagGroupIds)).append("\n");
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

