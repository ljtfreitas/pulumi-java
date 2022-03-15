// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResponsePolicyNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResponsePolicyNetworkResponse Empty = new ResponsePolicyNetworkResponse();

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl", required=true)
      private final String networkUrl;

    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public ResponsePolicyNetworkResponse(
        String kind,
        String networkUrl) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ResponsePolicyNetworkResponse() {
        this.kind = null;
        this.networkUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }
        public ResponsePolicyNetworkResponse build() {
            return new ResponsePolicyNetworkResponse(kind, networkUrl);
        }
    }
}
