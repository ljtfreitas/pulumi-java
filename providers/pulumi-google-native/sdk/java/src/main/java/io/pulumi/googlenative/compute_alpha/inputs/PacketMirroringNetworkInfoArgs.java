// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringNetworkInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringNetworkInfoArgs Empty = new PacketMirroringNetworkInfoArgs();

    /**
     * URL of the network resource.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public PacketMirroringNetworkInfoArgs(@Nullable Input<String> url) {
        this.url = url;
    }

    private PacketMirroringNetworkInfoArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringNetworkInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringNetworkInfoArgs defaults) {
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
        public PacketMirroringNetworkInfoArgs build() {
            return new PacketMirroringNetworkInfoArgs(url);
        }
    }
}
