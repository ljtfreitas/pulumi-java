// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import java.util.Objects;


public final class ComponentOverrides extends io.pulumi.resources.InvokeArgs {

    public static final ComponentOverrides Empty = new ComponentOverrides();

    public ComponentOverrides() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentOverrides defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentOverrides defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ComponentOverrides build() {
            return new ComponentOverrides();
        }
    }
}
