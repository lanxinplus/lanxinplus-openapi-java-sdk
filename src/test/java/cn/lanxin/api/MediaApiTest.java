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


package cn.lanxin.api;

import cn.lanxin.ApiException;
import java.io.File;
import cn.lanxin.models.V1MediasCreateResponse;
import cn.lanxin.models.V1MediasPathFetchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaApi
 */
@Ignore
public class MediaApiTest {

    private final MediaApi api = new MediaApi();

    
    /**
     * 上传文件
     *
     * 文件上传，获取对应的 MEDIA ID（文件大小不能超过2M）
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MediasCreateTest() throws ApiException {
        String appToken = null;
        String type = null;
        File media = null;
        String userToken = null;
        V1MediasCreateResponse response = api.v1MediasCreate(appToken, type, media, userToken);

        // TODO: test validations
    }
    
    /**
     * 下载文件
     *
     * 根据media id 获取文件下载内容
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MediasFetchTest() throws ApiException {
        String appToken = null;
        String mediaid = null;
        String userToken = null;
        File response = api.v1MediasFetch(appToken, mediaid, userToken);

        // TODO: test validations
    }
    
    /**
     * 获取文件下载路径
     *
     * 获取文件下载路径
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MediasPathFetchTest() throws ApiException {
        String appToken = null;
        String mediaid = null;
        String userToken = null;
        V1MediasPathFetchResponse response = api.v1MediasPathFetch(appToken, mediaid, userToken);

        // TODO: test validations
    }
    
}
