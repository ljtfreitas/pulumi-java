// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ExperimentTemplateTargetMap {
    @CustomType.Constructor
    private ExperimentTemplateTargetMap() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateTargetMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTemplateTargetMap defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ExperimentTemplateTargetMap build() {
            return new ExperimentTemplateTargetMap();
        }
    }
}
