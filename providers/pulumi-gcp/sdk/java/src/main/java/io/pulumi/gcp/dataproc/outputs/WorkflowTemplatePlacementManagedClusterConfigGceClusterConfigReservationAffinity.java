// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity {
    /**
     * Optional. Type of reservation to consume Possible values: TYPE_UNSPECIFIED, NO_RESERVATION, ANY_RESERVATION, SPECIFIC_RESERVATION
     * 
     */
    private final @Nullable String consumeReservationType;
    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    private final @Nullable String key;
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"consumeReservationType","key","values"})
    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity(
        @Nullable String consumeReservationType,
        @Nullable String key,
        @Nullable List<String> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    /**
     * Optional. Type of reservation to consume Possible values: TYPE_UNSPECIFIED, NO_RESERVATION, ANY_RESERVATION, SPECIFIC_RESERVATION
     * 
     */
    public Optional<String> getConsumeReservationType() {
        return Optional.ofNullable(this.consumeReservationType);
    }
    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumeReservationType;
        private @Nullable String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(@Nullable String consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity(consumeReservationType, key, values);
        }
    }
}
