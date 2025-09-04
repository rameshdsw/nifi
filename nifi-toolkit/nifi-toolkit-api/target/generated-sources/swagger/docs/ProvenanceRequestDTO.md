# ProvenanceRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterNodeId** | **String** | The id of the node in the cluster where this provenance originated. |  [optional]
**endDate** | **String** | The latest event time to include in the query. |  [optional]
**incrementalResults** | **Boolean** | Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default. |  [optional]
**maxResults** | **Integer** | The maximum number of results to include. |  [optional]
**maximumFileSize** | **String** | The maximum file size to include in the query. |  [optional]
**minimumFileSize** | **String** | The minimum file size to include in the query. |  [optional]
**searchTerms** | [**Map&lt;String, ProvenanceSearchValueDTO&gt;**](ProvenanceSearchValueDTO.md) | The search terms used to perform the search. |  [optional]
**startDate** | **String** | The earliest event time to include in the query. |  [optional]
**summarize** | **Boolean** | Whether or not to summarize provenance events returned. This property is false by default. |  [optional]
