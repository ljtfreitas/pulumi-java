// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScalingPlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScalingPlanArgs Empty = new GetScalingPlanArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the scaling plan.
     * 
     */
    @Import(name="scalingPlanName", required=true)
      private final String scalingPlanName;

    public String getScalingPlanName() {
        return this.scalingPlanName;
    }

    public GetScalingPlanArgs(
        String resourceGroupName,
        String scalingPlanName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scalingPlanName = Objects.requireNonNull(scalingPlanName, "expected parameter 'scalingPlanName' to be non-null");
    }

    private GetScalingPlanArgs() {
        this.resourceGroupName = null;
        this.scalingPlanName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScalingPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String scalingPlanName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScalingPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scalingPlanName = defaults.scalingPlanName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder scalingPlanName(String scalingPlanName) {
            this.scalingPlanName = Objects.requireNonNull(scalingPlanName);
            return this;
        }
        public GetScalingPlanArgs build() {
            return new GetScalingPlanArgs(resourceGroupName, scalingPlanName);
        }
    }
}
