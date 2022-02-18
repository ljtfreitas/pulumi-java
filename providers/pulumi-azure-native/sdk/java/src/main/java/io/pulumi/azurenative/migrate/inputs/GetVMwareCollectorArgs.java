// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVMwareCollectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVMwareCollectorArgs Empty = new GetVMwareCollectorArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="projectName", required=true)
    private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a VMware collector within a project.
     * 
     */
    @InputImport(name="vmWareCollectorName", required=true)
    private final String vmWareCollectorName;

    public String getVmWareCollectorName() {
        return this.vmWareCollectorName;
    }

    public GetVMwareCollectorArgs(
        String projectName,
        String resourceGroupName,
        String vmWareCollectorName) {
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmWareCollectorName = Objects.requireNonNull(vmWareCollectorName, "expected parameter 'vmWareCollectorName' to be non-null");
    }

    private GetVMwareCollectorArgs() {
        this.projectName = null;
        this.resourceGroupName = null;
        this.vmWareCollectorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVMwareCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectName;
        private String resourceGroupName;
        private String vmWareCollectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVMwareCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmWareCollectorName = defaults.vmWareCollectorName;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVmWareCollectorName(String vmWareCollectorName) {
            this.vmWareCollectorName = Objects.requireNonNull(vmWareCollectorName);
            return this;
        }

        public GetVMwareCollectorArgs build() {
            return new GetVMwareCollectorArgs(projectName, resourceGroupName, vmWareCollectorName);
        }
    }
}
