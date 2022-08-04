package com.reeneev.security.repository;

import com.reeneev.security.model.Role;

public interface RoleRepository {
    Role getRoleById(String id);

    Role getRoleByName(String name);

    void save(Role role);
}
