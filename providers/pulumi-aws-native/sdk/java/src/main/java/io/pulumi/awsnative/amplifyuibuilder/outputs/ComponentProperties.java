// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ComponentProperties {
    @CustomType.Constructor
    private ComponentProperties() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentProperties defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ComponentProperties build() {
            return new ComponentProperties();
        }
    }
}
