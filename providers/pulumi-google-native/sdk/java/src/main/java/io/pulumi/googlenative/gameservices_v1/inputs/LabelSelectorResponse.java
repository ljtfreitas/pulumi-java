// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The label selector, used to group labels on the resources.
 * 
 */
public final class LabelSelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelSelectorResponse Empty = new LabelSelectorResponse();

    /**
     * Resource labels for this selector.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    public LabelSelectorResponse(Map<String,String> labels) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private LabelSelectorResponse() {
        this.labels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public LabelSelectorResponse build() {
            return new LabelSelectorResponse(labels);
        }
    }
}
