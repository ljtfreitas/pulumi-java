// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectServiceCatalogProvisioningDetailsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectServiceCatalogProvisioningDetailsGetArgs Empty = new ProjectServiceCatalogProvisioningDetailsGetArgs();

    /**
     * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    @InputImport(name="pathId")
    private final @Nullable Input<String> pathId;

    public Input<String> getPathId() {
        return this.pathId == null ? Input.empty() : this.pathId;
    }

    /**
     * The ID of the product to provision.
     * 
     */
    @InputImport(name="productId", required=true)
    private final Input<String> productId;

    public Input<String> getProductId() {
        return this.productId;
    }

    /**
     * The ID of the provisioning artifact.
     * 
     */
    @InputImport(name="provisioningArtifactId")
    private final @Nullable Input<String> provisioningArtifactId;

    public Input<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Input.empty() : this.provisioningArtifactId;
    }

    /**
     * A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    @InputImport(name="provisioningParameters")
    private final @Nullable Input<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters;

    public Input<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Input.empty() : this.provisioningParameters;
    }

    public ProjectServiceCatalogProvisioningDetailsGetArgs(
        @Nullable Input<String> pathId,
        Input<String> productId,
        @Nullable Input<String> provisioningArtifactId,
        @Nullable Input<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters) {
        this.pathId = pathId;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningParameters = provisioningParameters;
    }

    private ProjectServiceCatalogProvisioningDetailsGetArgs() {
        this.pathId = Input.empty();
        this.productId = Input.empty();
        this.provisioningArtifactId = Input.empty();
        this.provisioningParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectServiceCatalogProvisioningDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pathId;
        private Input<String> productId;
        private @Nullable Input<String> provisioningArtifactId;
        private @Nullable Input<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectServiceCatalogProvisioningDetailsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        public Builder setPathId(@Nullable Input<String> pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder setPathId(@Nullable String pathId) {
            this.pathId = Input.ofNullable(pathId);
            return this;
        }

        public Builder setProductId(Input<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Input.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder setProvisioningArtifactId(@Nullable Input<String> provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder setProvisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = Input.ofNullable(provisioningArtifactId);
            return this;
        }

        public Builder setProvisioningParameters(@Nullable Input<List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder setProvisioningParameters(@Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameterGetArgs> provisioningParameters) {
            this.provisioningParameters = Input.ofNullable(provisioningParameters);
            return this;
        }
        public ProjectServiceCatalogProvisioningDetailsGetArgs build() {
            return new ProjectServiceCatalogProvisioningDetailsGetArgs(pathId, productId, provisioningArtifactId, provisioningParameters);
        }
    }
}
