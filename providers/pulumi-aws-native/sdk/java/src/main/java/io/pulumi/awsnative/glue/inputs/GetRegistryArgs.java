// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistryArgs Empty = new GetRegistryArgs();

    /**
     * Amazon Resource Name for the created Registry.
     * 
     */
    @InputImport(name="arn", required=true)
        private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetRegistryArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetRegistryArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetRegistryArgs build() {
            return new GetRegistryArgs(arn);
        }
    }
}
