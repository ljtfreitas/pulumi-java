// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchedulePolicyResponse {
    /**
     * The idle duration between replication stages.
     * 
     */
    private final String idleDuration;
    /**
     * A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM's operating system undergoes changes and adaptations to fully function on Compute Engine.
     * 
     */
    private final Boolean skipOsAdaptation;

    @CustomType.Constructor
    private SchedulePolicyResponse(
        @CustomType.Parameter("idleDuration") String idleDuration,
        @CustomType.Parameter("skipOsAdaptation") Boolean skipOsAdaptation) {
        this.idleDuration = idleDuration;
        this.skipOsAdaptation = skipOsAdaptation;
    }

    /**
     * The idle duration between replication stages.
     * 
    */
    public String getIdleDuration() {
        return this.idleDuration;
    }
    /**
     * A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM's operating system undergoes changes and adaptations to fully function on Compute Engine.
     * 
    */
    public Boolean getSkipOsAdaptation() {
        return this.skipOsAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String idleDuration;
        private Boolean skipOsAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleDuration = defaults.idleDuration;
    	      this.skipOsAdaptation = defaults.skipOsAdaptation;
        }

        public Builder idleDuration(String idleDuration) {
            this.idleDuration = Objects.requireNonNull(idleDuration);
            return this;
        }

        public Builder skipOsAdaptation(Boolean skipOsAdaptation) {
            this.skipOsAdaptation = Objects.requireNonNull(skipOsAdaptation);
            return this;
        }
        public SchedulePolicyResponse build() {
            return new SchedulePolicyResponse(idleDuration, skipOsAdaptation);
        }
    }
}
