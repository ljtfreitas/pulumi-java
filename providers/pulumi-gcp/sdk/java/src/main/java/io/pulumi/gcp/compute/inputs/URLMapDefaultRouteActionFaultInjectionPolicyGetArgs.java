// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyGetArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyGetArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @InputImport(name="abort")
        private final @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;

    public Input<URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs> getAbort() {
        return this.abort == null ? Input.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="delay")
        private final @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

    public Input<URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs> getDelay() {
        return this.delay == null ? Input.empty() : this.delay;
    }

    public URLMapDefaultRouteActionFaultInjectionPolicyGetArgs(
        @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort,
        @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyGetArgs() {
        this.abort = Input.empty();
        this.delay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort;
        private @Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder setAbort(@Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs> abort) {
            this.abort = abort;
            return this;
        }

        public Builder setAbort(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs abort) {
            this.abort = Input.ofNullable(abort);
            return this;
        }

        public Builder setDelay(@Nullable Input<URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDelay(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs delay) {
            this.delay = Input.ofNullable(delay);
            return this;
        }
        public URLMapDefaultRouteActionFaultInjectionPolicyGetArgs build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyGetArgs(abort, delay);
        }
    }
}
