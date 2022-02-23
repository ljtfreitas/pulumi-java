// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMessageGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides settings for a message that is sent to the user when a fulfillment Lambda function starts running.
 * 
 */
public final class BotFulfillmentStartResponseSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotFulfillmentStartResponseSpecificationArgs Empty = new BotFulfillmentStartResponseSpecificationArgs();

    /**
     * Determines whether the user can interrupt the start message while it is playing.
     * 
     */
    @InputImport(name="allowInterrupt")
        private final @Nullable Input<Boolean> allowInterrupt;

    public Input<Boolean> getAllowInterrupt() {
        return this.allowInterrupt == null ? Input.empty() : this.allowInterrupt;
    }

    /**
     * The delay between when the Lambda fulfillment function starts running and the start message is played. If the Lambda function returns before the delay is over, the start message isn't played.
     * 
     */
    @InputImport(name="delayInSeconds", required=true)
        private final Input<Integer> delayInSeconds;

    public Input<Integer> getDelayInSeconds() {
        return this.delayInSeconds;
    }

    @InputImport(name="messageGroups", required=true)
        private final Input<List<BotMessageGroupArgs>> messageGroups;

    public Input<List<BotMessageGroupArgs>> getMessageGroups() {
        return this.messageGroups;
    }

    public BotFulfillmentStartResponseSpecificationArgs(
        @Nullable Input<Boolean> allowInterrupt,
        Input<Integer> delayInSeconds,
        Input<List<BotMessageGroupArgs>> messageGroups) {
        this.allowInterrupt = allowInterrupt;
        this.delayInSeconds = Objects.requireNonNull(delayInSeconds, "expected parameter 'delayInSeconds' to be non-null");
        this.messageGroups = Objects.requireNonNull(messageGroups, "expected parameter 'messageGroups' to be non-null");
    }

    private BotFulfillmentStartResponseSpecificationArgs() {
        this.allowInterrupt = Input.empty();
        this.delayInSeconds = Input.empty();
        this.messageGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotFulfillmentStartResponseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInterrupt;
        private Input<Integer> delayInSeconds;
        private Input<List<BotMessageGroupArgs>> messageGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(BotFulfillmentStartResponseSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.delayInSeconds = defaults.delayInSeconds;
    	      this.messageGroups = defaults.messageGroups;
        }

        public Builder setAllowInterrupt(@Nullable Input<Boolean> allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder setAllowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = Input.ofNullable(allowInterrupt);
            return this;
        }

        public Builder setDelayInSeconds(Input<Integer> delayInSeconds) {
            this.delayInSeconds = Objects.requireNonNull(delayInSeconds);
            return this;
        }

        public Builder setDelayInSeconds(Integer delayInSeconds) {
            this.delayInSeconds = Input.of(Objects.requireNonNull(delayInSeconds));
            return this;
        }

        public Builder setMessageGroups(Input<List<BotMessageGroupArgs>> messageGroups) {
            this.messageGroups = Objects.requireNonNull(messageGroups);
            return this;
        }

        public Builder setMessageGroups(List<BotMessageGroupArgs> messageGroups) {
            this.messageGroups = Input.of(Objects.requireNonNull(messageGroups));
            return this;
        }
        public BotFulfillmentStartResponseSpecificationArgs build() {
            return new BotFulfillmentStartResponseSpecificationArgs(allowInterrupt, delayInSeconds, messageGroups);
        }
    }
}
