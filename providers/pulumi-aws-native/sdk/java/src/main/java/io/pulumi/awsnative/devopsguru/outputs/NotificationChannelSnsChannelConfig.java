// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationChannelSnsChannelConfig {
    private final @Nullable String topicArn;

    @OutputCustomType.Constructor({"topicArn"})
    private NotificationChannelSnsChannelConfig(@Nullable String topicArn) {
        this.topicArn = topicArn;
    }

    public Optional<String> getTopicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelSnsChannelConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelSnsChannelConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public NotificationChannelSnsChannelConfig build() {
            return new NotificationChannelSnsChannelConfig(topicArn);
        }
    }
}
