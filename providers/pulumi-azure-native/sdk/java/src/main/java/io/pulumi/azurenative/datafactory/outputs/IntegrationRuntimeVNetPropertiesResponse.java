// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeVNetPropertiesResponse {
    /**
     * Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    private final @Nullable List<String> publicIPs;
    /**
     * The name of the subnet this integration runtime will join.
     * 
     */
    private final @Nullable String subnet;
    /**
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The ID of the VNet that this integration runtime will join.
     * 
     */
    private final @Nullable String vNetId;

    @OutputCustomType.Constructor({"publicIPs","subnet","subnetId","vNetId"})
    private IntegrationRuntimeVNetPropertiesResponse(
        @Nullable List<String> publicIPs,
        @Nullable String subnet,
        @Nullable String subnetId,
        @Nullable String vNetId) {
        this.publicIPs = publicIPs;
        this.subnet = subnet;
        this.subnetId = subnetId;
        this.vNetId = vNetId;
    }

    /**
     * Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    public List<String> getPublicIPs() {
        return this.publicIPs == null ? List.of() : this.publicIPs;
    }
    /**
     * The name of the subnet this integration runtime will join.
     * 
     */
    public Optional<String> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The ID of the VNet that this integration runtime will join.
     * 
     */
    public Optional<String> getVNetId() {
        return Optional.ofNullable(this.vNetId);
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
