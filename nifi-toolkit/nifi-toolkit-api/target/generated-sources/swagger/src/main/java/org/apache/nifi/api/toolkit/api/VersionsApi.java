package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.CreateActiveRequestEntity;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.StartVersionControlRequestEntity;
import org.apache.nifi.api.toolkit.model.VersionControlComponentMappingEntity;
import org.apache.nifi.api.toolkit.model.VersionControlInformationEntity;
import org.apache.nifi.api.toolkit.model.VersionedFlowSnapshotEntity;
import org.apache.nifi.api.toolkit.model.VersionedFlowUpdateRequestEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class VersionsApi {
    private ApiClient apiClient;

    public VersionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VersionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a version control request
     * Creates a request so that a Process Group can be placed under Version Control or have its Version Control configuration changed. Creating this request will prevent any other threads from simultaneously saving local changes to Version Control. It will not, however, actually save the local flow to the Flow Registry. A POST to /versions/process-groups/{id} should be used to initiate saving of the local flow to the Flow Registry. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The versioned flow details. (required)
     * @return String
     * @throws ApiException if fails to make API call
     */
    public String createVersionControlRequest(CreateActiveRequestEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createVersionControlRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/active-requests";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<String> localVarReturnType = new GenericType<String>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Revert Request with the given ID
     * Deletes the Revert Request with the given ID. After a request is created via a POST to /versions/revert-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Revert process has completed. If the request is deleted before the request completes, then the Revert request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The ID of the Revert Request (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity deleteRevertRequest(String id, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRevertRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/revert-requests/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Update Request with the given ID
     * Deletes the Update Request with the given ID. After a request is created via a POST to /versions/update-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The ID of the Update Request (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity deleteUpdateRequest1(String id, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUpdateRequest1");
        }
        // create path and map variables
        String localVarPath = "/versions/update-requests/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the version control request with the given ID
     * Deletes the Version Control Request with the given ID. This will allow other threads to save flows to the Flow Registry. See also the documentation for POSTing to /versions/active-requests for information regarding why this is done. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The request ID. (required)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @throws ApiException if fails to make API call
     */
    public void deleteVersionControlRequest(String id, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVersionControlRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/active-requests/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));


        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }
    /**
     * Gets the latest version of a Process Group for download
     * 
     * @param id The process group id. (required)
     * @return String
     * @throws ApiException if fails to make API call
     */
    public String exportFlowVersion(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling exportFlowVersion");
        }
        // create path and map variables
        String localVarPath = "/versions/process-groups/{id}/download"
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

        GenericType<String> localVarReturnType = new GenericType<String>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Revert Request with the given ID
     * Returns the Revert Request with the given ID. Once a Revert Request has been created by performing a POST to /versions/revert-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The ID of the Revert Request (required)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity getRevertRequest(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getRevertRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/revert-requests/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns the Update Request with the given ID
     * Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /versions/update-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The ID of the Update Request (required)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity getUpdateRequest(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getUpdateRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/update-requests/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the Version Control information for a process group
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The process group id. (required)
     * @return VersionControlInformationEntity
     * @throws ApiException if fails to make API call
     */
    public VersionControlInformationEntity getVersionInformation(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getVersionInformation");
        }
        // create path and map variables
        String localVarPath = "/versions/process-groups/{id}"
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

        GenericType<VersionControlInformationEntity> localVarReturnType = new GenericType<VersionControlInformationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Initiate the Revert Request of a Process Group with the given ID
     * For a Process Group that is already under Version Control, this will initiate the action of reverting any local changes that have been made to the Process Group since it was last synchronized with the Flow Registry. This will result in the flow matching the Versioned Flow that exists in the Flow Registry. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/revert-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/revert-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The Version Control Information to revert to. (required)
     * @param id The process group id. (required)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity initiateRevertFlowVersion(VersionControlInformationEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling initiateRevertFlowVersion");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling initiateRevertFlowVersion");
        }
        // create path and map variables
        String localVarPath = "/versions/revert-requests/process-groups/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Initiate the Update Request of a Process Group with the given ID
     * For a Process Group that is already under Version Control, this will initiate the action of changing from a specific version of the flow in the Flow Registry to a different version of the flow. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/update-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The controller service configuration details. (required)
     * @param id The process group id. (required)
     * @return VersionedFlowUpdateRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowUpdateRequestEntity initiateVersionControlUpdate(VersionControlInformationEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling initiateVersionControlUpdate");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling initiateVersionControlUpdate");
        }
        // create path and map variables
        String localVarPath = "/versions/update-requests/process-groups/{id}"
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

        GenericType<VersionedFlowUpdateRequestEntity> localVarReturnType = new GenericType<VersionedFlowUpdateRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Save the Process Group with the given ID
     * Begins version controlling the Process Group with the given ID or commits changes to the Versioned Flow, depending on if the provided VersionControlInformation includes a flowId. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The versioned flow details. (required)
     * @param id The process group id. (required)
     * @return VersionControlInformationEntity
     * @throws ApiException if fails to make API call
     */
    public VersionControlInformationEntity saveToFlowRegistry(StartVersionControlRequestEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling saveToFlowRegistry");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling saveToFlowRegistry");
        }
        // create path and map variables
        String localVarPath = "/versions/process-groups/{id}"
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

        GenericType<VersionControlInformationEntity> localVarReturnType = new GenericType<VersionControlInformationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Stops version controlling the Process Group with the given ID
     * Stops version controlling the Process Group with the given ID. The Process Group will no longer track to any Versioned Flow. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The process group id. (required)
     * @param version The version is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return VersionControlInformationEntity
     * @throws ApiException if fails to make API call
     */
    public VersionControlInformationEntity stopVersionControl(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling stopVersionControl");
        }
        // create path and map variables
        String localVarPath = "/versions/process-groups/{id}"
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

        GenericType<VersionControlInformationEntity> localVarReturnType = new GenericType<VersionControlInformationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update the version of a Process Group with the given ID
     * For a Process Group that is already under Version Control, this will update the version of the flow to a different version. This endpoint expects that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The controller service configuration details. (required)
     * @param id The process group id. (required)
     * @return VersionControlInformationEntity
     * @throws ApiException if fails to make API call
     */
    public VersionControlInformationEntity updateFlowVersion(VersionedFlowSnapshotEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateFlowVersion");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateFlowVersion");
        }
        // create path and map variables
        String localVarPath = "/versions/process-groups/{id}"
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

        GenericType<VersionControlInformationEntity> localVarReturnType = new GenericType<VersionControlInformationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates the request with the given ID
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The version control component mapping. (required)
     * @param id The request ID. (required)
     * @return VersionControlInformationEntity
     * @throws ApiException if fails to make API call
     */
    public VersionControlInformationEntity updateVersionControlRequest(VersionControlComponentMappingEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateVersionControlRequest");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateVersionControlRequest");
        }
        // create path and map variables
        String localVarPath = "/versions/active-requests/{id}"
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

        GenericType<VersionControlInformationEntity> localVarReturnType = new GenericType<VersionControlInformationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
