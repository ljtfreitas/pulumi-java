// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleRepublishActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleRepublishActionArgs Empty = new TopicRuleRepublishActionArgs();

    @Import(name="qos")
      private final @Nullable Output<Integer> qos;

    public Output<Integer> getQos() {
        return this.qos == null ? Output.empty() : this.qos;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public TopicRuleRepublishActionArgs(
        @Nullable Output<Integer> qos,
        Output<String> roleArn,
        Output<String> topic) {
        this.qos = qos;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TopicRuleRepublishActionArgs() {
        this.qos = Output.empty();
        this.roleArn = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleRepublishActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> qos;
        private Output<String> roleArn;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleRepublishActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qos = defaults.qos;
    	      this.roleArn = defaults.roleArn;
    	      this.topic = defaults.topic;
        }

        public Builder qos(@Nullable Output<Integer> qos) {
            this.qos = qos;
            return this;
        }

        public Builder qos(@Nullable Integer qos) {
            this.qos = Output.ofNullable(qos);
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
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
        public TopicRuleRepublishActionArgs build() {
            return new TopicRuleRepublishActionArgs(qos, roleArn, topic);
        }
    }
}
