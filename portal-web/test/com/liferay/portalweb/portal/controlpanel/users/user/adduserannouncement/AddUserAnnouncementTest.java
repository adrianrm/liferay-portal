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

package com.liferay.portalweb.portal.controlpanel.users.user.adduserannouncement;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserAnnouncementTest extends BaseTestCase {
	public void testAddUserAnnouncement() throws Exception {
		selenium.open("/web/guest/home/");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("link=Control Panel")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.clickAt("link=Users and Organizations",
			RuntimeVariables.replace("Users and Organizations"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.type("//input[@id='_125_keywords']",
			RuntimeVariables.replace("selen01"));
		selenium.saveScreenShotAndSource();
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();
		selenium.clickAt("//td[2]/a", RuntimeVariables.replace("User Name"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//a[@id='_125_announcementsLink']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isPartialText("//a[@id='_125_announcementsLink']",
				"Announcements"));
		selenium.clickAt("//a[@id='_125_announcementsLink']",
			RuntimeVariables.replace("Announcements"));
		selenium.clickAt("//input[@id='_125_announcementsTypegeneralEmailCheckbox']",
			RuntimeVariables.replace("General Email Checkbox"));
		selenium.uncheck(
			"//input[@id='_125_announcementsTypegeneralSmsCheckbox']");
		selenium.uncheck(
			"//input[@id='_125_announcementsTypenewsEmailCheckbox']");
		selenium.clickAt("//input[@id='_125_announcementsTypenewsSmsCheckbox']",
			RuntimeVariables.replace("News SMS Checkbox"));
		selenium.clickAt("//input[@id='_125_announcementsTypetestEmailCheckbox']",
			RuntimeVariables.replace("Test Email Checkbox"));
		selenium.uncheck("//input[@id='_125_announcementsTypetestSmsCheckbox']");
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		selenium.saveScreenShotAndSource();

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("//div[@class='portlet-msg-success']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.saveScreenShotAndSource();
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertTrue(selenium.isChecked(
				"//input[@id='_125_announcementsTypegeneralEmailCheckbox']"));
		selenium.saveScreenShotAndSource();
		assertFalse(selenium.isChecked(
				"//input[@id='_125_announcementsTypegeneralSmsCheckbox']"));
		selenium.saveScreenShotAndSource();
		assertFalse(selenium.isChecked(
				"//input[@id='_125_announcementsTypenewsEmailCheckbox']"));
		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isChecked(
				"//input[@id='_125_announcementsTypenewsSmsCheckbox']"));
		selenium.saveScreenShotAndSource();
		assertTrue(selenium.isChecked(
				"//input[@id='_125_announcementsTypetestEmailCheckbox']"));
		selenium.saveScreenShotAndSource();
		assertFalse(selenium.isChecked(
				"//input[@id='_125_announcementsTypetestSmsCheckbox']"));
		selenium.saveScreenShotAndSource();
	}
}