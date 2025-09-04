package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.AboutEntity;
import org.apache.nifi.api.toolkit.model.ActionEntity;
import org.apache.nifi.api.toolkit.model.ActivateControllerServicesEntity;
import org.apache.nifi.api.toolkit.model.AdditionalDetailsEntity;
import org.apache.nifi.api.toolkit.model.BannerEntity;
import org.apache.nifi.api.toolkit.model.BulletinBoardEntity;
import org.apache.nifi.api.toolkit.model.BulletinBoardPatternParameter;
import org.apache.nifi.api.toolkit.model.ClusterSearchResultsEntity;
import org.apache.nifi.api.toolkit.model.ClusterSummaryEntity;
import org.apache.nifi.api.toolkit.model.ComponentHistoryEntity;
import org.apache.nifi.api.toolkit.model.ConnectionStatisticsEntity;
import org.apache.nifi.api.toolkit.model.ConnectionStatusEntity;
import org.apache.nifi.api.toolkit.model.ContentViewerEntity;
import org.apache.nifi.api.toolkit.model.ControllerBulletinsEntity;
import org.apache.nifi.api.toolkit.model.ControllerServiceDefinition;
import org.apache.nifi.api.toolkit.model.ControllerServiceTypesEntity;
import org.apache.nifi.api.toolkit.model.ControllerServicesEntity;
import org.apache.nifi.api.toolkit.model.ControllerStatusEntity;
import org.apache.nifi.api.toolkit.model.CurrentUserEntity;
import org.apache.nifi.api.toolkit.model.DateTimeParameter;
import org.apache.nifi.api.toolkit.model.FlowAnalysisResultEntity;
import org.apache.nifi.api.toolkit.model.FlowAnalysisRuleDefinition;
import org.apache.nifi.api.toolkit.model.FlowAnalysisRuleTypesEntity;
import org.apache.nifi.api.toolkit.model.FlowBreadcrumbEntity;
import org.apache.nifi.api.toolkit.model.FlowComparisonEntity;
import org.apache.nifi.api.toolkit.model.FlowConfigurationEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryBranchesEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryBucketsEntity;
import org.apache.nifi.api.toolkit.model.FlowRegistryClientsEntity;
import org.apache.nifi.api.toolkit.model.HistoryEntity;
import org.apache.nifi.api.toolkit.model.IntegerParameter;
import org.apache.nifi.api.toolkit.model.LongParameter;
import org.apache.nifi.api.toolkit.model.ParameterContextsEntity;
import org.apache.nifi.api.toolkit.model.ParameterProviderDefinition;
import org.apache.nifi.api.toolkit.model.ParameterProviderTypesEntity;
import org.apache.nifi.api.toolkit.model.ParameterProvidersEntity;
import org.apache.nifi.api.toolkit.model.PortStatusEntity;
import org.apache.nifi.api.toolkit.model.PrioritizerTypesEntity;
import org.apache.nifi.api.toolkit.model.ProcessGroupFlowEntity;
import org.apache.nifi.api.toolkit.model.ProcessGroupStatusEntity;
import org.apache.nifi.api.toolkit.model.ProcessorDefinition;
import org.apache.nifi.api.toolkit.model.ProcessorStatusEntity;
import org.apache.nifi.api.toolkit.model.ProcessorTypesEntity;
import org.apache.nifi.api.toolkit.model.RemoteProcessGroupStatusEntity;
import org.apache.nifi.api.toolkit.model.ReportingTaskDefinition;
import org.apache.nifi.api.toolkit.model.ReportingTaskTypesEntity;
import org.apache.nifi.api.toolkit.model.ReportingTasksEntity;
import org.apache.nifi.api.toolkit.model.RuntimeManifestEntity;
import org.apache.nifi.api.toolkit.model.ScheduleComponentsEntity;
import org.apache.nifi.api.toolkit.model.SearchResultsEntity;
import org.apache.nifi.api.toolkit.model.StatusHistoryEntity;
import org.apache.nifi.api.toolkit.model.StreamingOutput;
import org.apache.nifi.api.toolkit.model.VersionedFlowEntity;
import org.apache.nifi.api.toolkit.model.VersionedFlowSnapshotMetadataSetEntity;
import org.apache.nifi.api.toolkit.model.VersionedFlowsEntity;
import org.apache.nifi.api.toolkit.model.VersionedReportingTaskSnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class FlowApi {
    private ApiClient apiClient;

    public FlowApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlowApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Enable or disable Controller Services in the specified Process Group.
     * 
     * @param body The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered. (required)
     * @param id The process group id. (required)
     * @return ActivateControllerServicesEntity
     * @throws ApiException if fails to make API call
     */
    public ActivateControllerServicesEntity activateControllerServices(ActivateControllerServicesEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling activateControllerServices");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling activateControllerServices");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}/controller-services"
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

        GenericType<ActivateControllerServicesEntity> localVarReturnType = new GenericType<ActivateControllerServicesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Download a snapshot of the given reporting tasks and any controller services they use
     * 
     * @param reportingTaskId Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. (optional)
     * @return byte[]
     * @throws ApiException if fails to make API call
     */
    public byte[] downloadReportingTaskSnapshot(String reportingTaskId) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/reporting-tasks/download";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportingTaskId", reportingTaskId));


        final String[] localVarAccepts = {
            "application/json"
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
     * Generates a client id.
     * 
     * @return String
     * @throws ApiException if fails to make API call
     */
    public String generateClientId() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/client-id";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "text/plain"
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
     * Retrieves details about this NiFi to put in the About dialog
     * 
     * @return AboutEntity
     * @throws ApiException if fails to make API call
     */
    public AboutEntity getAboutInfo() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/about";

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

        GenericType<AboutEntity> localVarReturnType = new GenericType<AboutEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets an action
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param id The action id. (required)
     * @return ActionEntity
     * @throws ApiException if fails to make API call
     */
    public ActionEntity getAction(IntegerParameter id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getAction");
        }
        // create path and map variables
        String localVarPath = "/flow/history/{id}"
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

        GenericType<ActionEntity> localVarReturnType = new GenericType<ActionEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the additional details for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The processor type (required)
     * @return AdditionalDetailsEntity
     * @throws ApiException if fails to make API call
     */
    public AdditionalDetailsEntity getAdditionalDetails(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getAdditionalDetails");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getAdditionalDetails");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getAdditionalDetails");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getAdditionalDetails");
        }
        // create path and map variables
        String localVarPath = "/flow/additional-details/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<AdditionalDetailsEntity> localVarReturnType = new GenericType<AdditionalDetailsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns all flow analysis results currently in effect
     * 
     * @return FlowAnalysisResultEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisResultEntity getAllFlowAnalysisResults() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/flow-analysis/results";

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

        GenericType<FlowAnalysisResultEntity> localVarReturnType = new GenericType<FlowAnalysisResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the banners for this NiFi
     * 
     * @return BannerEntity
     * @throws ApiException if fails to make API call
     */
    public BannerEntity getBanners() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/banners";

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

        GenericType<BannerEntity> localVarReturnType = new GenericType<BannerEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the branches from the specified registry for the current user
     * 
     * @param id The registry id. (required)
     * @return FlowRegistryBranchesEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryBranchesEntity getBranches(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getBranches");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{id}/branches"
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

        GenericType<FlowRegistryBranchesEntity> localVarReturnType = new GenericType<FlowRegistryBranchesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the breadcrumbs for a process group
     * 
     * @param id The process group id. (required)
     * @return FlowBreadcrumbEntity
     * @throws ApiException if fails to make API call
     */
    public FlowBreadcrumbEntity getBreadcrumbs(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getBreadcrumbs");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}/breadcrumbs"
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

        GenericType<FlowBreadcrumbEntity> localVarReturnType = new GenericType<FlowBreadcrumbEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the buckets from the specified registry for the current user
     * 
     * @param id The registry id. (required)
     * @param branch The name of a branch to get the buckets from. If not specified the default branch of the registry client will be used. (optional)
     * @return FlowRegistryBucketsEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryBucketsEntity getBuckets(String id, String branch) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getBuckets");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{id}/buckets"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<FlowRegistryBucketsEntity> localVarReturnType = new GenericType<FlowRegistryBucketsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets current bulletins
     * 
     * @param after Includes bulletins with an id after this value. (optional)
     * @param sourceName Includes bulletins originating from this sources whose name match this regular expression. (optional)
     * @param message Includes bulletins whose message that match this regular expression. (optional)
     * @param sourceId Includes bulletins originating from this sources whose id match this regular expression. (optional)
     * @param groupId Includes bulletins originating from this sources whose group id match this regular expression. (optional)
     * @param limit The number of bulletins to limit the response to. (optional)
     * @return BulletinBoardEntity
     * @throws ApiException if fails to make API call
     */
    public BulletinBoardEntity getBulletinBoard(LongParameter after, BulletinBoardPatternParameter sourceName, BulletinBoardPatternParameter message, BulletinBoardPatternParameter sourceId, BulletinBoardPatternParameter groupId, IntegerParameter limit) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/bulletin-board";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceName", sourceName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupId", groupId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<BulletinBoardEntity> localVarReturnType = new GenericType<BulletinBoardEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves Controller level bulletins
     * 
     * @return ControllerBulletinsEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerBulletinsEntity getBulletins() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/controller/bulletins";

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

        GenericType<ControllerBulletinsEntity> localVarReturnType = new GenericType<ControllerBulletinsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * The cluster summary for this NiFi
     * 
     * @return ClusterSummaryEntity
     * @throws ApiException if fails to make API call
     */
    public ClusterSummaryEntity getClusterSummary() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/cluster/summary";

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

        GenericType<ClusterSummaryEntity> localVarReturnType = new GenericType<ClusterSummaryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets configuration history for a component
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param componentId The component id. (required)
     * @return ComponentHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public ComponentHistoryEntity getComponentHistory(String componentId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new ApiException(400, "Missing the required parameter 'componentId' when calling getComponentHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/history/components/{componentId}"
                .replaceAll("\\{" + "componentId" + "\\}", apiClient.escapeString(componentId.toString()));

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
     * Gets statistics for a connection
     * 
     * @param id The connection id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the statistics. (optional)
     * @return ConnectionStatisticsEntity
     * @throws ApiException if fails to make API call
     */
    public ConnectionStatisticsEntity getConnectionStatistics(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getConnectionStatistics");
        }
        // create path and map variables
        String localVarPath = "/flow/connections/{id}/statistics"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ConnectionStatisticsEntity> localVarReturnType = new GenericType<ConnectionStatisticsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status for a connection
     * 
     * @param id The connection id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return ConnectionStatusEntity
     * @throws ApiException if fails to make API call
     */
    public ConnectionStatusEntity getConnectionStatus(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getConnectionStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/connections/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ConnectionStatusEntity> localVarReturnType = new GenericType<ConnectionStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the status history for a connection
     * 
     * @param id The connection id. (required)
     * @return StatusHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public StatusHistoryEntity getConnectionStatusHistory(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getConnectionStatusHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/connections/{id}/status/history"
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

        GenericType<StatusHistoryEntity> localVarReturnType = new GenericType<StatusHistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the registered content viewers
     * 
     * @return ContentViewerEntity
     * @throws ApiException if fails to make API call
     */
    public ContentViewerEntity getContentViewers() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/content-viewers";

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

        GenericType<ContentViewerEntity> localVarReturnType = new GenericType<ContentViewerEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the Controller Service Definition for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The controller service type (required)
     * @return ControllerServiceDefinition
     * @throws ApiException if fails to make API call
     */
    public ControllerServiceDefinition getControllerServiceDefinition(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getControllerServiceDefinition");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getControllerServiceDefinition");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getControllerServiceDefinition");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getControllerServiceDefinition");
        }
        // create path and map variables
        String localVarPath = "/flow/controller-service-definition/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<ControllerServiceDefinition> localVarReturnType = new GenericType<ControllerServiceDefinition>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of controller services that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param serviceType If specified, will only return controller services that are compatible with this type of service. (optional)
     * @param serviceBundleGroup If serviceType specified, is the bundle group of the serviceType. (optional)
     * @param serviceBundleArtifact If serviceType specified, is the bundle artifact of the serviceType. (optional)
     * @param serviceBundleVersion If serviceType specified, is the bundle version of the serviceType. (optional)
     * @param bundleGroupFilter If specified, will only return types that are a member of this bundle group. (optional)
     * @param bundleArtifactFilter If specified, will only return types that are a member of this bundle artifact. (optional)
     * @param typeFilter If specified, will only return types whose fully qualified classname matches. (optional)
     * @return ControllerServiceTypesEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerServiceTypesEntity getControllerServiceTypes(String serviceType, String serviceBundleGroup, String serviceBundleArtifact, String serviceBundleVersion, String bundleGroupFilter, String bundleArtifactFilter, String typeFilter) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/controller-service-types";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceType", serviceType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceBundleGroup", serviceBundleGroup));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceBundleArtifact", serviceBundleArtifact));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceBundleVersion", serviceBundleVersion));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleGroupFilter", bundleGroupFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleArtifactFilter", bundleArtifactFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeFilter", typeFilter));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ControllerServiceTypesEntity> localVarReturnType = new GenericType<ControllerServiceTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets controller services for reporting tasks
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     * @param uiOnly  (optional, default to false)
     * @param includeReferencingComponents Whether or not to include services&#x27; referencing components in the response (optional, default to true)
     * @return ControllerServicesEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerServicesEntity getControllerServicesFromController(Boolean uiOnly, Boolean includeReferencingComponents) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/controller/controller-services";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uiOnly", uiOnly));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeReferencingComponents", includeReferencingComponents));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ControllerServicesEntity> localVarReturnType = new GenericType<ControllerServicesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all controller services
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     * @param id The process group id. (required)
     * @param includeAncestorGroups Whether or not to include parent/ancestor process groups (optional, default to true)
     * @param includeDescendantGroups Whether or not to include descendant process groups (optional, default to false)
     * @param includeReferencingComponents Whether or not to include services&#x27; referencing components in the response (optional, default to true)
     * @param uiOnly  (optional, default to false)
     * @return ControllerServicesEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerServicesEntity getControllerServicesFromGroup(String id, Boolean includeAncestorGroups, Boolean includeDescendantGroups, Boolean includeReferencingComponents, Boolean uiOnly) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getControllerServicesFromGroup");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}/controller-services"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAncestorGroups", includeAncestorGroups));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDescendantGroups", includeDescendantGroups));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeReferencingComponents", includeReferencingComponents));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uiOnly", uiOnly));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ControllerServicesEntity> localVarReturnType = new GenericType<ControllerServicesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the current status of this NiFi
     * 
     * @return ControllerStatusEntity
     * @throws ApiException if fails to make API call
     */
    public ControllerStatusEntity getControllerStatus() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/status";

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

        GenericType<ControllerStatusEntity> localVarReturnType = new GenericType<ControllerStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the user identity of the user making the request
     * 
     * @return CurrentUserEntity
     * @throws ApiException if fails to make API call
     */
    public CurrentUserEntity getCurrentUser() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/current-user";

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

        GenericType<CurrentUserEntity> localVarReturnType = new GenericType<CurrentUserEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
     * 
     * @param registryId The registry client id. (required)
     * @param bucketId The bucket id. (required)
     * @param flowId The flow id. (required)
     * @param branch The name of a branch to get the flow from. If not specified the default branch of the registry client will be used. (optional)
     * @return VersionedFlowEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowEntity getDetails(String registryId, String bucketId, String flowId, String branch) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'registryId' is set
        if (registryId == null) {
            throw new ApiException(400, "Missing the required parameter 'registryId' when calling getDetails");
        }
        // verify the required parameter 'bucketId' is set
        if (bucketId == null) {
            throw new ApiException(400, "Missing the required parameter 'bucketId' when calling getDetails");
        }
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException(400, "Missing the required parameter 'flowId' when calling getDetails");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/details"
                .replaceAll("\\{" + "registry-id" + "\\}", apiClient.escapeString(registryId.toString()))
                .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
                .replaceAll("\\{" + "flow-id" + "\\}", apiClient.escapeString(flowId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<VersionedFlowEntity> localVarReturnType = new GenericType<VersionedFlowEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets a process group
     * If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.
     * @param id The process group id. (required)
     * @param uiOnly  (optional, default to false)
     * @return ProcessGroupFlowEntity
     * @throws ApiException if fails to make API call
     */
    public ProcessGroupFlowEntity getFlow(String id, Boolean uiOnly) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getFlow");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uiOnly", uiOnly));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ProcessGroupFlowEntity> localVarReturnType = new GenericType<ProcessGroupFlowEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Returns flow analysis results produced by the analysis of a given process group
     * 
     * @param processGroupId The id of the process group representing (a part of) the flow to be analyzed. (required)
     * @return FlowAnalysisResultEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisResultEntity getFlowAnalysisResults(String processGroupId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'processGroupId' is set
        if (processGroupId == null) {
            throw new ApiException(400, "Missing the required parameter 'processGroupId' when calling getFlowAnalysisResults");
        }
        // create path and map variables
        String localVarPath = "/flow/flow-analysis/results/{processGroupId}"
                .replaceAll("\\{" + "processGroupId" + "\\}", apiClient.escapeString(processGroupId.toString()));

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

        GenericType<FlowAnalysisResultEntity> localVarReturnType = new GenericType<FlowAnalysisResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the Flow Analysis Rule Definition for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The flow analysis rule type (required)
     * @return FlowAnalysisRuleDefinition
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleDefinition getFlowAnalysisRuleDefinition(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getFlowAnalysisRuleDefinition");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getFlowAnalysisRuleDefinition");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getFlowAnalysisRuleDefinition");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getFlowAnalysisRuleDefinition");
        }
        // create path and map variables
        String localVarPath = "/flow/flow-analysis-rule-definition/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<FlowAnalysisRuleDefinition> localVarReturnType = new GenericType<FlowAnalysisRuleDefinition>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of available Flow Analysis Rules
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param bundleGroupFilter If specified, will only return types that are a member of this bundle group. (optional)
     * @param bundleArtifactFilter If specified, will only return types that are a member of this bundle artifact. (optional)
     * @param type If specified, will only return types whose fully qualified classname matches. (optional)
     * @return FlowAnalysisRuleTypesEntity
     * @throws ApiException if fails to make API call
     */
    public FlowAnalysisRuleTypesEntity getFlowAnalysisRuleTypes(String bundleGroupFilter, String bundleArtifactFilter, String type) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/flow-analysis-rule-types";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleGroupFilter", bundleGroupFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleArtifactFilter", bundleArtifactFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<FlowAnalysisRuleTypesEntity> localVarReturnType = new GenericType<FlowAnalysisRuleTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the configuration for this NiFi flow
     * 
     * @return FlowConfigurationEntity
     * @throws ApiException if fails to make API call
     */
    public FlowConfigurationEntity getFlowConfig() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/config";

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

        GenericType<FlowConfigurationEntity> localVarReturnType = new GenericType<FlowConfigurationEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all metrics for the flow from a particular node
     * 
     * @param producer The producer for flow file metrics. Each producer may have its own output format. (required)
     * @param includedRegistries Set of included metrics registries. Duplicate the parameter to include multiple registries. All registries are included by default. (optional)
     * @param sampleName Regular Expression Pattern to be applied against the sample name field (optional)
     * @param sampleLabelValue Regular Expression Pattern to be applied against the sample label value field (optional)
     * @param rootFieldName Name of the first field of JSON object. Applicable for JSON producer only. (optional)
     * @return StreamingOutput
     * @throws ApiException if fails to make API call
     */
    public StreamingOutput getFlowMetrics(String producer, List<String> includedRegistries, String sampleName, String sampleLabelValue, String rootFieldName) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'producer' is set
        if (producer == null) {
            throw new ApiException(400, "Missing the required parameter 'producer' when calling getFlowMetrics");
        }
        // create path and map variables
        String localVarPath = "/flow/metrics/{producer}"
                .replaceAll("\\{" + "producer" + "\\}", apiClient.escapeString(producer.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includedRegistries", includedRegistries));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sampleName", sampleName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sampleLabelValue", sampleLabelValue));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rootFieldName", rootFieldName));


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
     * Gets the flows from the specified registry and bucket for the current user
     * 
     * @param registryId The registry client id. (required)
     * @param bucketId The bucket id. (required)
     * @param branch The name of a branch to get the flows from. If not specified the default branch of the registry client will be used. (optional)
     * @return VersionedFlowsEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowsEntity getFlows(String registryId, String bucketId, String branch) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'registryId' is set
        if (registryId == null) {
            throw new ApiException(400, "Missing the required parameter 'registryId' when calling getFlows");
        }
        // verify the required parameter 'bucketId' is set
        if (bucketId == null) {
            throw new ApiException(400, "Missing the required parameter 'bucketId' when calling getFlows");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{registry-id}/buckets/{bucket-id}/flows"
                .replaceAll("\\{" + "registry-id" + "\\}", apiClient.escapeString(registryId.toString()))
                .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<VersionedFlowsEntity> localVarReturnType = new GenericType<VersionedFlowsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status for an input port
     * 
     * @param id The input port id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return PortStatusEntity
     * @throws ApiException if fails to make API call
     */
    public PortStatusEntity getInputPortStatus(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getInputPortStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/input-ports/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<PortStatusEntity> localVarReturnType = new GenericType<PortStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status for an output port
     * 
     * @param id The output port id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return PortStatusEntity
     * @throws ApiException if fails to make API call
     */
    public PortStatusEntity getOutputPortStatus(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getOutputPortStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/output-ports/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<PortStatusEntity> localVarReturnType = new GenericType<PortStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all Parameter Contexts
     * 
     * @return ParameterContextsEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterContextsEntity getParameterContexts() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/parameter-contexts";

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

        GenericType<ParameterContextsEntity> localVarReturnType = new GenericType<ParameterContextsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the Parameter Provider Definition for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The parameter provider type (required)
     * @return ParameterProviderDefinition
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderDefinition getParameterProviderDefinition(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getParameterProviderDefinition");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getParameterProviderDefinition");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getParameterProviderDefinition");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getParameterProviderDefinition");
        }
        // create path and map variables
        String localVarPath = "/flow/parameter-provider-definition/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<ParameterProviderDefinition> localVarReturnType = new GenericType<ParameterProviderDefinition>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of parameter providers that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param bundleGroupFilter If specified, will only return types that are a member of this bundle group. (optional)
     * @param bundleArtifactFilter If specified, will only return types that are a member of this bundle artifact. (optional)
     * @param type If specified, will only return types whose fully qualified classname matches. (optional)
     * @return ParameterProviderTypesEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProviderTypesEntity getParameterProviderTypes(String bundleGroupFilter, String bundleArtifactFilter, String type) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/parameter-provider-types";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleGroupFilter", bundleGroupFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleArtifactFilter", bundleArtifactFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ParameterProviderTypesEntity> localVarReturnType = new GenericType<ParameterProviderTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all parameter providers
     * 
     * @return ParameterProvidersEntity
     * @throws ApiException if fails to make API call
     */
    public ParameterProvidersEntity getParameterProviders() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/parameter-providers";

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

        GenericType<ParameterProvidersEntity> localVarReturnType = new GenericType<ParameterProvidersEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of prioritizers that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @return PrioritizerTypesEntity
     * @throws ApiException if fails to make API call
     */
    public PrioritizerTypesEntity getPrioritizers() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/prioritizers";

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

        GenericType<PrioritizerTypesEntity> localVarReturnType = new GenericType<PrioritizerTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the status for a process group
     * The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.
     * @param id The process group id. (required)
     * @param recursive Whether all descendant groups and the status of their content will be included. Optional, defaults to false (optional, default to false)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return ProcessGroupStatusEntity
     * @throws ApiException if fails to make API call
     */
    public ProcessGroupStatusEntity getProcessGroupStatus(String id, Boolean recursive, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProcessGroupStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "recursive", recursive));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ProcessGroupStatusEntity> localVarReturnType = new GenericType<ProcessGroupStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status history for a remote process group
     * 
     * @param id The process group id. (required)
     * @return StatusHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public StatusHistoryEntity getProcessGroupStatusHistory(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProcessGroupStatusHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}/status/history"
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

        GenericType<StatusHistoryEntity> localVarReturnType = new GenericType<StatusHistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the Processor Definition for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The processor type (required)
     * @return ProcessorDefinition
     * @throws ApiException if fails to make API call
     */
    public ProcessorDefinition getProcessorDefinition(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getProcessorDefinition");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getProcessorDefinition");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getProcessorDefinition");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getProcessorDefinition");
        }
        // create path and map variables
        String localVarPath = "/flow/processor-definition/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<ProcessorDefinition> localVarReturnType = new GenericType<ProcessorDefinition>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status for a processor
     * 
     * @param id The processor id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return ProcessorStatusEntity
     * @throws ApiException if fails to make API call
     */
    public ProcessorStatusEntity getProcessorStatus(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProcessorStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/processors/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ProcessorStatusEntity> localVarReturnType = new GenericType<ProcessorStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets status history for a processor
     * 
     * @param id The processor id. (required)
     * @return StatusHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public StatusHistoryEntity getProcessorStatusHistory(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getProcessorStatusHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/processors/{id}/status/history"
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

        GenericType<StatusHistoryEntity> localVarReturnType = new GenericType<StatusHistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of processors that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param bundleGroupFilter If specified, will only return types that are a member of this bundle group. (optional)
     * @param bundleArtifactFilter If specified, will only return types that are a member of this bundle artifact. (optional)
     * @param type If specified, will only return types whose fully qualified classname matches. (optional)
     * @return ProcessorTypesEntity
     * @throws ApiException if fails to make API call
     */
    public ProcessorTypesEntity getProcessorTypes(String bundleGroupFilter, String bundleArtifactFilter, String type) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/processor-types";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleGroupFilter", bundleGroupFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleArtifactFilter", bundleArtifactFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ProcessorTypesEntity> localVarReturnType = new GenericType<ProcessorTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the listing of available flow registry clients
     * 
     * @return FlowRegistryClientsEntity
     * @throws ApiException if fails to make API call
     */
    public FlowRegistryClientsEntity getRegistryClients() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/registries";

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
     * Gets status for a remote process group
     * 
     * @param id The remote process group id. (required)
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return RemoteProcessGroupStatusEntity
     * @throws ApiException if fails to make API call
     */
    public RemoteProcessGroupStatusEntity getRemoteProcessGroupStatus(String id, Boolean nodewise, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteProcessGroupStatus");
        }
        // create path and map variables
        String localVarPath = "/flow/remote-process-groups/{id}/status"
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<RemoteProcessGroupStatusEntity> localVarReturnType = new GenericType<RemoteProcessGroupStatusEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the status history
     * 
     * @param id The remote process group id. (required)
     * @return StatusHistoryEntity
     * @throws ApiException if fails to make API call
     */
    public StatusHistoryEntity getRemoteProcessGroupStatusHistory(String id) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteProcessGroupStatusHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/remote-process-groups/{id}/status/history"
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

        GenericType<StatusHistoryEntity> localVarReturnType = new GenericType<StatusHistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the Reporting Task Definition for the specified component type.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param group The bundle group (required)
     * @param artifact The bundle artifact (required)
     * @param version The bundle version (required)
     * @param type The reporting task type (required)
     * @return ReportingTaskDefinition
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskDefinition getReportingTaskDefinition(String group, String artifact, String version, String type) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException(400, "Missing the required parameter 'group' when calling getReportingTaskDefinition");
        }
        // verify the required parameter 'artifact' is set
        if (artifact == null) {
            throw new ApiException(400, "Missing the required parameter 'artifact' when calling getReportingTaskDefinition");
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getReportingTaskDefinition");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getReportingTaskDefinition");
        }
        // create path and map variables
        String localVarPath = "/flow/reporting-task-definition/{group}/{artifact}/{version}/{type}"
                .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
                .replaceAll("\\{" + "artifact" + "\\}", apiClient.escapeString(artifact.toString()))
                .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
                .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

        GenericType<ReportingTaskDefinition> localVarReturnType = new GenericType<ReportingTaskDefinition>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a snapshot of the given reporting tasks and any controller services they use
     * 
     * @param reportingTaskId Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. (optional)
     * @return VersionedReportingTaskSnapshot
     * @throws ApiException if fails to make API call
     */
    public VersionedReportingTaskSnapshot getReportingTaskSnapshot(String reportingTaskId) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/reporting-tasks/snapshot";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportingTaskId", reportingTaskId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<VersionedReportingTaskSnapshot> localVarReturnType = new GenericType<VersionedReportingTaskSnapshot>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the types of reporting tasks that this NiFi supports
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param bundleGroupFilter If specified, will only return types that are a member of this bundle group. (optional)
     * @param bundleArtifactFilter If specified, will only return types that are a member of this bundle artifact. (optional)
     * @param type If specified, will only return types whose fully qualified classname matches. (optional)
     * @return ReportingTaskTypesEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTaskTypesEntity getReportingTaskTypes(String bundleGroupFilter, String bundleArtifactFilter, String type) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/reporting-task-types";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleGroupFilter", bundleGroupFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleArtifactFilter", bundleArtifactFilter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ReportingTaskTypesEntity> localVarReturnType = new GenericType<ReportingTaskTypesEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets all reporting tasks
     * 
     * @return ReportingTasksEntity
     * @throws ApiException if fails to make API call
     */
    public ReportingTasksEntity getReportingTasks() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/reporting-tasks";

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

        GenericType<ReportingTasksEntity> localVarReturnType = new GenericType<ReportingTasksEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves the runtime manifest for this NiFi instance.
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @return RuntimeManifestEntity
     * @throws ApiException if fails to make API call
     */
    public RuntimeManifestEntity getRuntimeManifest() throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/runtime-manifest";

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

        GenericType<RuntimeManifestEntity> localVarReturnType = new GenericType<RuntimeManifestEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version
     * 
     * @param registryId The registry client id. (required)
     * @param branchIdA The branch id for the base version. (required)
     * @param bucketIdA The bucket id for the base version. (required)
     * @param flowIdA The flow id for the base version. (required)
     * @param versionA The base version. (required)
     * @param branchIdB The branch id for the compared version. (required)
     * @param bucketIdB The bucket id for the compared version. (required)
     * @param flowIdB The flow id for the compared version. (required)
     * @param versionB The compared version. (required)
     * @param offset Must be a non-negative number. Specifies the starting point of the listing. 0 means start from the beginning. (optional, default to 0)
     * @param limit Limits the number of differences listed. This might lead to partial result. 0 means no limitation is applied. (optional, default to 1000)
     * @return FlowComparisonEntity
     * @throws ApiException if fails to make API call
     */
    public FlowComparisonEntity getVersionDifferences(String registryId, String branchIdA, String bucketIdA, String flowIdA, String versionA, String branchIdB, String bucketIdB, String flowIdB, String versionB, Integer offset, Integer limit) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'registryId' is set
        if (registryId == null) {
            throw new ApiException(400, "Missing the required parameter 'registryId' when calling getVersionDifferences");
        }
        // verify the required parameter 'branchIdA' is set
        if (branchIdA == null) {
            throw new ApiException(400, "Missing the required parameter 'branchIdA' when calling getVersionDifferences");
        }
        // verify the required parameter 'bucketIdA' is set
        if (bucketIdA == null) {
            throw new ApiException(400, "Missing the required parameter 'bucketIdA' when calling getVersionDifferences");
        }
        // verify the required parameter 'flowIdA' is set
        if (flowIdA == null) {
            throw new ApiException(400, "Missing the required parameter 'flowIdA' when calling getVersionDifferences");
        }
        // verify the required parameter 'versionA' is set
        if (versionA == null) {
            throw new ApiException(400, "Missing the required parameter 'versionA' when calling getVersionDifferences");
        }
        // verify the required parameter 'branchIdB' is set
        if (branchIdB == null) {
            throw new ApiException(400, "Missing the required parameter 'branchIdB' when calling getVersionDifferences");
        }
        // verify the required parameter 'bucketIdB' is set
        if (bucketIdB == null) {
            throw new ApiException(400, "Missing the required parameter 'bucketIdB' when calling getVersionDifferences");
        }
        // verify the required parameter 'flowIdB' is set
        if (flowIdB == null) {
            throw new ApiException(400, "Missing the required parameter 'flowIdB' when calling getVersionDifferences");
        }
        // verify the required parameter 'versionB' is set
        if (versionB == null) {
            throw new ApiException(400, "Missing the required parameter 'versionB' when calling getVersionDifferences");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{registry-id}/branches/{branch-id-a}/buckets/{bucket-id-a}/flows/{flow-id-a}/{version-a}/diff/branches/{branch-id-b}/buckets/{bucket-id-b}/flows/{flow-id-b}/{version-b}"
                .replaceAll("\\{" + "registry-id" + "\\}", apiClient.escapeString(registryId.toString()))
                .replaceAll("\\{" + "branch-id-a" + "\\}", apiClient.escapeString(branchIdA.toString()))
                .replaceAll("\\{" + "bucket-id-a" + "\\}", apiClient.escapeString(bucketIdA.toString()))
                .replaceAll("\\{" + "flow-id-a" + "\\}", apiClient.escapeString(flowIdA.toString()))
                .replaceAll("\\{" + "version-a" + "\\}", apiClient.escapeString(versionA.toString()))
                .replaceAll("\\{" + "branch-id-b" + "\\}", apiClient.escapeString(branchIdB.toString()))
                .replaceAll("\\{" + "bucket-id-b" + "\\}", apiClient.escapeString(bucketIdB.toString()))
                .replaceAll("\\{" + "flow-id-b" + "\\}", apiClient.escapeString(flowIdB.toString()))
                .replaceAll("\\{" + "version-b" + "\\}", apiClient.escapeString(versionB.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<FlowComparisonEntity> localVarReturnType = new GenericType<FlowComparisonEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the flow versions from the specified registry and bucket for the specified flow for the current user
     * 
     * @param registryId The registry client id. (required)
     * @param bucketId The bucket id. (required)
     * @param flowId The flow id. (required)
     * @param branch The name of a branch to get the flow versions from. If not specified the default branch of the registry client will be used. (optional)
     * @return VersionedFlowSnapshotMetadataSetEntity
     * @throws ApiException if fails to make API call
     */
    public VersionedFlowSnapshotMetadataSetEntity getVersions(String registryId, String bucketId, String flowId, String branch) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'registryId' is set
        if (registryId == null) {
            throw new ApiException(400, "Missing the required parameter 'registryId' when calling getVersions");
        }
        // verify the required parameter 'bucketId' is set
        if (bucketId == null) {
            throw new ApiException(400, "Missing the required parameter 'bucketId' when calling getVersions");
        }
        // verify the required parameter 'flowId' is set
        if (flowId == null) {
            throw new ApiException(400, "Missing the required parameter 'flowId' when calling getVersions");
        }
        // create path and map variables
        String localVarPath = "/flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions"
                .replaceAll("\\{" + "registry-id" + "\\}", apiClient.escapeString(registryId.toString()))
                .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
                .replaceAll("\\{" + "flow-id" + "\\}", apiClient.escapeString(flowId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<VersionedFlowSnapshotMetadataSetEntity> localVarReturnType = new GenericType<VersionedFlowSnapshotMetadataSetEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets configuration history
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param offset The offset into the result set. (required)
     * @param count The number of actions to return. (required)
     * @param sortColumn The field to sort on. (optional)
     * @param sortOrder The direction to sort. (optional)
     * @param startDate Include actions after this date. (optional)
     * @param endDate Include actions before this date. (optional)
     * @param userIdentity Include actions performed by this user. (optional)
     * @param sourceId Include actions on this component. (optional)
     * @return HistoryEntity
     * @throws ApiException if fails to make API call
     */
    public HistoryEntity queryHistory(IntegerParameter offset, IntegerParameter count, String sortColumn, String sortOrder, DateTimeParameter startDate, DateTimeParameter endDate, String userIdentity, String sourceId) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new ApiException(400, "Missing the required parameter 'offset' when calling queryHistory");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException(400, "Missing the required parameter 'count' when calling queryHistory");
        }
        // create path and map variables
        String localVarPath = "/flow/history";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortColumn", sortColumn));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userIdentity", userIdentity));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<HistoryEntity> localVarReturnType = new GenericType<HistoryEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Schedule or unschedule components in the specified Process Group.
     * 
     * @param body The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered. (required)
     * @param id The process group id. (required)
     * @return ScheduleComponentsEntity
     * @throws ApiException if fails to make API call
     */
    public ScheduleComponentsEntity scheduleComponents(ScheduleComponentsEntity body, String id) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling scheduleComponents");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling scheduleComponents");
        }
        // create path and map variables
        String localVarPath = "/flow/process-groups/{id}"
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

        GenericType<ScheduleComponentsEntity> localVarReturnType = new GenericType<ScheduleComponentsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Searches the cluster for a node with the specified address
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param q Node address to search for. (required)
     * @return ClusterSearchResultsEntity
     * @throws ApiException if fails to make API call
     */
    public ClusterSearchResultsEntity searchCluster(String q) throws ApiException {
        Object localVarPostBody = null;
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException(400, "Missing the required parameter 'q' when calling searchCluster");
        }
        // create path and map variables
        String localVarPath = "/flow/cluster/search-results";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<ClusterSearchResultsEntity> localVarReturnType = new GenericType<ClusterSearchResultsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Performs a search against this NiFi using the specified search term
     * Only search results from authorized components will be returned.
     * @param q  (optional)
     * @param a  (optional)
     * @return SearchResultsEntity
     * @throws ApiException if fails to make API call
     */
    public SearchResultsEntity searchFlow(String q, String a) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/flow/search-results";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "a", a));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<SearchResultsEntity> localVarReturnType = new GenericType<SearchResultsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
