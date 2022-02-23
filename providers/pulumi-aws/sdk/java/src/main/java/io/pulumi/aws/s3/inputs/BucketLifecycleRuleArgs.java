// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs;
import io.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs;
import io.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs;
import io.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleArgs Empty = new BucketLifecycleRuleArgs();

    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     */
    @InputImport(name="abortIncompleteMultipartUploadDays")
    private final @Nullable Input<Integer> abortIncompleteMultipartUploadDays;

    public Input<Integer> getAbortIncompleteMultipartUploadDays() {
        return this.abortIncompleteMultipartUploadDays == null ? Input.empty() : this.abortIncompleteMultipartUploadDays;
    }

    /**
     * Specifies lifecycle rule status.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Specifies a period in the object's expire (documented below).
     * 
     */
    @InputImport(name="expiration")
    private final @Nullable Input<BucketLifecycleRuleExpirationArgs> expiration;

    public Input<BucketLifecycleRuleExpirationArgs> getExpiration() {
        return this.expiration == null ? Input.empty() : this.expiration;
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Specifies when noncurrent object versions expire (documented below).
     * 
     */
    @InputImport(name="noncurrentVersionExpiration")
    private final @Nullable Input<BucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration;

    public Input<BucketLifecycleRuleNoncurrentVersionExpirationArgs> getNoncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration == null ? Input.empty() : this.noncurrentVersionExpiration;
    }

    /**
     * Specifies when noncurrent object versions transitions (documented below).
     * 
     */
    @InputImport(name="noncurrentVersionTransitions")
    private final @Nullable Input<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions;

    public Input<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> getNoncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? Input.empty() : this.noncurrentVersionTransitions;
    }

    /**
     * Object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * Specifies object tags key and value.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies a period in the object's transitions (documented below).
     * 
     */
    @InputImport(name="transitions")
    private final @Nullable Input<List<BucketLifecycleRuleTransitionArgs>> transitions;

    public Input<List<BucketLifecycleRuleTransitionArgs>> getTransitions() {
        return this.transitions == null ? Input.empty() : this.transitions;
    }

    public BucketLifecycleRuleArgs(
        @Nullable Input<Integer> abortIncompleteMultipartUploadDays,
        Input<Boolean> enabled,
        @Nullable Input<BucketLifecycleRuleExpirationArgs> expiration,
        @Nullable Input<String> id,
        @Nullable Input<BucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration,
        @Nullable Input<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions,
        @Nullable Input<String> prefix,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<BucketLifecycleRuleTransitionArgs>> transitions) {
        this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.expiration = expiration;
        this.id = id;
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        this.prefix = prefix;
        this.tags = tags;
        this.transitions = transitions;
    }

    private BucketLifecycleRuleArgs() {
        this.abortIncompleteMultipartUploadDays = Input.empty();
        this.enabled = Input.empty();
        this.expiration = Input.empty();
        this.id = Input.empty();
        this.noncurrentVersionExpiration = Input.empty();
        this.noncurrentVersionTransitions = Input.empty();
        this.prefix = Input.empty();
        this.tags = Input.empty();
        this.transitions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> abortIncompleteMultipartUploadDays;
        private Input<Boolean> enabled;
        private @Nullable Input<BucketLifecycleRuleExpirationArgs> expiration;
        private @Nullable Input<String> id;
        private @Nullable Input<BucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration;
        private @Nullable Input<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions;
        private @Nullable Input<String> prefix;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<BucketLifecycleRuleTransitionArgs>> transitions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUploadDays = defaults.abortIncompleteMultipartUploadDays;
    	      this.enabled = defaults.enabled;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
    	      this.transitions = defaults.transitions;
        }

        public Builder setAbortIncompleteMultipartUploadDays(@Nullable Input<Integer> abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }

        public Builder setAbortIncompleteMultipartUploadDays(@Nullable Integer abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = Input.ofNullable(abortIncompleteMultipartUploadDays);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setExpiration(@Nullable Input<BucketLifecycleRuleExpirationArgs> expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder setExpiration(@Nullable BucketLifecycleRuleExpirationArgs expiration) {
            this.expiration = Input.ofNullable(expiration);
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

        public Builder setNoncurrentVersionExpiration(@Nullable Input<BucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }

        public Builder setNoncurrentVersionExpiration(@Nullable BucketLifecycleRuleNoncurrentVersionExpirationArgs noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = Input.ofNullable(noncurrentVersionExpiration);
            return this;
        }

        public Builder setNoncurrentVersionTransitions(@Nullable Input<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }

        public Builder setNoncurrentVersionTransitions(@Nullable List<BucketLifecycleRuleNoncurrentVersionTransitionArgs> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = Input.ofNullable(noncurrentVersionTransitions);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
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

        public Builder setTransitions(@Nullable Input<List<BucketLifecycleRuleTransitionArgs>> transitions) {
            this.transitions = transitions;
            return this;
        }

        public Builder setTransitions(@Nullable List<BucketLifecycleRuleTransitionArgs> transitions) {
            this.transitions = Input.ofNullable(transitions);
            return this;
        }
        public BucketLifecycleRuleArgs build() {
            return new BucketLifecycleRuleArgs(abortIncompleteMultipartUploadDays, enabled, expiration, id, noncurrentVersionExpiration, noncurrentVersionTransitions, prefix, tags, transitions);
        }
    }
}
