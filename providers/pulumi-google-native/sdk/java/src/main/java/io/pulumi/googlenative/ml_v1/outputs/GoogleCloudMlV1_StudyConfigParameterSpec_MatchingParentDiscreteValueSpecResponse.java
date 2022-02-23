// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse {
    /**
     * Matches values of the parent parameter with type 'DISCRETE'. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    private final List<Double> values;

    @OutputCustomType.Constructor({"values"})
    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse(List<Double> values) {
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Matches values of the parent parameter with type 'DISCRETE'. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    public List<Double> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Double> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse(values);
        }
    }
}
