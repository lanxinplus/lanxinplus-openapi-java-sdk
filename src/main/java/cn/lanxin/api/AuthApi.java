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

import cn.lanxin.ApiCallback;
import cn.lanxin.ApiClient;
import cn.lanxin.ApiException;
import cn.lanxin.ApiResponse;
import cn.lanxin.Configuration;
import cn.lanxin.Pair;
import cn.lanxin.ProgressRequestBody;
import cn.lanxin.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cn.lanxin.models.V1AppTokenCreateResponse;
import cn.lanxin.models.V1JsApiTokenCreateResponse;
import cn.lanxin.models.V1UserTokenCreateResponse;
import cn.lanxin.models.V1UsersFetchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthApi {
    private ApiClient localVarApiClient;

    public AuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1AppTokenCreate
     * @param grantType client_credential (required)
     * @param appid 应用ID (required)
     * @param secret 应用密钥 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AppTokenCreateCall(String grantType, String appid, String secret, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/apptoken/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("grant_type", grantType));
        }

        if (appid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("appid", appid));
        }

        if (secret != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("secret", secret));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1AppTokenCreateValidateBeforeCall(String grantType, String appid, String secret, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling v1AppTokenCreate(Async)");
        }
        
        // verify the required parameter 'appid' is set
        if (appid == null) {
            throw new ApiException("Missing the required parameter 'appid' when calling v1AppTokenCreate(Async)");
        }
        
        // verify the required parameter 'secret' is set
        if (secret == null) {
            throw new ApiException("Missing the required parameter 'secret' when calling v1AppTokenCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1AppTokenCreateCall(grantType, appid, secret, _callback);
        return localVarCall;

    }

    /**
     * 获取应用访问TOKEN
     * 使用AppId，AppSecret，创建应用访问APP_TOKEN
     * @param grantType client_credential (required)
     * @param appid 应用ID (required)
     * @param secret 应用密钥 (required)
     * @return V1AppTokenCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public V1AppTokenCreateResponse v1AppTokenCreate(String grantType, String appid, String secret) throws ApiException {
        ApiResponse<V1AppTokenCreateResponse> localVarResp = v1AppTokenCreateWithHttpInfo(grantType, appid, secret);
        return localVarResp.getData();
    }

    /**
     * 获取应用访问TOKEN
     * 使用AppId，AppSecret，创建应用访问APP_TOKEN
     * @param grantType client_credential (required)
     * @param appid 应用ID (required)
     * @param secret 应用密钥 (required)
     * @return ApiResponse&lt;V1AppTokenCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1AppTokenCreateResponse> v1AppTokenCreateWithHttpInfo(String grantType, String appid, String secret) throws ApiException {
        okhttp3.Call localVarCall = v1AppTokenCreateValidateBeforeCall(grantType, appid, secret, null);
        Type localVarReturnType = new TypeToken<V1AppTokenCreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取应用访问TOKEN (asynchronously)
     * 使用AppId，AppSecret，创建应用访问APP_TOKEN
     * @param grantType client_credential (required)
     * @param appid 应用ID (required)
     * @param secret 应用密钥 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1AppTokenCreateAsync(String grantType, String appid, String secret, final ApiCallback<V1AppTokenCreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1AppTokenCreateValidateBeforeCall(grantType, appid, secret, _callback);
        Type localVarReturnType = new TypeToken<V1AppTokenCreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1JsApiTokenCreate
     * @param appToken app_token (required)
     * @param userToken user_token (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1JsApiTokenCreateCall(String appToken, String userToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/jsapitoken/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_token", appToken));
        }

        if (userToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_token", userToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1JsApiTokenCreateValidateBeforeCall(String appToken, String userToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appToken' is set
        if (appToken == null) {
            throw new ApiException("Missing the required parameter 'appToken' when calling v1JsApiTokenCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1JsApiTokenCreateCall(appToken, userToken, _callback);
        return localVarCall;

    }

    /**
     * 获取jsapi访问TOKEN
     * 创建JSAPI访问JS_API_TOKEN，该JS_API_TOKEN用于生成JASPI签名参数，用于JSAPI接口的身份验证
     * @param appToken app_token (required)
     * @param userToken user_token (optional)
     * @return V1JsApiTokenCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public V1JsApiTokenCreateResponse v1JsApiTokenCreate(String appToken, String userToken) throws ApiException {
        ApiResponse<V1JsApiTokenCreateResponse> localVarResp = v1JsApiTokenCreateWithHttpInfo(appToken, userToken);
        return localVarResp.getData();
    }

    /**
     * 获取jsapi访问TOKEN
     * 创建JSAPI访问JS_API_TOKEN，该JS_API_TOKEN用于生成JASPI签名参数，用于JSAPI接口的身份验证
     * @param appToken app_token (required)
     * @param userToken user_token (optional)
     * @return ApiResponse&lt;V1JsApiTokenCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1JsApiTokenCreateResponse> v1JsApiTokenCreateWithHttpInfo(String appToken, String userToken) throws ApiException {
        okhttp3.Call localVarCall = v1JsApiTokenCreateValidateBeforeCall(appToken, userToken, null);
        Type localVarReturnType = new TypeToken<V1JsApiTokenCreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取jsapi访问TOKEN (asynchronously)
     * 创建JSAPI访问JS_API_TOKEN，该JS_API_TOKEN用于生成JASPI签名参数，用于JSAPI接口的身份验证
     * @param appToken app_token (required)
     * @param userToken user_token (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1JsApiTokenCreateAsync(String appToken, String userToken, final ApiCallback<V1JsApiTokenCreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1JsApiTokenCreateValidateBeforeCall(appToken, userToken, _callback);
        Type localVarReturnType = new TypeToken<V1JsApiTokenCreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UserTokenCreate
     * @param appToken app_token (required)
     * @param grantType 使用固定值 &#39;authorization_code&#39; (required)
     * @param code 人员免登录授权码 (required)
     * @param redirectUri redirect_uri (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserTokenCreateCall(String appToken, String grantType, String code, String redirectUri, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/usertoken/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_token", appToken));
        }

        if (grantType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("grant_type", grantType));
        }

        if (code != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("code", code));
        }

        if (redirectUri != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("redirect_uri", redirectUri));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UserTokenCreateValidateBeforeCall(String appToken, String grantType, String code, String redirectUri, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appToken' is set
        if (appToken == null) {
            throw new ApiException("Missing the required parameter 'appToken' when calling v1UserTokenCreate(Async)");
        }
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling v1UserTokenCreate(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling v1UserTokenCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1UserTokenCreateCall(appToken, grantType, code, redirectUri, _callback);
        return localVarCall;

    }

    /**
     * 获取人员访问TOKEN
     * OAuth2 授权流程，通过 OAuth2 授权码获取人员身份访问USER_TOKEN
     * @param appToken app_token (required)
     * @param grantType 使用固定值 &#39;authorization_code&#39; (required)
     * @param code 人员免登录授权码 (required)
     * @param redirectUri redirect_uri (optional)
     * @return V1UserTokenCreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public V1UserTokenCreateResponse v1UserTokenCreate(String appToken, String grantType, String code, String redirectUri) throws ApiException {
        ApiResponse<V1UserTokenCreateResponse> localVarResp = v1UserTokenCreateWithHttpInfo(appToken, grantType, code, redirectUri);
        return localVarResp.getData();
    }

    /**
     * 获取人员访问TOKEN
     * OAuth2 授权流程，通过 OAuth2 授权码获取人员身份访问USER_TOKEN
     * @param appToken app_token (required)
     * @param grantType 使用固定值 &#39;authorization_code&#39; (required)
     * @param code 人员免登录授权码 (required)
     * @param redirectUri redirect_uri (optional)
     * @return ApiResponse&lt;V1UserTokenCreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1UserTokenCreateResponse> v1UserTokenCreateWithHttpInfo(String appToken, String grantType, String code, String redirectUri) throws ApiException {
        okhttp3.Call localVarCall = v1UserTokenCreateValidateBeforeCall(appToken, grantType, code, redirectUri, null);
        Type localVarReturnType = new TypeToken<V1UserTokenCreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取人员访问TOKEN (asynchronously)
     * OAuth2 授权流程，通过 OAuth2 授权码获取人员身份访问USER_TOKEN
     * @param appToken app_token (required)
     * @param grantType 使用固定值 &#39;authorization_code&#39; (required)
     * @param code 人员免登录授权码 (required)
     * @param redirectUri redirect_uri (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UserTokenCreateAsync(String appToken, String grantType, String code, String redirectUri, final ApiCallback<V1UserTokenCreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UserTokenCreateValidateBeforeCall(appToken, grantType, code, redirectUri, _callback);
        Type localVarReturnType = new TypeToken<V1UserTokenCreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1UsersFetch
     * @param appToken app_token (required)
     * @param userToken user_token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UsersFetchCall(String appToken, String userToken, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/users/fetch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_token", appToken));
        }

        if (userToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_token", userToken));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1UsersFetchValidateBeforeCall(String appToken, String userToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appToken' is set
        if (appToken == null) {
            throw new ApiException("Missing the required parameter 'appToken' when calling v1UsersFetch(Async)");
        }
        
        // verify the required parameter 'userToken' is set
        if (userToken == null) {
            throw new ApiException("Missing the required parameter 'userToken' when calling v1UsersFetch(Async)");
        }
        

        okhttp3.Call localVarCall = v1UsersFetchCall(appToken, userToken, _callback);
        return localVarCall;

    }

    /**
     * 获取人员基本信息
     * 根据人员token 获取当前端上登录人员信息
     * @param appToken app_token (required)
     * @param userToken user_token (required)
     * @return V1UsersFetchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public V1UsersFetchResponse v1UsersFetch(String appToken, String userToken) throws ApiException {
        ApiResponse<V1UsersFetchResponse> localVarResp = v1UsersFetchWithHttpInfo(appToken, userToken);
        return localVarResp.getData();
    }

    /**
     * 获取人员基本信息
     * 根据人员token 获取当前端上登录人员信息
     * @param appToken app_token (required)
     * @param userToken user_token (required)
     * @return ApiResponse&lt;V1UsersFetchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1UsersFetchResponse> v1UsersFetchWithHttpInfo(String appToken, String userToken) throws ApiException {
        okhttp3.Call localVarCall = v1UsersFetchValidateBeforeCall(appToken, userToken, null);
        Type localVarReturnType = new TypeToken<V1UsersFetchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取人员基本信息 (asynchronously)
     * 根据人员token 获取当前端上登录人员信息
     * @param appToken app_token (required)
     * @param userToken user_token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1UsersFetchAsync(String appToken, String userToken, final ApiCallback<V1UsersFetchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1UsersFetchValidateBeforeCall(appToken, userToken, _callback);
        Type localVarReturnType = new TypeToken<V1UsersFetchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}