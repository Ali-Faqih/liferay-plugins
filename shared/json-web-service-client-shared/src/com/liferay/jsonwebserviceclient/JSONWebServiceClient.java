/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.jsonwebserviceclient;

import java.io.IOException;

import java.util.Map;

import javax.security.auth.login.CredentialException;

/**
 * @author Ivica Cardic
 * @author Igor Beslic
 */
public interface JSONWebServiceClient {

	public String doGet(String url, Map<String, String> parameters)
		throws CredentialException, IOException;

	public String doPost(String url, Map<String, String> parameters)
		throws CredentialException, IOException;

	public void resetHttpClient();

	public void setLogin(String login);

	public void setPassword(String password);

}