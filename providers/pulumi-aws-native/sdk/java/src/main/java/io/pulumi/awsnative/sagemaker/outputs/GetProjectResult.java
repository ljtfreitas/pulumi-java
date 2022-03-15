// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ProjectStatus;
import io.pulumi.awsnative.sagemaker.outputs.ServiceCatalogProvisionedProductDetailsProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    /**
     * The time at which the project was created.
     * 
     */
    private final @Nullable String creationTime;
    private final @Nullable String projectArn;
    private final @Nullable String projectId;
    /**
     * The status of a project.
     * 
     */
    private final @Nullable ProjectStatus projectStatus;
    /**
     * Provisioned ServiceCatalog  Details
     * 
     */
    private final @Nullable ServiceCatalogProvisionedProductDetailsProperties serviceCatalogProvisionedProductDetails;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("projectArn") @Nullable String projectArn,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("projectStatus") @Nullable ProjectStatus projectStatus,
        @CustomType.Parameter("serviceCatalogProvisionedProductDetails") @Nullable ServiceCatalogProvisionedProductDetailsProperties serviceCatalogProvisionedProductDetails) {
        this.creationTime = creationTime;
        this.projectArn = projectArn;
        this.projectId = projectId;
        this.projectStatus = projectStatus;
        this.serviceCatalogProvisionedProductDetails = serviceCatalogProvisionedProductDetails;
    }

    /**
     * The time at which the project was created.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getProjectArn() {
        return Optional.ofNullable(this.projectArn);
    }
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * The status of a project.
     * 
    */
    public Optional<ProjectStatus> getProjectStatus() {
        return Optional.ofNullable(this.projectStatus);
    }
    /**
     * Provisioned ServiceCatalog  Details
     * 
    */
    public Optional<ServiceCatalogProvisionedProductDetailsProperties> getServiceCatalogProvisionedProductDetails() {
        return Optional.ofNullable(this.serviceCatalogProvisionedProductDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String projectArn;
        private @Nullable String projectId;
        private @Nullable ProjectStatus projectStatus;
        private @Nullable ServiceCatalogProvisionedProductDetailsProperties serviceCatalogProvisionedProductDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.projectArn = defaults.projectArn;
    	      this.projectId = defaults.projectId;
    	      this.projectStatus = defaults.projectStatus;
    	      this.serviceCatalogProvisionedProductDetails = defaults.serviceCatalogProvisionedProductDetails;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder projectArn(@Nullable String projectArn) {
            this.projectArn = projectArn;
            return this;
        }

        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder projectStatus(@Nullable ProjectStatus projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }

        public Builder serviceCatalogProvisionedProductDetails(@Nullable ServiceCatalogProvisionedProductDetailsProperties serviceCatalogProvisionedProductDetails) {
            this.serviceCatalogProvisionedProductDetails = serviceCatalogProvisionedProductDetails;
            return this;
        }
        public GetProjectResult build() {
            return new GetProjectResult(creationTime, projectArn, projectId, projectStatus, serviceCatalogProvisionedProductDetails);
        }
    }
}
