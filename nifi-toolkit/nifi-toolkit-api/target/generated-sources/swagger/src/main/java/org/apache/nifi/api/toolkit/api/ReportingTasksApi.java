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
import org.apache.nifi.api.toolkit.model.PropertyDescriptorEntity;
import org.apache.nifi.api.toolkit.model.ReportingTaskEntity;
import org.apache.nifi.api.toolkit.model.ReportingTaskRunStatusEntity;
import org.apache.nifi.api.toolkit.model.VerifyConfigRequestEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ReportingTasksApi {
    private ApiClient apiClient;

    public ReportingTasksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingTasksApi(ApiClient apiClient) {
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
     * @param id The reporting task id. (required)
     * @return ConfigurationAnalysisEntity
     * @throws ApiException if fails to make API call
     */
    public ConfigurationAnalysisEntity analyzeConfiguration3(ConfigurationAnalysisEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling analyzeConfiguration3");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling analyzeConfiguration3");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/config/analysis"
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
     * Clears the state for a reporting task
     * 
     * @param id The reporting task id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity clearState4(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling clearState4");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/state/clear-requests"
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
     * Deletes the Verification Request with the given ID
     * Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param id The ID of the Reporting Task (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity deleteVerificationRequest3(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVerificationRequest3");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling deleteVerificationRequest3");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/config/verification-requests/{requestId}"
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
     * Gets a reporting task property descriptor
     * 
     * @param id The reporting task id. (required)
     * @param propertyName The property name. (required)
     * @param sensitive Property Descriptor requested sensitive status (optional)
     * @return PropertyDescriptorEntity
     * @throws ApiException if fails to make API call
     */
    public PropertyDescriptorEntity getPropertyDescriptor4(String id, String propertyName, Boolean sensitive) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getPropertyDescriptor4");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException(400, "Missing the required parameter 'propertyName' when calling getPropertyDescriptor4");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/descriptors"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "propertyName", propertyName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sensitive", sensitive));


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
     * Gets a reporting task
     * 
     * @param id The reporting task id. (required)
     * @return ReportingTaskEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskEntity getReportingTask(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getReportingTask");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}"
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

        GenericType<ReportingTaskEntity> localVarReturnType = new GenericType<ReportingTaskEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the state for a reporting task
     * 
     * @param id The reporting task id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity getState4(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getState4");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/state"
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
     * @param id The ID of the Reporting Task (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity getVerificationRequest3(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getVerificationRequest3");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling getVerificationRequest3");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/config/verification-requests/{requestId}"
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
     * Deletes a reporting task
     * 
     * @param id The reporting task id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return ReportingTaskEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskEntity removeReportingTask(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling removeReportingTask");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}"
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

        GenericType<ReportingTaskEntity> localVarReturnType = new GenericType<ReportingTaskEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Performs verification of the Reporting Task&#x27;s configuration
     * This will initiate the process of verifying a given Reporting Task configuration. This may be a long-running task. As a result, this endpoint will immediately return a ReportingTaskConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /reporting-tasks/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /reporting-tasks/{serviceId}/verification-requests/{requestId}.
     * @param body The reporting task configuration verification request. (required)
     * @param id The reporting task id. (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity submitConfigVerificationRequest2(VerifyConfigRequestEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitConfigVerificationRequest2");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling submitConfigVerificationRequest2");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/config/verification-requests"
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
     * Updates a reporting task
     * 
     * @param body The reporting task configuration details. (required)
     * @param id The reporting task id. (required)
     * @return ReportingTaskEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskEntity updateReportingTask(ReportingTaskEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateReportingTask");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateReportingTask");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}"
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

        GenericType<ReportingTaskEntity> localVarReturnType = new GenericType<ReportingTaskEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of a reporting task
     * 
     * @param body The reporting task run status. (required)
     * @param id The reporting task id. (required)
     * @return ReportingTaskEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskEntity updateRunStatus5(ReportingTaskRunStatusEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRunStatus5");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRunStatus5");
        }
        // create path and map variables
        String localVarPath = "/reporting-tasks/{id}/run-status"
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

        GenericType<ReportingTaskEntity> localVarReturnType = new GenericType<ReportingTaskEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
