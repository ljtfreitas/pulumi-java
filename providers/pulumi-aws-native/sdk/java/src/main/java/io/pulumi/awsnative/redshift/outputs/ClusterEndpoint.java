// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEndpoint {
    private final @Nullable String address;
    private final @Nullable String port;

    @OutputCustomType.Constructor({"address","port"})
    private ClusterEndpoint(
        @Nullable String address,
        @Nullable String port) {
        this.address = address;
        this.port = port;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }
        public ClusterEndpoint build() {
            return new ClusterEndpoint(address, port);
        }
    }
}
