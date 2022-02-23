// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.RoleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeProfileResponse {
    /**
     * The list of roles in the cluster.
     * 
     */
    private final @Nullable List<RoleResponse> roles;

    @OutputCustomType.Constructor({"roles"})
    private ComputeProfileResponse(@Nullable List<RoleResponse> roles) {
        this.roles = roles;
    }

    /**
     * The list of roles in the cluster.
     * 
     */
    public List<RoleResponse> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RoleResponse> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
        }

        public Builder setRoles(@Nullable List<RoleResponse> roles) {
            this.roles = roles;
            return this;
        }
        public ComputeProfileResponse build() {
            return new ComputeProfileResponse(roles);
        }
    }
}
