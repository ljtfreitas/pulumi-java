// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.FeatureGroupDataCatalogConfig;
import io.pulumi.awsnative.sagemaker.outputs.FeatureGroupS3StorageConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OfflineStoreConfigProperties {
    private final @Nullable FeatureGroupDataCatalogConfig dataCatalogConfig;
    private final @Nullable Boolean disableGlueTableCreation;
    private final FeatureGroupS3StorageConfig s3StorageConfig;

    @OutputCustomType.Constructor({"dataCatalogConfig","disableGlueTableCreation","s3StorageConfig"})
    private OfflineStoreConfigProperties(
        @Nullable FeatureGroupDataCatalogConfig dataCatalogConfig,
        @Nullable Boolean disableGlueTableCreation,
        FeatureGroupS3StorageConfig s3StorageConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.disableGlueTableCreation = disableGlueTableCreation;
        this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
    }

    public Optional<FeatureGroupDataCatalogConfig> getDataCatalogConfig() {
        return Optional.ofNullable(this.dataCatalogConfig);
    }
    public Optional<Boolean> getDisableGlueTableCreation() {
        return Optional.ofNullable(this.disableGlueTableCreation);
    }
    public FeatureGroupS3StorageConfig getS3StorageConfig() {
        return this.s3StorageConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OfflineStoreConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FeatureGroupDataCatalogConfig dataCatalogConfig;
        private @Nullable Boolean disableGlueTableCreation;
        private FeatureGroupS3StorageConfig s3StorageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OfflineStoreConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.disableGlueTableCreation = defaults.disableGlueTableCreation;
    	      this.s3StorageConfig = defaults.s3StorageConfig;
        }

        public Builder setDataCatalogConfig(@Nullable FeatureGroupDataCatalogConfig dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        public Builder setDisableGlueTableCreation(@Nullable Boolean disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        public Builder setS3StorageConfig(FeatureGroupS3StorageConfig s3StorageConfig) {
            this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
            return this;
        }
        public OfflineStoreConfigProperties build() {
            return new OfflineStoreConfigProperties(dataCatalogConfig, disableGlueTableCreation, s3StorageConfig);
        }
    }
}
