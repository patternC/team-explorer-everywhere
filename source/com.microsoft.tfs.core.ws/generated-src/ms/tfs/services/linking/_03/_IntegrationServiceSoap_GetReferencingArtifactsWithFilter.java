// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.linking._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.linking._03._FilterType;
import ms.tfs.services.linking._03._IntegrationServiceSoap_GetReferencingArtifactsWithFilter;
import ms.tfs.services.linking._03._LinkFilter;

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
public class _IntegrationServiceSoap_GetReferencingArtifactsWithFilter
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String[] uriList;
    protected _LinkFilter[] filters;

    public _IntegrationServiceSoap_GetReferencingArtifactsWithFilter()
    {
        super();
    }

    public _IntegrationServiceSoap_GetReferencingArtifactsWithFilter(
        final String[] uriList,
        final _LinkFilter[] filters)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUriList(uriList);
        setFilters(filters);
    }

    public String[] getUriList()
    {
        return this.uriList;
    }

    public void setUriList(String[] value)
    {
        this.uriList = value;
    }

    public _LinkFilter[] getFilters()
    {
        return this.filters;
    }

    public void setFilters(_LinkFilter[] value)
    {
        this.filters = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.uriList != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("uriList");

            for (int iterator0 = 0; iterator0 < this.uriList.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.uriList[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.filters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("filters");

            for (int iterator0 = 0; iterator0 < this.filters.length; iterator0++)
            {
                this.filters[iterator0].writeAsElement(
                    writer,
                    "LinkFilter");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
