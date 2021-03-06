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
 * V1MediasCreateData
 */

public class V1MediasCreateData {
  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_MEDIA_ID = "mediaId";
  @SerializedName(SERIALIZED_NAME_MEDIA_ID)
  private String mediaId;


  public V1MediasCreateData createdTime(String createdTime) {
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * 文件创建时间戳，单位微秒
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文件创建时间戳，单位微秒")

  public String getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  public V1MediasCreateData mediaId(String mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * 文件ID
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文件ID")

  public String getMediaId() {
    return mediaId;
  }


  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MediasCreateData v1MediasCreateData = (V1MediasCreateData) o;
    return Objects.equals(this.createdTime, v1MediasCreateData.createdTime) &&
        Objects.equals(this.mediaId, v1MediasCreateData.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, mediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MediasCreateData {\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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

