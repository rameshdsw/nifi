package org.apache.nifi.api.toolkit.api;//jersey3

import org.apache.nifi.api.toolkit.ApiException;
import org.apache.nifi.api.toolkit.ApiClient;
import org.apache.nifi.api.toolkit.Configuration;
import org.apache.nifi.api.toolkit.Pair;

import jakarta.ws.rs.core.GenericType;

import org.apache.nifi.api.toolkit.model.StreamingOutput;
import org.apache.nifi.api.toolkit.model.TransactionResultEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-09-03T13:15:23.252321740+05:30[Asia/Kolkata]")
public class DataTransferApi {
    private ApiClient apiClient;

    public DataTransferApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataTransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Commit or cancel the specified transaction
     * 
     * @param responseCode The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). (required)
     * @param portId The input port id. (required)
     * @param transactionId The transaction id. (required)
     * @param body  (optional)
     * @return TransactionResultEntity
     * @throws ApiException if fails to make API call
     */
    public TransactionResultEntity commitInputPortTransaction(Integer responseCode, String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'responseCode' is set
        if (responseCode == null) {
            throw new ApiException(400, "Missing the required parameter 'responseCode' when calling commitInputPortTransaction");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling commitInputPortTransaction");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling commitInputPortTransaction");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/input-ports/{portId}/transactions/{transactionId}"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "responseCode", responseCode));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/octet-stream"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<TransactionResultEntity> localVarReturnType = new GenericType<TransactionResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Commit or cancel the specified transaction
     * 
     * @param responseCode The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). (required)
     * @param checksum A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side. (required)
     * @param portId The output port id. (required)
     * @param transactionId The transaction id. (required)
     * @param body  (optional)
     * @return TransactionResultEntity
     * @throws ApiException if fails to make API call
     */
    public TransactionResultEntity commitOutputPortTransaction(Integer responseCode, String checksum, String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'responseCode' is set
        if (responseCode == null) {
            throw new ApiException(400, "Missing the required parameter 'responseCode' when calling commitOutputPortTransaction");
        }
        // verify the required parameter 'checksum' is set
        if (checksum == null) {
            throw new ApiException(400, "Missing the required parameter 'checksum' when calling commitOutputPortTransaction");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling commitOutputPortTransaction");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling commitOutputPortTransaction");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/output-ports/{portId}/transactions/{transactionId}"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "responseCode", responseCode));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checksum", checksum));


        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/octet-stream"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<TransactionResultEntity> localVarReturnType = new GenericType<TransactionResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a transaction to the specified output port or input port
     * 
     * @param portType The port type. (required)
     * @param portId  (required)
     * @param body  (optional)
     * @return TransactionResultEntity
     * @throws ApiException if fails to make API call
     */
    public TransactionResultEntity createPortTransaction(String portType, String portId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'portType' is set
        if (portType == null) {
            throw new ApiException(400, "Missing the required parameter 'portType' when calling createPortTransaction");
        }
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling createPortTransaction");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/{portType}/{portId}/transactions"
                .replaceAll("\\{" + "portType" + "\\}", apiClient.escapeString(portType.toString()))
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<TransactionResultEntity> localVarReturnType = new GenericType<TransactionResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Extend transaction TTL
     * 
     * @param portId  (required)
     * @param transactionId  (required)
     * @param body  (optional)
     * @return TransactionResultEntity
     * @throws ApiException if fails to make API call
     */
    public TransactionResultEntity extendInputPortTransactionTTL(String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling extendInputPortTransactionTTL");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling extendInputPortTransactionTTL");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/input-ports/{portId}/transactions/{transactionId}"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<TransactionResultEntity> localVarReturnType = new GenericType<TransactionResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Extend transaction TTL
     * 
     * @param portId  (required)
     * @param transactionId  (required)
     * @param body  (optional)
     * @return TransactionResultEntity
     * @throws ApiException if fails to make API call
     */
    public TransactionResultEntity extendOutputPortTransactionTTL(String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling extendOutputPortTransactionTTL");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling extendOutputPortTransactionTTL");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/output-ports/{portId}/transactions/{transactionId}"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<TransactionResultEntity> localVarReturnType = new GenericType<TransactionResultEntity>() {};
        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Transfer flow files to the input port
     * 
     * @param portId The input port id. (required)
     * @param transactionId  (required)
     * @param body  (optional)
     * @return String
     * @throws ApiException if fails to make API call
     */
    public String receiveFlowFiles(String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling receiveFlowFiles");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling receiveFlowFiles");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "application/octet-stream"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        GenericType<String> localVarReturnType = new GenericType<String>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Transfer flow files from the output port
     * 
     * @param portId The output port id. (required)
     * @param transactionId  (required)
     * @param body  (optional)
     * @throws ApiException if fails to make API call
     */
    public void transferFlowFiles(String portId, String transactionId, Object body) throws ApiException {
        Object localVarPostBody = body;
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException(400, "Missing the required parameter 'portId' when calling transferFlowFiles");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException(400, "Missing the required parameter 'transactionId' when calling transferFlowFiles");
        }
        // create path and map variables
        String localVarPath = "/data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files"
                .replaceAll("\\{" + "portId" + "\\}", apiClient.escapeString(portId.toString()))
                .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();



        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }
}
