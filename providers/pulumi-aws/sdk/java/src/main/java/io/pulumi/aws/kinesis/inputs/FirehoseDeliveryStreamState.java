// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamS3ConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamServerSideEncryptionGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamSplunkConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamState extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamState Empty = new FirehoseDeliveryStreamState();

    /**
     * The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<String> destination;

    public Output<String> getDestination() {
        return this.destination == null ? Output.empty() : this.destination;
    }

    @Import(name="destinationId")
      private final @Nullable Output<String> destinationId;

    public Output<String> getDestinationId() {
        return this.destinationId == null ? Output.empty() : this.destinationId;
    }

    /**
     * Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    @Import(name="elasticsearchConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration;

    public Output<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> getElasticsearchConfiguration() {
        return this.elasticsearchConfiguration == null ? Output.empty() : this.elasticsearchConfiguration;
    }

    /**
     * Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    @Import(name="extendedS3Configuration")
      private final @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> getExtendedS3Configuration() {
        return this.extendedS3Configuration == null ? Output.empty() : this.extendedS3Configuration;
    }

    /**
     * Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    @Import(name="httpEndpointConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration;

    public Output<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> getHttpEndpointConfiguration() {
        return this.httpEndpointConfiguration == null ? Output.empty() : this.httpEndpointConfiguration;
    }

    /**
     * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    @Import(name="kinesisSourceConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration;

    public Output<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> getKinesisSourceConfiguration() {
        return this.kinesisSourceConfiguration == null ? Output.empty() : this.kinesisSourceConfiguration;
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    @Import(name="redshiftConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration;

    public Output<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> getRedshiftConfiguration() {
        return this.redshiftConfiguration == null ? Output.empty() : this.redshiftConfiguration;
    }

    /**
     * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    @Import(name="s3Configuration")
      private final @Nullable Output<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration;

    public Output<FirehoseDeliveryStreamS3ConfigurationGetArgs> getS3Configuration() {
        return this.s3Configuration == null ? Output.empty() : this.s3Configuration;
    }

    /**
     * Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    @Import(name="serverSideEncryption")
      private final @Nullable Output<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption;

    public Output<FirehoseDeliveryStreamServerSideEncryptionGetArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Output.empty() : this.serverSideEncryption;
    }

    /**
     * Configuration options if splunk is the destination. More details are given below.
     * 
     */
    @Import(name="splunkConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration;

    public Output<FirehoseDeliveryStreamSplunkConfigurationGetArgs> getSplunkConfiguration() {
        return this.splunkConfiguration == null ? Output.empty() : this.splunkConfiguration;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Output.empty() : this.versionId;
    }

    public FirehoseDeliveryStreamState(
        @Nullable Output<String> arn,
        @Nullable Output<String> destination,
        @Nullable Output<String> destinationId,
        @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration,
        @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration,
        @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration,
        @Nullable Output<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration,
        @Nullable Output<String> name,
        @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration,
        @Nullable Output<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration,
        @Nullable Output<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption,
        @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> versionId) {
        this.arn = arn;
        this.destination = destination;
        this.destinationId = destinationId;
        this.elasticsearchConfiguration = elasticsearchConfiguration;
        this.extendedS3Configuration = extendedS3Configuration;
        this.httpEndpointConfiguration = httpEndpointConfiguration;
        this.kinesisSourceConfiguration = kinesisSourceConfiguration;
        this.name = name;
        this.redshiftConfiguration = redshiftConfiguration;
        this.s3Configuration = s3Configuration;
        this.serverSideEncryption = serverSideEncryption;
        this.splunkConfiguration = splunkConfiguration;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.versionId = versionId;
    }

    private FirehoseDeliveryStreamState() {
        this.arn = Output.empty();
        this.destination = Output.empty();
        this.destinationId = Output.empty();
        this.elasticsearchConfiguration = Output.empty();
        this.extendedS3Configuration = Output.empty();
        this.httpEndpointConfiguration = Output.empty();
        this.kinesisSourceConfiguration = Output.empty();
        this.name = Output.empty();
        this.redshiftConfiguration = Output.empty();
        this.s3Configuration = Output.empty();
        this.serverSideEncryption = Output.empty();
        this.splunkConfiguration = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.versionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> destination;
        private @Nullable Output<String> destinationId;
        private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration;
        private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration;
        private @Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration;
        private @Nullable Output<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration;
        private @Nullable Output<String> name;
        private @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration;
        private @Nullable Output<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration;
        private @Nullable Output<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption;
        private @Nullable Output<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destination = defaults.destination;
    	      this.destinationId = defaults.destinationId;
    	      this.elasticsearchConfiguration = defaults.elasticsearchConfiguration;
    	      this.extendedS3Configuration = defaults.extendedS3Configuration;
    	      this.httpEndpointConfiguration = defaults.httpEndpointConfiguration;
    	      this.kinesisSourceConfiguration = defaults.kinesisSourceConfiguration;
    	      this.name = defaults.name;
    	      this.redshiftConfiguration = defaults.redshiftConfiguration;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.splunkConfiguration = defaults.splunkConfiguration;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.versionId = defaults.versionId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder destination(@Nullable Output<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = Output.ofNullable(destination);
            return this;
        }

        public Builder destinationId(@Nullable Output<String> destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder destinationId(@Nullable String destinationId) {
            this.destinationId = Output.ofNullable(destinationId);
            return this;
        }

        public Builder elasticsearchConfiguration(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration) {
            this.elasticsearchConfiguration = elasticsearchConfiguration;
            return this;
        }

        public Builder elasticsearchConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationGetArgs elasticsearchConfiguration) {
            this.elasticsearchConfiguration = Output.ofNullable(elasticsearchConfiguration);
            return this;
        }

        public Builder extendedS3Configuration(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration) {
            this.extendedS3Configuration = extendedS3Configuration;
            return this;
        }

        public Builder extendedS3Configuration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs extendedS3Configuration) {
            this.extendedS3Configuration = Output.ofNullable(extendedS3Configuration);
            return this;
        }

        public Builder httpEndpointConfiguration(@Nullable Output<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration) {
            this.httpEndpointConfiguration = httpEndpointConfiguration;
            return this;
        }

        public Builder httpEndpointConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs httpEndpointConfiguration) {
            this.httpEndpointConfiguration = Output.ofNullable(httpEndpointConfiguration);
            return this;
        }

        public Builder kinesisSourceConfiguration(@Nullable Output<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = kinesisSourceConfiguration;
            return this;
        }

        public Builder kinesisSourceConfiguration(@Nullable FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = Output.ofNullable(kinesisSourceConfiguration);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder redshiftConfiguration(@Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration) {
            this.redshiftConfiguration = redshiftConfiguration;
            return this;
        }

        public Builder redshiftConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationGetArgs redshiftConfiguration) {
            this.redshiftConfiguration = Output.ofNullable(redshiftConfiguration);
            return this;
        }

        public Builder s3Configuration(@Nullable Output<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }

        public Builder s3Configuration(@Nullable FirehoseDeliveryStreamS3ConfigurationGetArgs s3Configuration) {
            this.s3Configuration = Output.ofNullable(s3Configuration);
            return this;
        }

        public Builder serverSideEncryption(@Nullable Output<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder serverSideEncryption(@Nullable FirehoseDeliveryStreamServerSideEncryptionGetArgs serverSideEncryption) {
            this.serverSideEncryption = Output.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder splunkConfiguration(@Nullable Output<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration) {
            this.splunkConfiguration = splunkConfiguration;
            return this;
        }

        public Builder splunkConfiguration(@Nullable FirehoseDeliveryStreamSplunkConfigurationGetArgs splunkConfiguration) {
            this.splunkConfiguration = Output.ofNullable(splunkConfiguration);
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

        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = Output.ofNullable(versionId);
            return this;
        }
        public FirehoseDeliveryStreamState build() {
            return new FirehoseDeliveryStreamState(arn, destination, destinationId, elasticsearchConfiguration, extendedS3Configuration, httpEndpointConfiguration, kinesisSourceConfiguration, name, redshiftConfiguration, s3Configuration, serverSideEncryption, splunkConfiguration, tags, tagsAll, versionId);
        }
    }
}
