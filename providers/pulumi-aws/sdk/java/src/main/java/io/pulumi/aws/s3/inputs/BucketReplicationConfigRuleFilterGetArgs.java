// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleFilterGetArgs Empty = new BucketReplicationConfigRuleFilterGetArgs();

    /**
     * A configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * 
     */
    @Import(name="and")
      private final @Nullable Output<BucketReplicationConfigRuleFilterAndGetArgs> and;

    public Output<BucketReplicationConfigRuleFilterAndGetArgs> getAnd() {
        return this.and == null ? Output.empty() : this.and;
    }

    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * A configuration block for specifying a tag key and value documented below.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<BucketReplicationConfigRuleFilterTagGetArgs> tag;

    public Output<BucketReplicationConfigRuleFilterTagGetArgs> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    public BucketReplicationConfigRuleFilterGetArgs(
        @Nullable Output<BucketReplicationConfigRuleFilterAndGetArgs> and,
        @Nullable Output<String> prefix,
        @Nullable Output<BucketReplicationConfigRuleFilterTagGetArgs> tag) {
        this.and = and;
        this.prefix = prefix;
        this.tag = tag;
    }

    private BucketReplicationConfigRuleFilterGetArgs() {
        this.and = Output.empty();
        this.prefix = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigRuleFilterAndGetArgs> and;
        private @Nullable Output<String> prefix;
        private @Nullable Output<BucketReplicationConfigRuleFilterTagGetArgs> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.prefix = defaults.prefix;
    	      this.tag = defaults.tag;
        }

        public Builder and(@Nullable Output<BucketReplicationConfigRuleFilterAndGetArgs> and) {
            this.and = and;
            return this;
        }

        public Builder and(@Nullable BucketReplicationConfigRuleFilterAndGetArgs and) {
            this.and = Output.ofNullable(and);
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }

        public Builder tag(@Nullable Output<BucketReplicationConfigRuleFilterTagGetArgs> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable BucketReplicationConfigRuleFilterTagGetArgs tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }
        public BucketReplicationConfigRuleFilterGetArgs build() {
            return new BucketReplicationConfigRuleFilterGetArgs(and, prefix, tag);
        }
    }
}
