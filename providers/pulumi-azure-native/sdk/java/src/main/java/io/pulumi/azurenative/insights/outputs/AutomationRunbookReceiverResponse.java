// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationRunbookReceiverResponse {
    /**
     * The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     * 
     */
    private final String automationAccountId;
    /**
     * Indicates whether this instance is global runbook.
     * 
     */
    private final Boolean isGlobalRunbook;
    /**
     * Indicates name of the webhook.
     * 
     */
    private final @Nullable String name;
    /**
     * The name for this runbook.
     * 
     */
    private final String runbookName;
    /**
     * The URI where webhooks should be sent.
     * 
     */
    private final @Nullable String serviceUri;
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;
    /**
     * The resource id for webhook linked to this runbook.
     * 
     */
    private final String webhookResourceId;

    @OutputCustomType.Constructor({"automationAccountId","isGlobalRunbook","name","runbookName","serviceUri","useCommonAlertSchema","webhookResourceId"})
    private AutomationRunbookReceiverResponse(
        String automationAccountId,
        Boolean isGlobalRunbook,
        @Nullable String name,
        String runbookName,
        @Nullable String serviceUri,
        @Nullable Boolean useCommonAlertSchema,
        String webhookResourceId) {
        this.automationAccountId = Objects.requireNonNull(automationAccountId);
        this.isGlobalRunbook = Objects.requireNonNull(isGlobalRunbook);
        this.name = name;
        this.runbookName = Objects.requireNonNull(runbookName);
        this.serviceUri = serviceUri;
        this.useCommonAlertSchema = useCommonAlertSchema;
        this.webhookResourceId = Objects.requireNonNull(webhookResourceId);
    }

    /**
     * The Azure automation account Id which holds this runbook and authenticate to Azure resource.
     * 
     */
    public String getAutomationAccountId() {
        return this.automationAccountId;
    }
    /**
     * Indicates whether this instance is global runbook.
     * 
     */
    public Boolean getIsGlobalRunbook() {
        return this.isGlobalRunbook;
    }
    /**
     * Indicates name of the webhook.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The name for this runbook.
     * 
     */
    public String getRunbookName() {
        return this.runbookName;
    }
    /**
     * The URI where webhooks should be sent.
     * 
     */
    public Optional<String> getServiceUri() {
        return Optional.ofNullable(this.serviceUri);
    }
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    public Optional<Boolean> getUseCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }
    /**
     * The resource id for webhook linked to this runbook.
     * 
     */
    public String getWebhookResourceId() {
        return this.webhookResourceId;
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

        public Builder setAutomationAccountId(String automationAccountId) {
            this.automationAccountId = Objects.requireNonNull(automationAccountId);
            return this;
        }

        public Builder setIsGlobalRunbook(Boolean isGlobalRunbook) {
            this.isGlobalRunbook = Objects.requireNonNull(isGlobalRunbook);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRunbookName(String runbookName) {
            this.runbookName = Objects.requireNonNull(runbookName);
            return this;
        }

        public Builder setServiceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public Builder setWebhookResourceId(String webhookResourceId) {
            this.webhookResourceId = Objects.requireNonNull(webhookResourceId);
            return this;
        }

        public AutomationRunbookReceiverResponse build() {
            return new AutomationRunbookReceiverResponse(automationAccountId, isGlobalRunbook, name, runbookName, serviceUri, useCommonAlertSchema, webhookResourceId);
        }
    }
}
