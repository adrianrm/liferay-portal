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

package com.liferay.portlet.mobiledevicerules.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the m d r rule local service. This utility wraps {@link com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Edward C. Han
 * @see MDRRuleLocalService
 * @see com.liferay.portlet.mobiledevicerules.service.base.MDRRuleLocalServiceBaseImpl
 * @see com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleLocalServiceImpl
 * @generated
 */
public class MDRRuleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the m d r rule to the database. Also notifies the appropriate model listeners.
	*
	* @param mdrRule the m d r rule
	* @return the m d r rule that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule addMDRRule(
		com.liferay.portlet.mobiledevicerules.model.MDRRule mdrRule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMDRRule(mdrRule);
	}

	/**
	* Creates a new m d r rule with the primary key. Does not add the m d r rule to the database.
	*
	* @param ruleId the primary key for the new m d r rule
	* @return the new m d r rule
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule createMDRRule(
		long ruleId) {
		return getService().createMDRRule(ruleId);
	}

	/**
	* Deletes the m d r rule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ruleId the primary key of the m d r rule
	* @throws PortalException if a m d r rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteMDRRule(long ruleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteMDRRule(ruleId);
	}

	/**
	* Deletes the m d r rule from the database. Also notifies the appropriate model listeners.
	*
	* @param mdrRule the m d r rule
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteMDRRule(
		com.liferay.portlet.mobiledevicerules.model.MDRRule mdrRule)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteMDRRule(mdrRule);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the m d r rule with the primary key.
	*
	* @param ruleId the primary key of the m d r rule
	* @return the m d r rule
	* @throws PortalException if a m d r rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule getMDRRule(
		long ruleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMDRRule(ruleId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the m d r rule with the UUID in the group.
	*
	* @param uuid the UUID of m d r rule
	* @param groupId the group id of the m d r rule
	* @return the m d r rule
	* @throws PortalException if a m d r rule with the UUID in the group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule getMDRRuleByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMDRRuleByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the m d r rules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of m d r rules
	* @param end the upper bound of the range of m d r rules (not inclusive)
	* @return the range of m d r rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRule> getMDRRules(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMDRRules(start, end);
	}

	/**
	* Returns the number of m d r rules.
	*
	* @return the number of m d r rules
	* @throws SystemException if a system exception occurred
	*/
	public static int getMDRRulesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMDRRulesCount();
	}

	/**
	* Updates the m d r rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mdrRule the m d r rule
	* @return the m d r rule that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule updateMDRRule(
		com.liferay.portlet.mobiledevicerules.model.MDRRule mdrRule)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMDRRule(mdrRule);
	}

	/**
	* Updates the m d r rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mdrRule the m d r rule
	* @param merge whether to merge the m d r rule with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the m d r rule that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.mobiledevicerules.model.MDRRule updateMDRRule(
		com.liferay.portlet.mobiledevicerules.model.MDRRule mdrRule,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMDRRule(mdrRule, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static MDRRuleLocalService getService() {
		if (_service == null) {
			_service = (MDRRuleLocalService)PortalBeanLocatorUtil.locate(MDRRuleLocalService.class.getName());

			ReferenceRegistry.registerReference(MDRRuleLocalServiceUtil.class,
				"_service");
			MethodCache.remove(MDRRuleLocalService.class);
		}

		return _service;
	}

	public void setService(MDRRuleLocalService service) {
		MethodCache.remove(MDRRuleLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(MDRRuleLocalServiceUtil.class,
			"_service");
		MethodCache.remove(MDRRuleLocalService.class);
	}

	private static MDRRuleLocalService _service;
}