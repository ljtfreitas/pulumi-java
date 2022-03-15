// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotResponseSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Response that Amazon Lex sends to the user when the intent is closed.
 * 
 */
public final class BotIntentClosingSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotIntentClosingSettingArgs Empty = new BotIntentClosingSettingArgs();

    @Import(name="closingResponse", required=true)
      private final Output<BotResponseSpecificationArgs> closingResponse;

    public Output<BotResponseSpecificationArgs> getClosingResponse() {
        return this.closingResponse;
    }

    @Import(name="isActive")
      private final @Nullable Output<Boolean> isActive;

    public Output<Boolean> getIsActive() {
        return this.isActive == null ? Output.empty() : this.isActive;
    }

    public BotIntentClosingSettingArgs(
        Output<BotResponseSpecificationArgs> closingResponse,
        @Nullable Output<Boolean> isActive) {
        this.closingResponse = Objects.requireNonNull(closingResponse, "expected parameter 'closingResponse' to be non-null");
        this.isActive = isActive;
    }

    private BotIntentClosingSettingArgs() {
        this.closingResponse = Output.empty();
        this.isActive = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentClosingSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BotResponseSpecificationArgs> closingResponse;
        private @Nullable Output<Boolean> isActive;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentClosingSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.closingResponse = defaults.closingResponse;
    	      this.isActive = defaults.isActive;
        }

        public Builder closingResponse(Output<BotResponseSpecificationArgs> closingResponse) {
            this.closingResponse = Objects.requireNonNull(closingResponse);
            return this;
        }

        public Builder closingResponse(BotResponseSpecificationArgs closingResponse) {
            this.closingResponse = Output.of(Objects.requireNonNull(closingResponse));
            return this;
        }

        public Builder isActive(@Nullable Output<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = Output.ofNullable(isActive);
            return this;
        }
        public BotIntentClosingSettingArgs build() {
            return new BotIntentClosingSettingArgs(closingResponse, isActive);
        }
    }
}
