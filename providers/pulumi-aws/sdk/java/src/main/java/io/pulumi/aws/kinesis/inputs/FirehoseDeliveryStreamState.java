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
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    @InputImport(name="destination")
    private final @Nullable Input<String> destination;

    public Input<String> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    @InputImport(name="destinationId")
    private final @Nullable Input<String> destinationId;

    public Input<String> getDestinationId() {
        return this.destinationId == null ? Input.empty() : this.destinationId;
    }

    /**
     * Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    @InputImport(name="elasticsearchConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration;

    public Input<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> getElasticsearchConfiguration() {
        return this.elasticsearchConfiguration == null ? Input.empty() : this.elasticsearchConfiguration;
    }

    /**
     * Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    @InputImport(name="extendedS3Configuration")
    private final @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> getExtendedS3Configuration() {
        return this.extendedS3Configuration == null ? Input.empty() : this.extendedS3Configuration;
    }

    /**
     * Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    @InputImport(name="httpEndpointConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration;

    public Input<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> getHttpEndpointConfiguration() {
        return this.httpEndpointConfiguration == null ? Input.empty() : this.httpEndpointConfiguration;
    }

    /**
     * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    @InputImport(name="kinesisSourceConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration;

    public Input<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> getKinesisSourceConfiguration() {
        return this.kinesisSourceConfiguration == null ? Input.empty() : this.kinesisSourceConfiguration;
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    @InputImport(name="redshiftConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration;

    public Input<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> getRedshiftConfiguration() {
        return this.redshiftConfiguration == null ? Input.empty() : this.redshiftConfiguration;
    }

    /**
     * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    @InputImport(name="s3Configuration")
    private final @Nullable Input<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration;

    public Input<FirehoseDeliveryStreamS3ConfigurationGetArgs> getS3Configuration() {
        return this.s3Configuration == null ? Input.empty() : this.s3Configuration;
    }

    /**
     * Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    @InputImport(name="serverSideEncryption")
    private final @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption;

    public Input<FirehoseDeliveryStreamServerSideEncryptionGetArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Input.empty() : this.serverSideEncryption;
    }

    /**
     * Configuration options if splunk is the destination. More details are given below.
     * 
     */
    @InputImport(name="splunkConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration;

    public Input<FirehoseDeliveryStreamSplunkConfigurationGetArgs> getSplunkConfiguration() {
        return this.splunkConfiguration == null ? Input.empty() : this.splunkConfiguration;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    @InputImport(name="versionId")
    private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public FirehoseDeliveryStreamState(
        @Nullable Input<String> arn,
        @Nullable Input<String> destination,
        @Nullable Input<String> destinationId,
        @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration,
        @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration,
        @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration,
        @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration,
        @Nullable Input<String> name,
        @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration,
        @Nullable Input<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration,
        @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption,
        @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> versionId) {
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
        this.arn = Input.empty();
        this.destination = Input.empty();
        this.destinationId = Input.empty();
        this.elasticsearchConfiguration = Input.empty();
        this.extendedS3Configuration = Input.empty();
        this.httpEndpointConfiguration = Input.empty();
        this.kinesisSourceConfiguration = Input.empty();
        this.name = Input.empty();
        this.redshiftConfiguration = Input.empty();
        this.s3Configuration = Input.empty();
        this.serverSideEncryption = Input.empty();
        this.splunkConfiguration = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> destination;
        private @Nullable Input<String> destinationId;
        private @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration;
        private @Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration;
        private @Nullable Input<String> name;
        private @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration;
        private @Nullable Input<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration;
        private @Nullable Input<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption;
        private @Nullable Input<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> versionId;

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

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDestination(@Nullable Input<String> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setDestinationId(@Nullable Input<String> destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder setDestinationId(@Nullable String destinationId) {
            this.destinationId = Input.ofNullable(destinationId);
            return this;
        }

        public Builder setElasticsearchConfiguration(@Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationGetArgs> elasticsearchConfiguration) {
            this.elasticsearchConfiguration = elasticsearchConfiguration;
            return this;
        }

        public Builder setElasticsearchConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationGetArgs elasticsearchConfiguration) {
            this.elasticsearchConfiguration = Input.ofNullable(elasticsearchConfiguration);
            return this;
        }

        public Builder setExtendedS3Configuration(@Nullable Input<FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs> extendedS3Configuration) {
            this.extendedS3Configuration = extendedS3Configuration;
            return this;
        }

        public Builder setExtendedS3Configuration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationGetArgs extendedS3Configuration) {
            this.extendedS3Configuration = Input.ofNullable(extendedS3Configuration);
            return this;
        }

        public Builder setHttpEndpointConfiguration(@Nullable Input<FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs> httpEndpointConfiguration) {
            this.httpEndpointConfiguration = httpEndpointConfiguration;
            return this;
        }

        public Builder setHttpEndpointConfiguration(@Nullable FirehoseDeliveryStreamHttpEndpointConfigurationGetArgs httpEndpointConfiguration) {
            this.httpEndpointConfiguration = Input.ofNullable(httpEndpointConfiguration);
            return this;
        }

        public Builder setKinesisSourceConfiguration(@Nullable Input<FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs> kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = kinesisSourceConfiguration;
            return this;
        }

        public Builder setKinesisSourceConfiguration(@Nullable FirehoseDeliveryStreamKinesisSourceConfigurationGetArgs kinesisSourceConfiguration) {
            this.kinesisSourceConfiguration = Input.ofNullable(kinesisSourceConfiguration);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRedshiftConfiguration(@Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationGetArgs> redshiftConfiguration) {
            this.redshiftConfiguration = redshiftConfiguration;
            return this;
        }

        public Builder setRedshiftConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationGetArgs redshiftConfiguration) {
            this.redshiftConfiguration = Input.ofNullable(redshiftConfiguration);
            return this;
        }

        public Builder setS3Configuration(@Nullable Input<FirehoseDeliveryStreamS3ConfigurationGetArgs> s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }

        public Builder setS3Configuration(@Nullable FirehoseDeliveryStreamS3ConfigurationGetArgs s3Configuration) {
            this.s3Configuration = Input.ofNullable(s3Configuration);
            return this;
        }

        public Builder setServerSideEncryption(@Nullable Input<FirehoseDeliveryStreamServerSideEncryptionGetArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder setServerSideEncryption(@Nullable FirehoseDeliveryStreamServerSideEncryptionGetArgs serverSideEncryption) {
            this.serverSideEncryption = Input.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder setSplunkConfiguration(@Nullable Input<FirehoseDeliveryStreamSplunkConfigurationGetArgs> splunkConfiguration) {
            this.splunkConfiguration = splunkConfiguration;
            return this;
        }

        public Builder setSplunkConfiguration(@Nullable FirehoseDeliveryStreamSplunkConfigurationGetArgs splunkConfiguration) {
            this.splunkConfiguration = Input.ofNullable(splunkConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }
        public FirehoseDeliveryStreamState build() {
            return new FirehoseDeliveryStreamState(arn, destination, destinationId, elasticsearchConfiguration, extendedS3Configuration, httpEndpointConfiguration, kinesisSourceConfiguration, name, redshiftConfiguration, s3Configuration, serverSideEncryption, splunkConfiguration, tags, tagsAll, versionId);
        }
    }
}
