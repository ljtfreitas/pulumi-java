// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.PriorityLevelConfigurationCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PriorityLevelConfigurationStatus {
    /**
     * `conditions` is the current state of "request-priority".
     * 
     */
    private final @Nullable List<PriorityLevelConfigurationCondition> conditions;

    @CustomType.Constructor
    private PriorityLevelConfigurationStatus(@CustomType.Parameter("conditions") @Nullable List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * `conditions` is the current state of "request-priority".
     * 
    */
    public List<PriorityLevelConfigurationCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PriorityLevelConfigurationCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable List<PriorityLevelConfigurationCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public PriorityLevelConfigurationStatus build() {
            return new PriorityLevelConfigurationStatus(conditions);
        }
    }
}
