// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.awsnative.cloudformation.inputs.StackSetDeploymentTargets;
import io.pulumi.awsnative.cloudformation.inputs.StackSetParameter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackSetStackInstances extends io.pulumi.resources.InvokeArgs {

    public static final StackSetStackInstances Empty = new StackSetStackInstances();

    @InputImport(name="deploymentTargets", required=true)
    private final StackSetDeploymentTargets deploymentTargets;

    public StackSetDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    @InputImport(name="parameterOverrides")
    private final @Nullable List<StackSetParameter> parameterOverrides;

    public List<StackSetParameter> getParameterOverrides() {
        return this.parameterOverrides == null ? List.of() : this.parameterOverrides;
    }

    @InputImport(name="regions", required=true)
    private final List<String> regions;

    public List<String> getRegions() {
        return this.regions;
    }

    public StackSetStackInstances(
        StackSetDeploymentTargets deploymentTargets,
        @Nullable List<StackSetParameter> parameterOverrides,
        List<String> regions) {
        this.deploymentTargets = Objects.requireNonNull(deploymentTargets, "expected parameter 'deploymentTargets' to be non-null");
        this.parameterOverrides = parameterOverrides;
        this.regions = Objects.requireNonNull(regions, "expected parameter 'regions' to be non-null");
    }

    private StackSetStackInstances() {
        this.deploymentTargets = null;
        this.parameterOverrides = List.of();
        this.regions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetStackInstances defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackSetDeploymentTargets deploymentTargets;
        private @Nullable List<StackSetParameter> parameterOverrides;
        private List<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetStackInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentTargets = defaults.deploymentTargets;
    	      this.parameterOverrides = defaults.parameterOverrides;
    	      this.regions = defaults.regions;
        }

        public Builder setDeploymentTargets(StackSetDeploymentTargets deploymentTargets) {
            this.deploymentTargets = Objects.requireNonNull(deploymentTargets);
            return this;
        }

        public Builder setParameterOverrides(@Nullable List<StackSetParameter> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }

        public Builder setRegions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }

        public StackSetStackInstances build() {
            return new StackSetStackInstances(deploymentTargets, parameterOverrides, regions);
        }
    }
}