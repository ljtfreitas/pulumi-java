// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupCustomHTTPHeader;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupCustomRequestHandling {
    /**
     * Collection of HTTP headers.
     * 
     */
    private final List<RuleGroupCustomHTTPHeader> insertHeaders;

    @CustomType.Constructor
    private RuleGroupCustomRequestHandling(@CustomType.Parameter("insertHeaders") List<RuleGroupCustomHTTPHeader> insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    /**
     * Collection of HTTP headers.
     * 
    */
    public List<RuleGroupCustomHTTPHeader> getInsertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupCustomHTTPHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(List<RuleGroupCustomHTTPHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public RuleGroupCustomRequestHandling build() {
            return new RuleGroupCustomRequestHandling(insertHeaders);
        }
    }
}
