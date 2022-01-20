package web.repository;

import web.model.Role;

public interface RoleDao {
    public Role getRoleByName(String name);
}
