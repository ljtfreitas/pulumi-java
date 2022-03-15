// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.NodeConfigSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.
 * 
 */
public final class NodeConfigStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConfigStatusArgs Empty = new NodeConfigStatusArgs();

    /**
     * Active reports the checkpointed config the node is actively using. Active will represent either the current version of the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config results in an error.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<NodeConfigSourceArgs> active;

    public Output<NodeConfigSourceArgs> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    /**
     * Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the Active config by loading and validating the checkpointed payload identified by Assigned.
     * 
     */
    @Import(name="assigned")
      private final @Nullable Output<NodeConfigSourceArgs> assigned;

    public Output<NodeConfigSourceArgs> getAssigned() {
        return this.assigned == null ? Output.empty() : this.assigned;
    }

    /**
     * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
     * 
     */
    @Import(name="error")
      private final @Nullable Output<String> error;

    public Output<String> getError() {
        return this.error == null ? Output.empty() : this.error;
    }

    /**
     * LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood. Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil, because the local default config is always assumed good. You should not make assumptions about the node's method of determining config stability and correctness, as this may change or become configurable in the future.
     * 
     */
    @Import(name="lastKnownGood")
      private final @Nullable Output<NodeConfigSourceArgs> lastKnownGood;

    public Output<NodeConfigSourceArgs> getLastKnownGood() {
        return this.lastKnownGood == null ? Output.empty() : this.lastKnownGood;
    }

    public NodeConfigStatusArgs(
        @Nullable Output<NodeConfigSourceArgs> active,
        @Nullable Output<NodeConfigSourceArgs> assigned,
        @Nullable Output<String> error,
        @Nullable Output<NodeConfigSourceArgs> lastKnownGood) {
        this.active = active;
        this.assigned = assigned;
        this.error = error;
        this.lastKnownGood = lastKnownGood;
    }

    private NodeConfigStatusArgs() {
        this.active = Output.empty();
        this.assigned = Output.empty();
        this.error = Output.empty();
        this.lastKnownGood = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeConfigSourceArgs> active;
        private @Nullable Output<NodeConfigSourceArgs> assigned;
        private @Nullable Output<String> error;
        private @Nullable Output<NodeConfigSourceArgs> lastKnownGood;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.assigned = defaults.assigned;
    	      this.error = defaults.error;
    	      this.lastKnownGood = defaults.lastKnownGood;
        }

        public Builder active(@Nullable Output<NodeConfigSourceArgs> active) {
            this.active = active;
            return this;
        }

        public Builder active(@Nullable NodeConfigSourceArgs active) {
            this.active = Output.ofNullable(active);
            return this;
        }

        public Builder assigned(@Nullable Output<NodeConfigSourceArgs> assigned) {
            this.assigned = assigned;
            return this;
        }

        public Builder assigned(@Nullable NodeConfigSourceArgs assigned) {
            this.assigned = Output.ofNullable(assigned);
            return this;
        }

        public Builder error(@Nullable Output<String> error) {
            this.error = error;
            return this;
        }

        public Builder error(@Nullable String error) {
            this.error = Output.ofNullable(error);
            return this;
        }

        public Builder lastKnownGood(@Nullable Output<NodeConfigSourceArgs> lastKnownGood) {
            this.lastKnownGood = lastKnownGood;
            return this;
        }

        public Builder lastKnownGood(@Nullable NodeConfigSourceArgs lastKnownGood) {
            this.lastKnownGood = Output.ofNullable(lastKnownGood);
            return this;
        }
        public NodeConfigStatusArgs build() {
            return new NodeConfigStatusArgs(active, assigned, error, lastKnownGood);
        }
    }
}
