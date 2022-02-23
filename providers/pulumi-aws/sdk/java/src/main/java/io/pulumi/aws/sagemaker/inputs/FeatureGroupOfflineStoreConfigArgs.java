// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigS3StorageConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupOfflineStoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupOfflineStoreConfigArgs Empty = new FeatureGroupOfflineStoreConfigArgs();

    /**
     * The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
     * 
     */
    @InputImport(name="dataCatalogConfig")
    private final @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig;

    public Input<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> getDataCatalogConfig() {
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
    private final Input<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig;

    public Input<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> getS3StorageConfig() {
        return this.s3StorageConfig;
    }

    public FeatureGroupOfflineStoreConfigArgs(
        @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig,
        @Nullable Input<Boolean> disableGlueTableCreation,
        Input<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.disableGlueTableCreation = disableGlueTableCreation;
        this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig, "expected parameter 's3StorageConfig' to be non-null");
    }

    private FeatureGroupOfflineStoreConfigArgs() {
        this.dataCatalogConfig = Input.empty();
        this.disableGlueTableCreation = Input.empty();
        this.s3StorageConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig;
        private @Nullable Input<Boolean> disableGlueTableCreation;
        private Input<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.disableGlueTableCreation = defaults.disableGlueTableCreation;
    	      this.s3StorageConfig = defaults.s3StorageConfig;
        }

        public Builder setDataCatalogConfig(@Nullable Input<FeatureGroupOfflineStoreConfigDataCatalogConfigArgs> dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        public Builder setDataCatalogConfig(@Nullable FeatureGroupOfflineStoreConfigDataCatalogConfigArgs dataCatalogConfig) {
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

        public Builder setS3StorageConfig(Input<FeatureGroupOfflineStoreConfigS3StorageConfigArgs> s3StorageConfig) {
            this.s3StorageConfig = Objects.requireNonNull(s3StorageConfig);
            return this;
        }

        public Builder setS3StorageConfig(FeatureGroupOfflineStoreConfigS3StorageConfigArgs s3StorageConfig) {
            this.s3StorageConfig = Input.of(Objects.requireNonNull(s3StorageConfig));
            return this;
        }
        public FeatureGroupOfflineStoreConfigArgs build() {
            return new FeatureGroupOfflineStoreConfigArgs(dataCatalogConfig, disableGlueTableCreation, s3StorageConfig);
        }
    }
}