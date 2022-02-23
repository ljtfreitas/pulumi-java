// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="mqttTopic", required=true)
        private final Input<String> mqttTopic;

    public Input<String> getMqttTopic() {
        return this.mqttTopic;
    }

    @InputImport(name="payload")
        private final @Nullable Input<DetectorModelPayloadArgs> payload;

    public Input<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    public DetectorModelIotTopicPublishArgs(
        Input<String> mqttTopic,
        @Nullable Input<DetectorModelPayloadArgs> payload) {
        this.mqttTopic = Objects.requireNonNull(mqttTopic, "expected parameter 'mqttTopic' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotTopicPublishArgs() {
        this.mqttTopic = Input.empty();
        this.payload = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotTopicPublishArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mqttTopic;
        private @Nullable Input<DetectorModelPayloadArgs> payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotTopicPublishArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttTopic = defaults.mqttTopic;
    	      this.payload = defaults.payload;
        }

        public Builder setMqttTopic(Input<String> mqttTopic) {
            this.mqttTopic = Objects.requireNonNull(mqttTopic);
            return this;
        }

        public Builder setMqttTopic(String mqttTopic) {
            this.mqttTopic = Input.of(Objects.requireNonNull(mqttTopic));
            return this;
        }

        public Builder setPayload(@Nullable Input<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }
        public DetectorModelIotTopicPublishArgs build() {
            return new DetectorModelIotTopicPublishArgs(mqttTopic, payload);
        }
    }
}
