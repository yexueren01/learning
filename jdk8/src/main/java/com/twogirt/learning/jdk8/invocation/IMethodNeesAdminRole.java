package com.twogirt.learning.jdk8.invocation;

/**
 * Created by kezhang on 17/1/19.
 */
public interface IMethodNeesAdminRole {
    @RequiredRoles("admin")
    String invoke(Role role);
}
