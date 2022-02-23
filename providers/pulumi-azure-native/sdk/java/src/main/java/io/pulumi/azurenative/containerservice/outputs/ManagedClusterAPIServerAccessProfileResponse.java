// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterAPIServerAccessProfileResponse {
    /**
     * Authorized IP Ranges to kubernetes API server.
     * 
     */
    private final @Nullable List<String> authorizedIPRanges;
    /**
     * Whether to create the cluster as a private cluster or not.
     * 
     */
    private final @Nullable Boolean enablePrivateCluster;
    /**
     * Private dns zone mode for private cluster.
     * 
     */
    private final @Nullable String privateDNSZone;

    @OutputCustomType.Constructor({"authorizedIPRanges","enablePrivateCluster","privateDNSZone"})
    private ManagedClusterAPIServerAccessProfileResponse(
        @Nullable List<String> authorizedIPRanges,
        @Nullable Boolean enablePrivateCluster,
        @Nullable String privateDNSZone) {
        this.authorizedIPRanges = authorizedIPRanges;
        this.enablePrivateCluster = enablePrivateCluster;
        this.privateDNSZone = privateDNSZone;
    }

    /**
     * Authorized IP Ranges to kubernetes API server.
     * 
     */
    public List<String> getAuthorizedIPRanges() {
        return this.authorizedIPRanges == null ? List.of() : this.authorizedIPRanges;
    }
    /**
     * Whether to create the cluster as a private cluster or not.
     * 
     */
    public Optional<Boolean> getEnablePrivateCluster() {
        return Optional.ofNullable(this.enablePrivateCluster);
    }
    /**
     * Private dns zone mode for private cluster.
     * 
     */
    public Optional<String> getPrivateDNSZone() {
        return Optional.ofNullable(this.privateDNSZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAPIServerAccessProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authorizedIPRanges;
        private @Nullable Boolean enablePrivateCluster;
        private @Nullable String privateDNSZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAPIServerAccessProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedIPRanges = defaults.authorizedIPRanges;
    	      this.enablePrivateCluster = defaults.enablePrivateCluster;
    	      this.privateDNSZone = defaults.privateDNSZone;
        }

        public Builder setAuthorizedIPRanges(@Nullable List<String> authorizedIPRanges) {
            this.authorizedIPRanges = authorizedIPRanges;
            return this;
        }

        public Builder setEnablePrivateCluster(@Nullable Boolean enablePrivateCluster) {
            this.enablePrivateCluster = enablePrivateCluster;
            return this;
        }

        public Builder setPrivateDNSZone(@Nullable String privateDNSZone) {
            this.privateDNSZone = privateDNSZone;
            return this;
        }
        public ManagedClusterAPIServerAccessProfileResponse build() {
            return new ManagedClusterAPIServerAccessProfileResponse(authorizedIPRanges, enablePrivateCluster, privateDNSZone);
        }
    }
}
