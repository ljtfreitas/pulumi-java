// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.NatGatewaySkuArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Nat Gateway resource.
 * 
 */
public final class NatGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatGatewayArgs Empty = new NatGatewayArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The idle timeout of the nat gateway.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Output<Integer> idleTimeoutInMinutes;

    public Output<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Output.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    @Import(name="publicIpAddresses")
      private final @Nullable Output<List<SubResourceArgs>> publicIpAddresses;

    public Output<List<SubResourceArgs>> getPublicIpAddresses() {
        return this.publicIpAddresses == null ? Output.empty() : this.publicIpAddresses;
    }

    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    @Import(name="publicIpPrefixes")
      private final @Nullable Output<List<SubResourceArgs>> publicIpPrefixes;

    public Output<List<SubResourceArgs>> getPublicIpPrefixes() {
        return this.publicIpPrefixes == null ? Output.empty() : this.publicIpPrefixes;
    }

    /**
     * The nat gateway SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<NatGatewaySkuArgs> sku;

    public Output<NatGatewaySkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public NatGatewayArgs(
        @Nullable Output<String> id,
        @Nullable Output<Integer> idleTimeoutInMinutes,
        @Nullable Output<String> location,
        @Nullable Output<List<SubResourceArgs>> publicIpAddresses,
        @Nullable Output<List<SubResourceArgs>> publicIpPrefixes,
        @Nullable Output<NatGatewaySkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> zones) {
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.location = location;
        this.publicIpAddresses = publicIpAddresses;
        this.publicIpPrefixes = publicIpPrefixes;
        this.sku = sku;
        this.tags = tags;
        this.zones = zones;
    }

    private NatGatewayArgs() {
        this.id = Output.empty();
        this.idleTimeoutInMinutes = Output.empty();
        this.location = Output.empty();
        this.publicIpAddresses = Output.empty();
        this.publicIpPrefixes = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> idleTimeoutInMinutes;
        private @Nullable Output<String> location;
        private @Nullable Output<List<SubResourceArgs>> publicIpAddresses;
        private @Nullable Output<List<SubResourceArgs>> publicIpPrefixes;
        private @Nullable Output<NatGatewaySkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(NatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.location = defaults.location;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publicIpPrefixes = defaults.publicIpPrefixes;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Output.ofNullable(idleTimeoutInMinutes);
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

        public Builder publicIpAddresses(@Nullable Output<List<SubResourceArgs>> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        public Builder publicIpAddresses(@Nullable List<SubResourceArgs> publicIpAddresses) {
            this.publicIpAddresses = Output.ofNullable(publicIpAddresses);
            return this;
        }

        public Builder publicIpPrefixes(@Nullable Output<List<SubResourceArgs>> publicIpPrefixes) {
            this.publicIpPrefixes = publicIpPrefixes;
            return this;
        }

        public Builder publicIpPrefixes(@Nullable List<SubResourceArgs> publicIpPrefixes) {
            this.publicIpPrefixes = Output.ofNullable(publicIpPrefixes);
            return this;
        }

        public Builder sku(@Nullable Output<NatGatewaySkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable NatGatewaySkuArgs sku) {
            this.sku = Output.ofNullable(sku);
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

        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public NatGatewayArgs build() {
            return new NatGatewayArgs(id, idleTimeoutInMinutes, location, publicIpAddresses, publicIpPrefixes, sku, tags, zones);
        }
    }
}
