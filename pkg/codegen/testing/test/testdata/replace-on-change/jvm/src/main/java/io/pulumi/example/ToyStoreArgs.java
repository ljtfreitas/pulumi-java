// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import java.util.Objects;


public final class ToyStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToyStoreArgs Empty = new ToyStoreArgs();

    public ToyStoreArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToyStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ToyStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ToyStoreArgs build() {
            return new ToyStoreArgs();
        }
    }
}
