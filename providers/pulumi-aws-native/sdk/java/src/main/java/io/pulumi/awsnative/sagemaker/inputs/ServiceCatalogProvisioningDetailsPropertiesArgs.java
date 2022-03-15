// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ProjectProvisioningParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input ServiceCatalog Provisioning Details
 * 
 */
public final class ServiceCatalogProvisioningDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCatalogProvisioningDetailsPropertiesArgs Empty = new ServiceCatalogProvisioningDetailsPropertiesArgs();

    @Import(name="pathId")
      private final @Nullable Output<String> pathId;

    public Output<String> getPathId() {
        return this.pathId == null ? Output.empty() : this.pathId;
    }

    @Import(name="productId", required=true)
      private final Output<String> productId;

    public Output<String> getProductId() {
        return this.productId;
    }

    @Import(name="provisioningArtifactId")
      private final @Nullable Output<String> provisioningArtifactId;

    public Output<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Output.empty() : this.provisioningArtifactId;
    }

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     * 
     */
    @Import(name="provisioningParameters")
      private final @Nullable Output<List<ProjectProvisioningParameterArgs>> provisioningParameters;

    public Output<List<ProjectProvisioningParameterArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Output.empty() : this.provisioningParameters;
    }

    public ServiceCatalogProvisioningDetailsPropertiesArgs(
        @Nullable Output<String> pathId,
        Output<String> productId,
        @Nullable Output<String> provisioningArtifactId,
        @Nullable Output<List<ProjectProvisioningParameterArgs>> provisioningParameters) {
        this.pathId = pathId;
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningParameters = provisioningParameters;
    }

    private ServiceCatalogProvisioningDetailsPropertiesArgs() {
        this.pathId = Output.empty();
        this.productId = Output.empty();
        this.provisioningArtifactId = Output.empty();
        this.provisioningParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCatalogProvisioningDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pathId;
        private Output<String> productId;
        private @Nullable Output<String> provisioningArtifactId;
        private @Nullable Output<List<ProjectProvisioningParameterArgs>> provisioningParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCatalogProvisioningDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        public Builder pathId(@Nullable Output<String> pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder pathId(@Nullable String pathId) {
            this.pathId = Output.ofNullable(pathId);
            return this;
        }

        public Builder productId(Output<String> productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Output.of(Objects.requireNonNull(productId));
            return this;
        }

        public Builder provisioningArtifactId(@Nullable Output<String> provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder provisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = Output.ofNullable(provisioningArtifactId);
            return this;
        }

        public Builder provisioningParameters(@Nullable Output<List<ProjectProvisioningParameterArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }

        public Builder provisioningParameters(@Nullable List<ProjectProvisioningParameterArgs> provisioningParameters) {
            this.provisioningParameters = Output.ofNullable(provisioningParameters);
            return this;
        }
        public ServiceCatalogProvisioningDetailsPropertiesArgs build() {
            return new ServiceCatalogProvisioningDetailsPropertiesArgs(pathId, productId, provisioningArtifactId, provisioningParameters);
        }
    }
}
