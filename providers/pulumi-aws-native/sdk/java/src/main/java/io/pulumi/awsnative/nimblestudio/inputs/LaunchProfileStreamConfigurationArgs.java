// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingClipboardMode;
import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingInstanceType;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamConfigurationSessionStorageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchProfileStreamConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamConfigurationArgs Empty = new LaunchProfileStreamConfigurationArgs();

    @InputImport(name="clipboardMode", required=true)
    private final Input<LaunchProfileStreamingClipboardMode> clipboardMode;

    public Input<LaunchProfileStreamingClipboardMode> getClipboardMode() {
        return this.clipboardMode;
    }

    @InputImport(name="ec2InstanceTypes", required=true)
    private final Input<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes;

    public Input<List<LaunchProfileStreamingInstanceType>> getEc2InstanceTypes() {
        return this.ec2InstanceTypes;
    }

    @InputImport(name="maxSessionLengthInMinutes")
    private final @Nullable Input<Double> maxSessionLengthInMinutes;

    public Input<Double> getMaxSessionLengthInMinutes() {
        return this.maxSessionLengthInMinutes == null ? Input.empty() : this.maxSessionLengthInMinutes;
    }

    @InputImport(name="maxStoppedSessionLengthInMinutes")
    private final @Nullable Input<Double> maxStoppedSessionLengthInMinutes;

    public Input<Double> getMaxStoppedSessionLengthInMinutes() {
        return this.maxStoppedSessionLengthInMinutes == null ? Input.empty() : this.maxStoppedSessionLengthInMinutes;
    }

    @InputImport(name="sessionStorage")
    private final @Nullable Input<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage;

    public Input<LaunchProfileStreamConfigurationSessionStorageArgs> getSessionStorage() {
        return this.sessionStorage == null ? Input.empty() : this.sessionStorage;
    }

    @InputImport(name="streamingImageIds", required=true)
    private final Input<List<String>> streamingImageIds;

    public Input<List<String>> getStreamingImageIds() {
        return this.streamingImageIds;
    }

    public LaunchProfileStreamConfigurationArgs(
        Input<LaunchProfileStreamingClipboardMode> clipboardMode,
        Input<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes,
        @Nullable Input<Double> maxSessionLengthInMinutes,
        @Nullable Input<Double> maxStoppedSessionLengthInMinutes,
        @Nullable Input<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage,
        Input<List<String>> streamingImageIds) {
        this.clipboardMode = Objects.requireNonNull(clipboardMode, "expected parameter 'clipboardMode' to be non-null");
        this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes, "expected parameter 'ec2InstanceTypes' to be non-null");
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
        this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
        this.sessionStorage = sessionStorage;
        this.streamingImageIds = Objects.requireNonNull(streamingImageIds, "expected parameter 'streamingImageIds' to be non-null");
    }

    private LaunchProfileStreamConfigurationArgs() {
        this.clipboardMode = Input.empty();
        this.ec2InstanceTypes = Input.empty();
        this.maxSessionLengthInMinutes = Input.empty();
        this.maxStoppedSessionLengthInMinutes = Input.empty();
        this.sessionStorage = Input.empty();
        this.streamingImageIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LaunchProfileStreamingClipboardMode> clipboardMode;
        private Input<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes;
        private @Nullable Input<Double> maxSessionLengthInMinutes;
        private @Nullable Input<Double> maxStoppedSessionLengthInMinutes;
        private @Nullable Input<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage;
        private Input<List<String>> streamingImageIds;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clipboardMode = defaults.clipboardMode;
    	      this.ec2InstanceTypes = defaults.ec2InstanceTypes;
    	      this.maxSessionLengthInMinutes = defaults.maxSessionLengthInMinutes;
    	      this.maxStoppedSessionLengthInMinutes = defaults.maxStoppedSessionLengthInMinutes;
    	      this.sessionStorage = defaults.sessionStorage;
    	      this.streamingImageIds = defaults.streamingImageIds;
        }

        public Builder setClipboardMode(Input<LaunchProfileStreamingClipboardMode> clipboardMode) {
            this.clipboardMode = Objects.requireNonNull(clipboardMode);
            return this;
        }

        public Builder setClipboardMode(LaunchProfileStreamingClipboardMode clipboardMode) {
            this.clipboardMode = Input.of(Objects.requireNonNull(clipboardMode));
            return this;
        }

        public Builder setEc2InstanceTypes(Input<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes) {
            this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes);
            return this;
        }

        public Builder setEc2InstanceTypes(List<LaunchProfileStreamingInstanceType> ec2InstanceTypes) {
            this.ec2InstanceTypes = Input.of(Objects.requireNonNull(ec2InstanceTypes));
            return this;
        }

        public Builder setMaxSessionLengthInMinutes(@Nullable Input<Double> maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
            return this;
        }

        public Builder setMaxSessionLengthInMinutes(@Nullable Double maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = Input.ofNullable(maxSessionLengthInMinutes);
            return this;
        }

        public Builder setMaxStoppedSessionLengthInMinutes(@Nullable Input<Double> maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
            return this;
        }

        public Builder setMaxStoppedSessionLengthInMinutes(@Nullable Double maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = Input.ofNullable(maxStoppedSessionLengthInMinutes);
            return this;
        }

        public Builder setSessionStorage(@Nullable Input<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage) {
            this.sessionStorage = sessionStorage;
            return this;
        }

        public Builder setSessionStorage(@Nullable LaunchProfileStreamConfigurationSessionStorageArgs sessionStorage) {
            this.sessionStorage = Input.ofNullable(sessionStorage);
            return this;
        }

        public Builder setStreamingImageIds(Input<List<String>> streamingImageIds) {
            this.streamingImageIds = Objects.requireNonNull(streamingImageIds);
            return this;
        }

        public Builder setStreamingImageIds(List<String> streamingImageIds) {
            this.streamingImageIds = Input.of(Objects.requireNonNull(streamingImageIds));
            return this;
        }

        public LaunchProfileStreamConfigurationArgs build() {
            return new LaunchProfileStreamConfigurationArgs(clipboardMode, ec2InstanceTypes, maxSessionLengthInMinutes, maxStoppedSessionLengthInMinutes, sessionStorage, streamingImageIds);
        }
    }
}