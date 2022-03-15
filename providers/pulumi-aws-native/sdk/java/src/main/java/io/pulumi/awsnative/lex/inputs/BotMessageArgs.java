// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotCustomPayloadArgs;
import io.pulumi.awsnative.lex.inputs.BotImageResponseCardArgs;
import io.pulumi.awsnative.lex.inputs.BotPlainTextMessageArgs;
import io.pulumi.awsnative.lex.inputs.BotSSMLMessageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The primary message that Amazon Lex should send to the user.
 * 
 */
public final class BotMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotMessageArgs Empty = new BotMessageArgs();

    @Import(name="customPayload")
      private final @Nullable Output<BotCustomPayloadArgs> customPayload;

    public Output<BotCustomPayloadArgs> getCustomPayload() {
        return this.customPayload == null ? Output.empty() : this.customPayload;
    }

    @Import(name="imageResponseCard")
      private final @Nullable Output<BotImageResponseCardArgs> imageResponseCard;

    public Output<BotImageResponseCardArgs> getImageResponseCard() {
        return this.imageResponseCard == null ? Output.empty() : this.imageResponseCard;
    }

    @Import(name="plainTextMessage")
      private final @Nullable Output<BotPlainTextMessageArgs> plainTextMessage;

    public Output<BotPlainTextMessageArgs> getPlainTextMessage() {
        return this.plainTextMessage == null ? Output.empty() : this.plainTextMessage;
    }

    @Import(name="sSMLMessage")
      private final @Nullable Output<BotSSMLMessageArgs> sSMLMessage;

    public Output<BotSSMLMessageArgs> getSSMLMessage() {
        return this.sSMLMessage == null ? Output.empty() : this.sSMLMessage;
    }

    public BotMessageArgs(
        @Nullable Output<BotCustomPayloadArgs> customPayload,
        @Nullable Output<BotImageResponseCardArgs> imageResponseCard,
        @Nullable Output<BotPlainTextMessageArgs> plainTextMessage,
        @Nullable Output<BotSSMLMessageArgs> sSMLMessage) {
        this.customPayload = customPayload;
        this.imageResponseCard = imageResponseCard;
        this.plainTextMessage = plainTextMessage;
        this.sSMLMessage = sSMLMessage;
    }

    private BotMessageArgs() {
        this.customPayload = Output.empty();
        this.imageResponseCard = Output.empty();
        this.plainTextMessage = Output.empty();
        this.sSMLMessage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BotCustomPayloadArgs> customPayload;
        private @Nullable Output<BotImageResponseCardArgs> imageResponseCard;
        private @Nullable Output<BotPlainTextMessageArgs> plainTextMessage;
        private @Nullable Output<BotSSMLMessageArgs> sSMLMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(BotMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPayload = defaults.customPayload;
    	      this.imageResponseCard = defaults.imageResponseCard;
    	      this.plainTextMessage = defaults.plainTextMessage;
    	      this.sSMLMessage = defaults.sSMLMessage;
        }

        public Builder customPayload(@Nullable Output<BotCustomPayloadArgs> customPayload) {
            this.customPayload = customPayload;
            return this;
        }

        public Builder customPayload(@Nullable BotCustomPayloadArgs customPayload) {
            this.customPayload = Output.ofNullable(customPayload);
            return this;
        }

        public Builder imageResponseCard(@Nullable Output<BotImageResponseCardArgs> imageResponseCard) {
            this.imageResponseCard = imageResponseCard;
            return this;
        }

        public Builder imageResponseCard(@Nullable BotImageResponseCardArgs imageResponseCard) {
            this.imageResponseCard = Output.ofNullable(imageResponseCard);
            return this;
        }

        public Builder plainTextMessage(@Nullable Output<BotPlainTextMessageArgs> plainTextMessage) {
            this.plainTextMessage = plainTextMessage;
            return this;
        }

        public Builder plainTextMessage(@Nullable BotPlainTextMessageArgs plainTextMessage) {
            this.plainTextMessage = Output.ofNullable(plainTextMessage);
            return this;
        }

        public Builder sSMLMessage(@Nullable Output<BotSSMLMessageArgs> sSMLMessage) {
            this.sSMLMessage = sSMLMessage;
            return this;
        }

        public Builder sSMLMessage(@Nullable BotSSMLMessageArgs sSMLMessage) {
            this.sSMLMessage = Output.ofNullable(sSMLMessage);
            return this;
        }
        public BotMessageArgs build() {
            return new BotMessageArgs(customPayload, imageResponseCard, plainTextMessage, sSMLMessage);
        }
    }
}
