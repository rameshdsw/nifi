package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.AssetEntity;
import org.apache.nifi.api.toolkit.model.AssetsEntity;
import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.ParameterContextEntity;
import org.apache.nifi.api.toolkit.model.ParameterContextUpdateRequestEntity;
import org.apache.nifi.api.toolkit.model.ParameterContextValidationRequestEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ParameterContextsApi {
    private ApiClient apiClient;

    public ParameterContextsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ParameterContextsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new Asset in the given Parameter Context
     * This endpoint will create a new Asset in the given Parameter Context. The Asset will be created with the given name and the contents of the file that is uploaded. The Asset will be created in the given Parameter Context, and will be available for use by any component that references the Parameter Context.
     * @param body The contents of the asset. (required)
     * @param contextId  (required)
     * @param filename  (optional)
     * @return AssetEntity
     * @throws ApiException if fails to make API call
     */
    public AssetEntity createAsset(Object body, String contextId, String filename) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createAsset");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling createAsset");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/assets"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();


        if (filename != null) {
            localVarHeaderParams.put("Filename", apiClient.parameterToString(filename));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/octet-stream"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<AssetEntity> localVarReturnType = new GenericType<AssetEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a Parameter Context
     * 
     * @param body The Parameter Context. (required)
     * @return ParameterContextEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextEntity createParameterContext(ParameterContextEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createParameterContext");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextEntity> localVarReturnType = new GenericType<ParameterContextEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes an Asset from the given Parameter Context
     * This endpoint will create a new Asset in the given Parameter Context. The Asset will be created with the given name and the contents of the file that is uploaded. The Asset will be created in the given Parameter Context, and will be available for use by any component that references the Parameter Context.
     * @param contextId The ID of the Parameter Context (required)
     * @param assetId The ID of the Asset (required)
     * @param disconnectedNodeAcknowledged  (optional, default to false)
     * @return AssetEntity
     * @throws ApiException if fails to make API call
     */
    public AssetEntity deleteAsset(String contextId, String assetId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteAsset");
        }
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException(400, "Missing the required parameter 'assetId' when calling deleteAsset");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/assets/{assetId}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "assetId" + "\\}", apiClient.escapeString(assetId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<AssetEntity> localVarReturnType = new GenericType<AssetEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Parameter Context with the given ID
     * Deletes the Parameter Context with the given ID.
     * @param id The Parameter Context ID. (required)
     * @param version The version is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ParameterContextEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextEntity deleteParameterContext(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteParameterContext");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextEntity> localVarReturnType = new GenericType<ParameterContextEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Update Request with the given ID
     * Deletes the Update Request with the given ID. After a request is created via a POST to /nifi-api/parameter-contexts/update-requests, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param contextId The ID of the ParameterContext (required)
     * @param requestId The ID of the Update Request (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ParameterContextUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextUpdateRequestEntity deleteUpdateRequest(String contextId, String requestId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteUpdateRequest");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling deleteUpdateRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/update-requests/{requestId}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextUpdateRequestEntity> localVarReturnType = new GenericType<ParameterContextUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Validation Request with the given ID
     * Deletes the Validation Request with the given ID. After a request is created via a POST to /nifi-api/validation-contexts, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the validation process has completed. If the request is deleted before the request completes, then the Validation request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param contextId The ID of the Parameter Context (required)
     * @param id The ID of the Update Request (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ParameterContextValidationRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextValidationRequestEntity deleteValidationRequest(String contextId, String id, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteValidationRequest");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteValidationRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/validation-requests/{id}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextValidationRequestEntity> localVarReturnType = new GenericType<ParameterContextValidationRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the content of the asset with the given id
     * 
     * @param contextId The ID of the Parameter Context (required)
     * @param assetId The ID of the Asset (required)
     * @return byte[]
     * @throws ApiException if fails to make API call
     */
    public byte[] getAssetContent(String contextId, String assetId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling getAssetContent");
        }
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetContent");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/assets/{assetId}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "assetId" + "\\}", apiClient.escapeString(assetId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Lists the assets that belong to the Parameter Context with the given ID
     * Lists the assets that belong to the Parameter Context with the given ID.
     * @param contextId The ID of the Parameter Context (required)
     * @return AssetsEntity
     * @throws ApiException if fails to make API call
     */
    public AssetsEntity getAssets(String contextId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling getAssets");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/assets"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<AssetsEntity> localVarReturnType = new GenericType<AssetsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Parameter Context with the given ID
     * Returns the Parameter Context with the given ID.
     * @param id The ID of the Parameter Context (required)
     * @param includeInheritedParameters Whether or not to include inherited parameters from other parameter contexts, and therefore also overridden values.  If true, the result will be the &#x27;effective&#x27; parameter context. (optional, default to false)
     * @return ParameterContextEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextEntity getParameterContext(String id, Boolean includeInheritedParameters) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getParameterContext");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeInheritedParameters", includeInheritedParameters));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextEntity> localVarReturnType = new GenericType<ParameterContextEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Update Request with the given ID
     * Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /nifi-api/parameter-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 
     * @param contextId The ID of the Parameter Context (required)
     * @param requestId The ID of the Update Request (required)
     * @return ParameterContextUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextUpdateRequestEntity getParameterContextUpdate(String contextId, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling getParameterContextUpdate");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling getParameterContextUpdate");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/update-requests/{requestId}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextUpdateRequestEntity> localVarReturnType = new GenericType<ParameterContextUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Validation Request with the given ID
     * Returns the Validation Request with the given ID. Once a Validation Request has been created by performing a POST to /nifi-api/validation-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 
     * @param contextId The ID of the Parameter Context (required)
     * @param id The ID of the Validation Request (required)
     * @return ParameterContextValidationRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextValidationRequestEntity getValidationRequest(String contextId, String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling getValidationRequest");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getValidationRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/validation-requests/{id}"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()))
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextValidationRequestEntity> localVarReturnType = new GenericType<ParameterContextValidationRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Initiate the Update Request of a Parameter Context
     * This will initiate the process of updating a Parameter Context. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextUpdateRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/update-requests/{requestId}.
     * @param body The updated version of the parameter context. (required)
     * @param contextId  (required)
     * @return ParameterContextUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextUpdateRequestEntity submitParameterContextUpdate(ParameterContextEntity body, String contextId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitParameterContextUpdate");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling submitParameterContextUpdate");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/update-requests"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextUpdateRequestEntity> localVarReturnType = new GenericType<ParameterContextUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
     * This will initiate the process of validating all components whose Process Group is bound to the specified Parameter Context. Performing validation against an arbitrary number of components may be expect and take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextValidationRequestEntity, and the process of validating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/validation-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/validation-requests/{requestId}.
     * @param body The validation request (required)
     * @param contextId  (required)
     * @return ParameterContextValidationRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextValidationRequestEntity submitValidationRequest(ParameterContextValidationRequestEntity body, String contextId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitValidationRequest");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new ApiException(400, "Missing the required parameter 'contextId' when calling submitValidationRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{contextId}/validation-requests"
                .replaceAll("\\{" + "contextId" + "\\}", apiClient.escapeString(contextId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextValidationRequestEntity> localVarReturnType = new GenericType<ParameterContextValidationRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Modifies a Parameter Context
     * This endpoint will update a Parameter Context to match the provided entity. However, this request will fail if any component is running and is referencing a Parameter in the Parameter Context. Generally, this endpoint is not called directly. Instead, an update request should be submitted by making a POST to the /parameter-contexts/update-requests endpoint. That endpoint will, in turn, call this endpoint.
     * @param body The updated Parameter Context (required)
     * @param id  (required)
     * @return ParameterContextEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextEntity updateParameterContext(ParameterContextEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateParameterContext");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateParameterContext");
        }
        // create path and map variables
        String localVarPath = "/parameter-contexts/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterContextEntity> localVarReturnType = new GenericType<ParameterContextEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
