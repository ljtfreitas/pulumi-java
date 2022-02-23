// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse;
import java.util.List;
import java.util.Objects;


public final class SecurityPolicyRuleHttpHeaderActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleHttpHeaderActionResponse Empty = new SecurityPolicyRuleHttpHeaderActionResponse();

    /**
     * The list of request headers to add or overwrite if they're already present.
     * 
     */
    @InputImport(name="requestHeadersToAdds", required=true)
      private final List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

    public List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds;
    }

    public SecurityPolicyRuleHttpHeaderActionResponse(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
        this.requestHeadersToAdds = Objects.requireNonNull(requestHeadersToAdds, "expected parameter 'requestHeadersToAdds' to be non-null");
    }

    private SecurityPolicyRuleHttpHeaderActionResponse() {
        this.requestHeadersToAdds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
        }

        public Builder setRequestHeadersToAdds(List<SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse> requestHeadersToAdds) {
            this.requestHeadersToAdds = Objects.requireNonNull(requestHeadersToAdds);
            return this;
        }
        public SecurityPolicyRuleHttpHeaderActionResponse build() {
            return new SecurityPolicyRuleHttpHeaderActionResponse(requestHeadersToAdds);
        }
    }
}
