// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * A description for the project.
     * 
     */
    @Import(name="projectDescription")
      private final @Nullable Output<String> projectDescription;

    public Output<String> getProjectDescription() {
        return this.projectDescription == null ? Output.empty() : this.projectDescription;
    }

    /**
     * The name of the Project.
     * 
     */
    @Import(name="projectName", required=true)
      private final Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName;
    }

    /**
     * The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * 
     */
    @Import(name="serviceCatalogProvisioningDetails", required=true)
      private final Output<ProjectServiceCatalogProvisioningDetailsArgs> serviceCatalogProvisioningDetails;

    public Output<ProjectServiceCatalogProvisioningDetailsArgs> getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ProjectArgs(
        @Nullable Output<String> projectDescription,
        Output<String> projectName,
        Output<ProjectServiceCatalogProvisioningDetailsArgs> serviceCatalogProvisioningDetails,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.projectDescription = projectDescription;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.serviceCatalogProvisioningDetails = Objects.requireNonNull(serviceCatalogProvisioningDetails, "expected parameter 'serviceCatalogProvisioningDetails' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ProjectArgs() {
        this.projectDescription = Output.empty();
        this.projectName = Output.empty();
        this.serviceCatalogProvisioningDetails = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> projectDescription;
        private Output<String> projectName;
        private Output<ProjectServiceCatalogProvisioningDetailsArgs> serviceCatalogProvisioningDetails;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectDescription = defaults.projectDescription;
    	      this.projectName = defaults.projectName;
    	      this.serviceCatalogProvisioningDetails = defaults.serviceCatalogProvisioningDetails;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder projectDescription(@Nullable Output<String> projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }

        public Builder projectDescription(@Nullable String projectDescription) {
            this.projectDescription = Output.ofNullable(projectDescription);
            return this;
        }

        public Builder projectName(Output<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder projectName(String projectName) {
            this.projectName = Output.of(Objects.requireNonNull(projectName));
            return this;
        }

        public Builder serviceCatalogProvisioningDetails(Output<ProjectServiceCatalogProvisioningDetailsArgs> serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = Objects.requireNonNull(serviceCatalogProvisioningDetails);
            return this;
        }

        public Builder serviceCatalogProvisioningDetails(ProjectServiceCatalogProvisioningDetailsArgs serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = Output.of(Objects.requireNonNull(serviceCatalogProvisioningDetails));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public ProjectArgs build() {
            return new ProjectArgs(projectDescription, projectName, serviceCatalogProvisioningDetails, tags, tagsAll);
        }
    }
}
