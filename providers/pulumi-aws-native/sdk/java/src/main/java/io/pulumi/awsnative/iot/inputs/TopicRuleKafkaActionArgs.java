// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleKafkaActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleKafkaActionArgs Empty = new TopicRuleKafkaActionArgs();

    @Import(name="clientProperties", required=true)
      private final Output<Object> clientProperties;

    public Output<Object> getClientProperties() {
        return this.clientProperties;
    }

    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    @Import(name="partition")
      private final @Nullable Output<String> partition;

    public Output<String> getPartition() {
        return this.partition == null ? Output.empty() : this.partition;
    }

    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public TopicRuleKafkaActionArgs(
        Output<Object> clientProperties,
        Output<String> destinationArn,
        @Nullable Output<String> key,
        @Nullable Output<String> partition,
        Output<String> topic) {
        this.clientProperties = Objects.requireNonNull(clientProperties, "expected parameter 'clientProperties' to be non-null");
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.key = key;
        this.partition = partition;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TopicRuleKafkaActionArgs() {
        this.clientProperties = Output.empty();
        this.destinationArn = Output.empty();
        this.key = Output.empty();
        this.partition = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleKafkaActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> clientProperties;
        private Output<String> destinationArn;
        private @Nullable Output<String> key;
        private @Nullable Output<String> partition;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleKafkaActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientProperties = defaults.clientProperties;
    	      this.destinationArn = defaults.destinationArn;
    	      this.key = defaults.key;
    	      this.partition = defaults.partition;
    	      this.topic = defaults.topic;
        }

        public Builder clientProperties(Output<Object> clientProperties) {
            this.clientProperties = Objects.requireNonNull(clientProperties);
            return this;
        }

        public Builder clientProperties(Object clientProperties) {
            this.clientProperties = Output.of(Objects.requireNonNull(clientProperties));
            return this;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder partition(@Nullable Output<String> partition) {
            this.partition = partition;
            return this;
        }

        public Builder partition(@Nullable String partition) {
            this.partition = Output.ofNullable(partition);
            return this;
        }

        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Output.of(Objects.requireNonNull(topic));
            return this;
        }
        public TopicRuleKafkaActionArgs build() {
            return new TopicRuleKafkaActionArgs(clientProperties, destinationArn, key, partition, topic);
        }
    }
}
