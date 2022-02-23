// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure action group
 * 
 */
public final class AzNsActionGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzNsActionGroupResponse Empty = new AzNsActionGroupResponse();

    /**
     * Azure Action Group reference.
     * 
     */
    @InputImport(name="actionGroup")
        private final @Nullable List<String> actionGroup;

    public List<String> getActionGroup() {
        return this.actionGroup == null ? List.of() : this.actionGroup;
    }

    /**
     * Custom payload to be sent for all webhook URI in Azure action group
     * 
     */
    @InputImport(name="customWebhookPayload")
        private final @Nullable String customWebhookPayload;

    public Optional<String> getCustomWebhookPayload() {
        return this.customWebhookPayload == null ? Optional.empty() : Optional.ofNullable(this.customWebhookPayload);
    }

    /**
     * Custom subject override for all email ids in Azure action group
     * 
     */
    @InputImport(name="emailSubject")
        private final @Nullable String emailSubject;

    public Optional<String> getEmailSubject() {
        return this.emailSubject == null ? Optional.empty() : Optional.ofNullable(this.emailSubject);
    }

    public AzNsActionGroupResponse(
        @Nullable List<String> actionGroup,
        @Nullable String customWebhookPayload,
        @Nullable String emailSubject) {
        this.actionGroup = actionGroup;
        this.customWebhookPayload = customWebhookPayload;
        this.emailSubject = emailSubject;
    }

    private AzNsActionGroupResponse() {
        this.actionGroup = List.of();
        this.customWebhookPayload = null;
        this.emailSubject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzNsActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actionGroup;
        private @Nullable String customWebhookPayload;
        private @Nullable String emailSubject;

        public Builder() {
    	      // Empty
        }

        public Builder(AzNsActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroup = defaults.actionGroup;
    	      this.customWebhookPayload = defaults.customWebhookPayload;
    	      this.emailSubject = defaults.emailSubject;
        }

        public Builder setActionGroup(@Nullable List<String> actionGroup) {
            this.actionGroup = actionGroup;
            return this;
        }

        public Builder setCustomWebhookPayload(@Nullable String customWebhookPayload) {
            this.customWebhookPayload = customWebhookPayload;
            return this;
        }

        public Builder setEmailSubject(@Nullable String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public AzNsActionGroupResponse build() {
            return new AzNsActionGroupResponse(actionGroup, customWebhookPayload, emailSubject);
        }
    }
}
