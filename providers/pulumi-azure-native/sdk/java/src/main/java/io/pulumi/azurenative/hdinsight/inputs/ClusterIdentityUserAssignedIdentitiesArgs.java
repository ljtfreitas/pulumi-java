// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIdentityUserAssignedIdentitiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityUserAssignedIdentitiesArgs Empty = new ClusterIdentityUserAssignedIdentitiesArgs();

    /**
     * The tenant id of user assigned identity.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public ClusterIdentityUserAssignedIdentitiesArgs(@Nullable Input<String> tenantId) {
        this.tenantId = tenantId;
    }

    private ClusterIdentityUserAssignedIdentitiesArgs() {
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityUserAssignedIdentitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityUserAssignedIdentitiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public ClusterIdentityUserAssignedIdentitiesArgs build() {
            return new ClusterIdentityUserAssignedIdentitiesArgs(tenantId);
        }
    }
}
