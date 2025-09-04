package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.ComponentStateEntity;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.RemotePortRunStatusEntity;
import org.apache.nifi.api.toolkit.model.RemoteProcessGroupEntity;
import org.apache.nifi.api.toolkit.model.RemoteProcessGroupPortEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class RemoteProcessGroupsApi {
    private ApiClient apiClient;

    public RemoteProcessGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RemoteProcessGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Gets a remote process group
     * 
     * @param id The remote process group id. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupEntity getRemoteProcessGroup(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteProcessGroup");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}"
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

        GenericType<RemoteProcessGroupEntity> localVarReturnType = new GenericType<RemoteProcessGroupEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the state for a RemoteProcessGroup
     * 
     * @param id The processor id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity getState3(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getState3");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/state"
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
     * Deletes a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return RemoteProcessGroupEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupEntity removeRemoteProcessGroup(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling removeRemoteProcessGroup");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}"
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

        GenericType<RemoteProcessGroupEntity> localVarReturnType = new GenericType<RemoteProcessGroupEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a remote process group
     * 
     * @param body The remote process group. (required)
     * @param id The remote process group id. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupEntity updateRemoteProcessGroup(RemoteProcessGroupEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroup");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroup");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}"
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

        GenericType<RemoteProcessGroupEntity> localVarReturnType = new GenericType<RemoteProcessGroupEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The remote process group port. (required)
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPort(RemoteProcessGroupPortEntity body, String id, String portId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupInputPort");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupInputPort");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling updateRemoteProcessGroupInputPort");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/input-ports/{port-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

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

        GenericType<RemoteProcessGroupPortEntity> localVarReturnType = new GenericType<RemoteProcessGroupPortEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of a remote port
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The remote process group port. (required)
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPortRunStatus(RemotePortRunStatusEntity body, String id, String portId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupInputPortRunStatus");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupInputPortRunStatus");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling updateRemoteProcessGroupInputPortRunStatus");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/input-ports/{port-id}/run-status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

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

        GenericType<RemoteProcessGroupPortEntity> localVarReturnType = new GenericType<RemoteProcessGroupPortEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a remote port
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The remote process group port. (required)
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPort(RemoteProcessGroupPortEntity body, String id, String portId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupOutputPort");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupOutputPort");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling updateRemoteProcessGroupOutputPort");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/output-ports/{port-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

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

        GenericType<RemoteProcessGroupPortEntity> localVarReturnType = new GenericType<RemoteProcessGroupPortEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of a remote port
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param body The remote process group port. (required)
     * @param id The remote process group id. (required)
     * @param portId The remote process group port id. (required)
     * @return RemoteProcessGroupPortEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPortRunStatus(RemotePortRunStatusEntity body, String id, String portId) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupOutputPortRunStatus");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupOutputPortRunStatus");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling updateRemoteProcessGroupOutputPortRunStatus");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/output-ports/{port-id}/run-status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "port-id" + "\\}", apiClient.escapeString(portId.toString()));

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

        GenericType<RemoteProcessGroupPortEntity> localVarReturnType = new GenericType<RemoteProcessGroupPortEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of a remote process group
     * 
     * @param body The remote process group run status. (required)
     * @param id The remote process group id. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupEntity updateRemoteProcessGroupRunStatus(RemotePortRunStatusEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupRunStatus");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupRunStatus");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/{id}/run-status"
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

        GenericType<RemoteProcessGroupEntity> localVarReturnType = new GenericType<RemoteProcessGroupEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of all remote process groups in a process group (recursively)
     * 
     * @param body The remote process groups run status. (required)
     * @param id The process group id. (required)
     * @return RemoteProcessGroupEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupEntity updateRemoteProcessGroupRunStatuses(RemotePortRunStatusEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRemoteProcessGroupRunStatuses");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRemoteProcessGroupRunStatuses");
        }
        // create path and map variables
        String localVarPath = "/remote-process-groups/process-group/{id}/run-status"
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

        GenericType<RemoteProcessGroupEntity> localVarReturnType = new GenericType<RemoteProcessGroupEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
