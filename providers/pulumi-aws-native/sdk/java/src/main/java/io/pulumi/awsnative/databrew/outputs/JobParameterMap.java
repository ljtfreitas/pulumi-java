// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class JobParameterMap {
    @CustomType.Constructor
    private JobParameterMap() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobParameterMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(JobParameterMap defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public JobParameterMap build() {
            return new JobParameterMap();
        }
    }
}
