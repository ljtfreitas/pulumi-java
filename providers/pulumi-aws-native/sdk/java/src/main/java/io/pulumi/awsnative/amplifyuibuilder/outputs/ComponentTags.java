// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ComponentTags {
    @OutputCustomType.Constructor({})
    private ComponentTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentTags defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ComponentTags build() {
            return new ComponentTags();
        }
    }
}