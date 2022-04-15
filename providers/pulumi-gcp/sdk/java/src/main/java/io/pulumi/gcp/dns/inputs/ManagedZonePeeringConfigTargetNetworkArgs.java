// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePeeringConfigTargetNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigTargetNetworkArgs Empty = new ManagedZonePeeringConfigTargetNetworkArgs();

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    @Import(name="networkUrl", required=true)
      private final Output<String> networkUrl;

    public Output<String> networkUrl() {
        return this.networkUrl;
    }

    public ManagedZonePeeringConfigTargetNetworkArgs(Output<String> networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ManagedZonePeeringConfigTargetNetworkArgs() {
        this.networkUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder networkUrl(Output<String> networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }
        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Output.of(Objects.requireNonNull(networkUrl));
            return this;
        }        public ManagedZonePeeringConfigTargetNetworkArgs build() {
            return new ManagedZonePeeringConfigTargetNetworkArgs(networkUrl);
        }
    }
}
