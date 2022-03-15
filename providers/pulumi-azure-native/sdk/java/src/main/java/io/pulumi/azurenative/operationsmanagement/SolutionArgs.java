// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement;

import io.pulumi.azurenative.operationsmanagement.inputs.SolutionPlanArgs;
import io.pulumi.azurenative.operationsmanagement.inputs.SolutionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SolutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionArgs Empty = new SolutionArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Plan for solution object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="plan")
      private final @Nullable Output<SolutionPlanArgs> plan;

    public Output<SolutionPlanArgs> getPlan() {
        return this.plan == null ? Output.empty() : this.plan;
    }

    /**
     * Properties for solution object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<SolutionPropertiesArgs> properties;

    public Output<SolutionPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * User Solution Name.
     * 
     */
    @Import(name="solutionName")
      private final @Nullable Output<String> solutionName;

    public Output<String> getSolutionName() {
        return this.solutionName == null ? Output.empty() : this.solutionName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SolutionArgs(
        @Nullable Output<String> location,
        @Nullable Output<SolutionPlanArgs> plan,
        @Nullable Output<SolutionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> solutionName,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.plan = plan;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = solutionName;
        this.tags = tags;
    }

    private SolutionArgs() {
        this.location = Output.empty();
        this.plan = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.solutionName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<SolutionPlanArgs> plan;
        private @Nullable Output<SolutionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> solutionName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder plan(@Nullable Output<SolutionPlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder plan(@Nullable SolutionPlanArgs plan) {
            this.plan = Output.ofNullable(plan);
            return this;
        }

        public Builder properties(@Nullable Output<SolutionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable SolutionPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder solutionName(@Nullable Output<String> solutionName) {
            this.solutionName = solutionName;
            return this;
        }

        public Builder solutionName(@Nullable String solutionName) {
            this.solutionName = Output.ofNullable(solutionName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public SolutionArgs build() {
            return new SolutionArgs(location, plan, properties, resourceGroupName, solutionName, tags);
        }
    }
}
