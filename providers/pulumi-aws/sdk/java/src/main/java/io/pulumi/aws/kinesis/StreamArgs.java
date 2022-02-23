// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.kinesis.inputs.StreamStreamModeDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    /**
     * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
     * 
     */
    @InputImport(name="encryptionType")
    private final @Nullable Input<String> encryptionType;

    public Input<String> getEncryptionType() {
        return this.encryptionType == null ? Input.empty() : this.encryptionType;
    }

    /**
     * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
     * 
     */
    @InputImport(name="enforceConsumerDeletion")
    private final @Nullable Input<Boolean> enforceConsumerDeletion;

    public Input<Boolean> getEnforceConsumerDeletion() {
        return this.enforceConsumerDeletion == null ? Input.empty() : this.enforceConsumerDeletion;
    }

    /**
     * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 8760 hours. Minimum value is 24. Default is 24.
     * 
     */
    @InputImport(name="retentionPeriod")
    private final @Nullable Input<Integer> retentionPeriod;

    public Input<Integer> getRetentionPeriod() {
        return this.retentionPeriod == null ? Input.empty() : this.retentionPeriod;
    }

    /**
     * The number of shards that the stream will use. If the `stream_mode` is `PROVISIONED`, this field is required.
     * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
     * 
     */
    @InputImport(name="shardCount")
    private final @Nullable Input<Integer> shardCount;

    public Input<Integer> getShardCount() {
        return this.shardCount == null ? Input.empty() : this.shardCount;
    }

    /**
     * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
     * 
     */
    @InputImport(name="shardLevelMetrics")
    private final @Nullable Input<List<String>> shardLevelMetrics;

    public Input<List<String>> getShardLevelMetrics() {
        return this.shardLevelMetrics == null ? Input.empty() : this.shardLevelMetrics;
    }

    /**
     * Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    @InputImport(name="streamModeDetails")
    private final @Nullable Input<StreamStreamModeDetailsArgs> streamModeDetails;

    public Input<StreamStreamModeDetailsArgs> getStreamModeDetails() {
        return this.streamModeDetails == null ? Input.empty() : this.streamModeDetails;
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

    public StreamArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> encryptionType,
        @Nullable Input<Boolean> enforceConsumerDeletion,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> name,
        @Nullable Input<Integer> retentionPeriod,
        @Nullable Input<Integer> shardCount,
        @Nullable Input<List<String>> shardLevelMetrics,
        @Nullable Input<StreamStreamModeDetailsArgs> streamModeDetails,
        @Nullable Input<Map<String,String>> tags) {
        this.arn = arn;
        this.encryptionType = encryptionType;
        this.enforceConsumerDeletion = enforceConsumerDeletion;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.retentionPeriod = retentionPeriod;
        this.shardCount = shardCount;
        this.shardLevelMetrics = shardLevelMetrics;
        this.streamModeDetails = streamModeDetails;
        this.tags = tags;
    }

    private StreamArgs() {
        this.arn = Input.empty();
        this.encryptionType = Input.empty();
        this.enforceConsumerDeletion = Input.empty();
        this.kmsKeyId = Input.empty();
        this.name = Input.empty();
        this.retentionPeriod = Input.empty();
        this.shardCount = Input.empty();
        this.shardLevelMetrics = Input.empty();
        this.streamModeDetails = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> encryptionType;
        private @Nullable Input<Boolean> enforceConsumerDeletion;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> retentionPeriod;
        private @Nullable Input<Integer> shardCount;
        private @Nullable Input<List<String>> shardLevelMetrics;
        private @Nullable Input<StreamStreamModeDetailsArgs> streamModeDetails;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encryptionType = defaults.encryptionType;
    	      this.enforceConsumerDeletion = defaults.enforceConsumerDeletion;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.shardCount = defaults.shardCount;
    	      this.shardLevelMetrics = defaults.shardLevelMetrics;
    	      this.streamModeDetails = defaults.streamModeDetails;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setEncryptionType(@Nullable Input<String> encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }

        public Builder setEncryptionType(@Nullable String encryptionType) {
            this.encryptionType = Input.ofNullable(encryptionType);
            return this;
        }

        public Builder setEnforceConsumerDeletion(@Nullable Input<Boolean> enforceConsumerDeletion) {
            this.enforceConsumerDeletion = enforceConsumerDeletion;
            return this;
        }

        public Builder setEnforceConsumerDeletion(@Nullable Boolean enforceConsumerDeletion) {
            this.enforceConsumerDeletion = Input.ofNullable(enforceConsumerDeletion);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
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

        public Builder setRetentionPeriod(@Nullable Input<Integer> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder setRetentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = Input.ofNullable(retentionPeriod);
            return this;
        }

        public Builder setShardCount(@Nullable Input<Integer> shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder setShardCount(@Nullable Integer shardCount) {
            this.shardCount = Input.ofNullable(shardCount);
            return this;
        }

        public Builder setShardLevelMetrics(@Nullable Input<List<String>> shardLevelMetrics) {
            this.shardLevelMetrics = shardLevelMetrics;
            return this;
        }

        public Builder setShardLevelMetrics(@Nullable List<String> shardLevelMetrics) {
            this.shardLevelMetrics = Input.ofNullable(shardLevelMetrics);
            return this;
        }

        public Builder setStreamModeDetails(@Nullable Input<StreamStreamModeDetailsArgs> streamModeDetails) {
            this.streamModeDetails = streamModeDetails;
            return this;
        }

        public Builder setStreamModeDetails(@Nullable StreamStreamModeDetailsArgs streamModeDetails) {
            this.streamModeDetails = Input.ofNullable(streamModeDetails);
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
        public StreamArgs build() {
            return new StreamArgs(arn, encryptionType, enforceConsumerDeletion, kmsKeyId, name, retentionPeriod, shardCount, shardLevelMetrics, streamModeDetails, tags);
        }
    }
}
