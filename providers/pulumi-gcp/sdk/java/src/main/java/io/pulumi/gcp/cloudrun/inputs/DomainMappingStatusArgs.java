// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionArgs;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusArgs Empty = new DomainMappingStatusArgs();

    @Import(name="conditions")
      private final @Nullable Output<List<DomainMappingStatusConditionArgs>> conditions;

    public Output<List<DomainMappingStatusConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    @Import(name="mappedRouteName")
      private final @Nullable Output<String> mappedRouteName;

    public Output<String> getMappedRouteName() {
        return this.mappedRouteName == null ? Output.empty() : this.mappedRouteName;
    }

    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Output.empty() : this.observedGeneration;
    }

    @Import(name="resourceRecords")
      private final @Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords;

    public Output<List<DomainMappingStatusResourceRecordArgs>> getResourceRecords() {
        return this.resourceRecords == null ? Output.empty() : this.resourceRecords;
    }

    public DomainMappingStatusArgs(
        @Nullable Output<List<DomainMappingStatusConditionArgs>> conditions,
        @Nullable Output<String> mappedRouteName,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords) {
        this.conditions = conditions;
        this.mappedRouteName = mappedRouteName;
        this.observedGeneration = observedGeneration;
        this.resourceRecords = resourceRecords;
    }

    private DomainMappingStatusArgs() {
        this.conditions = Output.empty();
        this.mappedRouteName = Output.empty();
        this.observedGeneration = Output.empty();
        this.resourceRecords = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DomainMappingStatusConditionArgs>> conditions;
        private @Nullable Output<String> mappedRouteName;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.mappedRouteName = defaults.mappedRouteName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.resourceRecords = defaults.resourceRecords;
        }

        public Builder conditions(@Nullable Output<List<DomainMappingStatusConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<DomainMappingStatusConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }

        public Builder mappedRouteName(@Nullable Output<String> mappedRouteName) {
            this.mappedRouteName = mappedRouteName;
            return this;
        }

        public Builder mappedRouteName(@Nullable String mappedRouteName) {
            this.mappedRouteName = Output.ofNullable(mappedRouteName);
            return this;
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Output.ofNullable(observedGeneration);
            return this;
        }

        public Builder resourceRecords(@Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords) {
            this.resourceRecords = resourceRecords;
            return this;
        }

        public Builder resourceRecords(@Nullable List<DomainMappingStatusResourceRecordArgs> resourceRecords) {
            this.resourceRecords = Output.ofNullable(resourceRecords);
            return this;
        }
        public DomainMappingStatusArgs build() {
            return new DomainMappingStatusArgs(conditions, mappedRouteName, observedGeneration, resourceRecords);
        }
    }
}
