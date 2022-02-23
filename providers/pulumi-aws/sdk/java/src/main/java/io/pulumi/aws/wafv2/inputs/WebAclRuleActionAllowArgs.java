// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowArgs Empty = new WebAclRuleActionAllowArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @InputImport(name="customRequestHandling")
    private final @Nullable Input<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

    public Input<WebAclRuleActionAllowCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public WebAclRuleActionAllowArgs(@Nullable Input<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclRuleActionAllowArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable Input<WebAclRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder setCustomRequestHandling(@Nullable WebAclRuleActionAllowCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }
        public WebAclRuleActionAllowArgs build() {
            return new WebAclRuleActionAllowArgs(customRequestHandling);
        }
    }
}
