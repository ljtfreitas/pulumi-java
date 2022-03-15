// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.BatchConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountBatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountBatchConfigurationArgs Empty = new IntegrationAccountBatchConfigurationArgs();

    /**
     * The batch configuration name.
     * 
     */
    @Import(name="batchConfigurationName")
      private final @Nullable Output<String> batchConfigurationName;

    public Output<String> getBatchConfigurationName() {
        return this.batchConfigurationName == null ? Output.empty() : this.batchConfigurationName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final Output<String> integrationAccountName;

    public Output<String> getIntegrationAccountName() {
        return this.integrationAccountName;
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
     * The batch configuration properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<BatchConfigurationPropertiesArgs> properties;

    public Output<BatchConfigurationPropertiesArgs> getProperties() {
        return this.properties;
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
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IntegrationAccountBatchConfigurationArgs(
        @Nullable Output<String> batchConfigurationName,
        Output<String> integrationAccountName,
        @Nullable Output<String> location,
        Output<BatchConfigurationPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.batchConfigurationName = batchConfigurationName;
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private IntegrationAccountBatchConfigurationArgs() {
        this.batchConfigurationName = Output.empty();
        this.integrationAccountName = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountBatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> batchConfigurationName;
        private Output<String> integrationAccountName;
        private @Nullable Output<String> location;
        private Output<BatchConfigurationPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountBatchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchConfigurationName = defaults.batchConfigurationName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder batchConfigurationName(@Nullable Output<String> batchConfigurationName) {
            this.batchConfigurationName = batchConfigurationName;
            return this;
        }

        public Builder batchConfigurationName(@Nullable String batchConfigurationName) {
            this.batchConfigurationName = Output.ofNullable(batchConfigurationName);
            return this;
        }

        public Builder integrationAccountName(Output<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Output.of(Objects.requireNonNull(integrationAccountName));
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

        public Builder properties(Output<BatchConfigurationPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(BatchConfigurationPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public IntegrationAccountBatchConfigurationArgs build() {
            return new IntegrationAccountBatchConfigurationArgs(batchConfigurationName, integrationAccountName, location, properties, resourceGroupName, tags);
        }
    }
}
