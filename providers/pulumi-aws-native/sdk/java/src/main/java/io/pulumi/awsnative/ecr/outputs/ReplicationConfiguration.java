// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.awsnative.ecr.outputs.ReplicationConfigurationReplicationRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReplicationConfiguration {
    /**
     * An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
     * 
     */
    private final List<ReplicationConfigurationReplicationRule> rules;

    @OutputCustomType.Constructor
    private ReplicationConfiguration(@OutputCustomType.Parameter("rules") List<ReplicationConfigurationReplicationRule> rules) {
        this.rules = rules;
    }

    /**
     * An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
     * 
    */
    public List<ReplicationConfigurationReplicationRule> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReplicationConfigurationReplicationRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(List<ReplicationConfigurationReplicationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public ReplicationConfiguration build() {
            return new ReplicationConfiguration(rules);
        }
    }
}
