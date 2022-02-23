// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WorkerPoolNetworkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolNetworkConfigGetArgs Empty = new WorkerPoolNetworkConfigGetArgs();

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to `WorkerPool.project_id` on the service producer network. Must be in the format `projects/{project}/global/networks/{network}`, where `{project}` is a project number, such as `12345`, and `{network}` is the name of a VPC network in the project. See (https://cloud.google.com/cloud-build/docs/custom-workers/set-up-custom-worker-pool-environment#understanding_the_network_configuration_options)
     * 
     */
    @InputImport(name="peeredNetwork", required=true)
        private final Input<String> peeredNetwork;

    public Input<String> getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public WorkerPoolNetworkConfigGetArgs(Input<String> peeredNetwork) {
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
    }

    private WorkerPoolNetworkConfigGetArgs() {
        this.peeredNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolNetworkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder setPeeredNetwork(Input<String> peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }

        public Builder setPeeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Input.of(Objects.requireNonNull(peeredNetwork));
            return this;
        }
        public WorkerPoolNetworkConfigGetArgs build() {
            return new WorkerPoolNetworkConfigGetArgs(peeredNetwork);
        }
    }
}
