// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification for using a Virtual Network.
 * 
 */
public final class VirtualNetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkProfileResponse Empty = new VirtualNetworkProfileResponse();

    /**
     * Resource id of the Virtual Network.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Name of the Virtual Network (read-only).
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Subnet within the Virtual Network.
     * 
     */
    @InputImport(name="subnet")
        private final @Nullable String subnet;

    public Optional<String> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * Resource type of the Virtual Network (read-only).
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public VirtualNetworkProfileResponse(
        String id,
        String name,
        @Nullable String subnet,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualNetworkProfileResponse() {
        this.id = null;
        this.name = null;
        this.subnet = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VirtualNetworkProfileResponse build() {
            return new VirtualNetworkProfileResponse(id, name, subnet, type);
        }
    }
}
