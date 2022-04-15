// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> nanos() {
        return this.nanos == null ? Codegen.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @Import(name="seconds")
      private final @Nullable Output<String> seconds;

    public Output<String> seconds() {
        return this.seconds == null ? Codegen.empty() : this.seconds;
    }

    public URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs(
        @Nullable Output<Integer> nanos,
        @Nullable Output<String> seconds) {
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs() {
        this.nanos = Codegen.empty();
        this.seconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<String> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Codegen.ofNullable(nanos);
            return this;
        }
        public Builder seconds(@Nullable Output<String> seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder seconds(@Nullable String seconds) {
            this.seconds = Codegen.ofNullable(seconds);
            return this;
        }        public URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs(nanos, seconds);
        }
    }
}
