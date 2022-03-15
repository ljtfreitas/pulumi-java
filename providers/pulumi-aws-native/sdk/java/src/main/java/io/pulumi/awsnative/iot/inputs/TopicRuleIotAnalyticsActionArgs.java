// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleIotAnalyticsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleIotAnalyticsActionArgs Empty = new TopicRuleIotAnalyticsActionArgs();

    @Import(name="batchMode")
      private final @Nullable Output<Boolean> batchMode;

    public Output<Boolean> getBatchMode() {
        return this.batchMode == null ? Output.empty() : this.batchMode;
    }

    @Import(name="channelName", required=true)
      private final Output<String> channelName;

    public Output<String> getChannelName() {
        return this.channelName;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleIotAnalyticsActionArgs(
        @Nullable Output<Boolean> batchMode,
        Output<String> channelName,
        Output<String> roleArn) {
        this.batchMode = batchMode;
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleIotAnalyticsActionArgs() {
        this.batchMode = Output.empty();
        this.channelName = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotAnalyticsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> batchMode;
        private Output<String> channelName;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotAnalyticsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMode = defaults.batchMode;
    	      this.channelName = defaults.channelName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder batchMode(@Nullable Output<Boolean> batchMode) {
            this.batchMode = batchMode;
            return this;
        }

        public Builder batchMode(@Nullable Boolean batchMode) {
            this.batchMode = Output.ofNullable(batchMode);
            return this;
        }

        public Builder channelName(Output<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder channelName(String channelName) {
            this.channelName = Output.of(Objects.requireNonNull(channelName));
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
        public TopicRuleIotAnalyticsActionArgs build() {
            return new TopicRuleIotAnalyticsActionArgs(batchMode, channelName, roleArn);
        }
    }
}
