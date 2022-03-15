// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that specifies the conditions for resource expiration (i.e., automatic resource deletion).
 * 
 */
public final class ExpirationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpirationPolicyArgs Empty = new ExpirationPolicyArgs();

    /**
     * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    public ExpirationPolicyArgs(@Nullable Output<String> ttl) {
        this.ttl = ttl;
    }

    private ExpirationPolicyArgs() {
        this.ttl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpirationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpirationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
        }

        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable String ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }
        public ExpirationPolicyArgs build() {
            return new ExpirationPolicyArgs(ttl);
        }
    }
}
