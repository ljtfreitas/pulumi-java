// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceProfileArgs Empty = new GetInstanceProfileArgs();

    @InputImport(name="arn", required=true)
        private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetInstanceProfileArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetInstanceProfileArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetInstanceProfileArgs build() {
            return new GetInstanceProfileArgs(arn);
        }
    }
}
