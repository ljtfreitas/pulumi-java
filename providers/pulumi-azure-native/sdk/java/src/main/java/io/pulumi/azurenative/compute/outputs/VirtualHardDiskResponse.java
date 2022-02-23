// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualHardDiskResponse {
    /**
     * Specifies the virtual hard disk's uri.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"uri"})
    private VirtualHardDiskResponse(@Nullable String uri) {
        this.uri = uri;
    }

    /**
     * Specifies the virtual hard disk's uri.
     * 
     */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHardDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHardDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public VirtualHardDiskResponse build() {
            return new VirtualHardDiskResponse(uri);
        }
    }
}
