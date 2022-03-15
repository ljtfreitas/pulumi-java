// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RRSetRoutingPolicyWrrPolicyResponse {
    private final List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items;
    private final String kind;

    @CustomType.Constructor
    private RRSetRoutingPolicyWrrPolicyResponse(
        @CustomType.Parameter("items") List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items,
        @CustomType.Parameter("kind") String kind) {
        this.items = items;
        this.kind = kind;
    }

    public List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> getItems() {
        return this.items;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder items(List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public RRSetRoutingPolicyWrrPolicyResponse build() {
            return new RRSetRoutingPolicyWrrPolicyResponse(items, kind);
        }
    }
}
