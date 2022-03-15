// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingClipboardMode;
import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingInstanceType;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamConfigurationSessionStorageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>A configuration for a streaming session.</p>
 * 
 */
public final class LaunchProfileStreamConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamConfigurationArgs Empty = new LaunchProfileStreamConfigurationArgs();

    @Import(name="clipboardMode", required=true)
      private final Output<LaunchProfileStreamingClipboardMode> clipboardMode;

    public Output<LaunchProfileStreamingClipboardMode> getClipboardMode() {
        return this.clipboardMode;
    }

    /**
     * <p>The EC2 instance types that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    @Import(name="ec2InstanceTypes", required=true)
      private final Output<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes;

    public Output<List<LaunchProfileStreamingInstanceType>> getEc2InstanceTypes() {
        return this.ec2InstanceTypes;
    }

    /**
     * <p>The length of time, in minutes, that a streaming session can be active before it is
     *             stopped or terminated. After this point, Nimble Studio automatically terminates or
     *             stops the session. The default length of time is 690 minutes, and the maximum length of
     *             time is 30 days.</p>
     * 
     */
    @Import(name="maxSessionLengthInMinutes")
      private final @Nullable Output<Double> maxSessionLengthInMinutes;

    public Output<Double> getMaxSessionLengthInMinutes() {
        return this.maxSessionLengthInMinutes == null ? Output.empty() : this.maxSessionLengthInMinutes;
    }

    /**
     * <p>Integer that determines if you can start and stop your sessions and how long a session
     *             can stay in the STOPPED state. The default value is 0. The maximum value is 5760.</p>
     *         <p>If the value is missing or set to 0, your sessions can’t be stopped. If you then call
     *             StopStreamingSession, the session fails. If the time that a session stays in the READY
     *             state exceeds the maxSessionLengthInMinutes value, the session will automatically be
     *             terminated by AWS (instead of stopped).</p>
     *         <p>If the value is set to a positive number, the session can be stopped. You can call
     *             StopStreamingSession to stop sessions in the READY state. If the time that a session
     *             stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will
     *             automatically be stopped by AWS (instead of terminated).</p>
     * 
     */
    @Import(name="maxStoppedSessionLengthInMinutes")
      private final @Nullable Output<Double> maxStoppedSessionLengthInMinutes;

    public Output<Double> getMaxStoppedSessionLengthInMinutes() {
        return this.maxStoppedSessionLengthInMinutes == null ? Output.empty() : this.maxStoppedSessionLengthInMinutes;
    }

    @Import(name="sessionStorage")
      private final @Nullable Output<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage;

    public Output<LaunchProfileStreamConfigurationSessionStorageArgs> getSessionStorage() {
        return this.sessionStorage == null ? Output.empty() : this.sessionStorage;
    }

    /**
     * <p>The streaming images that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    @Import(name="streamingImageIds", required=true)
      private final Output<List<String>> streamingImageIds;

    public Output<List<String>> getStreamingImageIds() {
        return this.streamingImageIds;
    }

    public LaunchProfileStreamConfigurationArgs(
        Output<LaunchProfileStreamingClipboardMode> clipboardMode,
        Output<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes,
        @Nullable Output<Double> maxSessionLengthInMinutes,
        @Nullable Output<Double> maxStoppedSessionLengthInMinutes,
        @Nullable Output<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage,
        Output<List<String>> streamingImageIds) {
        this.clipboardMode = Objects.requireNonNull(clipboardMode, "expected parameter 'clipboardMode' to be non-null");
        this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes, "expected parameter 'ec2InstanceTypes' to be non-null");
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
        this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
        this.sessionStorage = sessionStorage;
        this.streamingImageIds = Objects.requireNonNull(streamingImageIds, "expected parameter 'streamingImageIds' to be non-null");
    }

    private LaunchProfileStreamConfigurationArgs() {
        this.clipboardMode = Output.empty();
        this.ec2InstanceTypes = Output.empty();
        this.maxSessionLengthInMinutes = Output.empty();
        this.maxStoppedSessionLengthInMinutes = Output.empty();
        this.sessionStorage = Output.empty();
        this.streamingImageIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<LaunchProfileStreamingClipboardMode> clipboardMode;
        private Output<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes;
        private @Nullable Output<Double> maxSessionLengthInMinutes;
        private @Nullable Output<Double> maxStoppedSessionLengthInMinutes;
        private @Nullable Output<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage;
        private Output<List<String>> streamingImageIds;

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

        public Builder clipboardMode(Output<LaunchProfileStreamingClipboardMode> clipboardMode) {
            this.clipboardMode = Objects.requireNonNull(clipboardMode);
            return this;
        }

        public Builder clipboardMode(LaunchProfileStreamingClipboardMode clipboardMode) {
            this.clipboardMode = Output.of(Objects.requireNonNull(clipboardMode));
            return this;
        }

        public Builder ec2InstanceTypes(Output<List<LaunchProfileStreamingInstanceType>> ec2InstanceTypes) {
            this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes);
            return this;
        }

        public Builder ec2InstanceTypes(List<LaunchProfileStreamingInstanceType> ec2InstanceTypes) {
            this.ec2InstanceTypes = Output.of(Objects.requireNonNull(ec2InstanceTypes));
            return this;
        }

        public Builder maxSessionLengthInMinutes(@Nullable Output<Double> maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
            return this;
        }

        public Builder maxSessionLengthInMinutes(@Nullable Double maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = Output.ofNullable(maxSessionLengthInMinutes);
            return this;
        }

        public Builder maxStoppedSessionLengthInMinutes(@Nullable Output<Double> maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
            return this;
        }

        public Builder maxStoppedSessionLengthInMinutes(@Nullable Double maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = Output.ofNullable(maxStoppedSessionLengthInMinutes);
            return this;
        }

        public Builder sessionStorage(@Nullable Output<LaunchProfileStreamConfigurationSessionStorageArgs> sessionStorage) {
            this.sessionStorage = sessionStorage;
            return this;
        }

        public Builder sessionStorage(@Nullable LaunchProfileStreamConfigurationSessionStorageArgs sessionStorage) {
            this.sessionStorage = Output.ofNullable(sessionStorage);
            return this;
        }

        public Builder streamingImageIds(Output<List<String>> streamingImageIds) {
            this.streamingImageIds = Objects.requireNonNull(streamingImageIds);
            return this;
        }

        public Builder streamingImageIds(List<String> streamingImageIds) {
            this.streamingImageIds = Output.of(Objects.requireNonNull(streamingImageIds));
            return this;
        }
        public LaunchProfileStreamConfigurationArgs build() {
            return new LaunchProfileStreamConfigurationArgs(clipboardMode, ec2InstanceTypes, maxSessionLengthInMinutes, maxStoppedSessionLengthInMinutes, sessionStorage, streamingImageIds);
        }
    }
}
