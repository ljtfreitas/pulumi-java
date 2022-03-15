// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRunbookArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRunbookArgs Empty = new GetRunbookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The runbook name.
     * 
     */
    @Import(name="runbookName", required=true)
      private final String runbookName;

    public String getRunbookName() {
        return this.runbookName;
    }

    public GetRunbookArgs(
        String automationAccountName,
        String resourceGroupName,
        String runbookName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runbookName = Objects.requireNonNull(runbookName, "expected parameter 'runbookName' to be non-null");
    }

    private GetRunbookArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.runbookName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRunbookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String runbookName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRunbookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runbookName = defaults.runbookName;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder runbookName(String runbookName) {
            this.runbookName = Objects.requireNonNull(runbookName);
            return this;
        }
        public GetRunbookArgs build() {
            return new GetRunbookArgs(automationAccountName, resourceGroupName, runbookName);
        }
    }
}
