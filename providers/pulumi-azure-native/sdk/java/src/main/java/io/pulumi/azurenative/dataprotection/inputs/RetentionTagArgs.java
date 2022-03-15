// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Retention tag
 * 
 */
public final class RetentionTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionTagArgs Empty = new RetentionTagArgs();

    /**
     * Retention Tag Name to relate it to retention rule.
     * 
     */
    @Import(name="tagName", required=true)
      private final Output<String> tagName;

    public Output<String> getTagName() {
        return this.tagName;
    }

    public RetentionTagArgs(Output<String> tagName) {
        this.tagName = Objects.requireNonNull(tagName, "expected parameter 'tagName' to be non-null");
    }

    private RetentionTagArgs() {
        this.tagName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagName = defaults.tagName;
        }

        public Builder tagName(Output<String> tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }

        public Builder tagName(String tagName) {
            this.tagName = Output.of(Objects.requireNonNull(tagName));
            return this;
        }
        public RetentionTagArgs build() {
            return new RetentionTagArgs(tagName);
        }
    }
}
