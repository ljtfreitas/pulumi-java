// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs();

    /**
     * Optional. Type of reservation to consume Possible values: TYPE_UNSPECIFIED, NO_RESERVATION, ANY_RESERVATION, SPECIFIC_RESERVATION
     * 
     */
    @Import(name="consumeReservationType")
      private final @Nullable Output<String> consumeReservationType;

    public Output<String> getConsumeReservationType() {
        return this.consumeReservationType == null ? Output.empty() : this.consumeReservationType;
    }

    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs(
        @Nullable Output<String> consumeReservationType,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs() {
        this.consumeReservationType = Output.empty();
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> consumeReservationType;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(@Nullable Output<String> consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder consumeReservationType(@Nullable String consumeReservationType) {
            this.consumeReservationType = Output.ofNullable(consumeReservationType);
            return this;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs(consumeReservationType, key, values);
        }
    }
}
