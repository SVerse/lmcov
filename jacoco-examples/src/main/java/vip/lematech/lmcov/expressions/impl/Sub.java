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
package vip.lematech.lmcov.expressions.impl;

import vip.lematech.lmcov.expressions.service.IExpression;

public class Sub implements IExpression {

	private final IExpression l;

	private final IExpression r;

	public Sub(final IExpression l, final IExpression r) {
		this.l = l;
		this.r = r;
	}

	public double evaluate() {
		return l.evaluate() - r.evaluate();
	}

}