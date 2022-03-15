// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupDeploymentStyle {
    /**
     * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
     * 
     */
    private final @Nullable String deploymentOption;
    /**
     * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
     * 
     */
    private final @Nullable String deploymentType;

    @CustomType.Constructor
    private DeploymentGroupDeploymentStyle(
        @CustomType.Parameter("deploymentOption") @Nullable String deploymentOption,
        @CustomType.Parameter("deploymentType") @Nullable String deploymentType) {
        this.deploymentOption = deploymentOption;
        this.deploymentType = deploymentType;
    }

    /**
     * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
     * 
    */
    public Optional<String> getDeploymentOption() {
        return Optional.ofNullable(this.deploymentOption);
    }
    /**
     * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
     * 
    */
    public Optional<String> getDeploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupDeploymentStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deploymentOption;
        private @Nullable String deploymentType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupDeploymentStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentOption = defaults.deploymentOption;
    	      this.deploymentType = defaults.deploymentType;
        }

        public Builder deploymentOption(@Nullable String deploymentOption) {
            this.deploymentOption = deploymentOption;
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }
        public DeploymentGroupDeploymentStyle build() {
            return new DeploymentGroupDeploymentStyle(deploymentOption, deploymentType);
        }
    }
}
