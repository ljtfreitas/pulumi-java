// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.inputs.CidrBlockResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Configuration options for the master authorized networks feature. Enabled master authorized networks will disallow all external traffic to access Kubernetes master through HTTPS except traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
 * 
 */
public final class MasterAuthorizedNetworksConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MasterAuthorizedNetworksConfigResponse Empty = new MasterAuthorizedNetworksConfigResponse();

    /**
     * cidr_blocks define up to 10 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    @Import(name="cidrBlocks", required=true)
      private final List<CidrBlockResponse> cidrBlocks;

    public List<CidrBlockResponse> getCidrBlocks() {
        return this.cidrBlocks;
    }

    /**
     * Whether or not master authorized networks is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public MasterAuthorizedNetworksConfigResponse(
        List<CidrBlockResponse> cidrBlocks,
        Boolean enabled) {
        this.cidrBlocks = Objects.requireNonNull(cidrBlocks, "expected parameter 'cidrBlocks' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private MasterAuthorizedNetworksConfigResponse() {
        this.cidrBlocks = List.of();
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthorizedNetworksConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CidrBlockResponse> cidrBlocks;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthorizedNetworksConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(List<CidrBlockResponse> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public MasterAuthorizedNetworksConfigResponse build() {
            return new MasterAuthorizedNetworksConfigResponse(cidrBlocks, enabled);
        }
    }
}
