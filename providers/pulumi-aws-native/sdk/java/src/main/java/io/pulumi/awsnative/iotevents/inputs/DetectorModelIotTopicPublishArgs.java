// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information required to publish the MQTT message through the AWS IoT message broker.
 * 
 */
public final class DetectorModelIotTopicPublishArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelIotTopicPublishArgs Empty = new DetectorModelIotTopicPublishArgs();

    /**
     * The MQTT topic of the message. You can use a string expression that includes variables (`$variable.<variable-name>`) and input values (`$input.<input-name>.<path-to-datum>`) as the topic string.
     * 
     */
    @Import(name="mqttTopic", required=true)
      private final Output<String> mqttTopic;

    public Output<String> getMqttTopic() {
        return this.mqttTopic;
    }

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    public DetectorModelIotTopicPublishArgs(
        Output<String> mqttTopic,
        @Nullable Output<DetectorModelPayloadArgs> payload) {
        this.mqttTopic = Objects.requireNonNull(mqttTopic, "expected parameter 'mqttTopic' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotTopicPublishArgs() {
        this.mqttTopic = Output.empty();
        this.payload = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotTopicPublishArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> mqttTopic;
        private @Nullable Output<DetectorModelPayloadArgs> payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotTopicPublishArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttTopic = defaults.mqttTopic;
    	      this.payload = defaults.payload;
        }

        public Builder mqttTopic(Output<String> mqttTopic) {
            this.mqttTopic = Objects.requireNonNull(mqttTopic);
            return this;
        }

        public Builder mqttTopic(String mqttTopic) {
            this.mqttTopic = Output.of(Objects.requireNonNull(mqttTopic));
            return this;
        }

        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }
        public DetectorModelIotTopicPublishArgs build() {
            return new DetectorModelIotTopicPublishArgs(mqttTopic, payload);
        }
    }
}
