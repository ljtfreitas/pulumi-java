// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetImportCollectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImportCollectorArgs Empty = new GetImportCollectorArgs();

    /**
     * Unique name of a Import collector within a project.
     * 
     */
    @InputImport(name="importCollectorName", required=true)
    private final String importCollectorName;

    public String getImportCollectorName() {
        return this.importCollectorName;
    }

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

    public GetImportCollectorArgs(
        String importCollectorName,
        String projectName,
        String resourceGroupName) {
        this.importCollectorName = Objects.requireNonNull(importCollectorName, "expected parameter 'importCollectorName' to be non-null");
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetImportCollectorArgs() {
        this.importCollectorName = null;
        this.projectName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImportCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String importCollectorName;
        private String projectName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImportCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importCollectorName = defaults.importCollectorName;
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setImportCollectorName(String importCollectorName) {
            this.importCollectorName = Objects.requireNonNull(importCollectorName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetImportCollectorArgs build() {
            return new GetImportCollectorArgs(importCollectorName, projectName, resourceGroupName);
        }
    }
}
