// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowTriggerCallbackUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkflowTriggerCallbackUrlArgs Empty = new ListWorkflowTriggerCallbackUrlArgs();

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow trigger name.
     * 
     */
    @InputImport(name="triggerName", required=true)
    private final String triggerName;

    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
    private final String workflowName;

    public String getWorkflowName() {
        return this.workflowName;
    }

    public ListWorkflowTriggerCallbackUrlArgs(
        String resourceGroupName,
        String triggerName,
        String workflowName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private ListWorkflowTriggerCallbackUrlArgs() {
        this.resourceGroupName = null;
        this.triggerName = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowTriggerCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String triggerName;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowTriggerCallbackUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggerName = defaults.triggerName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTriggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }

        public ListWorkflowTriggerCallbackUrlArgs build() {
            return new ListWorkflowTriggerCallbackUrlArgs(resourceGroupName, triggerName, workflowName);
        }
    }
}
