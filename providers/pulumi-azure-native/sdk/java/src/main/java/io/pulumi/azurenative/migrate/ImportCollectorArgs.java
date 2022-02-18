// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.ImportCollectorPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImportCollectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImportCollectorArgs Empty = new ImportCollectorArgs();

    @InputImport(name="eTag")
    private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Unique name of a Import collector within a project.
     * 
     */
    @InputImport(name="importCollectorName")
    private final @Nullable Input<String> importCollectorName;

    public Input<String> getImportCollectorName() {
        return this.importCollectorName == null ? Input.empty() : this.importCollectorName;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="projectName", required=true)
    private final Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<ImportCollectorPropertiesArgs> properties;

    public Input<ImportCollectorPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ImportCollectorArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<String> importCollectorName,
        Input<String> projectName,
        @Nullable Input<ImportCollectorPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.eTag = eTag;
        this.importCollectorName = importCollectorName;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ImportCollectorArgs() {
        this.eTag = Input.empty();
        this.importCollectorName = Input.empty();
        this.projectName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<String> importCollectorName;
        private Input<String> projectName;
        private @Nullable Input<ImportCollectorPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.importCollectorName = defaults.importCollectorName;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setImportCollectorName(@Nullable Input<String> importCollectorName) {
            this.importCollectorName = importCollectorName;
            return this;
        }

        public Builder setImportCollectorName(@Nullable String importCollectorName) {
            this.importCollectorName = Input.ofNullable(importCollectorName);
            return this;
        }

        public Builder setProjectName(Input<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Input.of(Objects.requireNonNull(projectName));
            return this;
        }

        public Builder setProperties(@Nullable Input<ImportCollectorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ImportCollectorPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public ImportCollectorArgs build() {
            return new ImportCollectorArgs(eTag, importCollectorName, projectName, properties, resourceGroupName);
        }
    }
}
