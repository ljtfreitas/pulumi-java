// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class PostProcessingStepResponse {
    @OutputCustomType.Constructor({})
    private PostProcessingStepResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostProcessingStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(PostProcessingStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public PostProcessingStepResponse build() {
            return new PostProcessingStepResponse();
        }
    }
}
