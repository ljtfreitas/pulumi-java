// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ResiliencyPolicyTagMap {
    @OutputCustomType.Constructor({})
    private ResiliencyPolicyTagMap() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResiliencyPolicyTagMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ResiliencyPolicyTagMap defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ResiliencyPolicyTagMap build() {
            return new ResiliencyPolicyTagMap();
        }
    }
}
