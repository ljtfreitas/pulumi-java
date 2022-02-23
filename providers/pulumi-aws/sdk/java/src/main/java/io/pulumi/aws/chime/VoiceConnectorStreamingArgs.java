// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorStreamingArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorStreamingArgs Empty = new VoiceConnectorStreamingArgs();

    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    @InputImport(name="dataRetention", required=true)
    private final Input<Integer> dataRetention;

    public Input<Integer> getDataRetention() {
        return this.dataRetention;
    }

    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    @InputImport(name="streamingNotificationTargets")
    private final @Nullable Input<List<String>> streamingNotificationTargets;

    public Input<List<String>> getStreamingNotificationTargets() {
        return this.streamingNotificationTargets == null ? Input.empty() : this.streamingNotificationTargets;
    }

    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @InputImport(name="voiceConnectorId", required=true)
    private final Input<String> voiceConnectorId;

    public Input<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public VoiceConnectorStreamingArgs(
        Input<Integer> dataRetention,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<List<String>> streamingNotificationTargets,
        Input<String> voiceConnectorId) {
        this.dataRetention = Objects.requireNonNull(dataRetention, "expected parameter 'dataRetention' to be non-null");
        this.disabled = disabled;
        this.streamingNotificationTargets = streamingNotificationTargets;
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
    }

    private VoiceConnectorStreamingArgs() {
        this.dataRetention = Input.empty();
        this.disabled = Input.empty();
        this.streamingNotificationTargets = Input.empty();
        this.voiceConnectorId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorStreamingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> dataRetention;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<List<String>> streamingNotificationTargets;
        private Input<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorStreamingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetention = defaults.dataRetention;
    	      this.disabled = defaults.disabled;
    	      this.streamingNotificationTargets = defaults.streamingNotificationTargets;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder setDataRetention(Input<Integer> dataRetention) {
            this.dataRetention = Objects.requireNonNull(dataRetention);
            return this;
        }

        public Builder setDataRetention(Integer dataRetention) {
            this.dataRetention = Input.of(Objects.requireNonNull(dataRetention));
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setStreamingNotificationTargets(@Nullable Input<List<String>> streamingNotificationTargets) {
            this.streamingNotificationTargets = streamingNotificationTargets;
            return this;
        }

        public Builder setStreamingNotificationTargets(@Nullable List<String> streamingNotificationTargets) {
            this.streamingNotificationTargets = Input.ofNullable(streamingNotificationTargets);
            return this;
        }

        public Builder setVoiceConnectorId(Input<String> voiceConnectorId) {
            this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
            return this;
        }

        public Builder setVoiceConnectorId(String voiceConnectorId) {
            this.voiceConnectorId = Input.of(Objects.requireNonNull(voiceConnectorId));
            return this;
        }
        public VoiceConnectorStreamingArgs build() {
            return new VoiceConnectorStreamingArgs(dataRetention, disabled, streamingNotificationTargets, voiceConnectorId);
        }
    }
}
