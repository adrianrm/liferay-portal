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

package com.liferay.portalweb.stagingcommunity.documentlibrary.document.publishtolivenowdldocumentdocxnopagesdock;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class PublishToLiveNowDLDocumentDocxNoPagesDockTest extends BaseTestCase {
	public void testPublishToLiveNowDLDocumentDocxNoPagesDock()
		throws Exception {
		selenium.open("/web/community-name/");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("link=Document Library Test Page")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		selenium.clickAt("link=Document Library Test Page",
			RuntimeVariables.replace("Document Library Test Page"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isElementPresent(
				"//body[@class='blue live-view controls-visible signed-in public-page dockbar-ready']"));
		assertFalse(selenium.isElementPresent(
				"//body[@class='blue staging controls-visible signed-in public-page dockbar-ready']"));
		assertEquals(RuntimeVariables.replace(
				"There are no documents in this folder."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		assertFalse(selenium.isTextPresent("DL Document Title.docx"));
		selenium.clickAt("link=View Staged Page",
			RuntimeVariables.replace("View Staged Page"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.clickAt("link=Document Library Test Page",
			RuntimeVariables.replace("Document Library Test Page"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isElementPresent(
				"//body[@class='blue staging controls-visible signed-in public-page dockbar-ready']"));
		assertFalse(selenium.isElementPresent(
				"//body[@class='blue live-view controls-visible signed-in public-page dockbar-ready']"));
		assertEquals(RuntimeVariables.replace("DL Document Title.docx"),
			selenium.getText("//td[1]/a"));
		assertEquals(RuntimeVariables.replace("9.6k"),
			selenium.getText("//td[2]/a"));
		assertEquals(RuntimeVariables.replace("0"),
			selenium.getText("//td[3]/a"));
		assertEquals(RuntimeVariables.replace("No"),
			selenium.getText("//td[4]/a"));
		selenium.clickAt("link=Publish to Live Now",
			RuntimeVariables.replace("Publish to Live Now"));
		Thread.sleep(5000);

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//input[@value='Change Selection']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		selenium.clickAt("//input[@value='Change Selection']",
			RuntimeVariables.replace("Change Selection"));

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//div[@class='portlet-msg-info']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace(
				"Note that selecting no pages from the tree reverts to implicit selection of all pages."),
			selenium.getText("//div[@class='portlet-msg-info']"));
		selenium.clickAt("//li/div/div[1]",
			RuntimeVariables.replace("Drop Down Arrow"));

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//li/ul/li[1]/div/div[4]")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace("Document Library Test Page"),
			selenium.getText("//li/ul/li[1]/div/div[4]"));
		assertTrue(selenium.isElementPresent(
				"//div[@class='aui-helper-clearfix aui-tree-node-content aui-tree-data-content aui-tree-node-content aui-tree-node-io-content aui-tree-node-check-content aui-tree-node-task-content lfr-root-node aui-tree-node-selected aui-tree-expanded']"));
		assertTrue(selenium.isElementPresent(
				"//div[@class='aui-helper-clearfix aui-tree-node-content aui-tree-data-content aui-tree-node-content aui-tree-node-io-content aui-tree-node-check-content aui-tree-node-task-content aui-tree-collapsed']"));
		selenium.clickAt("//input[@value='Select']",
			RuntimeVariables.replace("Select"));
		Thread.sleep(5000);

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//div[@class='portlet-msg-info']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace(
				"There are no selected pages. All pages will therefore be exported."),
			selenium.getText("//div[@class='portlet-msg-info']"));

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//input[@value='Publish']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		selenium.click(RuntimeVariables.replace("//input[@value='Publish']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.getConfirmation()
						   .matches("^Are you sure you want to publish these pages[\\s\\S]$"));
		selenium.saveScreenShotAndSource();
	}
}