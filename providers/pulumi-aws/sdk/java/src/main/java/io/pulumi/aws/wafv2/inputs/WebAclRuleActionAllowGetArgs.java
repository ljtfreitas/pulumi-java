// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionAllowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowGetArgs Empty = new WebAclRuleActionAllowGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @InputImport(name="customRequestHandling")
    private final @Nullable Input<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

    public Input<WebAclRuleActionAllowCustomRequestHandlingGetArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public WebAclRuleActionAllowGetArgs(@Nullable Input<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclRuleActionAllowGetArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionAllowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionAllowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable Input<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder setCustomRequestHandling(@Nullable WebAclRuleActionAllowCustomRequestHandlingGetArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }
        public WebAclRuleActionAllowGetArgs build() {
            return new WebAclRuleActionAllowGetArgs(customRequestHandling);
        }
    }
}
