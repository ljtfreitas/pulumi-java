// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetSqsTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetSqsTargetGetArgs Empty = new EventTargetSqsTargetGetArgs();

    /**
     * The FIFO message group ID to use as the target.
     * 
     */
    @Import(name="messageGroupId")
      private final @Nullable Output<String> messageGroupId;

    public Output<String> getMessageGroupId() {
        return this.messageGroupId == null ? Output.empty() : this.messageGroupId;
    }

    public EventTargetSqsTargetGetArgs(@Nullable Output<String> messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    private EventTargetSqsTargetGetArgs() {
        this.messageGroupId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetSqsTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> messageGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetSqsTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageGroupId = defaults.messageGroupId;
        }

        public Builder messageGroupId(@Nullable Output<String> messageGroupId) {
            this.messageGroupId = messageGroupId;
            return this;
        }

        public Builder messageGroupId(@Nullable String messageGroupId) {
            this.messageGroupId = Output.ofNullable(messageGroupId);
            return this;
        }
        public EventTargetSqsTargetGetArgs build() {
            return new EventTargetSqsTargetGetArgs(messageGroupId);
        }
    }
}
