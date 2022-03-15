// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventTargetDeadLetterConfig {
    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    private final @Nullable String arn;

    @CustomType.Constructor
    private EventTargetDeadLetterConfig(@CustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public EventTargetDeadLetterConfig build() {
            return new EventTargetDeadLetterConfig(arn);
        }
    }
}
