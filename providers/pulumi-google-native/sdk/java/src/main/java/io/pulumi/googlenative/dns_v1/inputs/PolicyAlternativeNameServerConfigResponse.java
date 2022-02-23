// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.inputs.PolicyAlternativeNameServerConfigTargetNameServerResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PolicyAlternativeNameServerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolicyAlternativeNameServerConfigResponse Empty = new PolicyAlternativeNameServerConfigResponse();

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @InputImport(name="targetNameServers", required=true)
      private final List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers;

    public List<PolicyAlternativeNameServerConfigTargetNameServerResponse> getTargetNameServers() {
        return this.targetNameServers;
    }

    public PolicyAlternativeNameServerConfigResponse(
        String kind,
        List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.targetNameServers = Objects.requireNonNull(targetNameServers, "expected parameter 'targetNameServers' to be non-null");
    }

    private PolicyAlternativeNameServerConfigResponse() {
        this.kind = null;
        this.targetNameServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setTargetNameServers(List<PolicyAlternativeNameServerConfigTargetNameServerResponse> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }
        public PolicyAlternativeNameServerConfigResponse build() {
            return new PolicyAlternativeNameServerConfigResponse(kind, targetNameServers);
        }
    }
}
