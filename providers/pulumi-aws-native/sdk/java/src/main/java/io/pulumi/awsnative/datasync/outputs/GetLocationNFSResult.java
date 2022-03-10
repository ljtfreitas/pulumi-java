// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.outputs.LocationNFSMountOptions;
import io.pulumi.awsnative.datasync.outputs.LocationNFSOnPremConfig;
import io.pulumi.awsnative.datasync.outputs.LocationNFSTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationNFSResult {
    /**
     * The Amazon Resource Name (ARN) of the NFS location.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the NFS location that was described.
     * 
     */
    private final @Nullable String locationUri;
    private final @Nullable LocationNFSMountOptions mountOptions;
    private final @Nullable LocationNFSOnPremConfig onPremConfig;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationNFSTag> tags;

    @OutputCustomType.Constructor
    private GetLocationNFSResult(
        @OutputCustomType.Parameter("locationArn") @Nullable String locationArn,
        @OutputCustomType.Parameter("locationUri") @Nullable String locationUri,
        @OutputCustomType.Parameter("mountOptions") @Nullable LocationNFSMountOptions mountOptions,
        @OutputCustomType.Parameter("onPremConfig") @Nullable LocationNFSOnPremConfig onPremConfig,
        @OutputCustomType.Parameter("tags") @Nullable List<LocationNFSTag> tags) {
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.mountOptions = mountOptions;
        this.onPremConfig = onPremConfig;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the NFS location.
     * 
    */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the NFS location that was described.
     * 
    */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    public Optional<LocationNFSMountOptions> getMountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    public Optional<LocationNFSOnPremConfig> getOnPremConfig() {
        return Optional.ofNullable(this.onPremConfig);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LocationNFSTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationNFSResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable LocationNFSMountOptions mountOptions;
        private @Nullable LocationNFSOnPremConfig onPremConfig;
        private @Nullable List<LocationNFSTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationNFSResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.mountOptions = defaults.mountOptions;
    	      this.onPremConfig = defaults.onPremConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setMountOptions(@Nullable LocationNFSMountOptions mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setOnPremConfig(@Nullable LocationNFSOnPremConfig onPremConfig) {
            this.onPremConfig = onPremConfig;
            return this;
        }

        public Builder setTags(@Nullable List<LocationNFSTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocationNFSResult build() {
            return new GetLocationNFSResult(locationArn, locationUri, mountOptions, onPremConfig, tags);
        }
    }
}
