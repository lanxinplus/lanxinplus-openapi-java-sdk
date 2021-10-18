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
 * V1AppTokenCreateData
 */

public class V1AppTokenCreateData {
  public static final String SERIALIZED_NAME_APP_TOKEN = "appToken";
  @SerializedName(SERIALIZED_NAME_APP_TOKEN)
  private String appToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;


  public V1AppTokenCreateData appToken(String appToken) {
    
    this.appToken = appToken;
    return this;
  }

   /**
   * 应用访问APP_TOKEN
   * @return appToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用访问APP_TOKEN")

  public String getAppToken() {
    return appToken;
  }


  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }


  public V1AppTokenCreateData expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * TOKEN 有效期（7200秒），建议应用根据过期时间缓存appToken, 单次获取，多次使用
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TOKEN 有效期（7200秒），建议应用根据过期时间缓存appToken, 单次获取，多次使用")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppTokenCreateData v1AppTokenCreateData = (V1AppTokenCreateData) o;
    return Objects.equals(this.appToken, v1AppTokenCreateData.appToken) &&
        Objects.equals(this.expiresIn, v1AppTokenCreateData.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appToken, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppTokenCreateData {\n");
    sb.append("    appToken: ").append(toIndentedString(appToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
