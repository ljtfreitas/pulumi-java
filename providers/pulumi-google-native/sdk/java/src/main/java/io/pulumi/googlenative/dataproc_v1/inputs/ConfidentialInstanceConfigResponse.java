// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Confidential Instance Config for clusters using Confidential VMs (https://cloud.google.com/compute/confidential-vm/docs)
 * 
 */
public final class ConfidentialInstanceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfidentialInstanceConfigResponse Empty = new ConfidentialInstanceConfigResponse();

    /**
     * Optional. Defines whether the instance should have confidential compute enabled.
     * 
     */
    @Import(name="enableConfidentialCompute", required=true)
      private final Boolean enableConfidentialCompute;

    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public ConfidentialInstanceConfigResponse(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
    }

    private ConfidentialInstanceConfigResponse() {
        this.enableConfidentialCompute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }
        public ConfidentialInstanceConfigResponse build() {
            return new ConfidentialInstanceConfigResponse(enableConfidentialCompute);
        }
    }
}
