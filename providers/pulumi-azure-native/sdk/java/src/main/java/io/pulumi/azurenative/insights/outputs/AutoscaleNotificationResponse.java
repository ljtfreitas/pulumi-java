// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.EmailNotificationResponse;
import io.pulumi.azurenative.insights.outputs.WebhookNotificationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleNotificationResponse {
    /**
     * the email notification.
     * 
     */
    private final @Nullable EmailNotificationResponse email;
    /**
     * the operation associated with the notification and its value must be "scale"
     * 
     */
    private final String operation;
    /**
     * the collection of webhook notifications.
     * 
     */
    private final @Nullable List<WebhookNotificationResponse> webhooks;

    @OutputCustomType.Constructor({"email","operation","webhooks"})
    private AutoscaleNotificationResponse(
        @Nullable EmailNotificationResponse email,
        String operation,
        @Nullable List<WebhookNotificationResponse> webhooks) {
        this.email = email;
        this.operation = Objects.requireNonNull(operation);
        this.webhooks = webhooks;
    }

    /**
     * the email notification.
     * 
     */
    public Optional<EmailNotificationResponse> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * the operation associated with the notification and its value must be "scale"
     * 
     */
    public String getOperation() {
        return this.operation;
    }
    /**
     * the collection of webhook notifications.
     * 
     */
    public List<WebhookNotificationResponse> getWebhooks() {
        return this.webhooks == null ? List.of() : this.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EmailNotificationResponse email;
        private String operation;
        private @Nullable List<WebhookNotificationResponse> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.operation = defaults.operation;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder setEmail(@Nullable EmailNotificationResponse email) {
            this.email = email;
            return this;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setWebhooks(@Nullable List<WebhookNotificationResponse> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public AutoscaleNotificationResponse build() {
            return new AutoscaleNotificationResponse(email, operation, webhooks);
        }
    }
}
