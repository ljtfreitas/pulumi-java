// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionAllowArgs Empty = new WebAclDefaultActionAllowArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
      private final @Nullable Output<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling;

    public Output<WebAclDefaultActionAllowCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Output.empty() : this.customRequestHandling;
    }

    public WebAclDefaultActionAllowArgs(@Nullable Output<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclDefaultActionAllowArgs() {
        this.customRequestHandling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<WebAclDefaultActionAllowCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(@Nullable WebAclDefaultActionAllowCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Output.ofNullable(customRequestHandling);
            return this;
        }
        public WebAclDefaultActionAllowArgs build() {
            return new WebAclDefaultActionAllowArgs(customRequestHandling);
        }
    }
}
