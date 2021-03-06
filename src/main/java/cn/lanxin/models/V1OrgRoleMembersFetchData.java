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
import cn.lanxin.models.RoleStaff;
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
 * V1OrgRoleMembersFetchData
 */

public class V1OrgRoleMembersFetchData {
  public static final String SERIALIZED_NAME_STAFFS = "staffs";
  @SerializedName(SERIALIZED_NAME_STAFFS)
  private List<RoleStaff> staffs = null;


  public V1OrgRoleMembersFetchData staffs(List<RoleStaff> staffs) {
    
    this.staffs = staffs;
    return this;
  }

  public V1OrgRoleMembersFetchData addStaffsItem(RoleStaff staffsItem) {
    if (this.staffs == null) {
      this.staffs = new ArrayList<RoleStaff>();
    }
    this.staffs.add(staffsItem);
    return this;
  }

   /**
   * Get staffs
   * @return staffs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleStaff> getStaffs() {
    return staffs;
  }


  public void setStaffs(List<RoleStaff> staffs) {
    this.staffs = staffs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OrgRoleMembersFetchData v1OrgRoleMembersFetchData = (V1OrgRoleMembersFetchData) o;
    return Objects.equals(this.staffs, v1OrgRoleMembersFetchData.staffs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OrgRoleMembersFetchData {\n");
    sb.append("    staffs: ").append(toIndentedString(staffs)).append("\n");
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

