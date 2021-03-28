package com.app.service;

import com.app.pojos.Admin;

public interface IAdminService {

	public Admin authenticateAdmin(String email, String password);
}
