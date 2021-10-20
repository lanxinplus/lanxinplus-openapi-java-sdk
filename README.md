# 蓝信 Java SDK

## 关于
> - 此Java SDK基于[蓝信开放平台API]构建
> - 蓝信开放平台，便于企业应用与蓝信集成，让协同与管理更加高效
> - 蓝信开放接口SDK，便捷调用服务端API，例如：认证授权、通讯录、消息通知、角色权限、媒体素材、组织管理、应用管理等具体可以访问 [蓝信开放平台API] 文档 看看

## 运行环境
> - Java 1.7+
> - Maven 3.x +

## 安装方法
在您的项目中使用蓝信Java SDK。导入如下：
```xml
<dependency>
  <groupId>cn.lanxin</groupId>
  <artifactId>lanxinplus-openapi-java-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

从 GitHub 下载代码后，您可以使用 Maven 构建它。使用以下命令构建：
>  mvn clean install -DskipTests


## 快速使用
#### 获取 APP_TOKEN
```java
import cn.lanxin.ApiClient;
import cn.lanxin.ApiException;
import cn.lanxin.Configuration;
import cn.lanxin.api.AuthApi;
import cn.lanxin.models.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://example.com/open/apigw");

        AuthApi apiInstance = new AuthApi(defaultClient);
        String grantType = "client_credential";
        String appid = "";
        String secret = "";
        try {
            V1AppTokenCreateResponse result = apiInstance.v1AppTokenCreate(grantType, appid, secret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#v1AppTokenCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## 测试用例使用说明
#### 运行test
```
mvn -Dtest=AuthApiTest#v1AppTokenCreateTest test
```

## 联系我们
- [蓝信官方网站](https://www.lanxin.cn/)
- [蓝信开放平台文档中心](https://openapi.lanxin.cn/doc/#/)

[蓝信开放平台API]: https://openapi.lanxin.cn/doc/#/server-api/

## License
> - MIT License, see [license file](LICENSE)