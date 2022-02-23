// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionExpirationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionExpirationPolicyArgs Empty = new SubscriptionExpirationPolicyArgs();

    /**
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of ttl.
     * If ttl is not set, the associated resource never expires.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example - "3.5s".
     * 
     */
    @InputImport(name="ttl", required=true)
        private final Input<String> ttl;

    public Input<String> getTtl() {
        return this.ttl;
    }

    public SubscriptionExpirationPolicyArgs(Input<String> ttl) {
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
    }

    private SubscriptionExpirationPolicyArgs() {
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionExpirationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionExpirationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
        }

        public Builder setTtl(Input<String> ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Input.of(Objects.requireNonNull(ttl));
            return this;
        }
        public SubscriptionExpirationPolicyArgs build() {
            return new SubscriptionExpirationPolicyArgs(ttl);
        }
    }
}
