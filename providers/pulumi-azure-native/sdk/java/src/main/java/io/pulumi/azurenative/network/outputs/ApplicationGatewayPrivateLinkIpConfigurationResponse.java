// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayPrivateLinkIpConfigurationResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of application gateway private link ip configuration.
     * 
     */
    private final @Nullable String name;
    /**
     * Whether the ip configuration is primary or not.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * The private IP address of the IP configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * The private IP address allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * The provisioning state of the application gateway private link IP configuration.
     * 
     */
    private final String provisioningState;
    /**
     * Reference to the subnet resource.
     * 
     */
    private final @Nullable SubResourceResponse subnet;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","primary","privateIPAddress","privateIPAllocationMethod","provisioningState","subnet","type"})
    private ApplicationGatewayPrivateLinkIpConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Boolean primary,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable SubResourceResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.primary = primary;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of application gateway private link ip configuration.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Whether the ip configuration is primary or not.
     * 
     */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * The private IP address of the IP configuration.
     * 
     */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * The private IP address allocation method.
     * 
     */
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * The provisioning state of the application gateway private link IP configuration.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Reference to the subnet resource.
     * 
     */
    public Optional<SubResourceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPrivateLinkIpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPrivateLinkIpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayPrivateLinkIpConfigurationResponse build() {
            return new ApplicationGatewayPrivateLinkIpConfigurationResponse(etag, id, name, primary, privateIPAddress, privateIPAllocationMethod, provisioningState, subnet, type);
        }
    }
}
