package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.BulletinEntity;
import org.apache.nifi.api.toolkit.model.ClientIdParameter;
import org.apache.nifi.api.toolkit.model.ClusterEntity;
import org.apache.nifi.api.toolkit.model.ComponentHistoryEntity;
import org.apache.nifi.api.toolkit.model.ComponentStateEntity;
import org.apache.nifi.api.toolkit.model.ConfigurationAnalysisEntity;
import org.apache.nifi.api.toolkit.model.ControllerConfigurationEntity;
import org.apache.nifi.api.toolkit.model.ControllerServiceEntity;
import org.apache.nifi.api.toolkit.model.DateTimeParameter;
import org.apache.nifi.api.toolkit.model.FlowAnalysisRuleEntity;
import org.apache.nifi.api.toolkit.model.FlowAnalysisRuleRunStatusEntity;
import org.apache.nifi.api.toolkit.model.FlowAnalysisRulesEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryClientEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryClientTypesEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryClientsEntity;
import org.apache.nifi.api.toolkit.model.HistoryEntity;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.NarDetailsEntity;
import org.apache.nifi.api.toolkit.model.NarSummariesEntity;
import org.apache.nifi.api.toolkit.model.NarSummaryEntity;
import org.apache.nifi.api.toolkit.model.NodeEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderEntity;
import org.apache.nifi.api.toolkit.model.PropertyDescriptorEntity;
import org.apache.nifi.api.toolkit.model.ReportingTaskEntity;
import org.apache.nifi.api.toolkit.model.VerifyConfigRequestEntity;
import org.apache.nifi.api.toolkit.model.VersionedReportingTaskImportRequestEntity;
import org.apache.nifi.api.toolkit.model.VersionedReportingTaskImportResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class ControllerApi {
    private ApiClient apiClient;

    public ControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ControllerApi(ApiClient apiClient) {
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
     * @param id The flow analysis rules id. (required)
     * @return ConfigurationAnalysisEntity
     * @throws ApiException if fails to make API call
     */
    public ConfigurationAnalysisEntity analyzeFlowAnalysisRuleConfiguration(ConfigurationAnalysisEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling analyzeFlowAnalysisRuleConfiguration");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling analyzeFlowAnalysisRuleConfiguration");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/config/analysis"
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
     * Clears the state for a flow analysis rule
     * 
     * @param id The flow analysis rule id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity clearState(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling clearState");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/state/clear-requests"
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
     * Creates a new bulletin
     * 
     * @param body The reporting task configuration details. (required)
     * @return BulletinEntity
     * @throws ApiException if fails to make API call
     */
    public BulletinEntity createBulletin(BulletinEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createBulletin");
        }
        // create path and map variables
        String localVarPath = "/controller/bulletin";

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

        GenericType<BulletinEntity> localVarReturnType = new GenericType<BulletinEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new controller service
     * 
     * @param body The controller service configuration details. (required)
     * @return ControllerServiceEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerServiceEntity createControllerService(ControllerServiceEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createControllerService");
        }
        // create path and map variables
        String localVarPath = "/controller/controller-services";

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

        GenericType<ControllerServiceEntity> localVarReturnType = new GenericType<ControllerServiceEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new flow analysis rule
     * 
     * @param body The flow analysis rule configuration details. (required)
     * @return FlowAnalysisRuleEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleEntity createFlowAnalysisRule(FlowAnalysisRuleEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createFlowAnalysisRule");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules";

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

        GenericType<FlowAnalysisRuleEntity> localVarReturnType = new GenericType<FlowAnalysisRuleEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new flow registry client
     * 
     * @param body The flow registry client configuration details. (required)
     * @return FlowRegistryClientEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientEntity createFlowRegistryClient(FlowRegistryClientEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createFlowRegistryClient");
        }
        // create path and map variables
        String localVarPath = "/controller/registry-clients";

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

        GenericType<FlowRegistryClientEntity> localVarReturnType = new GenericType<FlowRegistryClientEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new parameter provider
     * 
     * @param body The parameter provider configuration details. (required)
     * @return ParameterProviderEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderEntity createParameterProvider(ParameterProviderEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createParameterProvider");
        }
        // create path and map variables
        String localVarPath = "/controller/parameter-providers";

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
     * Creates a new reporting task
     * 
     * @param body The reporting task configuration details. (required)
     * @return ReportingTaskEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskEntity createReportingTask(ReportingTaskEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createReportingTask");
        }
        // create path and map variables
        String localVarPath = "/controller/reporting-tasks";

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
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes the Verification Request with the given ID
     * Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.
     * @param id The ID of the Flow Analysis Rule (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity deleteFlowAnalysisRuleVerificationRequest(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFlowAnalysisRuleVerificationRequest");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling deleteFlowAnalysisRuleVerificationRequest");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/config/verification-requests/{requestId}"
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
     * Deletes a flow registry client
     * 
     * @param id The flow registry client id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return FlowRegistryClientEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientEntity deleteFlowRegistryClient(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFlowRegistryClient");
        }
        // create path and map variables
        String localVarPath = "/controller/registry-clients/{id}"
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

        GenericType<FlowRegistryClientEntity> localVarReturnType = new GenericType<FlowRegistryClientEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Purges history
     * 
     * @param endDate Purge actions before this date/time. (required)
     * @return HistoryEntity
     * @throws ApiException if fails to make API call
     */
    public HistoryEntity deleteHistory(DateTimeParameter endDate) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException(400, "Missing the required parameter 'endDate' when calling deleteHistory");
        }
        // create path and map variables
        String localVarPath = "/controller/history";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<HistoryEntity> localVarReturnType = new GenericType<HistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes an installed NAR
     * 
     * @param id The id of the NAR. (required)
     * @param disconnectedNodeAcknowledged  (optional, default to false)
     * @param force  (optional, default to false)
     * @return NarSummaryEntity
     * @throws ApiException if fails to make API call
     */
    public NarSummaryEntity deleteNar(String id, Boolean disconnectedNodeAcknowledged, Boolean force) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNar");
        }
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "disconnectedNodeAcknowledged", disconnectedNodeAcknowledged));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<NarSummaryEntity> localVarReturnType = new GenericType<NarSummaryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Removes a node from the cluster
     * 
     * @param id The node id. (required)
     * @return NodeEntity
     * @throws ApiException if fails to make API call
     */
    public NodeEntity deleteNode(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNode");
        }
        // create path and map variables
        String localVarPath = "/controller/cluster/nodes/{id}"
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

        GenericType<NodeEntity> localVarReturnType = new GenericType<NodeEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the content of the NAR with the given id
     * 
     * @param id The id of the NAR. (required)
     * @return byte[]
     * @throws ApiException if fails to make API call
     */
    public byte[] downloadNar(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling downloadNar");
        }
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars/{id}/content"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
     * Gets the contents of the cluster
     * Returns the contents of the cluster including all nodes and their status.
     * @return ClusterEntity
     * @throws ApiException if fails to make API call
     */
    public ClusterEntity getCluster() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/cluster";

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

        GenericType<ClusterEntity> localVarReturnType = new GenericType<ClusterEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the configuration for this NiFi Controller
     * 
     * @return ControllerConfigurationEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerConfigurationEntity getControllerConfig() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/config";

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

        GenericType<ControllerConfigurationEntity> localVarReturnType = new GenericType<ControllerConfigurationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a flow analysis rule
     * 
     * @param id The flow analysis rule id. (required)
     * @return FlowAnalysisRuleEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleEntity getFlowAnalysisRule(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowAnalysisRule");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}"
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

        GenericType<FlowAnalysisRuleEntity> localVarReturnType = new GenericType<FlowAnalysisRuleEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a flow analysis rule property descriptor
     * 
     * @param id The flow analysis rule id. (required)
     * @param propertyName The property name. (required)
     * @param sensitive Property Descriptor requested sensitive status (optional)
     * @return PropertyDescriptorEntity
     * @throws ApiException if fails to make API call
     */
    public PropertyDescriptorEntity getFlowAnalysisRulePropertyDescriptor(String id, String propertyName, Boolean sensitive) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowAnalysisRulePropertyDescriptor");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException(400, "Missing the required parameter 'propertyName' when calling getFlowAnalysisRulePropertyDescriptor");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/descriptors"
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
     * Gets the state for a flow analysis rule
     * 
     * @param id The flow analysis rule id. (required)
     * @return ComponentStateEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentStateEntity getFlowAnalysisRuleState(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowAnalysisRuleState");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/state"
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
     * @param id The ID of the Flow Analysis Rule (required)
     * @param requestId The ID of the Verification Request (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity getFlowAnalysisRuleVerificationRequest(String id, String requestId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowAnalysisRuleVerificationRequest");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException(400, "Missing the required parameter 'requestId' when calling getFlowAnalysisRuleVerificationRequest");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/config/verification-requests/{requestId}"
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
     * Gets all flow analysis rules
     * 
     * @return FlowAnalysisRulesEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRulesEntity getFlowAnalysisRules() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules";

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

        GenericType<FlowAnalysisRulesEntity> localVarReturnType = new GenericType<FlowAnalysisRulesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a flow registry client
     * 
     * @param id The flow registry client id. (required)
     * @return FlowRegistryClientEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientEntity getFlowRegistryClient(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlowRegistryClient");
        }
        // create path and map variables
        String localVarPath = "/controller/registry-clients/{id}"
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

        GenericType<FlowRegistryClientEntity> localVarReturnType = new GenericType<FlowRegistryClientEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the listing of available flow registry clients
     * 
     * @return FlowRegistryClientsEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientsEntity getFlowRegistryClients() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/registry-clients";

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

        GenericType<FlowRegistryClientsEntity> localVarReturnType = new GenericType<FlowRegistryClientsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the component types available from the installed NARs
     * 
     * @param id The id of the NAR. (required)
     * @return NarDetailsEntity
     * @throws ApiException if fails to make API call
     */
    public NarDetailsEntity getNarDetails(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getNarDetails");
        }
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars/{id}/details"
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

        GenericType<NarDetailsEntity> localVarReturnType = new GenericType<NarDetailsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves summary information for installed NARs
     * 
     * @return NarSummariesEntity
     * @throws ApiException if fails to make API call
     */
    public NarSummariesEntity getNarSummaries() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars";

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

        GenericType<NarSummariesEntity> localVarReturnType = new GenericType<NarSummariesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the summary information for the NAR with the given identifier
     * 
     * @param id The id of the NAR. (required)
     * @return NarDetailsEntity
     * @throws ApiException if fails to make API call
     */
    public NarDetailsEntity getNarSummary(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getNarSummary");
        }
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars/{id}"
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

        GenericType<NarDetailsEntity> localVarReturnType = new GenericType<NarDetailsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a node in the cluster
     * 
     * @param id The node id. (required)
     * @return NodeEntity
     * @throws ApiException if fails to make API call
     */
    public NodeEntity getNode(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getNode");
        }
        // create path and map variables
        String localVarPath = "/controller/cluster/nodes/{id}"
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

        GenericType<NodeEntity> localVarReturnType = new GenericType<NodeEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status history for the node
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @return ComponentHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentHistoryEntity getNodeStatusHistory() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/status/history";

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

        GenericType<ComponentHistoryEntity> localVarReturnType = new GenericType<ComponentHistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a flow registry client property descriptor
     * 
     * @param id The flow registry client id. (required)
     * @param propertyName The property name. (required)
     * @param sensitive Property Descriptor requested sensitive status (optional)
     * @return PropertyDescriptorEntity
     * @throws ApiException if fails to make API call
     */
    public PropertyDescriptorEntity getPropertyDescriptor(String id, String propertyName, Boolean sensitive) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getPropertyDescriptor");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new ApiException(400, "Missing the required parameter 'propertyName' when calling getPropertyDescriptor");
        }
        // create path and map variables
        String localVarPath = "/controller/registry-clients/{id}/descriptors"
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
     * Retrieves the types of flow  that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @return FlowRegistryClientTypesEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientTypesEntity getRegistryClientTypes() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/controller/registry-types";

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

        GenericType<FlowRegistryClientTypesEntity> localVarReturnType = new GenericType<FlowRegistryClientTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Imports a reporting task snapshot
     * 
     * @param body The import request containing the reporting task snapshot to import. (required)
     * @return VersionedReportingTaskImportResponseEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedReportingTaskImportResponseEntity importReportingTaskSnapshot(VersionedReportingTaskImportRequestEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling importReportingTaskSnapshot");
        }
        // create path and map variables
        String localVarPath = "/controller/reporting-tasks/import";

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

        GenericType<VersionedReportingTaskImportResponseEntity> localVarReturnType = new GenericType<VersionedReportingTaskImportResponseEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Deletes a flow analysis rule
     * 
     * @param id The flow analysis rule id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @param disconnectedNodeAcknowledged Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional, default to false)
     * @return FlowAnalysisRuleEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleEntity removeFlowAnalysisRule(String id, LongParameter version, ClientIdParameter clientId, Boolean disconnectedNodeAcknowledged) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling removeFlowAnalysisRule");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}"
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

        GenericType<FlowAnalysisRuleEntity> localVarReturnType = new GenericType<FlowAnalysisRuleEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Performs verification of the Flow Analysis Rule&#x27;s configuration
     * This will initiate the process of verifying a given Flow Analysis Rule configuration. This may be a long-running task. As a result, this endpoint will immediately return a FlowAnalysisRuleConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /flow-analysis-rules/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /flow-analysis-rules/{serviceId}/verification-requests/{requestId}.
     * @param body The flow analysis rules configuration verification request. (required)
     * @param id The flow analysis rules id. (required)
     * @return VerifyConfigRequestEntity
     * @throws ApiException if fails to make API call
     */
    public VerifyConfigRequestEntity submitFlowAnalysisRuleConfigVerificationRequest(VerifyConfigRequestEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling submitFlowAnalysisRuleConfigVerificationRequest");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling submitFlowAnalysisRuleConfigVerificationRequest");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/config/verification-requests"
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
     * Retrieves the configuration for this NiFi
     * 
     * @param body The controller configuration. (required)
     * @return ControllerConfigurationEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerConfigurationEntity updateControllerConfig(ControllerConfigurationEntity body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateControllerConfig");
        }
        // create path and map variables
        String localVarPath = "/controller/config";

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

        GenericType<ControllerConfigurationEntity> localVarReturnType = new GenericType<ControllerConfigurationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a flow analysis rule
     * 
     * @param body The flow analysis rule configuration details. (required)
     * @param id The flow analysis rule id. (required)
     * @return FlowAnalysisRuleEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleEntity updateFlowAnalysisRule(FlowAnalysisRuleEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateFlowAnalysisRule");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateFlowAnalysisRule");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}"
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

        GenericType<FlowAnalysisRuleEntity> localVarReturnType = new GenericType<FlowAnalysisRuleEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a flow registry client
     * 
     * @param body The flow registry client configuration details. (required)
     * @param id The flow registry client id. (required)
     * @return FlowRegistryClientEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientEntity updateFlowRegistryClient(FlowRegistryClientEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateFlowRegistryClient");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateFlowRegistryClient");
        }
        // create path and map variables
        String localVarPath = "/controller/registry-clients/{id}"
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

        GenericType<FlowRegistryClientEntity> localVarReturnType = new GenericType<FlowRegistryClientEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates a node in the cluster
     * 
     * @param body The node configuration. The only configuration that will be honored at this endpoint is the status. (required)
     * @param id The node id. (required)
     * @return NodeEntity
     * @throws ApiException if fails to make API call
     */
    public NodeEntity updateNode(NodeEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateNode");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateNode");
        }
        // create path and map variables
        String localVarPath = "/controller/cluster/nodes/{id}"
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

        GenericType<NodeEntity> localVarReturnType = new GenericType<NodeEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Updates run status of a flow analysis rule
     * 
     * @param body The flow analysis rule run status. (required)
     * @param id The flow analysis rule id. (required)
     * @return FlowAnalysisRuleEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleEntity updateRunStatus(FlowAnalysisRuleRunStatusEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateRunStatus");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateRunStatus");
        }
        // create path and map variables
        String localVarPath = "/controller/flow-analysis-rules/{id}/run-status"
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

        GenericType<FlowAnalysisRuleEntity> localVarReturnType = new GenericType<FlowAnalysisRuleEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Uploads a NAR and requests for it to be installed
     * 
     * @param body The contents of the NAR file. (required)
     * @param filename  (optional)
     * @return NarSummaryEntity
     * @throws ApiException if fails to make API call
     */
    public NarSummaryEntity uploadNar(Object body, String filename) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling uploadNar");
        }
        // create path and map variables
        String localVarPath = "/controller/nar-manager/nars/content";

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

        GenericType<NarSummaryEntity> localVarReturnType = new GenericType<NarSummaryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
