// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import java.util.Objects;


public final class ComponentBindingProperties extends io.pulumi.resources.InvokeArgs {

    public static final ComponentBindingProperties Empty = new ComponentBindingProperties();

    public ComponentBindingProperties() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentBindingProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentBindingProperties defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ComponentBindingProperties build() {
            return new ComponentBindingProperties();
        }
    }
}
