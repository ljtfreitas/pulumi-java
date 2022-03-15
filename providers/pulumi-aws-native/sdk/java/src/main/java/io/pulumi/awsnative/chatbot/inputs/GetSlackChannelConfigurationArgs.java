// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.chatbot.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSlackChannelConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSlackChannelConfigurationArgs Empty = new GetSlackChannelConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of the configuration
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetSlackChannelConfigurationArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetSlackChannelConfigurationArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlackChannelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSlackChannelConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetSlackChannelConfigurationArgs build() {
            return new GetSlackChannelConfigurationArgs(arn);
        }
    }
}
