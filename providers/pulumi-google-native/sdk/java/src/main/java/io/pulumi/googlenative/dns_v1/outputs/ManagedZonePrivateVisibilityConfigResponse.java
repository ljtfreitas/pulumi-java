// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZonePrivateVisibilityConfigNetworkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePrivateVisibilityConfigResponse {
    private final String kind;
    private final List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks;

    @OutputCustomType.Constructor({"kind","networks"})
    private ManagedZonePrivateVisibilityConfigResponse(
        String kind,
        List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks) {
        this.kind = Objects.requireNonNull(kind);
        this.networks = Objects.requireNonNull(networks);
    }

    public String getKind() {
        return this.kind;
    }
    public List<ManagedZonePrivateVisibilityConfigNetworkResponse> getNetworks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworks(List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }

        public ManagedZonePrivateVisibilityConfigResponse build() {
            return new ManagedZonePrivateVisibilityConfigResponse(kind, networks);
        }
    }
}