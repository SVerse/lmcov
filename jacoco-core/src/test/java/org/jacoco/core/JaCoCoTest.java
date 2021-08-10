/*******************************************************************************
 * Copyright (c) 2009, 2021 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for {@link JaCoCo}.
 */
public class JaCoCoTest {

	@Test
	public void testVERSION() {
		assertNotNull(JaCoCo.VERSION);
	}

	@Test
	public void testHOMEURL() {
		assertNotNull(JaCoCo.HOMEURL);
	}

	@Test
	public void testRUNTIMEPACKAGE() {
		assertNotNull(JaCoCo.RUNTIMEPACKAGE);
	}

}
