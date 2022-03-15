// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Azure Automation Runbook notification receiver.
 * 
 */
public final class AutomationRunbookReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationRunbookReceiverResponse Empty = new AutomationRunbookReceiverResponse();

    /**
     * The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     * 
     */
    @Import(name="automationAccountId", required=true)
      private final String automationAccountId;

    public String getAutomationAccountId() {
        return this.automationAccountId;
    }

    /**
     * Indicates whether this instance is global runbook.
     * 
     */
    @Import(name="isGlobalRunbook", required=true)
      private final Boolean isGlobalRunbook;

    public Boolean getIsGlobalRunbook() {
        return this.isGlobalRunbook;
    }

    /**
     * Indicates name of the webhook.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The name for this runbook.
     * 
     */
    @Import(name="runbookName", required=true)
      private final String runbookName;

    public String getRunbookName() {
        return this.runbookName;
    }

    /**
     * The URI where webhooks should be sent.
     * 
     */
    @Import(name="serviceUri")
      private final @Nullable String serviceUri;

    public Optional<String> getServiceUri() {
        return this.serviceUri == null ? Optional.empty() : Optional.ofNullable(this.serviceUri);
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
      private final @Nullable Boolean useCommonAlertSchema;

    public Optional<Boolean> getUseCommonAlertSchema() {
        return this.useCommonAlertSchema == null ? Optional.empty() : Optional.ofNullable(this.useCommonAlertSchema);
    }

    /**
     * The resource id for webhook linked to this runbook.
     * 
     */
    @Import(name="webhookResourceId", required=true)
      private final String webhookResourceId;

    public String getWebhookResourceId() {
        return this.webhookResourceId;
    }

    public AutomationRunbookReceiverResponse(
        String automationAccountId,
        Boolean isGlobalRunbook,
        @Nullable String name,
        String runbookName,
        @Nullable String serviceUri,
        @Nullable Boolean useCommonAlertSchema,
        String webhookResourceId) {
        this.automationAccountId = Objects.requireNonNull(automationAccountId, "expected parameter 'automationAccountId' to be non-null");
        this.isGlobalRunbook = Objects.requireNonNull(isGlobalRunbook, "expected parameter 'isGlobalRunbook' to be non-null");
        this.name = name;
        this.runbookName = Objects.requireNonNull(runbookName, "expected parameter 'runbookName' to be non-null");
        this.serviceUri = serviceUri;
        this.useCommonAlertSchema = useCommonAlertSchema == null ? false : useCommonAlertSchema;
        this.webhookResourceId = Objects.requireNonNull(webhookResourceId, "expected parameter 'webhookResourceId' to be non-null");
    }

    private AutomationRunbookReceiverResponse() {
        this.automationAccountId = null;
        this.isGlobalRunbook = null;
        this.name = null;
        this.runbookName = null;
        this.serviceUri = null;
        this.useCommonAlertSchema = null;
        this.webhookResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRunbookReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountId;
        private Boolean isGlobalRunbook;
        private @Nullable String name;
        private String runbookName;
        private @Nullable String serviceUri;
        private @Nullable Boolean useCommonAlertSchema;
        private String webhookResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRunbookReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountId = defaults.automationAccountId;
    	      this.isGlobalRunbook = defaults.isGlobalRunbook;
    	      this.name = defaults.name;
    	      this.runbookName = defaults.runbookName;
    	      this.serviceUri = defaults.serviceUri;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
    	      this.webhookResourceId = defaults.webhookResourceId;
        }

        public Builder automationAccountId(String automationAccountId) {
            this.automationAccountId = Objects.requireNonNull(automationAccountId);
            return this;
        }

        public Builder isGlobalRunbook(Boolean isGlobalRunbook) {
            this.isGlobalRunbook = Objects.requireNonNull(isGlobalRunbook);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder runbookName(String runbookName) {
            this.runbookName = Objects.requireNonNull(runbookName);
            return this;
        }

        public Builder serviceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }

        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public Builder webhookResourceId(String webhookResourceId) {
            this.webhookResourceId = Objects.requireNonNull(webhookResourceId);
            return this;
        }
        public AutomationRunbookReceiverResponse build() {
            return new AutomationRunbookReceiverResponse(automationAccountId, isGlobalRunbook, name, runbookName, serviceUri, useCommonAlertSchema, webhookResourceId);
        }
    }
}
