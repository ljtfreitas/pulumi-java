// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotResponseSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotPostFulfillmentStatusSpecification {
    private final @Nullable BotResponseSpecification failureResponse;
    private final @Nullable BotResponseSpecification successResponse;
    private final @Nullable BotResponseSpecification timeoutResponse;

    @OutputCustomType.Constructor({"failureResponse","successResponse","timeoutResponse"})
    private BotPostFulfillmentStatusSpecification(
        @Nullable BotResponseSpecification failureResponse,
        @Nullable BotResponseSpecification successResponse,
        @Nullable BotResponseSpecification timeoutResponse) {
        this.failureResponse = failureResponse;
        this.successResponse = successResponse;
        this.timeoutResponse = timeoutResponse;
    }

    public Optional<BotResponseSpecification> getFailureResponse() {
        return Optional.ofNullable(this.failureResponse);
    }
    public Optional<BotResponseSpecification> getSuccessResponse() {
        return Optional.ofNullable(this.successResponse);
    }
    public Optional<BotResponseSpecification> getTimeoutResponse() {
        return Optional.ofNullable(this.timeoutResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPostFulfillmentStatusSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotResponseSpecification failureResponse;
        private @Nullable BotResponseSpecification successResponse;
        private @Nullable BotResponseSpecification timeoutResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPostFulfillmentStatusSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureResponse = defaults.failureResponse;
    	      this.successResponse = defaults.successResponse;
    	      this.timeoutResponse = defaults.timeoutResponse;
        }

        public Builder setFailureResponse(@Nullable BotResponseSpecification failureResponse) {
            this.failureResponse = failureResponse;
            return this;
        }

        public Builder setSuccessResponse(@Nullable BotResponseSpecification successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public Builder setTimeoutResponse(@Nullable BotResponseSpecification timeoutResponse) {
            this.timeoutResponse = timeoutResponse;
            return this;
        }
        public BotPostFulfillmentStatusSpecification build() {
            return new BotPostFulfillmentStatusSpecification(failureResponse, successResponse, timeoutResponse);
        }
    }
}
