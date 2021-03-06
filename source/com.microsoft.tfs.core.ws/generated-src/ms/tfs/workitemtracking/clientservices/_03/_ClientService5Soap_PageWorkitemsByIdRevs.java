// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService5Soap_PageWorkitemsByIdRevs;
import ms.tfs.workitemtracking.clientservices._03._IdRevisionPair;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService5Soap_PageWorkitemsByIdRevs
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _IdRevisionPair[] pairs;
    protected String[] columns;
    protected int[] longTextColumns;
    protected Calendar asOfDate;
    protected boolean useMaster;

    public _ClientService5Soap_PageWorkitemsByIdRevs()
    {
        super();
    }

    public _ClientService5Soap_PageWorkitemsByIdRevs(
        final _IdRevisionPair[] pairs,
        final String[] columns,
        final int[] longTextColumns,
        final Calendar asOfDate,
        final boolean useMaster)
    {
        // TODO : Call super() instead of setting all fields directly?
        setPairs(pairs);
        setColumns(columns);
        setLongTextColumns(longTextColumns);
        setAsOfDate(asOfDate);
        setUseMaster(useMaster);
    }

    public _IdRevisionPair[] getPairs()
    {
        return this.pairs;
    }

    public void setPairs(_IdRevisionPair[] value)
    {
        this.pairs = value;
    }

    public String[] getColumns()
    {
        return this.columns;
    }

    public void setColumns(String[] value)
    {
        this.columns = value;
    }

    public int[] getLongTextColumns()
    {
        return this.longTextColumns;
    }

    public void setLongTextColumns(int[] value)
    {
        this.longTextColumns = value;
    }

    public Calendar getAsOfDate()
    {
        return this.asOfDate;
    }

    public void setAsOfDate(Calendar value)
    {
        this.asOfDate = value;
    }

    public boolean isUseMaster()
    {
        return this.useMaster;
    }

    public void setUseMaster(boolean value)
    {
        this.useMaster = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.pairs != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("pairs");

            for (int iterator0 = 0; iterator0 < this.pairs.length; iterator0++)
            {
                this.pairs[iterator0].writeAsElement(
                    writer,
                    "IdRevisionPair");
            }

            writer.writeEndElement();
        }

        if (this.columns != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("columns");

            for (int iterator0 = 0; iterator0 < this.columns.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.columns[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.longTextColumns != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("longTextColumns");

            for (int iterator0 = 0; iterator0 < this.longTextColumns.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "int",
                    this.longTextColumns[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "asOfDate",
            this.asOfDate,
            true);
        XMLStreamWriterHelper.writeElement(
            writer,
            "useMaster",
            this.useMaster);

        writer.writeEndElement();
    }
}
