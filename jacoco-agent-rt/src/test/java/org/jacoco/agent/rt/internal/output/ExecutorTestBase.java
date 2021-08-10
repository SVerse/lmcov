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
package org.jacoco.agent.rt.internal.output;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.*;

import static org.junit.Assert.fail;

/**
 * Unit tests base for tests that need an {@link Executor} for multithreaded
 * test scenarios.
 */
public abstract class ExecutorTestBase {

    protected ExecutorService executor;

    @Before
    public void setup() throws Exception {
        executor = Executors.newSingleThreadExecutor();
    }

    @After
    public void teardown() throws Exception {
        executor.shutdown();
    }

    /**
     * Asserts that the given future blocks.
     *
     * @param future future to test
     * @throws Exception
     */
    protected void assertBlocks(final Future<?> future) throws Exception {
        try {
            future.get(10, TimeUnit.MILLISECONDS);
            fail("Operation should block");
        } catch (TimeoutException e) {
        }
    }

}
