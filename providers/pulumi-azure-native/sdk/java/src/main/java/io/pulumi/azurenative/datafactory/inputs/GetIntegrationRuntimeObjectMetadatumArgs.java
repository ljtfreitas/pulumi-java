// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntegrationRuntimeObjectMetadatumArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeObjectMetadatumArgs Empty = new GetIntegrationRuntimeObjectMetadatumArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
      private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
      private final String integrationRuntimeName;

    public String getIntegrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * Metadata path.
     * 
     */
    @Import(name="metadataPath")
      private final @Nullable String metadataPath;

    public Optional<String> getMetadataPath() {
        return this.metadataPath == null ? Optional.empty() : Optional.ofNullable(this.metadataPath);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIntegrationRuntimeObjectMetadatumArgs(
        String factoryName,
        String integrationRuntimeName,
        @Nullable String metadataPath,
        String resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
        this.metadataPath = metadataPath;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationRuntimeObjectMetadatumArgs() {
        this.factoryName = null;
        this.integrationRuntimeName = null;
        this.metadataPath = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String integrationRuntimeName;
        private @Nullable String metadataPath;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.metadataPath = defaults.metadataPath;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder factoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder integrationRuntimeName(String integrationRuntimeName) {
            this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName);
            return this;
        }

        public Builder metadataPath(@Nullable String metadataPath) {
            this.metadataPath = metadataPath;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIntegrationRuntimeObjectMetadatumArgs build() {
            return new GetIntegrationRuntimeObjectMetadatumArgs(factoryName, integrationRuntimeName, metadataPath, resourceGroupName);
        }
    }
}
