// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy {
    private final @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort abort;
    private final @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay delay;

    @OutputCustomType.Constructor({"abort","delay"})
    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy(
        @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort abort,
        @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay delay) {
        this.abort = abort;
        this.delay = delay;
    }

    public Optional<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort> getAbort() {
        return Optional.ofNullable(this.abort);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay> getDelay() {
        return Optional.ofNullable(this.delay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort abort;
        private @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder setAbort(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbort abort) {
            this.abort = abort;
            return this;
        }

        public Builder setDelay(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelay delay) {
            this.delay = delay;
            return this;
        }

        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy build() {
            return new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy(abort, delay);
        }
    }
}