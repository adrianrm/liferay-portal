/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portlet.shopping.order.checkoutorderbillingcitynull;

import com.liferay.portalweb.portal.BaseTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class CheckoutOrderBillingCityNullTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTestSuite(AddPageShoppingTest.class);
		testSuite.addTestSuite(AddPortletShoppingTest.class);
		testSuite.addTestSuite(AddCategoryTest.class);
		testSuite.addTestSuite(AddCategoryItemTest.class);
		testSuite.addTestSuite(CheckoutOrderBillingCityNullTest.class);
		testSuite.addTestSuite(AddToShoppingCartCategoryItemTest.class);
		testSuite.addTestSuite(TearDownCartTest.class);
		testSuite.addTestSuite(TearDownShoppingCategoryTest.class);
		testSuite.addTestSuite(TearDownPageTest.class);

		return testSuite;
	}

}