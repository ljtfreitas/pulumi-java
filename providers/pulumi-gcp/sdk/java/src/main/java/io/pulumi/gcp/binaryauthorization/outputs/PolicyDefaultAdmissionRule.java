// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyDefaultAdmissionRule {
    private final String enforcementMode;
    private final String evaluationMode;
    private final @Nullable List<String> requireAttestationsBies;

    @OutputCustomType.Constructor({"enforcementMode","evaluationMode","requireAttestationsBies"})
    private PolicyDefaultAdmissionRule(
        String enforcementMode,
        String evaluationMode,
        @Nullable List<String> requireAttestationsBies) {
        this.enforcementMode = Objects.requireNonNull(enforcementMode);
        this.evaluationMode = Objects.requireNonNull(evaluationMode);
        this.requireAttestationsBies = requireAttestationsBies;
    }

    public String getEnforcementMode() {
        return this.enforcementMode;
    }
    public String getEvaluationMode() {
        return this.evaluationMode;
    }
    public List<String> getRequireAttestationsBies() {
        return this.requireAttestationsBies == null ? List.of() : this.requireAttestationsBies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefaultAdmissionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String enforcementMode;
        private String evaluationMode;
        private @Nullable List<String> requireAttestationsBies;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefaultAdmissionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.evaluationMode = defaults.evaluationMode;
    	      this.requireAttestationsBies = defaults.requireAttestationsBies;
        }

        public Builder setEnforcementMode(String enforcementMode) {
            this.enforcementMode = Objects.requireNonNull(enforcementMode);
            return this;
        }

        public Builder setEvaluationMode(String evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }

        public Builder setRequireAttestationsBies(@Nullable List<String> requireAttestationsBies) {
            this.requireAttestationsBies = requireAttestationsBies;
            return this;
        }

        public PolicyDefaultAdmissionRule build() {
            return new PolicyDefaultAdmissionRule(enforcementMode, evaluationMode, requireAttestationsBies);
        }
    }
}