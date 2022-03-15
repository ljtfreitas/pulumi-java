// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOutpostInstanceTypesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOutpostInstanceTypesArgs Empty = new GetOutpostInstanceTypesArgs();

    /**
     * Outpost Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetOutpostInstanceTypesArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetOutpostInstanceTypesArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostInstanceTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostInstanceTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetOutpostInstanceTypesArgs build() {
            return new GetOutpostInstanceTypesArgs(arn);
        }
    }
}
