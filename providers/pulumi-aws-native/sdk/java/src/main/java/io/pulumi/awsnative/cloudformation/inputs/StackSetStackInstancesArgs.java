// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.awsnative.cloudformation.inputs.StackSetDeploymentTargetsArgs;
import io.pulumi.awsnative.cloudformation.inputs.StackSetParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Stack instances in some specific accounts and Regions.
 * 
 */
public final class StackSetStackInstancesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetStackInstancesArgs Empty = new StackSetStackInstancesArgs();

    @InputImport(name="deploymentTargets", required=true)
        private final Input<StackSetDeploymentTargetsArgs> deploymentTargets;

    public Input<StackSetDeploymentTargetsArgs> getDeploymentTargets() {
        return this.deploymentTargets;
    }

    /**
     * A list of stack set parameters whose values you want to override in the selected stack instances.
     * 
     */
    @InputImport(name="parameterOverrides")
        private final @Nullable Input<List<StackSetParameterArgs>> parameterOverrides;

    public Input<List<StackSetParameterArgs>> getParameterOverrides() {
        return this.parameterOverrides == null ? Input.empty() : this.parameterOverrides;
    }

    /**
     * The names of one or more Regions where you want to create stack instances using the specified AWS account(s).
     * 
     */
    @InputImport(name="regions", required=true)
        private final Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions;
    }

    public StackSetStackInstancesArgs(
        Input<StackSetDeploymentTargetsArgs> deploymentTargets,
        @Nullable Input<List<StackSetParameterArgs>> parameterOverrides,
        Input<List<String>> regions) {
        this.deploymentTargets = Objects.requireNonNull(deploymentTargets, "expected parameter 'deploymentTargets' to be non-null");
        this.parameterOverrides = parameterOverrides;
        this.regions = Objects.requireNonNull(regions, "expected parameter 'regions' to be non-null");
    }

    private StackSetStackInstancesArgs() {
        this.deploymentTargets = Input.empty();
        this.parameterOverrides = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetStackInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<StackSetDeploymentTargetsArgs> deploymentTargets;
        private @Nullable Input<List<StackSetParameterArgs>> parameterOverrides;
        private Input<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetStackInstancesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentTargets = defaults.deploymentTargets;
    	      this.parameterOverrides = defaults.parameterOverrides;
    	      this.regions = defaults.regions;
        }

        public Builder setDeploymentTargets(Input<StackSetDeploymentTargetsArgs> deploymentTargets) {
            this.deploymentTargets = Objects.requireNonNull(deploymentTargets);
            return this;
        }

        public Builder setDeploymentTargets(StackSetDeploymentTargetsArgs deploymentTargets) {
            this.deploymentTargets = Input.of(Objects.requireNonNull(deploymentTargets));
            return this;
        }

        public Builder setParameterOverrides(@Nullable Input<List<StackSetParameterArgs>> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }

        public Builder setParameterOverrides(@Nullable List<StackSetParameterArgs> parameterOverrides) {
            this.parameterOverrides = Input.ofNullable(parameterOverrides);
            return this;
        }

        public Builder setRegions(Input<List<String>> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }

        public Builder setRegions(List<String> regions) {
            this.regions = Input.of(Objects.requireNonNull(regions));
            return this;
        }
        public StackSetStackInstancesArgs build() {
            return new StackSetStackInstancesArgs(deploymentTargets, parameterOverrides, regions);
        }
    }
}
