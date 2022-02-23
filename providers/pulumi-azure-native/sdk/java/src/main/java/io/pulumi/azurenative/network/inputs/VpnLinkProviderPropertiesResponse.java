// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of properties of a link provider.
 * 
 */
public final class VpnLinkProviderPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnLinkProviderPropertiesResponse Empty = new VpnLinkProviderPropertiesResponse();

    /**
     * Name of the link provider.
     * 
     */
    @InputImport(name="linkProviderName")
        private final @Nullable String linkProviderName;

    public Optional<String> getLinkProviderName() {
        return this.linkProviderName == null ? Optional.empty() : Optional.ofNullable(this.linkProviderName);
    }

    /**
     * Link speed.
     * 
     */
    @InputImport(name="linkSpeedInMbps")
        private final @Nullable Integer linkSpeedInMbps;

    public Optional<Integer> getLinkSpeedInMbps() {
        return this.linkSpeedInMbps == null ? Optional.empty() : Optional.ofNullable(this.linkSpeedInMbps);
    }

    public VpnLinkProviderPropertiesResponse(
        @Nullable String linkProviderName,
        @Nullable Integer linkSpeedInMbps) {
        this.linkProviderName = linkProviderName;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    private VpnLinkProviderPropertiesResponse() {
        this.linkProviderName = null;
        this.linkSpeedInMbps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkProviderName;
        private @Nullable Integer linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkProviderName = defaults.linkProviderName;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder setLinkProviderName(@Nullable String linkProviderName) {
            this.linkProviderName = linkProviderName;
            return this;
        }

        public Builder setLinkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }
        public VpnLinkProviderPropertiesResponse build() {
            return new VpnLinkProviderPropertiesResponse(linkProviderName, linkSpeedInMbps);
        }
    }
}
