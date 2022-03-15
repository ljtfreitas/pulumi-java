// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudbuild_v1.enums.NetworkConfigEgressOption;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the network configuration for the pool.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Option to configure network egress for the workers.
     * 
     */
    @Import(name="egressOption")
      private final @Nullable Output<NetworkConfigEgressOption> egressOption;

    public Output<NetworkConfigEgressOption> getEgressOption() {
        return this.egressOption == null ? Output.empty() : this.egressOption;
    }

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to `WorkerPool.project_id` on the service producer network. Must be in the format `projects/{project}/global/networks/{network}`, where `{project}` is a project number, such as `12345`, and `{network}` is the name of a VPC network in the project. See [Understanding network configuration options](https://cloud.google.com/build/docs/private-pools/set-up-private-pool-environment)
     * 
     */
    @Import(name="peeredNetwork", required=true)
      private final Output<String> peeredNetwork;

    public Output<String> getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public NetworkConfigArgs(
        @Nullable Output<NetworkConfigEgressOption> egressOption,
        Output<String> peeredNetwork) {
        this.egressOption = egressOption;
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
    }

    private NetworkConfigArgs() {
        this.egressOption = Output.empty();
        this.peeredNetwork = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NetworkConfigEgressOption> egressOption;
        private Output<String> peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressOption = defaults.egressOption;
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder egressOption(@Nullable Output<NetworkConfigEgressOption> egressOption) {
            this.egressOption = egressOption;
            return this;
        }

        public Builder egressOption(@Nullable NetworkConfigEgressOption egressOption) {
            this.egressOption = Output.ofNullable(egressOption);
            return this;
        }

        public Builder peeredNetwork(Output<String> peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }

        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Output.of(Objects.requireNonNull(peeredNetwork));
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(egressOption, peeredNetwork);
        }
    }
}
