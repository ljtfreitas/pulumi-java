// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentInstanceFilterExclusionLabel {
    /**
     * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
     * 
     */
    private final @Nullable Map<String,String> labels;

    @OutputCustomType.Constructor({"labels"})
    private OsPolicyAssignmentInstanceFilterExclusionLabel(@Nullable Map<String,String> labels) {
        this.labels = labels;
    }

    /**
     * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterExclusionLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterExclusionLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public OsPolicyAssignmentInstanceFilterExclusionLabel build() {
            return new OsPolicyAssignmentInstanceFilterExclusionLabel(labels);
        }
    }
}
