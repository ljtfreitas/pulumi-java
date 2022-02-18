// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RoleSinkInfoResponse {
    /**
     * Compute role ID.
     * 
     */
    private final String roleId;

    @OutputCustomType.Constructor({"roleId"})
    private RoleSinkInfoResponse(String roleId) {
        this.roleId = Objects.requireNonNull(roleId);
    }

    /**
     * Compute role ID.
     * 
     */
    public String getRoleId() {
        return this.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleSinkInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleSinkInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleId = defaults.roleId;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }

        public RoleSinkInfoResponse build() {
            return new RoleSinkInfoResponse(roleId);
        }
    }
}
