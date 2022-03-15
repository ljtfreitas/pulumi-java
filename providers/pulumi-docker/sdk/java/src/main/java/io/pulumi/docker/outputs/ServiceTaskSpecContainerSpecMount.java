// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountBindOptions;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountTmpfsOptions;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountVolumeOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecMount {
    private final @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions;
    private final @Nullable Boolean readOnly;
    private final @Nullable String source;
    private final String target;
    private final @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions;
    private final String type;
    private final @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecMount(
        @CustomType.Parameter("bindOptions") @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("tmpfsOptions") @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeOptions") @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions) {
        this.bindOptions = bindOptions;
        this.readOnly = readOnly;
        this.source = source;
        this.target = target;
        this.tmpfsOptions = tmpfsOptions;
        this.type = type;
        this.volumeOptions = volumeOptions;
    }

    public Optional<ServiceTaskSpecContainerSpecMountBindOptions> getBindOptions() {
        return Optional.ofNullable(this.bindOptions);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public String getTarget() {
        return this.target;
    }
    public Optional<ServiceTaskSpecContainerSpecMountTmpfsOptions> getTmpfsOptions() {
        return Optional.ofNullable(this.tmpfsOptions);
    }
    public String getType() {
        return this.type;
    }
    public Optional<ServiceTaskSpecContainerSpecMountVolumeOptions> getVolumeOptions() {
        return Optional.ofNullable(this.volumeOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions;
        private @Nullable Boolean readOnly;
        private @Nullable String source;
        private String target;
        private @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions;
        private String type;
        private @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindOptions = defaults.bindOptions;
    	      this.readOnly = defaults.readOnly;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.tmpfsOptions = defaults.tmpfsOptions;
    	      this.type = defaults.type;
    	      this.volumeOptions = defaults.volumeOptions;
        }

        public Builder bindOptions(@Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions) {
            this.bindOptions = bindOptions;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder tmpfsOptions(@Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions) {
            this.tmpfsOptions = tmpfsOptions;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder volumeOptions(@Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions) {
            this.volumeOptions = volumeOptions;
            return this;
        }
        public ServiceTaskSpecContainerSpecMount build() {
            return new ServiceTaskSpecContainerSpecMount(bindOptions, readOnly, source, target, tmpfsOptions, type, volumeOptions);
        }
    }
}
