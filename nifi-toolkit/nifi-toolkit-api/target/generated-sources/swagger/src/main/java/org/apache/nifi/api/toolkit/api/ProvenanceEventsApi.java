package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.LatestProvenanceEventsEntity;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.ProvenanceEventEntity;
import org.apache.nifi.api.toolkit.model.ReplayLastEventRequestEntity;
import org.apache.nifi.api.toolkit.model.ReplayLastEventResponseEntity;
import org.apache.nifi.api.toolkit.model.StreamingOutput;
import org.apache.nifi.api.toolkit.model.SubmitReplayRequestEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ProvenanceEventsApi {
    private ApiClient apiClient;

    public ProvenanceEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvenanceEventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param range Range of bytes requested (optional)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return StreamingOutput
     * @throws ApiException if fails to make API call
     */
    public StreamingOutput getInputContent(LongParameter id, String range, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getInputContent");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/input"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
     * Retrieves the latest cached Provenance Events for the specified component
     * 
     * @param componentId The ID of the component to retrieve the latest Provenance Events for. (required)
     * @param limit The number of events to limit the response to. Defaults to 10. (optional, default to 10)
     * @return LatestProvenanceEventsEntity
     * @throws ApiException if fails to make API call
     */
    public LatestProvenanceEventsEntity getLatestProvenanceEvents(String componentId, Integer limit) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new ApiException(400, "Missing the required parameter 'componentId' when calling getLatestProvenanceEvents");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/latest/{componentId}"
                .replaceAll("\\{" + "componentId" + "\\}", apiClient.escapeString(componentId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<LatestProvenanceEventsEntity> localVarReturnType = new GenericType<LatestProvenanceEventsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param range Range of bytes requested (optional)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return StreamingOutput
     * @throws ApiException if fails to make API call
     */
    public StreamingOutput getOutputContent(LongParameter id, String range, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getOutputContent");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/output"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ProvenanceEventEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceEventEntity getProvenanceEvent(LongParameter id, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProvenanceEvent");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

        GenericType<ProvenanceEventEntity> localVarReturnType = new GenericType<ProvenanceEventEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ProvenanceEventEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceEventEntity submitReplay(SubmitReplayRequestEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitReplay");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/replays";

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

        GenericType<ProvenanceEventEntity> localVarReturnType = new GenericType<ProvenanceEventEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ReplayLastEventResponseEntity
     * @throws ApiException if fails to make API call
     */
    public ReplayLastEventResponseEntity submitReplayLatestEvent(ReplayLastEventRequestEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitReplayLatestEvent");
        }
        // create path and map variables
        String localVarPath = "/provenance-events/latest/replays";

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

        GenericType<ReplayLastEventResponseEntity> localVarReturnType = new GenericType<ReplayLastEventResponseEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
