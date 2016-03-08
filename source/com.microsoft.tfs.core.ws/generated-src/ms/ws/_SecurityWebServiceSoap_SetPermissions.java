// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._AccessControlEntryDetails;
import ms.ws._AceExtendedInformation;
import ms.ws._IdentityDescriptor;
import ms.ws._SecurityWebServiceSoap_SetPermissions;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _SecurityWebServiceSoap_SetPermissions
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String namespaceId;
    protected String token;
    protected _AccessControlEntryDetails[] accessControlEntries;
    protected boolean merge;

    public _SecurityWebServiceSoap_SetPermissions()
    {
        super();
    }

    public _SecurityWebServiceSoap_SetPermissions(
        final String namespaceId,
        final String token,
        final _AccessControlEntryDetails[] accessControlEntries,
        final boolean merge)
    {
        // TODO : Call super() instead of setting all fields directly?
        setNamespaceId(namespaceId);
        setToken(token);
        setAccessControlEntries(accessControlEntries);
        setMerge(merge);
    }

    public String getNamespaceId()
    {
        return this.namespaceId;
    }

    public void setNamespaceId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'namespaceId' is a required element, its value cannot be null");
        }

        this.namespaceId = value;
    }

    public String getToken()
    {
        return this.token;
    }

    public void setToken(String value)
    {
        this.token = value;
    }

    public _AccessControlEntryDetails[] getAccessControlEntries()
    {
        return this.accessControlEntries;
    }

    public void setAccessControlEntries(_AccessControlEntryDetails[] value)
    {
        this.accessControlEntries = value;
    }

    public boolean isMerge()
    {
        return this.merge;
    }

    public void setMerge(boolean value)
    {
        this.merge = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "namespaceId",
            this.namespaceId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "token",
            this.token);

        if (this.accessControlEntries != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("accessControlEntries");

            for (int iterator0 = 0; iterator0 < this.accessControlEntries.length; iterator0++)
            {
                this.accessControlEntries[iterator0].writeAsElement(
                    writer,
                    "AccessControlEntryDetails");
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "merge",
            this.merge);

        writer.writeEndElement();
    }
}