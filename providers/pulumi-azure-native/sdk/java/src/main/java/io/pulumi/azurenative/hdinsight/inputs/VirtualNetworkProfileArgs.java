// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The virtual network properties.
 * 
 */
public final class VirtualNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkProfileArgs Empty = new VirtualNetworkProfileArgs();

    /**
     * The ID of the virtual network.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    public VirtualNetworkProfileArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    private VirtualNetworkProfileArgs() {
        this.id = Output.empty();
        this.subnet = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable String subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }
        public VirtualNetworkProfileArgs build() {
            return new VirtualNetworkProfileArgs(id, subnet);
        }
    }
}
