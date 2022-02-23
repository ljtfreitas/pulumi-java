// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs.OverheadArgs;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs.SchedulingArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 * 
 */
public final class RuntimeClassSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeClassSpecArgs Empty = new RuntimeClassSpecArgs();

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    @InputImport(name="overhead")
        private final @Nullable Input<OverheadArgs> overhead;

    public Input<OverheadArgs> getOverhead() {
        return this.overhead == null ? Input.empty() : this.overhead;
    }

    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    @InputImport(name="runtimeHandler", required=true)
        private final Input<String> runtimeHandler;

    public Input<String> getRuntimeHandler() {
        return this.runtimeHandler;
    }

    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    @InputImport(name="scheduling")
        private final @Nullable Input<SchedulingArgs> scheduling;

    public Input<SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    public RuntimeClassSpecArgs(
        @Nullable Input<OverheadArgs> overhead,
        Input<String> runtimeHandler,
        @Nullable Input<SchedulingArgs> scheduling) {
        this.overhead = overhead;
        this.runtimeHandler = Objects.requireNonNull(runtimeHandler, "expected parameter 'runtimeHandler' to be non-null");
        this.scheduling = scheduling;
    }

    private RuntimeClassSpecArgs() {
        this.overhead = Input.empty();
        this.runtimeHandler = Input.empty();
        this.scheduling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OverheadArgs> overhead;
        private Input<String> runtimeHandler;
        private @Nullable Input<SchedulingArgs> scheduling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overhead = defaults.overhead;
    	      this.runtimeHandler = defaults.runtimeHandler;
    	      this.scheduling = defaults.scheduling;
        }

        public Builder setOverhead(@Nullable Input<OverheadArgs> overhead) {
            this.overhead = overhead;
            return this;
        }

        public Builder setOverhead(@Nullable OverheadArgs overhead) {
            this.overhead = Input.ofNullable(overhead);
            return this;
        }

        public Builder setRuntimeHandler(Input<String> runtimeHandler) {
            this.runtimeHandler = Objects.requireNonNull(runtimeHandler);
            return this;
        }

        public Builder setRuntimeHandler(String runtimeHandler) {
            this.runtimeHandler = Input.of(Objects.requireNonNull(runtimeHandler));
            return this;
        }

        public Builder setScheduling(@Nullable Input<SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable SchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }
        public RuntimeClassSpecArgs build() {
            return new RuntimeClassSpecArgs(overhead, runtimeHandler, scheduling);
        }
    }
}
