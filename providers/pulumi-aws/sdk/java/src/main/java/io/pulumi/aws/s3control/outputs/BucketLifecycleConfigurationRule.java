// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.aws.s3control.outputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload;
import io.pulumi.aws.s3control.outputs.BucketLifecycleConfigurationRuleExpiration;
import io.pulumi.aws.s3control.outputs.BucketLifecycleConfigurationRuleFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleConfigurationRule {
    /**
     * Configuration block containing settings for abort incomplete multipart upload.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
    /**
     * Configuration block containing settings for expiration of objects.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationRuleExpiration expiration;
    /**
     * Configuration block containing settings for filtering.
     * 
     */
    private final @Nullable BucketLifecycleConfigurationRuleFilter filter;
    /**
     * Unique identifier for the rule.
     * 
     */
    private final String id;
    /**
     * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private BucketLifecycleConfigurationRule(
        @CustomType.Parameter("abortIncompleteMultipartUpload") @Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload,
        @CustomType.Parameter("expiration") @Nullable BucketLifecycleConfigurationRuleExpiration expiration,
        @CustomType.Parameter("filter") @Nullable BucketLifecycleConfigurationRuleFilter filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("status") @Nullable String status) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expiration = expiration;
        this.filter = filter;
        this.id = id;
        this.status = status;
    }

    /**
     * Configuration block containing settings for abort incomplete multipart upload.
     * 
    */
    public Optional<BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload> getAbortIncompleteMultipartUpload() {
        return Optional.ofNullable(this.abortIncompleteMultipartUpload);
    }
    /**
     * Configuration block containing settings for expiration of objects.
     * 
    */
    public Optional<BucketLifecycleConfigurationRuleExpiration> getExpiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * Configuration block containing settings for filtering.
     * 
    */
    public Optional<BucketLifecycleConfigurationRuleFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Unique identifier for the rule.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        private @Nullable BucketLifecycleConfigurationRuleExpiration expiration;
        private @Nullable BucketLifecycleConfigurationRuleFilter filter;
        private String id;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expiration = defaults.expiration;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }

        public Builder expiration(@Nullable BucketLifecycleConfigurationRuleExpiration expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder filter(@Nullable BucketLifecycleConfigurationRuleFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public BucketLifecycleConfigurationRule build() {
            return new BucketLifecycleConfigurationRule(abortIncompleteMultipartUpload, expiration, filter, id, status);
        }
    }
}
