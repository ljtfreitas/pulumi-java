// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail;

import io.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs;
import io.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs;
import io.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailArgs Empty = new TrailArgs();

    /**
     * Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    @Import(name="advancedEventSelectors")
      private final @Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors;

    public Output<List<TrailAdvancedEventSelectorArgs>> getAdvancedEventSelectors() {
        return this.advancedEventSelectors == null ? Output.empty() : this.advancedEventSelectors;
    }

    /**
     * Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    @Import(name="cloudWatchLogsGroupArn")
      private final @Nullable Output<String> cloudWatchLogsGroupArn;

    public Output<String> getCloudWatchLogsGroupArn() {
        return this.cloudWatchLogsGroupArn == null ? Output.empty() : this.cloudWatchLogsGroupArn;
    }

    /**
     * Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    @Import(name="cloudWatchLogsRoleArn")
      private final @Nullable Output<String> cloudWatchLogsRoleArn;

    public Output<String> getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn == null ? Output.empty() : this.cloudWatchLogsRoleArn;
    }

    /**
     * Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enableLogFileValidation")
      private final @Nullable Output<Boolean> enableLogFileValidation;

    public Output<Boolean> getEnableLogFileValidation() {
        return this.enableLogFileValidation == null ? Output.empty() : this.enableLogFileValidation;
    }

    /**
     * Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Output.empty() : this.enableLogging;
    }

    /**
     * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    @Import(name="eventSelectors")
      private final @Nullable Output<List<TrailEventSelectorArgs>> eventSelectors;

    public Output<List<TrailEventSelectorArgs>> getEventSelectors() {
        return this.eventSelectors == null ? Output.empty() : this.eventSelectors;
    }

    /**
     * Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    @Import(name="includeGlobalServiceEvents")
      private final @Nullable Output<Boolean> includeGlobalServiceEvents;

    public Output<Boolean> getIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents == null ? Output.empty() : this.includeGlobalServiceEvents;
    }

    /**
     * Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    @Import(name="insightSelectors")
      private final @Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors;

    public Output<List<TrailInsightSelectorArgs>> getInsightSelectors() {
        return this.insightSelectors == null ? Output.empty() : this.insightSelectors;
    }

    /**
     * Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    @Import(name="isMultiRegionTrail")
      private final @Nullable Output<Boolean> isMultiRegionTrail;

    public Output<Boolean> getIsMultiRegionTrail() {
        return this.isMultiRegionTrail == null ? Output.empty() : this.isMultiRegionTrail;
    }

    /**
     * Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    @Import(name="isOrganizationTrail")
      private final @Nullable Output<Boolean> isOrganizationTrail;

    public Output<Boolean> getIsOrganizationTrail() {
        return this.isOrganizationTrail == null ? Output.empty() : this.isOrganizationTrail;
    }

    /**
     * KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Name of the S3 bucket designated for publishing log files.
     * 
     */
    @Import(name="s3BucketName", required=true)
      private final Output<String> s3BucketName;

    public Output<String> getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Output.empty() : this.s3KeyPrefix;
    }

    /**
     * Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    @Import(name="snsTopicName")
      private final @Nullable Output<String> snsTopicName;

    public Output<String> getSnsTopicName() {
        return this.snsTopicName == null ? Output.empty() : this.snsTopicName;
    }

    /**
     * Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public TrailArgs(
        @Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors,
        @Nullable Output<String> cloudWatchLogsGroupArn,
        @Nullable Output<String> cloudWatchLogsRoleArn,
        @Nullable Output<Boolean> enableLogFileValidation,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<List<TrailEventSelectorArgs>> eventSelectors,
        @Nullable Output<Boolean> includeGlobalServiceEvents,
        @Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors,
        @Nullable Output<Boolean> isMultiRegionTrail,
        @Nullable Output<Boolean> isOrganizationTrail,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> name,
        Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix,
        @Nullable Output<String> snsTopicName,
        @Nullable Output<Map<String,String>> tags) {
        this.advancedEventSelectors = advancedEventSelectors;
        this.cloudWatchLogsGroupArn = cloudWatchLogsGroupArn;
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        this.enableLogFileValidation = enableLogFileValidation;
        this.enableLogging = enableLogging;
        this.eventSelectors = eventSelectors;
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        this.insightSelectors = insightSelectors;
        this.isMultiRegionTrail = isMultiRegionTrail;
        this.isOrganizationTrail = isOrganizationTrail;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
        this.snsTopicName = snsTopicName;
        this.tags = tags;
    }

    private TrailArgs() {
        this.advancedEventSelectors = Output.empty();
        this.cloudWatchLogsGroupArn = Output.empty();
        this.cloudWatchLogsRoleArn = Output.empty();
        this.enableLogFileValidation = Output.empty();
        this.enableLogging = Output.empty();
        this.eventSelectors = Output.empty();
        this.includeGlobalServiceEvents = Output.empty();
        this.insightSelectors = Output.empty();
        this.isMultiRegionTrail = Output.empty();
        this.isOrganizationTrail = Output.empty();
        this.kmsKeyId = Output.empty();
        this.name = Output.empty();
        this.s3BucketName = Output.empty();
        this.s3KeyPrefix = Output.empty();
        this.snsTopicName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors;
        private @Nullable Output<String> cloudWatchLogsGroupArn;
        private @Nullable Output<String> cloudWatchLogsRoleArn;
        private @Nullable Output<Boolean> enableLogFileValidation;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<List<TrailEventSelectorArgs>> eventSelectors;
        private @Nullable Output<Boolean> includeGlobalServiceEvents;
        private @Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors;
        private @Nullable Output<Boolean> isMultiRegionTrail;
        private @Nullable Output<Boolean> isOrganizationTrail;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> name;
        private Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;
        private @Nullable Output<String> snsTopicName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedEventSelectors = defaults.advancedEventSelectors;
    	      this.cloudWatchLogsGroupArn = defaults.cloudWatchLogsGroupArn;
    	      this.cloudWatchLogsRoleArn = defaults.cloudWatchLogsRoleArn;
    	      this.enableLogFileValidation = defaults.enableLogFileValidation;
    	      this.enableLogging = defaults.enableLogging;
    	      this.eventSelectors = defaults.eventSelectors;
    	      this.includeGlobalServiceEvents = defaults.includeGlobalServiceEvents;
    	      this.insightSelectors = defaults.insightSelectors;
    	      this.isMultiRegionTrail = defaults.isMultiRegionTrail;
    	      this.isOrganizationTrail = defaults.isOrganizationTrail;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.snsTopicName = defaults.snsTopicName;
    	      this.tags = defaults.tags;
        }

        public Builder advancedEventSelectors(@Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors) {
            this.advancedEventSelectors = advancedEventSelectors;
            return this;
        }

        public Builder advancedEventSelectors(@Nullable List<TrailAdvancedEventSelectorArgs> advancedEventSelectors) {
            this.advancedEventSelectors = Output.ofNullable(advancedEventSelectors);
            return this;
        }

        public Builder cloudWatchLogsGroupArn(@Nullable Output<String> cloudWatchLogsGroupArn) {
            this.cloudWatchLogsGroupArn = cloudWatchLogsGroupArn;
            return this;
        }

        public Builder cloudWatchLogsGroupArn(@Nullable String cloudWatchLogsGroupArn) {
            this.cloudWatchLogsGroupArn = Output.ofNullable(cloudWatchLogsGroupArn);
            return this;
        }

        public Builder cloudWatchLogsRoleArn(@Nullable Output<String> cloudWatchLogsRoleArn) {
            this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
            return this;
        }

        public Builder cloudWatchLogsRoleArn(@Nullable String cloudWatchLogsRoleArn) {
            this.cloudWatchLogsRoleArn = Output.ofNullable(cloudWatchLogsRoleArn);
            return this;
        }

        public Builder enableLogFileValidation(@Nullable Output<Boolean> enableLogFileValidation) {
            this.enableLogFileValidation = enableLogFileValidation;
            return this;
        }

        public Builder enableLogFileValidation(@Nullable Boolean enableLogFileValidation) {
            this.enableLogFileValidation = Output.ofNullable(enableLogFileValidation);
            return this;
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Output.ofNullable(enableLogging);
            return this;
        }

        public Builder eventSelectors(@Nullable Output<List<TrailEventSelectorArgs>> eventSelectors) {
            this.eventSelectors = eventSelectors;
            return this;
        }

        public Builder eventSelectors(@Nullable List<TrailEventSelectorArgs> eventSelectors) {
            this.eventSelectors = Output.ofNullable(eventSelectors);
            return this;
        }

        public Builder includeGlobalServiceEvents(@Nullable Output<Boolean> includeGlobalServiceEvents) {
            this.includeGlobalServiceEvents = includeGlobalServiceEvents;
            return this;
        }

        public Builder includeGlobalServiceEvents(@Nullable Boolean includeGlobalServiceEvents) {
            this.includeGlobalServiceEvents = Output.ofNullable(includeGlobalServiceEvents);
            return this;
        }

        public Builder insightSelectors(@Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors) {
            this.insightSelectors = insightSelectors;
            return this;
        }

        public Builder insightSelectors(@Nullable List<TrailInsightSelectorArgs> insightSelectors) {
            this.insightSelectors = Output.ofNullable(insightSelectors);
            return this;
        }

        public Builder isMultiRegionTrail(@Nullable Output<Boolean> isMultiRegionTrail) {
            this.isMultiRegionTrail = isMultiRegionTrail;
            return this;
        }

        public Builder isMultiRegionTrail(@Nullable Boolean isMultiRegionTrail) {
            this.isMultiRegionTrail = Output.ofNullable(isMultiRegionTrail);
            return this;
        }

        public Builder isOrganizationTrail(@Nullable Output<Boolean> isOrganizationTrail) {
            this.isOrganizationTrail = isOrganizationTrail;
            return this;
        }

        public Builder isOrganizationTrail(@Nullable Boolean isOrganizationTrail) {
            this.isOrganizationTrail = Output.ofNullable(isOrganizationTrail);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
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

        public Builder s3BucketName(Output<String> s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Output.of(Objects.requireNonNull(s3BucketName));
            return this;
        }

        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Output.ofNullable(s3KeyPrefix);
            return this;
        }

        public Builder snsTopicName(@Nullable Output<String> snsTopicName) {
            this.snsTopicName = snsTopicName;
            return this;
        }

        public Builder snsTopicName(@Nullable String snsTopicName) {
            this.snsTopicName = Output.ofNullable(snsTopicName);
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
        public TrailArgs build() {
            return new TrailArgs(advancedEventSelectors, cloudWatchLogsGroupArn, cloudWatchLogsRoleArn, enableLogFileValidation, enableLogging, eventSelectors, includeGlobalServiceEvents, insightSelectors, isMultiRegionTrail, isOrganizationTrail, kmsKeyId, name, s3BucketName, s3KeyPrefix, snsTopicName, tags);
        }
    }
}
