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
import cn.lanxin.models.GroupInfoTag;
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
 * V1TagGroupsInfoFetchData
 */

public class V1TagGroupsInfoFetchData {
  public static final String SERIALIZED_NAME_TAG_GROUP_CATEGORY = "tagGroupCategory";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_CATEGORY)
  private Integer tagGroupCategory;

  public static final String SERIALIZED_NAME_TAG_GROUP_NAME = "tagGroupName";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_NAME)
  private String tagGroupName;

  public static final String SERIALIZED_NAME_TAG_GROUP_TYPE = "tagGroupType";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_TYPE)
  private String tagGroupType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<GroupInfoTag> tags = null;


  public V1TagGroupsInfoFetchData tagGroupCategory(Integer tagGroupCategory) {
    
    this.tagGroupCategory = tagGroupCategory;
    return this;
  }

   /**
   * 标签分类。1：staff分类，2：department分类。
   * @return tagGroupCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签分类。1：staff分类，2：department分类。")

  public Integer getTagGroupCategory() {
    return tagGroupCategory;
  }


  public void setTagGroupCategory(Integer tagGroupCategory) {
    this.tagGroupCategory = tagGroupCategory;
  }


  public V1TagGroupsInfoFetchData tagGroupName(String tagGroupName) {
    
    this.tagGroupName = tagGroupName;
    return this;
  }

   /**
   * 标签组名称
   * @return tagGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签组名称")

  public String getTagGroupName() {
    return tagGroupName;
  }


  public void setTagGroupName(String tagGroupName) {
    this.tagGroupName = tagGroupName;
  }


  public V1TagGroupsInfoFetchData tagGroupType(String tagGroupType) {
    
    this.tagGroupType = tagGroupType;
    return this;
  }

   /**
   * 标签组类型（用于索引）
   * @return tagGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签组类型（用于索引）")

  public String getTagGroupType() {
    return tagGroupType;
  }


  public void setTagGroupType(String tagGroupType) {
    this.tagGroupType = tagGroupType;
  }


  public V1TagGroupsInfoFetchData tags(List<GroupInfoTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public V1TagGroupsInfoFetchData addTagsItem(GroupInfoTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<GroupInfoTag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 标签列表
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签列表")

  public List<GroupInfoTag> getTags() {
    return tags;
  }


  public void setTags(List<GroupInfoTag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagGroupsInfoFetchData v1TagGroupsInfoFetchData = (V1TagGroupsInfoFetchData) o;
    return Objects.equals(this.tagGroupCategory, v1TagGroupsInfoFetchData.tagGroupCategory) &&
        Objects.equals(this.tagGroupName, v1TagGroupsInfoFetchData.tagGroupName) &&
        Objects.equals(this.tagGroupType, v1TagGroupsInfoFetchData.tagGroupType) &&
        Objects.equals(this.tags, v1TagGroupsInfoFetchData.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagGroupCategory, tagGroupName, tagGroupType, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagGroupsInfoFetchData {\n");
    sb.append("    tagGroupCategory: ").append(toIndentedString(tagGroupCategory)).append("\n");
    sb.append("    tagGroupName: ").append(toIndentedString(tagGroupName)).append("\n");
    sb.append("    tagGroupType: ").append(toIndentedString(tagGroupType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

