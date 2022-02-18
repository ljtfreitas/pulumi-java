// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.OperationType;
import io.pulumi.azurenative.insights.inputs.EmailNotificationArgs;
import io.pulumi.azurenative.insights.inputs.WebhookNotificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Autoscale notification.
 * 
 */
public final class AutoscaleNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscaleNotificationArgs Empty = new AutoscaleNotificationArgs();

    /**
     * the email notification.
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<EmailNotificationArgs> email;

    public Input<EmailNotificationArgs> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * the operation associated with the notification and its value must be "scale"
     * 
     */
    @InputImport(name="operation", required=true)
    private final Input<OperationType> operation;

    public Input<OperationType> getOperation() {
        return this.operation;
    }

    /**
     * the collection of webhook notifications.
     * 
     */
    @InputImport(name="webhooks")
    private final @Nullable Input<List<WebhookNotificationArgs>> webhooks;

    public Input<List<WebhookNotificationArgs>> getWebhooks() {
        return this.webhooks == null ? Input.empty() : this.webhooks;
    }

    public AutoscaleNotificationArgs(
        @Nullable Input<EmailNotificationArgs> email,
        Input<OperationType> operation,
        @Nullable Input<List<WebhookNotificationArgs>> webhooks) {
        this.email = email;
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.webhooks = webhooks;
    }

    private AutoscaleNotificationArgs() {
        this.email = Input.empty();
        this.operation = Input.empty();
        this.webhooks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EmailNotificationArgs> email;
        private Input<OperationType> operation;
        private @Nullable Input<List<WebhookNotificationArgs>> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.operation = defaults.operation;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder setEmail(@Nullable Input<EmailNotificationArgs> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable EmailNotificationArgs email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setOperation(Input<OperationType> operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setOperation(OperationType operation) {
            this.operation = Input.of(Objects.requireNonNull(operation));
            return this;
        }

        public Builder setWebhooks(@Nullable Input<List<WebhookNotificationArgs>> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public Builder setWebhooks(@Nullable List<WebhookNotificationArgs> webhooks) {
            this.webhooks = Input.ofNullable(webhooks);
            return this;
        }

        public AutoscaleNotificationArgs build() {
            return new AutoscaleNotificationArgs(email, operation, webhooks);
        }
    }
}
