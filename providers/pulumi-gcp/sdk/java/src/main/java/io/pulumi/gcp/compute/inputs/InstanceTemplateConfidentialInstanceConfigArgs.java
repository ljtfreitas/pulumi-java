// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceTemplateConfidentialInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateConfidentialInstanceConfigArgs Empty = new InstanceTemplateConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
     */
    @Import(name="enableConfidentialCompute", required=true)
      private final Output<Boolean> enableConfidentialCompute;

    public Output<Boolean> getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public InstanceTemplateConfidentialInstanceConfigArgs(Output<Boolean> enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private InstanceTemplateConfidentialInstanceConfigArgs() {
        this.enableConfidentialCompute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Output<Boolean> enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Output.of(Objects.requireNonNull(enableConfidentialCompute));
            return this;
        }
        public InstanceTemplateConfidentialInstanceConfigArgs build() {
            return new InstanceTemplateConfidentialInstanceConfigArgs(enableConfidentialCompute);
        }
    }
}
