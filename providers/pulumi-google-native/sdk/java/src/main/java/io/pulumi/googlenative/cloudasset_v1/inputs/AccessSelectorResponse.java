// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies roles and/or permissions to analyze, to determine both the identities possessing them and the resources they control. If multiple values are specified, results will include roles or permissions matching any of them. The total number of roles and permissions should be equal or less than 10.
 * 
 */
public final class AccessSelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessSelectorResponse Empty = new AccessSelectorResponse();

    /**
     * Optional. The permissions to appear in result.
     * 
     */
    @InputImport(name="permissions", required=true)
      private final List<String> permissions;

    public List<String> getPermissions() {
        return this.permissions;
    }

    /**
     * Optional. The roles to appear in result.
     * 
     */
    @InputImport(name="roles", required=true)
      private final List<String> roles;

    public List<String> getRoles() {
        return this.roles;
    }

    public AccessSelectorResponse(
        List<String> permissions,
        List<String> roles) {
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
    }

    private AccessSelectorResponse() {
        this.permissions = List.of();
        this.roles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> permissions;
        private List<String> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.roles = defaults.roles;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setRoles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public AccessSelectorResponse build() {
            return new AccessSelectorResponse(permissions, roles);
        }
    }
}
