// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetDeadLetterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetDeadLetterConfigArgs Empty = new EventTargetDeadLetterConfigArgs();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    public EventTargetDeadLetterConfigArgs(@Nullable Output<String> arn) {
        this.arn = arn;
    }

    private EventTargetDeadLetterConfigArgs() {
        this.arn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetDeadLetterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetDeadLetterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public EventTargetDeadLetterConfigArgs build() {
            return new EventTargetDeadLetterConfigArgs(arn);
        }
    }
}
