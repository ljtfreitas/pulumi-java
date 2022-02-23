// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NfsLocationOnPremConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsLocationOnPremConfigGetArgs Empty = new NfsLocationOnPremConfigGetArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
     * 
     */
    @InputImport(name="agentArns", required=true)
    private final Input<List<String>> agentArns;

    public Input<List<String>> getAgentArns() {
        return this.agentArns;
    }

    public NfsLocationOnPremConfigGetArgs(Input<List<String>> agentArns) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
    }

    private NfsLocationOnPremConfigGetArgs() {
        this.agentArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsLocationOnPremConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> agentArns;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsLocationOnPremConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
        }

        public Builder setAgentArns(Input<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }

        public Builder setAgentArns(List<String> agentArns) {
            this.agentArns = Input.of(Objects.requireNonNull(agentArns));
            return this;
        }
        public NfsLocationOnPremConfigGetArgs build() {
            return new NfsLocationOnPremConfigGetArgs(agentArns);
        }
    }
}
