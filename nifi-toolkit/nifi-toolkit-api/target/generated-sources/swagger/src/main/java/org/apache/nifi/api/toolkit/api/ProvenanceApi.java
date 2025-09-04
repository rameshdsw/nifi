package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.LineageEntity;
import org.apache.nifi.api.toolkit.model.ProvenanceEntity;
import org.apache.nifi.api.toolkit.model.ProvenanceOptionsEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ProvenanceApi {
    private ApiClient apiClient;

    public ProvenanceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvenanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a lineage query
     * 
     * @param id The id of the lineage query. (required)
     * @param clusterNodeId The id of the node where this query exists if clustered. (optional)
     * @return LineageEntity
     * @throws ApiException if fails to make API call
     */
    public LineageEntity deleteLineage(String id, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLineage");
        }
        // create path and map variables
        String localVarPath = "/provenance/lineage/{id}"
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

        GenericType<LineageEntity> localVarReturnType = new GenericType<LineageEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes a provenance query
     * 
     * @param id The id of the provenance query. (required)
     * @param clusterNodeId The id of the node where this query exists if clustered. (optional)
     * @return ProvenanceEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceEntity deleteProvenance(String id, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProvenance");
        }
        // create path and map variables
        String localVarPath = "/provenance/{id}"
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

        GenericType<ProvenanceEntity> localVarReturnType = new GenericType<ProvenanceEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a lineage query
     * 
     * @param id The id of the lineage query. (required)
     * @param clusterNodeId The id of the node where this query exists if clustered. (optional)
     * @return LineageEntity
     * @throws ApiException if fails to make API call
     */
    public LineageEntity getLineage(String id, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getLineage");
        }
        // create path and map variables
        String localVarPath = "/provenance/lineage/{id}"
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

        GenericType<LineageEntity> localVarReturnType = new GenericType<LineageEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a provenance query
     * 
     * @param id The id of the provenance query. (required)
     * @param clusterNodeId The id of the node where this query exists if clustered. (optional)
     * @param summarize Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default. (optional, default to false)
     * @param incrementalResults Whether or not to summarize provenance events returned. This property is false by default. (optional, default to true)
     * @return ProvenanceEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceEntity getProvenance(String id, String clusterNodeId, Boolean summarize, Boolean incrementalResults) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProvenance");
        }
        // create path and map variables
        String localVarPath = "/provenance/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "summarize", summarize));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "incrementalResults", incrementalResults));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ProvenanceEntity> localVarReturnType = new GenericType<ProvenanceEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the searchable attributes for provenance events
     * 
     * @return ProvenanceOptionsEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceOptionsEntity getSearchOptions() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/provenance/search-options";

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

        GenericType<ProvenanceOptionsEntity> localVarReturnType = new GenericType<ProvenanceOptionsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Submits a lineage query
     * Lineage queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the lineage request should be deleted by the client who originally submitted it.
     * @param body The lineage query details. (required)
     * @return LineageEntity
     * @throws ApiException if fails to make API call
     */
    public LineageEntity submitLineageRequest(LineageEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitLineageRequest");
        }
        // create path and map variables
        String localVarPath = "/provenance/lineage";

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

        GenericType<LineageEntity> localVarReturnType = new GenericType<LineageEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Submits a provenance query
     * Provenance queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the provenance request should be deleted by the client who originally submitted it.
     * @param body The provenance query details. (required)
     * @return ProvenanceEntity
     * @throws ApiException if fails to make API call
     */
    public ProvenanceEntity submitProvenanceRequest(ProvenanceEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitProvenanceRequest");
        }
        // create path and map variables
        String localVarPath = "/provenance";

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

        GenericType<ProvenanceEntity> localVarReturnType = new GenericType<ProvenanceEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
