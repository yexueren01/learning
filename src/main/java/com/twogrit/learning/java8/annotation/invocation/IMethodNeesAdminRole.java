package com.twogrit.learning.java8.annotation.invocation;

/**
 * Created by kezhang on 17/1/19.
 */
public interface IMethodNeesAdminRole {
    @RequiredRoles("admin")
    String invoke(Role role);
}
