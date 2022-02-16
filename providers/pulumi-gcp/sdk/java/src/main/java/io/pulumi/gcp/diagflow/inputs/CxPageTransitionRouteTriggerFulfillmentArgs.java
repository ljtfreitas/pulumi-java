// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteTriggerFulfillmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteTriggerFulfillmentArgs Empty = new CxPageTransitionRouteTriggerFulfillmentArgs();

    @InputImport(name="messages")
    private final @Nullable Input<List<CxPageTransitionRouteTriggerFulfillmentMessageArgs>> messages;

    public Input<List<CxPageTransitionRouteTriggerFulfillmentMessageArgs>> getMessages() {
        return this.messages == null ? Input.empty() : this.messages;
    }

    @InputImport(name="returnPartialResponses")
    private final @Nullable Input<Boolean> returnPartialResponses;

    public Input<Boolean> getReturnPartialResponses() {
        return this.returnPartialResponses == null ? Input.empty() : this.returnPartialResponses;
    }

    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    @InputImport(name="webhook")
    private final @Nullable Input<String> webhook;

    public Input<String> getWebhook() {
        return this.webhook == null ? Input.empty() : this.webhook;
    }

    public CxPageTransitionRouteTriggerFulfillmentArgs(
        @Nullable Input<List<CxPageTransitionRouteTriggerFulfillmentMessageArgs>> messages,
        @Nullable Input<Boolean> returnPartialResponses,
        @Nullable Input<String> tag,
        @Nullable Input<String> webhook) {
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.tag = tag;
        this.webhook = webhook;
    }

    private CxPageTransitionRouteTriggerFulfillmentArgs() {
        this.messages = Input.empty();
        this.returnPartialResponses = Input.empty();
        this.tag = Input.empty();
        this.webhook = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CxPageTransitionRouteTriggerFulfillmentMessageArgs>> messages;
        private @Nullable Input<Boolean> returnPartialResponses;
        private @Nullable Input<String> tag;
        private @Nullable Input<String> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setMessages(@Nullable Input<List<CxPageTransitionRouteTriggerFulfillmentMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder setMessages(@Nullable List<CxPageTransitionRouteTriggerFulfillmentMessageArgs> messages) {
            this.messages = Input.ofNullable(messages);
            return this;
        }

        public Builder setReturnPartialResponses(@Nullable Input<Boolean> returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }

        public Builder setReturnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = Input.ofNullable(returnPartialResponses);
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public Builder setWebhook(@Nullable Input<String> webhook) {
            this.webhook = webhook;
            return this;
        }

        public Builder setWebhook(@Nullable String webhook) {
            this.webhook = Input.ofNullable(webhook);
            return this;
        }

        public CxPageTransitionRouteTriggerFulfillmentArgs build() {
            return new CxPageTransitionRouteTriggerFulfillmentArgs(messages, returnPartialResponses, tag, webhook);
        }
    }
}