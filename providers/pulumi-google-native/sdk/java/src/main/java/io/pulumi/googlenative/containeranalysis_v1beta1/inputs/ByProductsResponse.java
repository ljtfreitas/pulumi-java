// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Defines an object for the byproducts field in in-toto links. The suggested fields are "stderr", "stdout", and "return-value".
 * 
 */
public final class ByProductsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ByProductsResponse Empty = new ByProductsResponse();

    @InputImport(name="customValues", required=true)
      private final Map<String,String> customValues;

    public Map<String,String> getCustomValues() {
        return this.customValues;
    }

    public ByProductsResponse(Map<String,String> customValues) {
        this.customValues = Objects.requireNonNull(customValues, "expected parameter 'customValues' to be non-null");
    }

    private ByProductsResponse() {
        this.customValues = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByProductsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ByProductsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customValues = defaults.customValues;
        }

        public Builder setCustomValues(Map<String,String> customValues) {
            this.customValues = Objects.requireNonNull(customValues);
            return this;
        }
        public ByProductsResponse build() {
            return new ByProductsResponse(customValues);
        }
    }
}
