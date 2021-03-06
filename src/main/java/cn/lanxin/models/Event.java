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
import cn.lanxin.models.PushData;
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
 * Event
 */

public class Event {
  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channelType";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private Integer channelType;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "deviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private Integer deviceType;

  public static final String SERIALIZED_NAME_ENTRY_ID = "entryId";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private String entryId;

  public static final String SERIALIZED_NAME_EVENT_DATA = "eventData";
  @SerializedName(SERIALIZED_NAME_EVENT_DATA)
  private String eventData;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private Integer expires;

  public static final String SERIALIZED_NAME_PUSH_DATA = "pushData";
  @SerializedName(SERIALIZED_NAME_PUSH_DATA)
  private PushData pushData;

  public static final String SERIALIZED_NAME_RECEIVER_IDS = "receiverIds";
  @SerializedName(SERIALIZED_NAME_RECEIVER_IDS)
  private List<String> receiverIds = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public Event channelType(Integer channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * ????????????
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????")

  public Integer getChannelType() {
    return channelType;
  }


  public void setChannelType(Integer channelType) {
    this.channelType = channelType;
  }


  public Event deviceType(Integer deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * ??????????????????????????????1: android, 2: ios, 4: windows, 8: mac, 16: linux ?????????channelType???????????????????????????????????????( | )????????????????????????????????????0??? ????????????????????????????????????????????????????????????
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "??????????????????????????????1: android, 2: ios, 4: windows, 8: mac, 16: linux ?????????channelType???????????????????????????????????????( | )????????????????????????????????????0??? ????????????????????????????????????????????????????????????")

  public Integer getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public Event entryId(String entryId) {
    
    this.entryId = entryId;
    return this;
  }

   /**
   * ???????????????ID???????????????????????????
   * @return entryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????ID???????????????????????????")

  public String getEntryId() {
    return entryId;
  }


  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }


  public Event eventData(String eventData) {
    
    this.eventData = eventData;
    return this;
  }

   /**
   * ???????????????????????????????????????-????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
   * @return eventData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????-????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")

  public String getEventData() {
    return eventData;
  }


  public void setEventData(String eventData) {
    this.eventData = eventData;
  }


  public Event eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????:app_changes??? ????????????????????????????????????????????????????????? ?????????type_??????type_??????Id(openid)??? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????:app_changes??? ????????????????????????????????????????????????????????? ?????????type_??????type_??????Id(openid)??? ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public Event expires(Integer expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * ???????????????????????????????????????????????????0????????????????????????????????????????????????????????????0?????????????????????????????????????????????????????????
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "???????????????????????????????????????????????????0????????????????????????????????????????????????????????????0?????????????????????????????????????????????????????????")

  public Integer getExpires() {
    return expires;
  }


  public void setExpires(Integer expires) {
    this.expires = expires;
  }


  public Event pushData(PushData pushData) {
    
    this.pushData = pushData;
    return this;
  }

   /**
   * Get pushData
   * @return pushData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushData getPushData() {
    return pushData;
  }


  public void setPushData(PushData pushData) {
    this.pushData = pushData;
  }


  public Event receiverIds(List<String> receiverIds) {
    
    this.receiverIds = receiverIds;
    return this;
  }

  public Event addReceiverIdsItem(String receiverIdsItem) {
    if (this.receiverIds == null) {
      this.receiverIds = new ArrayList<String>();
    }
    this.receiverIds.add(receiverIdsItem);
    return this;
  }

   /**
   * ????????????open staffId??????
   * @return receiverIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "????????????open staffId??????")

  public List<String> getReceiverIds() {
    return receiverIds;
  }


  public void setReceiverIds(List<String> receiverIds) {
    this.receiverIds = receiverIds;
  }


  public Event version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * ?????????????????????????????????????????????????????????????????????????????? ?????????1605693953610320
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "?????????????????????????????????????????????????????????????????????????????? ?????????1605693953610320")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.channelType, event.channelType) &&
        Objects.equals(this.deviceType, event.deviceType) &&
        Objects.equals(this.entryId, event.entryId) &&
        Objects.equals(this.eventData, event.eventData) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.expires, event.expires) &&
        Objects.equals(this.pushData, event.pushData) &&
        Objects.equals(this.receiverIds, event.receiverIds) &&
        Objects.equals(this.version, event.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, deviceType, entryId, eventData, eventType, expires, pushData, receiverIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    pushData: ").append(toIndentedString(pushData)).append("\n");
    sb.append("    receiverIds: ").append(toIndentedString(receiverIds)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

