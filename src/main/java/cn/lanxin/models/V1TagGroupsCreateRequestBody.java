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
 * V1TagGroupsCreateRequestBody
 */

public class V1TagGroupsCreateRequestBody {
  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_TAG_GROUP_CATEGORY = "tagGroupCategory";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_CATEGORY)
  private Integer tagGroupCategory;

  public static final String SERIALIZED_NAME_TAG_GROUP_NAME = "tagGroupName";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_NAME)
  private String tagGroupName;

  public static final String SERIALIZED_NAME_TAG_GROUP_TYPE = "tagGroupType";
  @SerializedName(SERIALIZED_NAME_TAG_GROUP_TYPE)
  private String tagGroupType;


  public V1TagGroupsCreateRequestBody orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * 组织ID
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "组织ID")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public V1TagGroupsCreateRequestBody tagGroupCategory(Integer tagGroupCategory) {
    
    this.tagGroupCategory = tagGroupCategory;
    return this;
  }

   /**
   * 标签类别。1：用于staff，2：用于department
   * @return tagGroupCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签类别。1：用于staff，2：用于department")

  public Integer getTagGroupCategory() {
    return tagGroupCategory;
  }


  public void setTagGroupCategory(Integer tagGroupCategory) {
    this.tagGroupCategory = tagGroupCategory;
  }


  public V1TagGroupsCreateRequestBody tagGroupName(String tagGroupName) {
    
    this.tagGroupName = tagGroupName;
    return this;
  }

   /**
   * 标签分组名称（名称需要组织内唯一，不可重复，建议使用：应用开发商名称+应用名称+标签分组名称）
   * @return tagGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签分组名称（名称需要组织内唯一，不可重复，建议使用：应用开发商名称+应用名称+标签分组名称）")

  public String getTagGroupName() {
    return tagGroupName;
  }


  public void setTagGroupName(String tagGroupName) {
    this.tagGroupName = tagGroupName;
  }


  public V1TagGroupsCreateRequestBody tagGroupType(String tagGroupType) {
    
    this.tagGroupType = tagGroupType;
    return this;
  }

   /**
   * 标签组类型，用于分类检索, 非必填。通过这个字段应用可以方便的管理自己所创建的标签分组，是个自定义字符串，建议使用应用的域名再加个uuid保证唯一性
   * @return tagGroupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签组类型，用于分类检索, 非必填。通过这个字段应用可以方便的管理自己所创建的标签分组，是个自定义字符串，建议使用应用的域名再加个uuid保证唯一性")

  public String getTagGroupType() {
    return tagGroupType;
  }


  public void setTagGroupType(String tagGroupType) {
    this.tagGroupType = tagGroupType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TagGroupsCreateRequestBody v1TagGroupsCreateRequestBody = (V1TagGroupsCreateRequestBody) o;
    return Objects.equals(this.orgId, v1TagGroupsCreateRequestBody.orgId) &&
        Objects.equals(this.tagGroupCategory, v1TagGroupsCreateRequestBody.tagGroupCategory) &&
        Objects.equals(this.tagGroupName, v1TagGroupsCreateRequestBody.tagGroupName) &&
        Objects.equals(this.tagGroupType, v1TagGroupsCreateRequestBody.tagGroupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, tagGroupCategory, tagGroupName, tagGroupType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TagGroupsCreateRequestBody {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tagGroupCategory: ").append(toIndentedString(tagGroupCategory)).append("\n");
    sb.append("    tagGroupName: ").append(toIndentedString(tagGroupName)).append("\n");
    sb.append("    tagGroupType: ").append(toIndentedString(tagGroupType)).append("\n");
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

