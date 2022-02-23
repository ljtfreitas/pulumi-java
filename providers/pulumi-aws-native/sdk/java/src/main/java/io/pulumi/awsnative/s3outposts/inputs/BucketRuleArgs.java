// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.awsnative.s3outposts.enums.BucketRuleStatus;
import io.pulumi.awsnative.s3outposts.inputs.BucketAbortIncompleteMultipartUploadArgs;
import io.pulumi.awsnative.s3outposts.inputs.BucketRuleFilterPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies lifecycle rules for an Amazon S3Outposts bucket. You must specify at least one of the following: AbortIncompleteMultipartUpload, ExpirationDate, ExpirationInDays.
 * 
 */
public final class BucketRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketRuleArgs Empty = new BucketRuleArgs();

    /**
     * Specifies a lifecycle rule that stops incomplete multipart uploads to an Amazon S3Outposts bucket.
     * 
     */
    @InputImport(name="abortIncompleteMultipartUpload")
        private final @Nullable Input<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;

    public Input<BucketAbortIncompleteMultipartUploadArgs> getAbortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload == null ? Input.empty() : this.abortIncompleteMultipartUpload;
    }

    /**
     * Indicates when objects are deleted from Amazon S3Outposts. The date value must be in ISO 8601 format. The time is always midnight UTC.
     * 
     */
    @InputImport(name="expirationDate")
        private final @Nullable Input<String> expirationDate;

    public Input<String> getExpirationDate() {
        return this.expirationDate == null ? Input.empty() : this.expirationDate;
    }

    /**
     * Indicates the number of days after creation when objects are deleted from Amazon S3Outposts.
     * 
     */
    @InputImport(name="expirationInDays")
        private final @Nullable Input<Integer> expirationInDays;

    public Input<Integer> getExpirationInDays() {
        return this.expirationInDays == null ? Input.empty() : this.expirationInDays;
    }

    /**
     * The container for the filter of the lifecycle rule.
     * 
     */
    @InputImport(name="filter")
        private final @Nullable Input<BucketRuleFilterPropertiesArgs> filter;

    public Input<BucketRuleFilterPropertiesArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Unique identifier for the lifecycle rule. The value can't be longer than 255 characters.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="status")
        private final @Nullable Input<BucketRuleStatus> status;

    public Input<BucketRuleStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public BucketRuleArgs(
        @Nullable Input<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload,
        @Nullable Input<String> expirationDate,
        @Nullable Input<Integer> expirationInDays,
        @Nullable Input<BucketRuleFilterPropertiesArgs> filter,
        @Nullable Input<String> id,
        @Nullable Input<BucketRuleStatus> status) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expirationDate = expirationDate;
        this.expirationInDays = expirationInDays;
        this.filter = filter;
        this.id = id;
        this.status = status;
    }

    private BucketRuleArgs() {
        this.abortIncompleteMultipartUpload = Input.empty();
        this.expirationDate = Input.empty();
        this.expirationInDays = Input.empty();
        this.filter = Input.empty();
        this.id = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload;
        private @Nullable Input<String> expirationDate;
        private @Nullable Input<Integer> expirationInDays;
        private @Nullable Input<BucketRuleFilterPropertiesArgs> filter;
        private @Nullable Input<String> id;
        private @Nullable Input<BucketRuleStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder setAbortIncompleteMultipartUpload(@Nullable Input<BucketAbortIncompleteMultipartUploadArgs> abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        public Builder setAbortIncompleteMultipartUpload(@Nullable BucketAbortIncompleteMultipartUploadArgs abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = Input.ofNullable(abortIncompleteMultipartUpload);
            return this;
        }

        public Builder setExpirationDate(@Nullable Input<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = Input.ofNullable(expirationDate);
            return this;
        }

        public Builder setExpirationInDays(@Nullable Input<Integer> expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        public Builder setExpirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = Input.ofNullable(expirationInDays);
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketRuleFilterPropertiesArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketRuleFilterPropertiesArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setStatus(@Nullable Input<BucketRuleStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable BucketRuleStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public BucketRuleArgs build() {
            return new BucketRuleArgs(abortIncompleteMultipartUpload, expirationDate, expirationInDays, filter, id, status);
        }
    }
}
