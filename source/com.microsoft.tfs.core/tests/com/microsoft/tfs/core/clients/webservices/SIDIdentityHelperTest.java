// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.webservices;

import com.microsoft.tfs.util.GUID;

import junit.framework.TestCase;

public class SIDIdentityHelperTest extends TestCase {
    public void testGetDomainSID() {
        // Results generated by calling .NET method with the expected values as
        // input

        // Test each byte position

        assertEquals(
            "S-1-9-1551374245-0-0-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-0-1", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000000000001")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-0-512", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000000000200")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-0-196608", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000000030000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-0-67108864", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000004000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-5-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-000500000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-1536-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0000-060000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-458752-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0007-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-0-134217728-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0000-0800-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-9-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0900-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-256-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0000-0001-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-131072-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0200-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-0-50331648-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000000-0003-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-4-0-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("04000000-0000-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-1280-0-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00050000-0000-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-393216-0-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000600-0000-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$
        assertEquals(
            "S-1-9-1551374245-117440512-0-0-0", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("00000007-0000-0000-0000-000000000000")).getSDDLForm()); //$NON-NLS-1$

        // Random numbers were the byte[] array input in .NET

        assertEquals(
            "S-1-9-1551374245-2532926414-2139718466-2571584343-3108136210", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("ce63f996-897f-4283-9947-4357b9426512")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-3189746718-1847005003-2247156791-2408657911", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("1eac1fbe-176e-4b0f-85f0-e4378f9133f7")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-2081801060-2798719553-2669464137-1053333936", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("64c3157c-d1a6-4112-9f1c-ca493ec899b0")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-331969299-2477268557-3141807433-1044389605", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("1373c913-a893-4d1e-bb44-2d493e401ee5")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-3482225347-2634135112-2996672446-3505595054", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("c38a8ecf-019d-48b6-b29d-97bed0f322ae")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-734076203-2942134343-2232920136-4205349387", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("2b1dc12b-5daf-4768-8517-a848faa88a0b")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-262470319-4013494337-2990265005-1397402158", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("affaa40f-39ef-4110-b23b-d2ad534aaa2e")).getSDDLForm()); //$NON-NLS-1$

        assertEquals(
            "S-1-9-1551374245-1888123732-3486504512-2297364973-4075647764", //$NON-NLS-1$
            SIDIdentityHelper.getDomainSID(new GUID("547b8a70-cfcf-40d6-88ef-01edf2ed7314")).getSDDLForm()); //$NON-NLS-1$
    }
}