// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupPortRange extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupPortRange Empty = new RuleGroupPortRange();

    @Import(name="fromPort", required=true)
      private final Integer fromPort;

    public Integer getFromPort() {
        return this.fromPort;
    }

    @Import(name="toPort", required=true)
      private final Integer toPort;

    public Integer getToPort() {
        return this.toPort;
    }

    public RuleGroupPortRange(
        Integer fromPort,
        Integer toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private RuleGroupPortRange() {
        this.fromPort = null;
        this.toPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public RuleGroupPortRange build() {
            return new RuleGroupPortRange(fromPort, toPort);
        }
    }
}
