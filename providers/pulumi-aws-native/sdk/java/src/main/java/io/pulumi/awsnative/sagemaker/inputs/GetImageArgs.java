// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    @Import(name="imageArn", required=true)
      private final String imageArn;

    public String getImageArn() {
        return this.imageArn;
    }

    public GetImageArgs(String imageArn) {
        this.imageArn = Objects.requireNonNull(imageArn, "expected parameter 'imageArn' to be non-null");
    }

    private GetImageArgs() {
        this.imageArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageArn = defaults.imageArn;
        }

        public Builder imageArn(String imageArn) {
            this.imageArn = Objects.requireNonNull(imageArn);
            return this;
        }
        public GetImageArgs build() {
            return new GetImageArgs(imageArn);
        }
    }
}
