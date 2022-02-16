// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingClipboardMode;
import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingInstanceType;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamConfigurationSessionStorage;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchProfileStreamConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final LaunchProfileStreamConfiguration Empty = new LaunchProfileStreamConfiguration();

    @InputImport(name="clipboardMode", required=true)
    private final LaunchProfileStreamingClipboardMode clipboardMode;

    public LaunchProfileStreamingClipboardMode getClipboardMode() {
        return this.clipboardMode;
    }

    @InputImport(name="ec2InstanceTypes", required=true)
    private final List<LaunchProfileStreamingInstanceType> ec2InstanceTypes;

    public List<LaunchProfileStreamingInstanceType> getEc2InstanceTypes() {
        return this.ec2InstanceTypes;
    }

    @InputImport(name="maxSessionLengthInMinutes")
    private final @Nullable Double maxSessionLengthInMinutes;

    public Optional<Double> getMaxSessionLengthInMinutes() {
        return this.maxSessionLengthInMinutes == null ? Optional.empty() : Optional.ofNullable(this.maxSessionLengthInMinutes);
    }

    @InputImport(name="maxStoppedSessionLengthInMinutes")
    private final @Nullable Double maxStoppedSessionLengthInMinutes;

    public Optional<Double> getMaxStoppedSessionLengthInMinutes() {
        return this.maxStoppedSessionLengthInMinutes == null ? Optional.empty() : Optional.ofNullable(this.maxStoppedSessionLengthInMinutes);
    }

    @InputImport(name="sessionStorage")
    private final @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage;

    public Optional<LaunchProfileStreamConfigurationSessionStorage> getSessionStorage() {
        return this.sessionStorage == null ? Optional.empty() : Optional.ofNullable(this.sessionStorage);
    }

    @InputImport(name="streamingImageIds", required=true)
    private final List<String> streamingImageIds;

    public List<String> getStreamingImageIds() {
        return this.streamingImageIds;
    }

    public LaunchProfileStreamConfiguration(
        LaunchProfileStreamingClipboardMode clipboardMode,
        List<LaunchProfileStreamingInstanceType> ec2InstanceTypes,
        @Nullable Double maxSessionLengthInMinutes,
        @Nullable Double maxStoppedSessionLengthInMinutes,
        @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage,
        List<String> streamingImageIds) {
        this.clipboardMode = Objects.requireNonNull(clipboardMode, "expected parameter 'clipboardMode' to be non-null");
        this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes, "expected parameter 'ec2InstanceTypes' to be non-null");
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
        this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
        this.sessionStorage = sessionStorage;
        this.streamingImageIds = Objects.requireNonNull(streamingImageIds, "expected parameter 'streamingImageIds' to be non-null");
    }

    private LaunchProfileStreamConfiguration() {
        this.clipboardMode = null;
        this.ec2InstanceTypes = List.of();
        this.maxSessionLengthInMinutes = null;
        this.maxStoppedSessionLengthInMinutes = null;
        this.sessionStorage = null;
        this.streamingImageIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchProfileStreamingClipboardMode clipboardMode;
        private List<LaunchProfileStreamingInstanceType> ec2InstanceTypes;
        private @Nullable Double maxSessionLengthInMinutes;
        private @Nullable Double maxStoppedSessionLengthInMinutes;
        private @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage;
        private List<String> streamingImageIds;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clipboardMode = defaults.clipboardMode;
    	      this.ec2InstanceTypes = defaults.ec2InstanceTypes;
    	      this.maxSessionLengthInMinutes = defaults.maxSessionLengthInMinutes;
    	      this.maxStoppedSessionLengthInMinutes = defaults.maxStoppedSessionLengthInMinutes;
    	      this.sessionStorage = defaults.sessionStorage;
    	      this.streamingImageIds = defaults.streamingImageIds;
        }

        public Builder setClipboardMode(LaunchProfileStreamingClipboardMode clipboardMode) {
            this.clipboardMode = Objects.requireNonNull(clipboardMode);
            return this;
        }

        public Builder setEc2InstanceTypes(List<LaunchProfileStreamingInstanceType> ec2InstanceTypes) {
            this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes);
            return this;
        }

        public Builder setMaxSessionLengthInMinutes(@Nullable Double maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
            return this;
        }

        public Builder setMaxStoppedSessionLengthInMinutes(@Nullable Double maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
            return this;
        }

        public Builder setSessionStorage(@Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage) {
            this.sessionStorage = sessionStorage;
            return this;
        }

        public Builder setStreamingImageIds(List<String> streamingImageIds) {
            this.streamingImageIds = Objects.requireNonNull(streamingImageIds);
            return this;
        }

        public LaunchProfileStreamConfiguration build() {
            return new LaunchProfileStreamConfiguration(clipboardMode, ec2InstanceTypes, maxSessionLengthInMinutes, maxStoppedSessionLengthInMinutes, sessionStorage, streamingImageIds);
        }
    }
}