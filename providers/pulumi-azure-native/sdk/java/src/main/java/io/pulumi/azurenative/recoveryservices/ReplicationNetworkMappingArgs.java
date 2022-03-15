// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.CreateNetworkMappingInputPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationNetworkMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationNetworkMappingArgs Empty = new ReplicationNetworkMappingArgs();

    /**
     * Primary fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
      private final Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * Network mapping name.
     * 
     */
    @Import(name="networkMappingName")
      private final @Nullable Output<String> networkMappingName;

    public Output<String> getNetworkMappingName() {
        return this.networkMappingName == null ? Output.empty() : this.networkMappingName;
    }

    /**
     * Primary network name.
     * 
     */
    @Import(name="networkName", required=true)
      private final Output<String> networkName;

    public Output<String> getNetworkName() {
        return this.networkName;
    }

    /**
     * Input properties for creating network mapping.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<CreateNetworkMappingInputPropertiesArgs> properties;

    public Output<CreateNetworkMappingInputPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationNetworkMappingArgs(
        Output<String> fabricName,
        @Nullable Output<String> networkMappingName,
        Output<String> networkName,
        @Nullable Output<CreateNetworkMappingInputPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.networkMappingName = networkMappingName;
        this.networkName = Objects.requireNonNull(networkName, "expected parameter 'networkName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationNetworkMappingArgs() {
        this.fabricName = Output.empty();
        this.networkMappingName = Output.empty();
        this.networkName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationNetworkMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fabricName;
        private @Nullable Output<String> networkMappingName;
        private Output<String> networkName;
        private @Nullable Output<CreateNetworkMappingInputPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationNetworkMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.networkMappingName = defaults.networkMappingName;
    	      this.networkName = defaults.networkName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder fabricName(Output<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder fabricName(String fabricName) {
            this.fabricName = Output.of(Objects.requireNonNull(fabricName));
            return this;
        }

        public Builder networkMappingName(@Nullable Output<String> networkMappingName) {
            this.networkMappingName = networkMappingName;
            return this;
        }

        public Builder networkMappingName(@Nullable String networkMappingName) {
            this.networkMappingName = Output.ofNullable(networkMappingName);
            return this;
        }

        public Builder networkName(Output<String> networkName) {
            this.networkName = Objects.requireNonNull(networkName);
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = Output.of(Objects.requireNonNull(networkName));
            return this;
        }

        public Builder properties(@Nullable Output<CreateNetworkMappingInputPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable CreateNetworkMappingInputPropertiesArgs properties) {
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

        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ReplicationNetworkMappingArgs build() {
            return new ReplicationNetworkMappingArgs(fabricName, networkMappingName, networkName, properties, resourceGroupName, resourceName);
        }
    }
}
