// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.azurenative.powerplatform.outputs.SubnetPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkPropertiesResponse {
    /**
     * Uri of the virtual network.
     * 
     */
    private final @Nullable String id;
    /**
     * Properties of a subnet.
     * 
     */
    private final @Nullable SubnetPropertiesResponse subnet;

    @OutputCustomType.Constructor({"id","subnet"})
    private VirtualNetworkPropertiesResponse(
        @Nullable String id,
        @Nullable SubnetPropertiesResponse subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    /**
     * Uri of the virtual network.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Properties of a subnet.
     * 
     */
    public Optional<SubnetPropertiesResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable SubnetPropertiesResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetPropertiesResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public VirtualNetworkPropertiesResponse build() {
            return new VirtualNetworkPropertiesResponse(id, subnet);
        }
    }
}
