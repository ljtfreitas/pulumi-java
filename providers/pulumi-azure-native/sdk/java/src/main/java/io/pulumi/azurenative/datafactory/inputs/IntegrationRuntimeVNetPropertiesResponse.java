// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VNet properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeVNetPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeVNetPropertiesResponse Empty = new IntegrationRuntimeVNetPropertiesResponse();

    /**
     * Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    @InputImport(name="publicIPs")
    private final @Nullable List<String> publicIPs;

    public List<String> getPublicIPs() {
        return this.publicIPs == null ? List.of() : this.publicIPs;
    }

    /**
     * The name of the subnet this integration runtime will join.
     * 
     */
    @InputImport(name="subnet")
    private final @Nullable String subnet;

    public Optional<String> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    /**
     * The ID of the VNet that this integration runtime will join.
     * 
     */
    @InputImport(name="vNetId")
    private final @Nullable String vNetId;

    public Optional<String> getVNetId() {
        return this.vNetId == null ? Optional.empty() : Optional.ofNullable(this.vNetId);
    }

    public IntegrationRuntimeVNetPropertiesResponse(
        @Nullable List<String> publicIPs,
        @Nullable String subnet,
        @Nullable String subnetId,
        @Nullable String vNetId) {
        this.publicIPs = publicIPs;
        this.subnet = subnet;
        this.subnetId = subnetId;
        this.vNetId = vNetId;
    }

    private IntegrationRuntimeVNetPropertiesResponse() {
        this.publicIPs = List.of();
        this.subnet = null;
        this.subnetId = null;
        this.vNetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeVNetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> publicIPs;
        private @Nullable String subnet;
        private @Nullable String subnetId;
        private @Nullable String vNetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeVNetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
    	      this.subnet = defaults.subnet;
    	      this.subnetId = defaults.subnetId;
    	      this.vNetId = defaults.vNetId;
        }

        public Builder setPublicIPs(@Nullable List<String> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }

        public Builder setSubnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setVNetId(@Nullable String vNetId) {
            this.vNetId = vNetId;
            return this;
        }

        public IntegrationRuntimeVNetPropertiesResponse build() {
            return new IntegrationRuntimeVNetPropertiesResponse(publicIPs, subnet, subnetId, vNetId);
        }
    }
}
