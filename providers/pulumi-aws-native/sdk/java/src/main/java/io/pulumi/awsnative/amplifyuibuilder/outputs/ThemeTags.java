// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ThemeTags {
    @CustomType.Constructor
    private ThemeTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ThemeTags build() {
            return new ThemeTags();
        }
    }
}
