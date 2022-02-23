// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourceInfoSubnetInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourceInfoSubnetInfoArgs Empty = new PacketMirroringMirroredResourceInfoSubnetInfoArgs();

    /**
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public PacketMirroringMirroredResourceInfoSubnetInfoArgs(@Nullable Input<String> url) {
        this.url = url;
    }

    private PacketMirroringMirroredResourceInfoSubnetInfoArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoSubnetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoSubnetInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public PacketMirroringMirroredResourceInfoSubnetInfoArgs build() {
            return new PacketMirroringMirroredResourceInfoSubnetInfoArgs(url);
        }
    }
}
