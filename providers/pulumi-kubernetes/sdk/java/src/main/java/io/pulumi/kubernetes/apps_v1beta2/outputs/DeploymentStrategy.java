// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apps_v1beta2.outputs.RollingUpdateDeployment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentStrategy {
    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    private final @Nullable RollingUpdateDeployment rollingUpdate;
    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private DeploymentStrategy(
        @CustomType.Parameter("rollingUpdate") @Nullable RollingUpdateDeployment rollingUpdate,
        @CustomType.Parameter("type") @Nullable String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
    */
    public Optional<RollingUpdateDeployment> getRollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RollingUpdateDeployment rollingUpdate;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable RollingUpdateDeployment rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DeploymentStrategy build() {
            return new DeploymentStrategy(rollingUpdate, type);
        }
    }
}
