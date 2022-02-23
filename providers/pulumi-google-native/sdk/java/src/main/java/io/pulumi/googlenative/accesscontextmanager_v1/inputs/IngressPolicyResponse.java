// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressFromResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressToResponse;
import java.util.Objects;


/**
 * Policy for ingress into ServicePerimeter. IngressPolicies match requests based on `ingress_from` and `ingress_to` stanzas. For an ingress policy to match, both the `ingress_from` and `ingress_to` stanzas must be matched. If an IngressPolicy matches a request, the request is allowed through the perimeter boundary from outside the perimeter. For example, access from the internet can be allowed either based on an AccessLevel or, for traffic hosted on Google Cloud, the project of the source network. For access from private networks, using the project of the hosting network is required. Individual ingress policies can be limited by restricting which services and/or actions they match using the `ingress_to` field.
 * 
 */
public final class IngressPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressPolicyResponse Empty = new IngressPolicyResponse();

    /**
     * Defines the conditions on the source of a request causing this IngressPolicy to apply.
     * 
     */
    @InputImport(name="ingressFrom", required=true)
      private final IngressFromResponse ingressFrom;

    public IngressFromResponse getIngressFrom() {
        return this.ingressFrom;
    }

    /**
     * Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply.
     * 
     */
    @InputImport(name="ingressTo", required=true)
      private final IngressToResponse ingressTo;

    public IngressToResponse getIngressTo() {
        return this.ingressTo;
    }

    public IngressPolicyResponse(
        IngressFromResponse ingressFrom,
        IngressToResponse ingressTo) {
        this.ingressFrom = Objects.requireNonNull(ingressFrom, "expected parameter 'ingressFrom' to be non-null");
        this.ingressTo = Objects.requireNonNull(ingressTo, "expected parameter 'ingressTo' to be non-null");
    }

    private IngressPolicyResponse() {
        this.ingressFrom = null;
        this.ingressTo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressFromResponse ingressFrom;
        private IngressToResponse ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(IngressFromResponse ingressFrom) {
            this.ingressFrom = Objects.requireNonNull(ingressFrom);
            return this;
        }

        public Builder setIngressTo(IngressToResponse ingressTo) {
            this.ingressTo = Objects.requireNonNull(ingressTo);
            return this;
        }
        public IngressPolicyResponse build() {
            return new IngressPolicyResponse(ingressFrom, ingressTo);
        }
    }
}
