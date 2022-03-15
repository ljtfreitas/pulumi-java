// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourcesSubnetworkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesSubnetworkGetArgs Empty = new PacketMirroringMirroredResourcesSubnetworkGetArgs();

    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public PacketMirroringMirroredResourcesSubnetworkGetArgs(Output<String> url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringMirroredResourcesSubnetworkGetArgs() {
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesSubnetworkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourcesSubnetworkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public PacketMirroringMirroredResourcesSubnetworkGetArgs build() {
            return new PacketMirroringMirroredResourcesSubnetworkGetArgs(url);
        }
    }
}
