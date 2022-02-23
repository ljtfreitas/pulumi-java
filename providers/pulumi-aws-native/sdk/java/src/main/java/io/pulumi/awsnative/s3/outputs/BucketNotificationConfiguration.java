// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketEventBridgeConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLambdaConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketQueueConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketTopicConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketNotificationConfiguration {
    private final @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration;
    private final @Nullable List<BucketLambdaConfiguration> lambdaConfigurations;
    private final @Nullable List<BucketQueueConfiguration> queueConfigurations;
    private final @Nullable List<BucketTopicConfiguration> topicConfigurations;

    @OutputCustomType.Constructor({"eventBridgeConfiguration","lambdaConfigurations","queueConfigurations","topicConfigurations"})
    private BucketNotificationConfiguration(
        @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration,
        @Nullable List<BucketLambdaConfiguration> lambdaConfigurations,
        @Nullable List<BucketQueueConfiguration> queueConfigurations,
        @Nullable List<BucketTopicConfiguration> topicConfigurations) {
        this.eventBridgeConfiguration = eventBridgeConfiguration;
        this.lambdaConfigurations = lambdaConfigurations;
        this.queueConfigurations = queueConfigurations;
        this.topicConfigurations = topicConfigurations;
    }

    public Optional<BucketEventBridgeConfiguration> getEventBridgeConfiguration() {
        return Optional.ofNullable(this.eventBridgeConfiguration);
    }
    public List<BucketLambdaConfiguration> getLambdaConfigurations() {
        return this.lambdaConfigurations == null ? List.of() : this.lambdaConfigurations;
    }
    public List<BucketQueueConfiguration> getQueueConfigurations() {
        return this.queueConfigurations == null ? List.of() : this.queueConfigurations;
    }
    public List<BucketTopicConfiguration> getTopicConfigurations() {
        return this.topicConfigurations == null ? List.of() : this.topicConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration;
        private @Nullable List<BucketLambdaConfiguration> lambdaConfigurations;
        private @Nullable List<BucketQueueConfiguration> queueConfigurations;
        private @Nullable List<BucketTopicConfiguration> topicConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridgeConfiguration = defaults.eventBridgeConfiguration;
    	      this.lambdaConfigurations = defaults.lambdaConfigurations;
    	      this.queueConfigurations = defaults.queueConfigurations;
    	      this.topicConfigurations = defaults.topicConfigurations;
        }

        public Builder setEventBridgeConfiguration(@Nullable BucketEventBridgeConfiguration eventBridgeConfiguration) {
            this.eventBridgeConfiguration = eventBridgeConfiguration;
            return this;
        }

        public Builder setLambdaConfigurations(@Nullable List<BucketLambdaConfiguration> lambdaConfigurations) {
            this.lambdaConfigurations = lambdaConfigurations;
            return this;
        }

        public Builder setQueueConfigurations(@Nullable List<BucketQueueConfiguration> queueConfigurations) {
            this.queueConfigurations = queueConfigurations;
            return this;
        }

        public Builder setTopicConfigurations(@Nullable List<BucketTopicConfiguration> topicConfigurations) {
            this.topicConfigurations = topicConfigurations;
            return this;
        }
        public BucketNotificationConfiguration build() {
            return new BucketNotificationConfiguration(eventBridgeConfiguration, lambdaConfigurations, queueConfigurations, topicConfigurations);
        }
    }
}
