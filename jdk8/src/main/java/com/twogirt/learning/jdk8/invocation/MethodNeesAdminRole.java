package com.twogirt.learning.jdk8.invocation;


/**
 * Created by kezhang on 17/1/19.
 */
public class MethodNeesAdminRole  implements IMethodNeesAdminRole{

    public MethodNeesAdminRole() {
    }


    @RequiredRoles("admin")
    @Override
    public String invoke(Role role) {
        return "done";
    }
}
