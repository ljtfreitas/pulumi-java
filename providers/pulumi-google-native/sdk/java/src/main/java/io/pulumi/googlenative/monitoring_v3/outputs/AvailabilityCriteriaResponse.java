// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class AvailabilityCriteriaResponse {
    @OutputCustomType.Constructor({})
    private AvailabilityCriteriaResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public AvailabilityCriteriaResponse build() {
            return new AvailabilityCriteriaResponse();
        }
    }
}
