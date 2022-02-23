// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainEBSOptions {
    private final @Nullable Boolean eBSEnabled;
    private final @Nullable Integer iops;
    private final @Nullable Integer volumeSize;
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor({"eBSEnabled","iops","volumeSize","volumeType"})
    private DomainEBSOptions(
        @Nullable Boolean eBSEnabled,
        @Nullable Integer iops,
        @Nullable Integer volumeSize,
        @Nullable String volumeType) {
        this.eBSEnabled = eBSEnabled;
        this.iops = iops;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    public Optional<Boolean> getEBSEnabled() {
        return Optional.ofNullable(this.eBSEnabled);
    }
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEBSOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean eBSEnabled;
        private @Nullable Integer iops;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEBSOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eBSEnabled = defaults.eBSEnabled;
    	      this.iops = defaults.iops;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setEBSEnabled(@Nullable Boolean eBSEnabled) {
            this.eBSEnabled = eBSEnabled;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public DomainEBSOptions build() {
            return new DomainEBSOptions(eBSEnabled, iops, volumeSize, volumeType);
        }
    }
}
