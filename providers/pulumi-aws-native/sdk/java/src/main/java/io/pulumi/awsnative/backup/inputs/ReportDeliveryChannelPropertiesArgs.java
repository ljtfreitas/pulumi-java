// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
 * 
 */
public final class ReportDeliveryChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDeliveryChannelPropertiesArgs Empty = new ReportDeliveryChannelPropertiesArgs();

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    @InputImport(name="formats")
        private final @Nullable Input<List<String>> formats;

    public Input<List<String>> getFormats() {
        return this.formats == null ? Input.empty() : this.formats;
    }

    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    @InputImport(name="s3BucketName", required=true)
        private final Input<String> s3BucketName;

    public Input<String> getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    @InputImport(name="s3KeyPrefix")
        private final @Nullable Input<String> s3KeyPrefix;

    public Input<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Input.empty() : this.s3KeyPrefix;
    }

    public ReportDeliveryChannelPropertiesArgs(
        @Nullable Input<List<String>> formats,
        Input<String> s3BucketName,
        @Nullable Input<String> s3KeyPrefix) {
        this.formats = formats;
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ReportDeliveryChannelPropertiesArgs() {
        this.formats = Input.empty();
        this.s3BucketName = Input.empty();
        this.s3KeyPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> formats;
        private Input<String> s3BucketName;
        private @Nullable Input<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formats = defaults.formats;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder setFormats(@Nullable Input<List<String>> formats) {
            this.formats = formats;
            return this;
        }

        public Builder setFormats(@Nullable List<String> formats) {
            this.formats = Input.ofNullable(formats);
            return this;
        }

        public Builder setS3BucketName(Input<String> s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Input.of(Objects.requireNonNull(s3BucketName));
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable Input<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Input.ofNullable(s3KeyPrefix);
            return this;
        }
        public ReportDeliveryChannelPropertiesArgs build() {
            return new ReportDeliveryChannelPropertiesArgs(formats, s3BucketName, s3KeyPrefix);
        }
    }
}
