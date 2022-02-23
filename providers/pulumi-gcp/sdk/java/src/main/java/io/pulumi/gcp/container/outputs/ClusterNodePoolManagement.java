// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNodePoolManagement {
    private final @Nullable Boolean autoRepair;
    private final @Nullable Boolean autoUpgrade;

    @OutputCustomType.Constructor({"autoRepair","autoUpgrade"})
    private ClusterNodePoolManagement(
        @Nullable Boolean autoRepair,
        @Nullable Boolean autoUpgrade) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
    }

    public Optional<Boolean> getAutoRepair() {
        return Optional.ofNullable(this.autoRepair);
    }
    public Optional<Boolean> getAutoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoRepair;
        private @Nullable Boolean autoUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
        }

        public Builder setAutoRepair(@Nullable Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }

        public Builder setAutoUpgrade(@Nullable Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public ClusterNodePoolManagement build() {
            return new ClusterNodePoolManagement(autoRepair, autoUpgrade);
        }
    }
}
