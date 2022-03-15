// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The IAM conditions context.
 * 
 */
public final class ConditionContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionContextArgs Empty = new ConditionContextArgs();

    /**
     * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
     * 
     */
    @Import(name="accessTime")
      private final @Nullable Output<String> accessTime;

    public Output<String> getAccessTime() {
        return this.accessTime == null ? Output.empty() : this.accessTime;
    }

    public ConditionContextArgs(@Nullable Output<String> accessTime) {
        this.accessTime = accessTime;
    }

    private ConditionContextArgs() {
        this.accessTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTime = defaults.accessTime;
        }

        public Builder accessTime(@Nullable Output<String> accessTime) {
            this.accessTime = accessTime;
            return this;
        }

        public Builder accessTime(@Nullable String accessTime) {
            this.accessTime = Output.ofNullable(accessTime);
            return this;
        }
        public ConditionContextArgs build() {
            return new ConditionContextArgs(accessTime);
        }
    }
}
