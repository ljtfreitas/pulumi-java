// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RRSetRoutingPolicyGeoPolicyResponse {
    /**
     * The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead.
     * 
     */
    private final List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items;
    private final String kind;

    @OutputCustomType.Constructor({"items","kind"})
    private RRSetRoutingPolicyGeoPolicyResponse(
        List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items,
        String kind) {
        this.items = Objects.requireNonNull(items);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead.
     * 
     */
    public List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> getItems() {
        return this.items;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder setItems(List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public RRSetRoutingPolicyGeoPolicyResponse build() {
            return new RRSetRoutingPolicyGeoPolicyResponse(items, kind);
        }
    }
}
