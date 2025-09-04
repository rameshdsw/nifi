package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.DropRequestEntity;
import org.apache.nifi.api.toolkit.model.FlowFileEntity;
import org.apache.nifi.api.toolkit.model.ListingRequestEntity;
import org.apache.nifi.api.toolkit.model.StreamingOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class FlowFileQueuesApi {
    private ApiClient apiClient;

    public FlowFileQueuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlowFileQueuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a request to drop the contents of the queue in this connection.
     * 
     * @param id The connection id. (required)
     * @return DropRequestEntity
     * @throws ApiException if fails to make API call
     */
    public DropRequestEntity createDropRequest(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling createDropRequest");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/drop-requests"
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

        GenericType<DropRequestEntity> localVarReturnType = new GenericType<DropRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Lists the contents of the queue in this connection.
     * 
     * @param id The connection id. (required)
     * @return ListingRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ListingRequestEntity createFlowFileListing(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling createFlowFileListing");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/listing-requests"
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

        GenericType<ListingRequestEntity> localVarReturnType = new GenericType<ListingRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Cancels and/or removes a request to list the contents of this connection.
     * 
     * @param id The connection id. (required)
     * @param listingRequestId The listing request id. (required)
     * @return ListingRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ListingRequestEntity deleteListingRequest(String id, String listingRequestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteListingRequest");
        }
        // verify the required parameter 'listingRequestId' is set
        if (listingRequestId == null) {
            throw new ApiException(400, "Missing the required parameter 'listingRequestId' when calling deleteListingRequest");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/listing-requests/{listing-request-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "listing-request-id" + "\\}", apiClient.escapeString(listingRequestId.toString()));

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

        GenericType<ListingRequestEntity> localVarReturnType = new GenericType<ListingRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the content for a FlowFile in a Connection.
     * 
     * @param id The connection id. (required)
     * @param flowfileUuid The flowfile uuid. (required)
     * @param range Range of bytes requested (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return StreamingOutput
     * @throws ApiException if fails to make API call
     */
    public StreamingOutput downloadFlowFileContent(String id, String flowfileUuid, String range, ClientIdParameter clientId, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling downloadFlowFileContent");
        }
        // verify the required parameter 'flowfileUuid' is set
        if (flowfileUuid == null) {
            throw new ApiException(400, "Missing the required parameter 'flowfileUuid' when calling downloadFlowFileContent");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "flowfile-uuid" + "\\}", apiClient.escapeString(flowfileUuid.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));

        if (range != null) {
            localVarHeaderParams.put("Range", apiClient.parameterToString(range));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<StreamingOutput> localVarReturnType = new GenericType<StreamingOutput>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the current status of a drop request for the specified connection.
     * 
     * @param id The connection id. (required)
     * @param dropRequestId The drop request id. (required)
     * @return DropRequestEntity
     * @throws ApiException if fails to make API call
     */
    public DropRequestEntity getDropRequest(String id, String dropRequestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getDropRequest");
        }
        // verify the required parameter 'dropRequestId' is set
        if (dropRequestId == null) {
            throw new ApiException(400, "Missing the required parameter 'dropRequestId' when calling getDropRequest");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/drop-requests/{drop-request-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "drop-request-id" + "\\}", apiClient.escapeString(dropRequestId.toString()));

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

        GenericType<DropRequestEntity> localVarReturnType = new GenericType<DropRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a FlowFile from a Connection.
     * 
     * @param id The connection id. (required)
     * @param flowfileUuid The flowfile uuid. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return FlowFileEntity
     * @throws ApiException if fails to make API call
     */
    public FlowFileEntity getFlowFile(String id, String flowfileUuid, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowFile");
        }
        // verify the required parameter 'flowfileUuid' is set
        if (flowfileUuid == null) {
            throw new ApiException(400, "Missing the required parameter 'flowfileUuid' when calling getFlowFile");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/flowfiles/{flowfile-uuid}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "flowfile-uuid" + "\\}", apiClient.escapeString(flowfileUuid.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<FlowFileEntity> localVarReturnType = new GenericType<FlowFileEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the current status of a listing request for the specified connection.
     * 
     * @param id The connection id. (required)
     * @param listingRequestId The listing request id. (required)
     * @return ListingRequestEntity
     * @throws ApiException if fails to make API call
     */
    public ListingRequestEntity getListingRequest(String id, String listingRequestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getListingRequest");
        }
        // verify the required parameter 'listingRequestId' is set
        if (listingRequestId == null) {
            throw new ApiException(400, "Missing the required parameter 'listingRequestId' when calling getListingRequest");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/listing-requests/{listing-request-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "listing-request-id" + "\\}", apiClient.escapeString(listingRequestId.toString()));

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

        GenericType<ListingRequestEntity> localVarReturnType = new GenericType<ListingRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Cancels and/or removes a request to drop the contents of this connection.
     * 
     * @param id The connection id. (required)
     * @param dropRequestId The drop request id. (required)
     * @return DropRequestEntity
     * @throws ApiException if fails to make API call
     */
    public DropRequestEntity removeDropRequest(String id, String dropRequestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling removeDropRequest");
        }
        // verify the required parameter 'dropRequestId' is set
        if (dropRequestId == null) {
            throw new ApiException(400, "Missing the required parameter 'dropRequestId' when calling removeDropRequest");
        }
        // create path and map variables
        String localVarPath = "/flowfile-queues/{id}/drop-requests/{drop-request-id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
                .replaceAll("\\{" + "drop-request-id" + "\\}", apiClient.escapeString(dropRequestId.toString()));

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

        GenericType<DropRequestEntity> localVarReturnType = new GenericType<DropRequestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
