// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigGetArgs Empty = new FeatureGroupOfflineStoreConfigGetArgs();

    /**
     * The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    @InputImport(name="dataCatalogConfig")
    private final @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs> dataCatalogConfig;

    public Input<FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs> getDataCatalogConfig() {
        return this.dataCatalogConfig == null ? Input.empty() : this.dataCatalogConfig;
    }

    /**
     * Set to `true` to turn Online Store On.
     * 
     */
    @InputImport(name="disableGlueTableCreation")
    private final @Nullable Input<Boolean> disableGlueTableCreation;

    public Input<Boolean> getDisableGlueTableCreation() {
        return this.disableGlueTableCreation == null ? Input.empty() : this.disableGlueTableCreation;
    }

    /**
     * The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
     * 
     */
    @InputImport(name="s3StorageConfig", required=true)
    private final Input<FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> s3StorageConfig;

    public Input<FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> getS3StorageConfig() {
        return this.s3StorageConfig;
    }

    public FeatureGroupOfflineStoreConfigGetArgs(
        @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs> dataCatalogConfig,
        @Nullable Input<Boolean> disableGlueTableCreation,
        Input<FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> s3StorageConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.disableGlueTableCreation = disableGlueTableCreation;
        this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig, "expected parameter 's3StorageConfig' to be non-null");
    }

    private FeatureGroupOfflineStoreConfigGetArgs() {
        this.dataCatalogConfig = Input.empty();
        this.disableGlueTableCreation = Input.empty();
        this.s3StorageConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs> dataCatalogConfig;
        private @Nullable Input<Boolean> disableGlueTableCreation;
        private Input<FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> s3StorageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.disableGlueTableCreation = defaults.disableGlueTableCreation;
    	      this.s3StorageConfig = defaults.s3StorageConfig;
        }

        public Builder setDataCatalogConfig(@Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs> dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        public Builder setDataCatalogConfig(@Nullable FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs dataCatalogConfig) {
            this.dataCatalogConfig = Input.ofNullable(dataCatalogConfig);
            return this;
        }

        public Builder setDisableGlueTableCreation(@Nullable Input<Boolean> disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        public Builder setDisableGlueTableCreation(@Nullable Boolean disableGlueTableCreation) {
            this.disableGlueTableCreation = Input.ofNullable(disableGlueTableCreation);
            return this;
        }

        public Builder setS3StorageConfig(Input<FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> s3StorageConfig) {
            this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
            return this;
        }

        public Builder setS3StorageConfig(FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs s3StorageConfig) {
            this.s3StorageConfig = Input.of(Objects.requireNonNull(s3StorageConfig));
            return this;
        }
        public FeatureGroupOfflineStoreConfigGetArgs build() {
            return new FeatureGroupOfflineStoreConfigGetArgs(dataCatalogConfig, disableGlueTableCreation, s3StorageConfig);
        }
    }
}
