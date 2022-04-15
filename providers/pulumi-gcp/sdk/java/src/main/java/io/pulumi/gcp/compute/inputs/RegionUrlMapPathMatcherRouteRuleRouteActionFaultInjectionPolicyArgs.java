// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs> abort() {
        return this.abort == null ? Codegen.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs> delay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs(
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs> abort,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs() {
        this.abort = Codegen.empty();
        this.delay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs> abort;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortArgs abort) {
            this.abort = Codegen.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs(abort, delay);
        }
    }
}
