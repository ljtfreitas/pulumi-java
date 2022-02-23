// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.azurenative.network.inputs.SubnetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Frontend IP address of the load balancer.
 * 
 */
public final class FrontendIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontendIPConfigurationResponse Empty = new FrontendIPConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
        private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * An array of references to inbound pools that use this frontend IP.
     * 
     */
    @InputImport(name="inboundNatPools", required=true)
        private final List<SubResourceResponse> inboundNatPools;

    public List<SubResourceResponse> getInboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * An array of references to inbound rules that use this frontend IP.
     * 
     */
    @InputImport(name="inboundNatRules", required=true)
        private final List<SubResourceResponse> inboundNatRules;

    public List<SubResourceResponse> getInboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * An array of references to load balancing rules that use this frontend IP.
     * 
     */
    @InputImport(name="loadBalancingRules", required=true)
        private final List<SubResourceResponse> loadBalancingRules;

    public List<SubResourceResponse> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * An array of references to outbound rules that use this frontend IP.
     * 
     */
    @InputImport(name="outboundRules", required=true)
        private final List<SubResourceResponse> outboundRules;

    public List<SubResourceResponse> getOutboundRules() {
        return this.outboundRules;
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @InputImport(name="privateIPAddress")
        private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * 
     */
    @InputImport(name="privateIPAddressVersion")
        private final @Nullable String privateIPAddressVersion;

    public Optional<String> getPrivateIPAddressVersion() {
        return this.privateIPAddressVersion == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddressVersion);
    }

    /**
     * The Private IP allocation method.
     * 
     */
    @InputImport(name="privateIPAllocationMethod")
        private final @Nullable String privateIPAllocationMethod;

    public Optional<String> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The provisioning state of the frontend IP configuration resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the Public IP resource.
     * 
     */
    @InputImport(name="publicIPAddress")
        private final @Nullable PublicIPAddressResponse publicIPAddress;

    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return this.publicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the Public IP Prefix resource.
     * 
     */
    @InputImport(name="publicIPPrefix")
        private final @Nullable SubResourceResponse publicIPPrefix;

    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return this.publicIPPrefix == null ? Optional.empty() : Optional.ofNullable(this.publicIPPrefix);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @InputImport(name="subnet")
        private final @Nullable SubnetResponse subnet;

    public Optional<SubnetResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @InputImport(name="zones")
        private final @Nullable List<String> zones;

    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public FrontendIPConfigurationResponse(
        String etag,
        @Nullable String id,
        List<SubResourceResponse> inboundNatPools,
        List<SubResourceResponse> inboundNatRules,
        List<SubResourceResponse> loadBalancingRules,
        @Nullable String name,
        List<SubResourceResponse> outboundRules,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAddressVersion,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable PublicIPAddressResponse publicIPAddress,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable SubnetResponse subnet,
        String type,
        @Nullable List<String> zones) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.inboundNatPools = Objects.requireNonNull(inboundNatPools, "expected parameter 'inboundNatPools' to be non-null");
        this.inboundNatRules = Objects.requireNonNull(inboundNatRules, "expected parameter 'inboundNatRules' to be non-null");
        this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules, "expected parameter 'loadBalancingRules' to be non-null");
        this.name = name;
        this.outboundRules = Objects.requireNonNull(outboundRules, "expected parameter 'outboundRules' to be non-null");
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddress = publicIPAddress;
        this.publicIPPrefix = publicIPPrefix;
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.zones = zones;
    }

    private FrontendIPConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.inboundNatPools = List.of();
        this.inboundNatRules = List.of();
        this.loadBalancingRules = List.of();
        this.name = null;
        this.outboundRules = List.of();
        this.privateIPAddress = null;
        this.privateIPAddressVersion = null;
        this.privateIPAllocationMethod = null;
        this.provisioningState = null;
        this.publicIPAddress = null;
        this.publicIPPrefix = null;
        this.subnet = null;
        this.type = null;
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private List<SubResourceResponse> inboundNatPools;
        private List<SubResourceResponse> inboundNatRules;
        private List<SubResourceResponse> loadBalancingRules;
        private @Nullable String name;
        private List<SubResourceResponse> outboundRules;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable PublicIPAddressResponse publicIPAddress;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable SubnetResponse subnet;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundNatPools(List<SubResourceResponse> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }

        public Builder setInboundNatRules(List<SubResourceResponse> inboundNatRules) {
            this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
            return this;
        }

        public Builder setLoadBalancingRules(List<SubResourceResponse> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOutboundRules(List<SubResourceResponse> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
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

        public Builder setPublicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public FrontendIPConfigurationResponse build() {
            return new FrontendIPConfigurationResponse(etag, id, inboundNatPools, inboundNatRules, loadBalancingRules, name, outboundRules, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, provisioningState, publicIPAddress, publicIPPrefix, subnet, type, zones);
        }
    }
}
