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
 * V1MessagesCreateRequestBody
 */

public class V1MessagesCreateRequestBody {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ATTACH = "attach";
  @SerializedName(SERIALIZED_NAME_ATTACH)
  private String attach;

  public static final String SERIALIZED_NAME_DEPARTMENT_ID_LIST = "departmentIdList";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_ID_LIST)
  private List<String> departmentIdList = null;

  public static final String SERIALIZED_NAME_ENTRY_ID = "entryId";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private String entryId;

  public static final String SERIALIZED_NAME_MSG_DATA = "msgData";
  @SerializedName(SERIALIZED_NAME_MSG_DATA)
  private Object msgData;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msgType";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_USER_ID_LIST = "userIdList";
  @SerializedName(SERIALIZED_NAME_USER_ID_LIST)
  private List<String> userIdList = null;


  public V1MessagesCreateRequestBody accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 普通应用不需要填，仅适用于应用使用多公号消息通道的情况，例如移动会务。accountId为公号ID/entryId为应用入口ID。优先使用accountId做为目标公号。如果accountId为空，则使用entryId指定的的应用入口所关联的公号。如果应用只有一个入口可不填
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通应用不需要填，仅适用于应用使用多公号消息通道的情况，例如移动会务。accountId为公号ID/entryId为应用入口ID。优先使用accountId做为目标公号。如果accountId为空，则使用entryId指定的的应用入口所关联的公号。如果应用只有一个入口可不填")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public V1MessagesCreateRequestBody attach(String attach) {
    
    this.attach = attach;
    return this;
  }

   /**
   * 普通应用不需要填，仅适用于微应用，公号消息附加数据，目前用于传递微应用链接上下文数据，内容需要做UrlEncode。
   * @return attach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通应用不需要填，仅适用于微应用，公号消息附加数据，目前用于传递微应用链接上下文数据，内容需要做UrlEncode。")

  public String getAttach() {
    return attach;
  }


  public void setAttach(String attach) {
    this.attach = attach;
  }


  public V1MessagesCreateRequestBody departmentIdList(List<String> departmentIdList) {
    
    this.departmentIdList = departmentIdList;
    return this;
  }

  public V1MessagesCreateRequestBody addDepartmentIdListItem(String departmentIdListItem) {
    if (this.departmentIdList == null) {
      this.departmentIdList = new ArrayList<String>();
    }
    this.departmentIdList.add(departmentIdListItem);
    return this;
  }

   /**
   * 接收者分支列表（分支下的所有人），可选，与userIdList二者间必选一个，如果需要全组织广播，则填根分支Id：orgId-0，例如：524288-0, 最多支持100个, 全组织广播时，只支持1个组织
   * @return departmentIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接收者分支列表（分支下的所有人），可选，与userIdList二者间必选一个，如果需要全组织广播，则填根分支Id：orgId-0，例如：524288-0, 最多支持100个, 全组织广播时，只支持1个组织")

  public List<String> getDepartmentIdList() {
    return departmentIdList;
  }


  public void setDepartmentIdList(List<String> departmentIdList) {
    this.departmentIdList = departmentIdList;
  }


  public V1MessagesCreateRequestBody entryId(String entryId) {
    
    this.entryId = entryId;
    return this;
  }

   /**
   * 普通应用不需要填，仅适用于微应用
   * @return entryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "普通应用不需要填，仅适用于微应用")

  public String getEntryId() {
    return entryId;
  }


  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }


  public V1MessagesCreateRequestBody msgData(Object msgData) {
    
    this.msgData = msgData;
    return this;
  }

   /**
   * type 类型名对应的同名的格式化数据。每种格式都有对应的数据类型
   * @return msgData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type 类型名对应的同名的格式化数据。每种格式都有对应的数据类型")

  public Object getMsgData() {
    return msgData;
  }


  public void setMsgData(Object msgData) {
    this.msgData = msgData;
  }


  public V1MessagesCreateRequestBody msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 发送的消息格式，支持以下几种：\&quot;text\&quot;，\&quot;oacard\&quot;，\&quot;linkCard\&quot;，\&quot;appCard\&quot;
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发送的消息格式，支持以下几种：\"text\"，\"oacard\"，\"linkCard\"，\"appCard\"")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public V1MessagesCreateRequestBody userIdList(List<String> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public V1MessagesCreateRequestBody addUserIdListItem(String userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<String>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * 接收者人员列表，指定消息接收者时使用，可选，与departmentIdList二者间必选一个, 最多支持1000个
   * @return userIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接收者人员列表，指定消息接收者时使用，可选，与departmentIdList二者间必选一个, 最多支持1000个")

  public List<String> getUserIdList() {
    return userIdList;
  }


  public void setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MessagesCreateRequestBody v1MessagesCreateRequestBody = (V1MessagesCreateRequestBody) o;
    return Objects.equals(this.accountId, v1MessagesCreateRequestBody.accountId) &&
        Objects.equals(this.attach, v1MessagesCreateRequestBody.attach) &&
        Objects.equals(this.departmentIdList, v1MessagesCreateRequestBody.departmentIdList) &&
        Objects.equals(this.entryId, v1MessagesCreateRequestBody.entryId) &&
        Objects.equals(this.msgData, v1MessagesCreateRequestBody.msgData) &&
        Objects.equals(this.msgType, v1MessagesCreateRequestBody.msgType) &&
        Objects.equals(this.userIdList, v1MessagesCreateRequestBody.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, attach, departmentIdList, entryId, msgData, msgType, userIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MessagesCreateRequestBody {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
    sb.append("    departmentIdList: ").append(toIndentedString(departmentIdList)).append("\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    msgData: ").append(toIndentedString(msgData)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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
