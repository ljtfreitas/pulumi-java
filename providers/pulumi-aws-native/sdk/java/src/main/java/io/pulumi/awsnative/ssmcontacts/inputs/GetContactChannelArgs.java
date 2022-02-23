// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContactChannelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactChannelArgs Empty = new GetContactChannelArgs();

    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    @InputImport(name="arn", required=true)
        private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetContactChannelArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetContactChannelArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetContactChannelArgs build() {
            return new GetContactChannelArgs(arn);
        }
    }
}
