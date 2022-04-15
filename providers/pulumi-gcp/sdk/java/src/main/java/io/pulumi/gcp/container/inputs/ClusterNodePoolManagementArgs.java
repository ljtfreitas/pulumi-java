// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolManagementArgs Empty = new ClusterNodePoolManagementArgs();

    @Import(name="autoRepair")
      private final @Nullable Output<Boolean> autoRepair;

    public Output<Boolean> autoRepair() {
        return this.autoRepair == null ? Codegen.empty() : this.autoRepair;
    }

    @Import(name="autoUpgrade")
      private final @Nullable Output<Boolean> autoUpgrade;

    public Output<Boolean> autoUpgrade() {
        return this.autoUpgrade == null ? Codegen.empty() : this.autoUpgrade;
    }

    public ClusterNodePoolManagementArgs(
        @Nullable Output<Boolean> autoRepair,
        @Nullable Output<Boolean> autoUpgrade) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
    }

    private ClusterNodePoolManagementArgs() {
        this.autoRepair = Codegen.empty();
        this.autoUpgrade = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoRepair;
        private @Nullable Output<Boolean> autoUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
        }

        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Builder autoRepair(@Nullable Boolean autoRepair) {
            this.autoRepair = Codegen.ofNullable(autoRepair);
            return this;
        }
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Builder autoUpgrade(@Nullable Boolean autoUpgrade) {
            this.autoUpgrade = Codegen.ofNullable(autoUpgrade);
            return this;
        }        public ClusterNodePoolManagementArgs build() {
            return new ClusterNodePoolManagementArgs(autoRepair, autoUpgrade);
        }
    }
}
