// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeComputePropertiesArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeCustomerVirtualNetworkArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeSsisPropertiesArgs;
import io.pulumi.azurenative.datafactory.inputs.ManagedVirtualNetworkReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed integration runtime, including managed elastic and managed dedicated integration runtimes.
 * 
 */
public final class ManagedIntegrationRuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIntegrationRuntimeArgs Empty = new ManagedIntegrationRuntimeArgs();

    /**
     * The compute resource for managed integration runtime.
     * 
     */
    @Import(name="computeProperties")
      private final @Nullable Output<IntegrationRuntimeComputePropertiesArgs> computeProperties;

    public Output<IntegrationRuntimeComputePropertiesArgs> getComputeProperties() {
        return this.computeProperties == null ? Output.empty() : this.computeProperties;
    }

    /**
     * The name of virtual network to which Azure-SSIS integration runtime will join
     * 
     */
    @Import(name="customerVirtualNetwork")
      private final @Nullable Output<IntegrationRuntimeCustomerVirtualNetworkArgs> customerVirtualNetwork;

    public Output<IntegrationRuntimeCustomerVirtualNetworkArgs> getCustomerVirtualNetwork() {
        return this.customerVirtualNetwork == null ? Output.empty() : this.customerVirtualNetwork;
    }

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Managed Virtual Network reference.
     * 
     */
    @Import(name="managedVirtualNetwork")
      private final @Nullable Output<ManagedVirtualNetworkReferenceArgs> managedVirtualNetwork;

    public Output<ManagedVirtualNetworkReferenceArgs> getManagedVirtualNetwork() {
        return this.managedVirtualNetwork == null ? Output.empty() : this.managedVirtualNetwork;
    }

    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    @Import(name="ssisProperties")
      private final @Nullable Output<IntegrationRuntimeSsisPropertiesArgs> ssisProperties;

    public Output<IntegrationRuntimeSsisPropertiesArgs> getSsisProperties() {
        return this.ssisProperties == null ? Output.empty() : this.ssisProperties;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ManagedIntegrationRuntimeArgs(
        @Nullable Output<IntegrationRuntimeComputePropertiesArgs> computeProperties,
        @Nullable Output<IntegrationRuntimeCustomerVirtualNetworkArgs> customerVirtualNetwork,
        @Nullable Output<String> description,
        @Nullable Output<ManagedVirtualNetworkReferenceArgs> managedVirtualNetwork,
        @Nullable Output<IntegrationRuntimeSsisPropertiesArgs> ssisProperties,
        Output<String> type) {
        this.computeProperties = computeProperties;
        this.customerVirtualNetwork = customerVirtualNetwork;
        this.description = description;
        this.managedVirtualNetwork = managedVirtualNetwork;
        this.ssisProperties = ssisProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeArgs() {
        this.computeProperties = Output.empty();
        this.customerVirtualNetwork = Output.empty();
        this.description = Output.empty();
        this.managedVirtualNetwork = Output.empty();
        this.ssisProperties = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntegrationRuntimeComputePropertiesArgs> computeProperties;
        private @Nullable Output<IntegrationRuntimeCustomerVirtualNetworkArgs> customerVirtualNetwork;
        private @Nullable Output<String> description;
        private @Nullable Output<ManagedVirtualNetworkReferenceArgs> managedVirtualNetwork;
        private @Nullable Output<IntegrationRuntimeSsisPropertiesArgs> ssisProperties;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.customerVirtualNetwork = defaults.customerVirtualNetwork;
    	      this.description = defaults.description;
    	      this.managedVirtualNetwork = defaults.managedVirtualNetwork;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.type = defaults.type;
        }

        public Builder computeProperties(@Nullable Output<IntegrationRuntimeComputePropertiesArgs> computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }

        public Builder computeProperties(@Nullable IntegrationRuntimeComputePropertiesArgs computeProperties) {
            this.computeProperties = Output.ofNullable(computeProperties);
            return this;
        }

        public Builder customerVirtualNetwork(@Nullable Output<IntegrationRuntimeCustomerVirtualNetworkArgs> customerVirtualNetwork) {
            this.customerVirtualNetwork = customerVirtualNetwork;
            return this;
        }

        public Builder customerVirtualNetwork(@Nullable IntegrationRuntimeCustomerVirtualNetworkArgs customerVirtualNetwork) {
            this.customerVirtualNetwork = Output.ofNullable(customerVirtualNetwork);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder managedVirtualNetwork(@Nullable Output<ManagedVirtualNetworkReferenceArgs> managedVirtualNetwork) {
            this.managedVirtualNetwork = managedVirtualNetwork;
            return this;
        }

        public Builder managedVirtualNetwork(@Nullable ManagedVirtualNetworkReferenceArgs managedVirtualNetwork) {
            this.managedVirtualNetwork = Output.ofNullable(managedVirtualNetwork);
            return this;
        }

        public Builder ssisProperties(@Nullable Output<IntegrationRuntimeSsisPropertiesArgs> ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }

        public Builder ssisProperties(@Nullable IntegrationRuntimeSsisPropertiesArgs ssisProperties) {
            this.ssisProperties = Output.ofNullable(ssisProperties);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ManagedIntegrationRuntimeArgs build() {
            return new ManagedIntegrationRuntimeArgs(computeProperties, customerVirtualNetwork, description, managedVirtualNetwork, ssisProperties, type);
        }
    }
}
