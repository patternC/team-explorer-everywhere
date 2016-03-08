// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildServiceHostUpdate;
import ms.tfs.build.buildservice._04._BuildServiceHostUpdateOptions;

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
public class _BuildServiceHostUpdateOptions
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String uri;
    protected _BuildServiceHostUpdate fields = new _BuildServiceHostUpdate(
                new _BuildServiceHostUpdate._BuildServiceHostUpdate_Flag[]
                {
                    _BuildServiceHostUpdate._BuildServiceHostUpdate_Flag.None
                });
    protected String name;
    protected String baseUrl;
    protected boolean requireClientCertificates;

    // No elements    
    public _BuildServiceHostUpdateOptions()
    {
        super();
    }

    public _BuildServiceHostUpdateOptions(
        final String uri,
        final _BuildServiceHostUpdate fields,
        final String name,
        final String baseUrl,
        final boolean requireClientCertificates)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUri(uri);
        setFields(fields);
        setName(name);
        setBaseUrl(baseUrl);
        setRequireClientCertificates(requireClientCertificates);
    }

    public String getUri()
    {
        return this.uri;
    }

    public void setUri(final String value)
    {
        this.uri = value;
    }

    public _BuildServiceHostUpdate getFields()
    {
        return this.fields;
    }

    public void setFields(final _BuildServiceHostUpdate value)
    {
        this.fields = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getBaseUrl()
    {
        return this.baseUrl;
    }

    public void setBaseUrl(final String value)
    {
        this.baseUrl = value;
    }

    public boolean isRequireClientCertificates()
    {
        return this.requireClientCertificates;
    }

    public void setRequireClientCertificates(final boolean value)
    {
        this.requireClientCertificates = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Uri",
            this.uri);

        if (this.fields != null)
        {
            this.fields.writeAsAttribute(
                writer,
                "Fields");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "BaseUrl",
            this.baseUrl);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "RequireClientCertificates",
            this.requireClientCertificates);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("Uri"))
            {
                this.uri = attributeValue;
            }
            else if (localName.equalsIgnoreCase("Fields"))
            {
                this.fields = new _BuildServiceHostUpdate();
                this.fields.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("Name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("BaseUrl"))
            {
                this.baseUrl = attributeValue;
            }
            else if (localName.equalsIgnoreCase("RequireClientCertificates"))
            {
                this.requireClientCertificates = XMLConvert.toBoolean(attributeValue);
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}