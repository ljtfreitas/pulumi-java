// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecArgs Empty = new TransferJobTransferSpecArgs();

    /**
     * An AWS S3 data source. Structure documented below.
     * 
     */
    @Import(name="awsS3DataSource")
      private final @Nullable Output<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource;

    public Output<TransferJobTransferSpecAwsS3DataSourceArgs> getAwsS3DataSource() {
        return this.awsS3DataSource == null ? Output.empty() : this.awsS3DataSource;
    }

    /**
     * An Azure Blob Storage data source. Structure documented below.
     * 
     */
    @Import(name="azureBlobStorageDataSource")
      private final @Nullable Output<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource;

    public Output<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> getAzureBlobStorageDataSource() {
        return this.azureBlobStorageDataSource == null ? Output.empty() : this.azureBlobStorageDataSource;
    }

    /**
     * A Google Cloud Storage data sink. Structure documented below.
     * 
     */
    @Import(name="gcsDataSink")
      private final @Nullable Output<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink;

    public Output<TransferJobTransferSpecGcsDataSinkArgs> getGcsDataSink() {
        return this.gcsDataSink == null ? Output.empty() : this.gcsDataSink;
    }

    /**
     * A Google Cloud Storage data source. Structure documented below.
     * 
     */
    @Import(name="gcsDataSource")
      private final @Nullable Output<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource;

    public Output<TransferJobTransferSpecGcsDataSourceArgs> getGcsDataSource() {
        return this.gcsDataSource == null ? Output.empty() : this.gcsDataSource;
    }

    /**
     * A HTTP URL data source. Structure documented below.
     * 
     */
    @Import(name="httpDataSource")
      private final @Nullable Output<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource;

    public Output<TransferJobTransferSpecHttpDataSourceArgs> getHttpDataSource() {
        return this.httpDataSource == null ? Output.empty() : this.httpDataSource;
    }

    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' `last_modification_time` do not exclude objects in a data sink. Structure documented below.
     * 
     */
    @Import(name="objectConditions")
      private final @Nullable Output<TransferJobTransferSpecObjectConditionsArgs> objectConditions;

    public Output<TransferJobTransferSpecObjectConditionsArgs> getObjectConditions() {
        return this.objectConditions == null ? Output.empty() : this.objectConditions;
    }

    /**
     * Characteristics of how to treat files from datasource and sink during job. If the option `delete_objects_unique_in_sink` is true, object conditions based on objects' `last_modification_time` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * 
     */
    @Import(name="transferOptions")
      private final @Nullable Output<TransferJobTransferSpecTransferOptionsArgs> transferOptions;

    public Output<TransferJobTransferSpecTransferOptionsArgs> getTransferOptions() {
        return this.transferOptions == null ? Output.empty() : this.transferOptions;
    }

    public TransferJobTransferSpecArgs(
        @Nullable Output<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource,
        @Nullable Output<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource,
        @Nullable Output<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink,
        @Nullable Output<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource,
        @Nullable Output<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource,
        @Nullable Output<TransferJobTransferSpecObjectConditionsArgs> objectConditions,
        @Nullable Output<TransferJobTransferSpecTransferOptionsArgs> transferOptions) {
        this.awsS3DataSource = awsS3DataSource;
        this.azureBlobStorageDataSource = azureBlobStorageDataSource;
        this.gcsDataSink = gcsDataSink;
        this.gcsDataSource = gcsDataSource;
        this.httpDataSource = httpDataSource;
        this.objectConditions = objectConditions;
        this.transferOptions = transferOptions;
    }

    private TransferJobTransferSpecArgs() {
        this.awsS3DataSource = Output.empty();
        this.azureBlobStorageDataSource = Output.empty();
        this.gcsDataSink = Output.empty();
        this.gcsDataSource = Output.empty();
        this.httpDataSource = Output.empty();
        this.objectConditions = Output.empty();
        this.transferOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource;
        private @Nullable Output<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource;
        private @Nullable Output<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink;
        private @Nullable Output<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource;
        private @Nullable Output<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource;
        private @Nullable Output<TransferJobTransferSpecObjectConditionsArgs> objectConditions;
        private @Nullable Output<TransferJobTransferSpecTransferOptionsArgs> transferOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsS3DataSource = defaults.awsS3DataSource;
    	      this.azureBlobStorageDataSource = defaults.azureBlobStorageDataSource;
    	      this.gcsDataSink = defaults.gcsDataSink;
    	      this.gcsDataSource = defaults.gcsDataSource;
    	      this.httpDataSource = defaults.httpDataSource;
    	      this.objectConditions = defaults.objectConditions;
    	      this.transferOptions = defaults.transferOptions;
        }

        public Builder awsS3DataSource(@Nullable Output<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource) {
            this.awsS3DataSource = awsS3DataSource;
            return this;
        }

        public Builder awsS3DataSource(@Nullable TransferJobTransferSpecAwsS3DataSourceArgs awsS3DataSource) {
            this.awsS3DataSource = Output.ofNullable(awsS3DataSource);
            return this;
        }

        public Builder azureBlobStorageDataSource(@Nullable Output<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = azureBlobStorageDataSource;
            return this;
        }

        public Builder azureBlobStorageDataSource(@Nullable TransferJobTransferSpecAzureBlobStorageDataSourceArgs azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = Output.ofNullable(azureBlobStorageDataSource);
            return this;
        }

        public Builder gcsDataSink(@Nullable Output<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink) {
            this.gcsDataSink = gcsDataSink;
            return this;
        }

        public Builder gcsDataSink(@Nullable TransferJobTransferSpecGcsDataSinkArgs gcsDataSink) {
            this.gcsDataSink = Output.ofNullable(gcsDataSink);
            return this;
        }

        public Builder gcsDataSource(@Nullable Output<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource) {
            this.gcsDataSource = gcsDataSource;
            return this;
        }

        public Builder gcsDataSource(@Nullable TransferJobTransferSpecGcsDataSourceArgs gcsDataSource) {
            this.gcsDataSource = Output.ofNullable(gcsDataSource);
            return this;
        }

        public Builder httpDataSource(@Nullable Output<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource) {
            this.httpDataSource = httpDataSource;
            return this;
        }

        public Builder httpDataSource(@Nullable TransferJobTransferSpecHttpDataSourceArgs httpDataSource) {
            this.httpDataSource = Output.ofNullable(httpDataSource);
            return this;
        }

        public Builder objectConditions(@Nullable Output<TransferJobTransferSpecObjectConditionsArgs> objectConditions) {
            this.objectConditions = objectConditions;
            return this;
        }

        public Builder objectConditions(@Nullable TransferJobTransferSpecObjectConditionsArgs objectConditions) {
            this.objectConditions = Output.ofNullable(objectConditions);
            return this;
        }

        public Builder transferOptions(@Nullable Output<TransferJobTransferSpecTransferOptionsArgs> transferOptions) {
            this.transferOptions = transferOptions;
            return this;
        }

        public Builder transferOptions(@Nullable TransferJobTransferSpecTransferOptionsArgs transferOptions) {
            this.transferOptions = Output.ofNullable(transferOptions);
            return this;
        }
        public TransferJobTransferSpecArgs build() {
            return new TransferJobTransferSpecArgs(awsS3DataSource, azureBlobStorageDataSource, gcsDataSink, gcsDataSource, httpDataSource, objectConditions, transferOptions);
        }
    }
}
