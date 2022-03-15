// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoggingConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoggingConfigurationArgs Empty = new GetLoggingConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final String resourceArn;

    public String getResourceArn() {
        return this.resourceArn;
    }

    public GetLoggingConfigurationArgs(String resourceArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private GetLoggingConfigurationArgs() {
        this.resourceArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public GetLoggingConfigurationArgs build() {
            return new GetLoggingConfigurationArgs(resourceArn);
        }
    }
}
