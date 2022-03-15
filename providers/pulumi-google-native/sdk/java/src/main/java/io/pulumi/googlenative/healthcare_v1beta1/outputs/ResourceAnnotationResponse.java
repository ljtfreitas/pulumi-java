// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceAnnotationResponse {
    /**
     * A description of the annotation record.
     * 
     */
    private final String label;

    @CustomType.Constructor
    private ResourceAnnotationResponse(@CustomType.Parameter("label") String label) {
        this.label = label;
    }

    /**
     * A description of the annotation record.
     * 
    */
    public String getLabel() {
        return this.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
        }

        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public ResourceAnnotationResponse build() {
            return new ResourceAnnotationResponse(label);
        }
    }
}
