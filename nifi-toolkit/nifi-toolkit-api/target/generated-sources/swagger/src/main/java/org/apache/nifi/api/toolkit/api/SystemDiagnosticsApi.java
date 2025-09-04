package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.JmxMetricsResultsEntity;
import org.apache.nifi.api.toolkit.model.SystemDiagnosticsEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class SystemDiagnosticsApi {
    private ApiClient apiClient;

    public SystemDiagnosticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemDiagnosticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve available JMX metrics
     * Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.
     * @param beanNameFilter Regular Expression Pattern to be applied against the ObjectName (optional)
     * @return JmxMetricsResultsEntity
     * @throws ApiException if fails to make API call
     */
    public JmxMetricsResultsEntity getJmxMetrics(String beanNameFilter) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/system-diagnostics/jmx-metrics";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "beanNameFilter", beanNameFilter));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<JmxMetricsResultsEntity> localVarReturnType = new GenericType<JmxMetricsResultsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Gets the diagnostics for the system NiFi is running on
     * 
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param diagnosticLevel Whether or not to include verbose details. Optional, defaults to false (optional, default to BASIC)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return SystemDiagnosticsEntity
     * @throws ApiException if fails to make API call
     */
    public SystemDiagnosticsEntity getSystemDiagnostics(Boolean nodewise, String diagnosticLevel, String clusterNodeId) throws ApiException {
        Object localVarPostBody = null;
        // create path and map variables
        String localVarPath = "/system-diagnostics";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodewise", nodewise));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "diagnosticLevel", diagnosticLevel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clusterNodeId", clusterNodeId));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<SystemDiagnosticsEntity> localVarReturnType = new GenericType<SystemDiagnosticsEntity>() {};
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
