// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterProfileResponse {
    /**
     * The domain for the cluster (immutable).
     * 
     */
    private final @Nullable String domain;
    /**
     * The pull secret for the cluster (immutable).
     * 
     */
    private final @Nullable String pullSecret;
    /**
     * The ID of the cluster resource group (immutable).
     * 
     */
    private final @Nullable String resourceGroupId;
    /**
     * The version of the cluster (immutable).
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"domain","pullSecret","resourceGroupId","version"})
    private ClusterProfileResponse(
        @Nullable String domain,
        @Nullable String pullSecret,
        @Nullable String resourceGroupId,
        @Nullable String version) {
        this.domain = domain;
        this.pullSecret = pullSecret;
        this.resourceGroupId = resourceGroupId;
        this.version = version;
    }

    /**
     * The domain for the cluster (immutable).
     * 
     */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * The pull secret for the cluster (immutable).
     * 
     */
    public Optional<String> getPullSecret() {
        return Optional.ofNullable(this.pullSecret);
    }
    /**
     * The ID of the cluster resource group (immutable).
     * 
     */
    public Optional<String> getResourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * The version of the cluster (immutable).
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String pullSecret;
        private @Nullable String resourceGroupId;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.pullSecret = defaults.pullSecret;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.version = defaults.version;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setPullSecret(@Nullable String pullSecret) {
            this.pullSecret = pullSecret;
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ClusterProfileResponse build() {
            return new ClusterProfileResponse(domain, pullSecret, resourceGroupId, version);
        }
    }
}
