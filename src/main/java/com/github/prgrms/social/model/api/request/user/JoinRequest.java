package com.github.prgrms.social.model.api.request.user;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class JoinRequest {

    private String name;

    private String principal;

    private String credentials;

    protected JoinRequest() {}

    public String getName() {
        return name;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getCredentials() {
        return credentials;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", name)
                .append("principal", principal)
                .append("credentials", credentials)
                .toString();
    }

}
