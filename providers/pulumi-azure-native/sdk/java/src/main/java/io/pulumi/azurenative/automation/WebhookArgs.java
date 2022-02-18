// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.RunbookAssociationPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
    private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the expiry time.
     * 
     */
    @InputImport(name="expiryTime")
    private final @Nullable Input<String> expiryTime;

    public Input<String> getExpiryTime() {
        return this.expiryTime == null ? Input.empty() : this.expiryTime;
    }

    /**
     * Gets or sets the value of the enabled flag of webhook.
     * 
     */
    @InputImport(name="isEnabled")
    private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * Gets or sets the name of the webhook.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Gets or sets the parameters of the job.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
     */
    @InputImport(name="runOn")
    private final @Nullable Input<String> runOn;

    public Input<String> getRunOn() {
        return this.runOn == null ? Input.empty() : this.runOn;
    }

    /**
     * Gets or sets the runbook.
     * 
     */
    @InputImport(name="runbook")
    private final @Nullable Input<RunbookAssociationPropertyArgs> runbook;

    public Input<RunbookAssociationPropertyArgs> getRunbook() {
        return this.runbook == null ? Input.empty() : this.runbook;
    }

    /**
     * Gets or sets the uri.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    /**
     * The webhook name.
     * 
     */
    @InputImport(name="webhookName")
    private final @Nullable Input<String> webhookName;

    public Input<String> getWebhookName() {
        return this.webhookName == null ? Input.empty() : this.webhookName;
    }

    public WebhookArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> expiryTime,
        @Nullable Input<Boolean> isEnabled,
        Input<String> name,
        @Nullable Input<Map<String,String>> parameters,
        Input<String> resourceGroupName,
        @Nullable Input<String> runOn,
        @Nullable Input<RunbookAssociationPropertyArgs> runbook,
        @Nullable Input<String> uri,
        @Nullable Input<String> webhookName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.expiryTime = expiryTime;
        this.isEnabled = isEnabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runOn = runOn;
        this.runbook = runbook;
        this.uri = uri;
        this.webhookName = webhookName;
    }

    private WebhookArgs() {
        this.automationAccountName = Input.empty();
        this.expiryTime = Input.empty();
        this.isEnabled = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroupName = Input.empty();
        this.runOn = Input.empty();
        this.runbook = Input.empty();
        this.uri = Input.empty();
        this.webhookName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> expiryTime;
        private @Nullable Input<Boolean> isEnabled;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> parameters;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> runOn;
        private @Nullable Input<RunbookAssociationPropertyArgs> runbook;
        private @Nullable Input<String> uri;
        private @Nullable Input<String> webhookName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.expiryTime = defaults.expiryTime;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runOn = defaults.runOn;
    	      this.runbook = defaults.runbook;
    	      this.uri = defaults.uri;
    	      this.webhookName = defaults.webhookName;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setExpiryTime(@Nullable Input<String> expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder setExpiryTime(@Nullable String expiryTime) {
            this.expiryTime = Input.ofNullable(expiryTime);
            return this;
        }

        public Builder setIsEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRunOn(@Nullable Input<String> runOn) {
            this.runOn = runOn;
            return this;
        }

        public Builder setRunOn(@Nullable String runOn) {
            this.runOn = Input.ofNullable(runOn);
            return this;
        }

        public Builder setRunbook(@Nullable Input<RunbookAssociationPropertyArgs> runbook) {
            this.runbook = runbook;
            return this;
        }

        public Builder setRunbook(@Nullable RunbookAssociationPropertyArgs runbook) {
            this.runbook = Input.ofNullable(runbook);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public Builder setWebhookName(@Nullable Input<String> webhookName) {
            this.webhookName = webhookName;
            return this;
        }

        public Builder setWebhookName(@Nullable String webhookName) {
            this.webhookName = Input.ofNullable(webhookName);
            return this;
        }

        public WebhookArgs build() {
            return new WebhookArgs(automationAccountName, expiryTime, isEnabled, name, parameters, resourceGroupName, runOn, runbook, uri, webhookName);
        }
    }
}
