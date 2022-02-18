// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridRunbookWorkerArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridRunbookWorkerArgs Empty = new HybridRunbookWorkerArgs();

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
     * The hybrid runbook worker group name
     * 
     */
    @InputImport(name="hybridRunbookWorkerGroupName", required=true)
    private final Input<String> hybridRunbookWorkerGroupName;

    public Input<String> getHybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
    }

    /**
     * The hybrid runbook worker id
     * 
     */
    @InputImport(name="hybridRunbookWorkerId")
    private final @Nullable Input<String> hybridRunbookWorkerId;

    public Input<String> getHybridRunbookWorkerId() {
        return this.hybridRunbookWorkerId == null ? Input.empty() : this.hybridRunbookWorkerId;
    }

    /**
     * Gets or sets the name of the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * Azure Resource Manager Id for a virtual machine.
     * 
     */
    @InputImport(name="vmResourceId")
    private final @Nullable Input<String> vmResourceId;

    public Input<String> getVmResourceId() {
        return this.vmResourceId == null ? Input.empty() : this.vmResourceId;
    }

    public HybridRunbookWorkerArgs(
        Input<String> automationAccountName,
        Input<String> hybridRunbookWorkerGroupName,
        @Nullable Input<String> hybridRunbookWorkerId,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> vmResourceId) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
        this.hybridRunbookWorkerId = hybridRunbookWorkerId;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmResourceId = vmResourceId;
    }

    private HybridRunbookWorkerArgs() {
        this.automationAccountName = Input.empty();
        this.hybridRunbookWorkerGroupName = Input.empty();
        this.hybridRunbookWorkerId = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.vmResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridRunbookWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private Input<String> hybridRunbookWorkerGroupName;
        private @Nullable Input<String> hybridRunbookWorkerId;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridRunbookWorkerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.hybridRunbookWorkerGroupName = defaults.hybridRunbookWorkerGroupName;
    	      this.hybridRunbookWorkerId = defaults.hybridRunbookWorkerId;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setHybridRunbookWorkerGroupName(Input<String> hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName);
            return this;
        }

        public Builder setHybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Input.of(Objects.requireNonNull(hybridRunbookWorkerGroupName));
            return this;
        }

        public Builder setHybridRunbookWorkerId(@Nullable Input<String> hybridRunbookWorkerId) {
            this.hybridRunbookWorkerId = hybridRunbookWorkerId;
            return this;
        }

        public Builder setHybridRunbookWorkerId(@Nullable String hybridRunbookWorkerId) {
            this.hybridRunbookWorkerId = Input.ofNullable(hybridRunbookWorkerId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setVmResourceId(@Nullable Input<String> vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }

        public Builder setVmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = Input.ofNullable(vmResourceId);
            return this;
        }

        public HybridRunbookWorkerArgs build() {
            return new HybridRunbookWorkerArgs(automationAccountName, hybridRunbookWorkerGroupName, hybridRunbookWorkerId, name, resourceGroupName, vmResourceId);
        }
    }
}
