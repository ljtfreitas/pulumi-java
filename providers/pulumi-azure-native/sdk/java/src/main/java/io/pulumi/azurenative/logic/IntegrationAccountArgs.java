// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.enums.WorkflowState;
import io.pulumi.azurenative.logic.inputs.IntegrationAccountSkuArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountArgs Empty = new IntegrationAccountArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName")
      private final @Nullable Output<String> integrationAccountName;

    public Output<String> getIntegrationAccountName() {
        return this.integrationAccountName == null ? Output.empty() : this.integrationAccountName;
    }

    /**
     * The integration service environment.
     * 
     */
    @Import(name="integrationServiceEnvironment")
      private final @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;

    public Output<ResourceReferenceArgs> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment == null ? Output.empty() : this.integrationServiceEnvironment;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<IntegrationAccountSkuArgs> sku;

    public Output<IntegrationAccountSkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * The workflow state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,WorkflowState>> state;

    public Output<Either<String,WorkflowState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IntegrationAccountArgs(
        @Nullable Output<String> integrationAccountName,
        @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<IntegrationAccountSkuArgs> sku,
        @Nullable Output<Either<String,WorkflowState>> state,
        @Nullable Output<Map<String,String>> tags) {
        this.integrationAccountName = integrationAccountName;
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.state = state;
        this.tags = tags;
    }

    private IntegrationAccountArgs() {
        this.integrationAccountName = Output.empty();
        this.integrationServiceEnvironment = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> integrationAccountName;
        private @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<IntegrationAccountSkuArgs> sku;
        private @Nullable Output<Either<String,WorkflowState>> state;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder integrationAccountName(@Nullable Output<String> integrationAccountName) {
            this.integrationAccountName = integrationAccountName;
            return this;
        }

        public Builder integrationAccountName(@Nullable String integrationAccountName) {
            this.integrationAccountName = Output.ofNullable(integrationAccountName);
            return this;
        }

        public Builder integrationServiceEnvironment(@Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }

        public Builder integrationServiceEnvironment(@Nullable ResourceReferenceArgs integrationServiceEnvironment) {
            this.integrationServiceEnvironment = Output.ofNullable(integrationServiceEnvironment);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder sku(@Nullable Output<IntegrationAccountSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable IntegrationAccountSkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder state(@Nullable Output<Either<String,WorkflowState>> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable Either<String,WorkflowState> state) {
            this.state = Output.ofNullable(state);
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
        public IntegrationAccountArgs build() {
            return new IntegrationAccountArgs(integrationAccountName, integrationServiceEnvironment, location, resourceGroupName, sku, state, tags);
        }
    }
}
