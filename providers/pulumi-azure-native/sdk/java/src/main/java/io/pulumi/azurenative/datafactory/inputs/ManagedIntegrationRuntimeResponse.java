// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeComputePropertiesResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeCustomerVirtualNetworkResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeSsisPropertiesResponse;
import io.pulumi.azurenative.datafactory.inputs.ManagedVirtualNetworkReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed integration runtime, including managed elastic and managed dedicated integration runtimes.
 * 
 */
public final class ManagedIntegrationRuntimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeResponse Empty = new ManagedIntegrationRuntimeResponse();

    /**
     * The compute resource for managed integration runtime.
     * 
     */
    @InputImport(name="computeProperties")
    private final @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;

    public Optional<IntegrationRuntimeComputePropertiesResponse> getComputeProperties() {
        return this.computeProperties == null ? Optional.empty() : Optional.ofNullable(this.computeProperties);
    }

    /**
     * The name of virtual network to which Azure-SSIS integration runtime will join
     * 
     */
    @InputImport(name="customerVirtualNetwork")
    private final @Nullable IntegrationRuntimeCustomerVirtualNetworkResponse customerVirtualNetwork;

    public Optional<IntegrationRuntimeCustomerVirtualNetworkResponse> getCustomerVirtualNetwork() {
        return this.customerVirtualNetwork == null ? Optional.empty() : Optional.ofNullable(this.customerVirtualNetwork);
    }

    /**
     * Integration runtime description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Managed Virtual Network reference.
     * 
     */
    @InputImport(name="managedVirtualNetwork")
    private final @Nullable ManagedVirtualNetworkReferenceResponse managedVirtualNetwork;

    public Optional<ManagedVirtualNetworkReferenceResponse> getManagedVirtualNetwork() {
        return this.managedVirtualNetwork == null ? Optional.empty() : Optional.ofNullable(this.managedVirtualNetwork);
    }

    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    @InputImport(name="ssisProperties")
    private final @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;

    public Optional<IntegrationRuntimeSsisPropertiesResponse> getSsisProperties() {
        return this.ssisProperties == null ? Optional.empty() : Optional.ofNullable(this.ssisProperties);
    }

    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'Managed'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ManagedIntegrationRuntimeResponse(
        @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties,
        @Nullable IntegrationRuntimeCustomerVirtualNetworkResponse customerVirtualNetwork,
        @Nullable String description,
        @Nullable ManagedVirtualNetworkReferenceResponse managedVirtualNetwork,
        @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties,
        String state,
        String type) {
        this.computeProperties = computeProperties;
        this.customerVirtualNetwork = customerVirtualNetwork;
        this.description = description;
        this.managedVirtualNetwork = managedVirtualNetwork;
        this.ssisProperties = ssisProperties;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeResponse() {
        this.computeProperties = null;
        this.customerVirtualNetwork = null;
        this.description = null;
        this.managedVirtualNetwork = null;
        this.ssisProperties = null;
        this.state = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
        private @Nullable IntegrationRuntimeCustomerVirtualNetworkResponse customerVirtualNetwork;
        private @Nullable String description;
        private @Nullable ManagedVirtualNetworkReferenceResponse managedVirtualNetwork;
        private @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.customerVirtualNetwork = defaults.customerVirtualNetwork;
    	      this.description = defaults.description;
    	      this.managedVirtualNetwork = defaults.managedVirtualNetwork;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setComputeProperties(@Nullable IntegrationRuntimeComputePropertiesResponse computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }

        public Builder setCustomerVirtualNetwork(@Nullable IntegrationRuntimeCustomerVirtualNetworkResponse customerVirtualNetwork) {
            this.customerVirtualNetwork = customerVirtualNetwork;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setManagedVirtualNetwork(@Nullable ManagedVirtualNetworkReferenceResponse managedVirtualNetwork) {
            this.managedVirtualNetwork = managedVirtualNetwork;
            return this;
        }

        public Builder setSsisProperties(@Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ManagedIntegrationRuntimeResponse build() {
            return new ManagedIntegrationRuntimeResponse(computeProperties, customerVirtualNetwork, description, managedVirtualNetwork, ssisProperties, state, type);
        }
    }
}
