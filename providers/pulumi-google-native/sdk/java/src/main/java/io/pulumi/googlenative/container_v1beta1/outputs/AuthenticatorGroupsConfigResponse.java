// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AuthenticatorGroupsConfigResponse {
    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    private final Boolean enabled;
    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    private final String securityGroup;

    @CustomType.Constructor
    private AuthenticatorGroupsConfigResponse(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("securityGroup") String securityGroup) {
        this.enabled = enabled;
        this.securityGroup = securityGroup;
    }

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
    */
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticatorGroupsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticatorGroupsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder securityGroup(String securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }
        public AuthenticatorGroupsConfigResponse build() {
            return new AuthenticatorGroupsConfigResponse(enabled, securityGroup);
        }
    }
}
