// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotResponseSpecification;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotIntentClosingSetting {
    private final BotResponseSpecification closingResponse;
    private final @Nullable Boolean isActive;

    @CustomType.Constructor
    private BotIntentClosingSetting(
        @CustomType.Parameter("closingResponse") BotResponseSpecification closingResponse,
        @CustomType.Parameter("isActive") @Nullable Boolean isActive) {
        this.closingResponse = closingResponse;
        this.isActive = isActive;
    }

    public BotResponseSpecification getClosingResponse() {
        return this.closingResponse;
    }
    public Optional<Boolean> getIsActive() {
        return Optional.ofNullable(this.isActive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentClosingSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotResponseSpecification closingResponse;
        private @Nullable Boolean isActive;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentClosingSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.closingResponse = defaults.closingResponse;
    	      this.isActive = defaults.isActive;
        }

        public Builder closingResponse(BotResponseSpecification closingResponse) {
            this.closingResponse = Objects.requireNonNull(closingResponse);
            return this;
        }

        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public BotIntentClosingSetting build() {
            return new BotIntentClosingSetting(closingResponse, isActive);
        }
    }
}
