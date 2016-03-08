// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;

import ms.tfs.workitemtracking.clientservices._03._AccessControlEntryData;
import ms.tfs.workitemtracking.clientservices._03._AccessControlEntryExtendedData;
import ms.tfs.workitemtracking.clientservices._03._AccessControlListMetadata;
import ms.tfs.workitemtracking.clientservices._03._ArtifactWorkItemIds;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_BulkUpdate;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_BulkUpdateResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetChangedWorkItemIds;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetChangedWorkItemIdsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetDestroyedWorkItemIds;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetDestroyedWorkItemIdsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetMetadataEx2;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetMetadataEx2Response;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetReferencingWorkitemUris;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetReferencingWorkitemUrisResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueries;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueriesResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQuery;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueryItemAccessControlList;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueryItemAccessControlListResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueryItems;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueryItemsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetStoredQueryResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItem;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItemIdsForArtifactUris;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItemIdsForArtifactUrisResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItemLinkChanges;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItemLinkChangesResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkItemResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkitemTrackingVersion;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_GetWorkitemTrackingVersionResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageItemsOnBehalfOf;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageItemsOnBehalfOfResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageWorkitemsByIdRevs;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageWorkitemsByIdRevsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageWorkitemsByIds;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_PageWorkitemsByIdsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemCount;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemCountOnBehalfOf;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemCountOnBehalfOfResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemCountResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitems;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_QueryWorkitemsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_RequestCancel;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_RequestCancelResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_StampWorkitemCache;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_StampWorkitemCacheResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncAccessControlLists;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncAccessControlListsResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncBisGroupsAndUsers;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncBisGroupsAndUsersResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncExternalStructures;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_SyncExternalStructuresResponse;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_Update;
import ms.tfs.workitemtracking.clientservices._03._ClientService4Soap_UpdateResponse;
import ms.tfs.workitemtracking.clientservices._03._ExtendedAccessControlListData;
import ms.tfs.workitemtracking.clientservices._03._IdRevisionPair;
import ms.tfs.workitemtracking.clientservices._03._IdentityDescriptorData;
import ms.tfs.workitemtracking.clientservices._03._MetadataTableHaveEntry;
import ms.tfs.workitemtracking.clientservices._03._QuerySortOrderEntry;
import ms.tfs.workitemtracking.clientservices._03._RequiredPermissions;
import ms.tfs.workitemtracking.clientservices._03._WorkItemId;
import ms.tfs.workitemtracking.clientservices._03._WorkItemLinkChange;

import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/WorkItemTracking/ClientServices/03}ClientService4Soap
 */
public interface _ClientService4Soap
{
    public _ArtifactWorkItemIds[] getWorkItemIdsForArtifactUris(
        final String[] artifactUris,
        final Calendar asOfDate)
        throws TransportException, SOAPFault;

    public _WorkItemId[] getDestroyedWorkItemIds(final long rowVersion)
        throws TransportException, SOAPFault;

    public _WorkItemId[] getChangedWorkItemIds(final long rowVersion)
        throws TransportException, SOAPFault;

    public _WorkItemLinkChange[] getWorkItemLinkChanges(final long rowVersion)
        throws TransportException, SOAPFault;

    public _ExtendedAccessControlListData getStoredQueryItemAccessControlList(
        final String queryItemId,
        final boolean getMetadata)
        throws TransportException, SOAPFault;

    public AnyContentType getStoredQueryItems(
        final long rowVersion,
        final int projectId,
        final AnyContentType _out_queryItemsPayload)
        throws TransportException, SOAPFault;

    public String getWorkitemTrackingVersion()
        throws TransportException, SOAPFault;

    public void stampWorkitemCache()
        throws TransportException, SOAPFault;

    public String[] getReferencingWorkitemUris(final String artifactUri)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_GetWorkItemResponse getWorkItem(
        final int workItemId,
        final int revisionId,
        final int minimumRevisionId,
        final Calendar asOfDate,
        final boolean useMaster,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_workItem,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_QueryWorkitemsResponse queryWorkitems(
        final AnyContentType psQuery,
        final _QuerySortOrderEntry[] sort,
        final boolean useMaster,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_resultIds,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_PageWorkitemsByIdsResponse pageWorkitemsByIds(
        final int[] ids,
        final String[] columns,
        final int[] longTextColumns,
        final Calendar asOfDate,
        final boolean useMaster,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_items,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_PageWorkitemsByIdRevsResponse pageWorkitemsByIdRevs(
        final _IdRevisionPair[] pairs,
        final String[] columns,
        final int[] longTextColumns,
        final Calendar asOfDate,
        final boolean useMaster,
        final AnyContentType _out_items)
        throws TransportException, SOAPFault;

    public AnyContentType pageItemsOnBehalfOf(
        final String userName,
        final int[] ids,
        final String[] columns,
        final AnyContentType _out_items)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_QueryWorkitemCountResponse queryWorkitemCount(
        final AnyContentType psQuery,
        final boolean useMaster,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public int queryWorkitemCountOnBehalfOf(
        final String userName,
        final AnyContentType query)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_GetMetadataEx2Response getMetadataEx2(
        final _MetadataTableHaveEntry[] metadataHave,
        final boolean useMaster,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_UpdateResponse update(
        final AnyContentType _package,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_result,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public _ClientService4Soap_BulkUpdateResponse bulkUpdate(
        final AnyContentType _package,
        final _MetadataTableHaveEntry[] metadataHave,
        final AnyContentType _out_result,
        final AnyContentType _out_metadata)
        throws TransportException, SOAPFault;

    public AnyContentType getStoredQuery(
        final String queryId,
        final AnyContentType _out_queryPayload)
        throws TransportException, SOAPFault;

    public AnyContentType getStoredQueries(
        final long rowVersion,
        final int projectId,
        final AnyContentType _out_queriesPayload)
        throws TransportException, SOAPFault;

    public void syncExternalStructures(final String projectURI)
        throws TransportException, SOAPFault;

    public void syncAccessControlLists(final String projectURI)
        throws TransportException, SOAPFault;

    public void syncBisGroupsAndUsers(final String projectUri)
        throws TransportException, SOAPFault;

    public void requestCancel(final String requestIdToCancel)
        throws TransportException, SOAPFault;
}