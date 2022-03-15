// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.RunAsCredentialAssociationPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridRunbookWorkerGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridRunbookWorkerGroupArgs Empty = new HybridRunbookWorkerGroupArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Sets the credential of a worker group.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<RunAsCredentialAssociationPropertyArgs> credential;

    public Output<RunAsCredentialAssociationPropertyArgs> getCredential() {
        return this.credential == null ? Output.empty() : this.credential;
    }

    /**
     * The hybrid runbook worker group name
     * 
     */
    @Import(name="hybridRunbookWorkerGroupName")
      private final @Nullable Output<String> hybridRunbookWorkerGroupName;

    public Output<String> getHybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName == null ? Output.empty() : this.hybridRunbookWorkerGroupName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public HybridRunbookWorkerGroupArgs(
        Output<String> automationAccountName,
        @Nullable Output<RunAsCredentialAssociationPropertyArgs> credential,
        @Nullable Output<String> hybridRunbookWorkerGroupName,
        Output<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.credential = credential;
        this.hybridRunbookWorkerGroupName = hybridRunbookWorkerGroupName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private HybridRunbookWorkerGroupArgs() {
        this.automationAccountName = Output.empty();
        this.credential = Output.empty();
        this.hybridRunbookWorkerGroupName = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridRunbookWorkerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private @Nullable Output<RunAsCredentialAssociationPropertyArgs> credential;
        private @Nullable Output<String> hybridRunbookWorkerGroupName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridRunbookWorkerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.credential = defaults.credential;
    	      this.hybridRunbookWorkerGroupName = defaults.hybridRunbookWorkerGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder credential(@Nullable Output<RunAsCredentialAssociationPropertyArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder credential(@Nullable RunAsCredentialAssociationPropertyArgs credential) {
            this.credential = Output.ofNullable(credential);
            return this;
        }

        public Builder hybridRunbookWorkerGroupName(@Nullable Output<String> hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = hybridRunbookWorkerGroupName;
            return this;
        }

        public Builder hybridRunbookWorkerGroupName(@Nullable String hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Output.ofNullable(hybridRunbookWorkerGroupName);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public HybridRunbookWorkerGroupArgs build() {
            return new HybridRunbookWorkerGroupArgs(automationAccountName, credential, hybridRunbookWorkerGroupName, resourceGroupName);
        }
    }
}
