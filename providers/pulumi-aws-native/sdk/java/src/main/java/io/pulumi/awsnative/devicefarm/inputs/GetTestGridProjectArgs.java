// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTestGridProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestGridProjectArgs Empty = new GetTestGridProjectArgs();

    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetTestGridProjectArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetTestGridProjectArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestGridProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestGridProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetTestGridProjectArgs build() {
            return new GetTestGridProjectArgs(arn);
        }
    }
}
