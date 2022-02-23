// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleActionCountCustomRequestHandlingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountCustomRequestHandlingArgs Empty = new WebAclRuleActionCountCustomRequestHandlingArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
    private final Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

    public Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public WebAclRuleActionCountCustomRequestHandlingArgs(Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private WebAclRuleActionCountCustomRequestHandlingArgs() {
        this.insertHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCountCustomRequestHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionCountCustomRequestHandlingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(Input<List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder setInsertHeaders(List<WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs> insertHeaders) {
            this.insertHeaders = Input.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public WebAclRuleActionCountCustomRequestHandlingArgs build() {
            return new WebAclRuleActionCountCustomRequestHandlingArgs(insertHeaders);
        }
    }
}
