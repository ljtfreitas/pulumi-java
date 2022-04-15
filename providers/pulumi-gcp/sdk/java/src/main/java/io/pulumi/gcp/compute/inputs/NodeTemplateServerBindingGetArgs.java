// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class NodeTemplateServerBindingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateServerBindingGetArgs Empty = new NodeTemplateServerBindingGetArgs();

    /**
     * Type of server binding policy. If `RESTART_NODE_ON_ANY_SERVER`,
     * nodes using this template will restart on any physical server
     * following a maintenance event.
     * If `RESTART_NODE_ON_MINIMAL_SERVER`, nodes using this template
     * will restart on the same physical server following a maintenance
     * event, instead of being live migrated to or restarted on a new
     * physical server. This option may be useful if you are using
     * software licenses tied to the underlying server characteristics
     * such as physical sockets or cores, to avoid the need for
     * additional licenses when maintenance occurs. However, VMs on such
     * nodes will experience outages while maintenance is applied.
     * Possible values are `RESTART_NODE_ON_ANY_SERVER` and `RESTART_NODE_ON_MINIMAL_SERVERS`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public NodeTemplateServerBindingGetArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodeTemplateServerBindingGetArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateServerBindingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateServerBindingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public NodeTemplateServerBindingGetArgs build() {
            return new NodeTemplateServerBindingGetArgs(type);
        }
    }
}
