// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The chat channel configuration.
 * 
 */
public final class ResponsePlanChatChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanChatChannelArgs Empty = new ResponsePlanChatChannelArgs();

    @InputImport(name="chatbotSns")
        private final @Nullable Input<List<String>> chatbotSns;

    public Input<List<String>> getChatbotSns() {
        return this.chatbotSns == null ? Input.empty() : this.chatbotSns;
    }

    public ResponsePlanChatChannelArgs(@Nullable Input<List<String>> chatbotSns) {
        this.chatbotSns = chatbotSns;
    }

    private ResponsePlanChatChannelArgs() {
        this.chatbotSns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanChatChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> chatbotSns;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanChatChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chatbotSns = defaults.chatbotSns;
        }

        public Builder setChatbotSns(@Nullable Input<List<String>> chatbotSns) {
            this.chatbotSns = chatbotSns;
            return this;
        }

        public Builder setChatbotSns(@Nullable List<String> chatbotSns) {
            this.chatbotSns = Input.ofNullable(chatbotSns);
            return this;
        }
        public ResponsePlanChatChannelArgs build() {
            return new ResponsePlanChatChannelArgs(chatbotSns);
        }
    }
}
