// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.inputs;

import java.util.Objects;


public final class ApplicationTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationTagsArgs Empty = new ApplicationTagsArgs();

    public ApplicationTagsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ApplicationTagsArgs build() {
            return new ApplicationTagsArgs();
        }
    }
}
