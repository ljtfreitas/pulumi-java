// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class PatchInstanceFilterGroupLabelResponse {
    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    private final Map<String,String> labels;

    @CustomType.Constructor
    private PatchInstanceFilterGroupLabelResponse(@CustomType.Parameter("labels") Map<String,String> labels) {
        this.labels = labels;
    }

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterGroupLabelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterGroupLabelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public PatchInstanceFilterGroupLabelResponse build() {
            return new PatchInstanceFilterGroupLabelResponse(labels);
        }
    }
}
