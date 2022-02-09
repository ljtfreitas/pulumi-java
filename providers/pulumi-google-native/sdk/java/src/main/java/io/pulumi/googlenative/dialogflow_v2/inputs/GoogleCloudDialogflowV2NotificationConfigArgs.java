// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2NotificationConfigMessageFormat;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowV2NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2NotificationConfigArgs Empty = new GoogleCloudDialogflowV2NotificationConfigArgs();

    @InputImport(name="messageFormat")
    private final @Nullable Input<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat;

    public Input<GoogleCloudDialogflowV2NotificationConfigMessageFormat> getMessageFormat() {
        return this.messageFormat == null ? Input.empty() : this.messageFormat;
    }

    @InputImport(name="topic")
    private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public GoogleCloudDialogflowV2NotificationConfigArgs(
        @Nullable Input<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat,
        @Nullable Input<String> topic) {
        this.messageFormat = messageFormat;
        this.topic = topic;
    }

    private GoogleCloudDialogflowV2NotificationConfigArgs() {
        this.messageFormat = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.topic = defaults.topic;
        }

        public Builder setMessageFormat(@Nullable Input<GoogleCloudDialogflowV2NotificationConfigMessageFormat> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder setMessageFormat(@Nullable GoogleCloudDialogflowV2NotificationConfigMessageFormat messageFormat) {
            this.messageFormat = Input.ofNullable(messageFormat);
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }

        public GoogleCloudDialogflowV2NotificationConfigArgs build() {
            return new GoogleCloudDialogflowV2NotificationConfigArgs(messageFormat, topic);
        }
    }
}