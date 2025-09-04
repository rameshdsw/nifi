package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.ComponentStateEntity;
import org.apache.nifi.api.toolkit.model.ConfigurationAnalysisEntity;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.ParameterProviderApplyParametersRequestEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderParameterApplicationEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderParameterFetchEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderReferencingComponentsEntity;
import org.apache.nifi.api.toolkit.model.PropertyDescriptorEntity;
import org.apache.nifi.api.toolkit.model.VerifyConfigRequestEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ParameterProvidersApi {
    private ApiClient apiClient;

    public ParameterProvidersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ParameterProvidersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
     * 
     * @param body The configuration analysis request. (required)
     * @param id The parameter provider id. (required)
     * @return ConfigurationAnalysisEntity
     * @throws ApiException if fails to make API call
     */
    public ConfigurationAnalysisEntity analyzeConfiguration1(ConfigurationAnalysisEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling analyzeConfiguration1");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling analyzeConfiguration1");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/config/analysis"
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

        GenericType<ConfigurationAnalysisEntity> localVarReturnType = new GenericType<ConfigurationAnalysisEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Clears the state for a parameter provider
     * 
     * @param id The parameter provider id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity clearState2(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling clearState2");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/state/clear-requests"
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

        GenericType<ComponentStateEntity> localVarReturnType = new GenericType<ComponentStateEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Apply Parameters Request with the given ID
     * Deletes the Apply Parameters Request with the given ID. After a request is created via a POST to /nifi-api/parameter-providers/apply-parameters-requests, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Apply process has completed. If the request is deleted before the request completes, then the Apply Parameters Request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param providerId The ID of the Parameter Provider (required)
     * @param requestId The ID of the Apply Parameters Request (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ParameterProviderApplyParametersRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderApplyParametersRequestEntity deleteApplyParametersRequest(String providerId, String requestId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException(400, "Missing the required parameter 'providerId' when calling deleteApplyParametersRequest");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling deleteApplyParametersRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{providerId}/apply-parameters-requests/{requestId}"
                .replaceAll("\\{" + "providerId" + "\\}", apiClient.escapeString(providerId.toString()))
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

        GenericType<ParameterProviderApplyParametersRequestEntity> localVarReturnType = new GenericType<ParameterProviderApplyParametersRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Verification Request with the given ID
     * Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param id The ID of the Parameter Provider (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity deleteVerificationRequest1(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVerificationRequest1");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling deleteVerificationRequest1");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/config/verification-requests/{requestId}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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

        GenericType<VerifyConfigRequestEntity> localVarReturnType = new GenericType<VerifyConfigRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Fetches and temporarily caches the parameters for a provider
     * 
     * @param body The parameter fetch request. (required)
     * @param id The parameter provider id. (required)
     * @return ParameterProviderEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderEntity fetchParameters(ParameterProviderParameterFetchEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling fetchParameters");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling fetchParameters");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/parameters/fetch-requests"
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

        GenericType<ParameterProviderEntity> localVarReturnType = new GenericType<ParameterProviderEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a parameter provider
     * 
     * @param id The parameter provider id. (required)
     * @return ParameterProviderEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderEntity getParameterProvider(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getParameterProvider");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}"
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

        GenericType<ParameterProviderEntity> localVarReturnType = new GenericType<ParameterProviderEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Apply Parameters Request with the given ID
     * Returns the Apply Parameters Request with the given ID. Once an Apply Parameters Request has been created by performing a POST to /nifi-api/parameter-providers, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the state, such as percent complete, the current state of the request, and any failures. 
     * @param providerId The ID of the Parameter Provider (required)
     * @param requestId The ID of the Apply Parameters Request (required)
     * @return ParameterProviderApplyParametersRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderApplyParametersRequestEntity getParameterProviderApplyParametersRequest(String providerId, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException(400, "Missing the required parameter 'providerId' when calling getParameterProviderApplyParametersRequest");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling getParameterProviderApplyParametersRequest");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{providerId}/apply-parameters-requests/{requestId}"
                .replaceAll("\\{" + "providerId" + "\\}", apiClient.escapeString(providerId.toString()))
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

        GenericType<ParameterProviderApplyParametersRequestEntity> localVarReturnType = new GenericType<ParameterProviderApplyParametersRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all references to a parameter provider
     * 
     * @param id The parameter provider id. (required)
     * @return ParameterProviderReferencingComponentsEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderReferencingComponentsEntity getParameterProviderReferences(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getParameterProviderReferences");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/references"
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

        GenericType<ParameterProviderReferencingComponentsEntity> localVarReturnType = new GenericType<ParameterProviderReferencingComponentsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a parameter provider property descriptor
     * 
     * @param id The parameter provider id. (required)
     * @param propertyName The property name. (required)
     * @return PropertyDescriptorEntity
     * @throws ApiException if fails to make API call
     */
    public PropertyDescriptorEntity getPropertyDescriptor2(String id, String propertyName) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getPropertyDescriptor2");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException(400, "Missing the required parameter 'propertyName' when calling getPropertyDescriptor2");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/descriptors"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "propertyName", propertyName));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<PropertyDescriptorEntity> localVarReturnType = new GenericType<PropertyDescriptorEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the state for a parameter provider
     * 
     * @param id The parameter provider id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity getState1(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getState1");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/state"
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

        GenericType<ComponentStateEntity> localVarReturnType = new GenericType<ComponentStateEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Verification Request with the given ID
     * Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 
     * @param id The ID of the Parameter Provider (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity getVerificationRequest1(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getVerificationRequest1");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling getVerificationRequest1");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/config/verification-requests/{requestId}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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

        GenericType<VerifyConfigRequestEntity> localVarReturnType = new GenericType<VerifyConfigRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes a parameter provider
     * 
     * @param id The parameter provider id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ParameterProviderEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderEntity removeParameterProvider(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling removeParameterProvider");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}"
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

        GenericType<ParameterProviderEntity> localVarReturnType = new GenericType<ParameterProviderEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Initiate a request to apply the fetched parameters of a Parameter Provider
     * This will initiate the process of applying fetched parameters to all referencing Parameter Contexts. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterProviderApplyParametersRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/apply-parameters-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/apply-parameters-requests/{requestId}.
     * @param body The apply parameters request. (required)
     * @param providerId  (required)
     * @return ParameterProviderApplyParametersRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderApplyParametersRequestEntity submitApplyParameters(ParameterProviderParameterApplicationEntity body, String providerId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitApplyParameters");
        }
        // verify the required parameter 'providerId' is set
        if (providerId == null) {
            throw new ApiException(400, "Missing the required parameter 'providerId' when calling submitApplyParameters");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{providerId}/apply-parameters-requests"
                .replaceAll("\\{" + "providerId" + "\\}", apiClient.escapeString(providerId.toString()));

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

        GenericType<ParameterProviderApplyParametersRequestEntity> localVarReturnType = new GenericType<ParameterProviderApplyParametersRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Performs verification of the Parameter Provider&#x27;s configuration
     * This will initiate the process of verifying a given Parameter Provider configuration. This may be a long-running task. As a result, this endpoint will immediately return a ParameterProviderConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/{providerId}/verification-requests/{requestId}.
     * @param body The parameter provider configuration verification request. (required)
     * @param id The parameter provider id. (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity submitConfigVerificationRequest1(VerifyConfigRequestEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitConfigVerificationRequest1");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling submitConfigVerificationRequest1");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}/config/verification-requests"
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

        GenericType<VerifyConfigRequestEntity> localVarReturnType = new GenericType<VerifyConfigRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a parameter provider
     * 
     * @param body The parameter provider configuration details. (required)
     * @param id The parameter provider id. (required)
     * @return ParameterProviderEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderEntity updateParameterProvider(ParameterProviderEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateParameterProvider");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateParameterProvider");
        }
        // create path and map variables
        String localVarPath = "/parameter-providers/{id}"
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

        GenericType<ParameterProviderEntity> localVarReturnType = new GenericType<ParameterProviderEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
