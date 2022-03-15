// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigurationRuleFilter {
    /**
     * Object keyname prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    private final @Nullable String prefix;
    /**
     * A map of tags that identifies subset of objects to which the rule applies.
     * The rule applies only to objects having all the tags in its tagset.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private BucketReplicationConfigurationRuleFilter(
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    /**
     * Object keyname prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * A map of tags that identifies subset of objects to which the rule applies.
     * The rule applies only to objects having all the tags in its tagset.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prefix;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public BucketReplicationConfigurationRuleFilter build() {
            return new BucketReplicationConfigurationRuleFilter(prefix, tags);
        }
    }
}
