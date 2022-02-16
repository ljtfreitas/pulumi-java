// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionArgs;
import io.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusArgs Empty = new DomainMappingStatusArgs();

    @InputImport(name="conditions")
    private final @Nullable Input<List<DomainMappingStatusConditionArgs>> conditions;

    public Input<List<DomainMappingStatusConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="mappedRouteName")
    private final @Nullable Input<String> mappedRouteName;

    public Input<String> getMappedRouteName() {
        return this.mappedRouteName == null ? Input.empty() : this.mappedRouteName;
    }

    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    @InputImport(name="resourceRecords")
    private final @Nullable Input<List<DomainMappingStatusResourceRecordArgs>> resourceRecords;

    public Input<List<DomainMappingStatusResourceRecordArgs>> getResourceRecords() {
        return this.resourceRecords == null ? Input.empty() : this.resourceRecords;
    }

    public DomainMappingStatusArgs(
        @Nullable Input<List<DomainMappingStatusConditionArgs>> conditions,
        @Nullable Input<String> mappedRouteName,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<List<DomainMappingStatusResourceRecordArgs>> resourceRecords) {
        this.conditions = conditions;
        this.mappedRouteName = mappedRouteName;
        this.observedGeneration = observedGeneration;
        this.resourceRecords = resourceRecords;
    }

    private DomainMappingStatusArgs() {
        this.conditions = Input.empty();
        this.mappedRouteName = Input.empty();
        this.observedGeneration = Input.empty();
        this.resourceRecords = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DomainMappingStatusConditionArgs>> conditions;
        private @Nullable Input<String> mappedRouteName;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<List<DomainMappingStatusResourceRecordArgs>> resourceRecords;

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

        public Builder setConditions(@Nullable Input<List<DomainMappingStatusConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<DomainMappingStatusConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setMappedRouteName(@Nullable Input<String> mappedRouteName) {
            this.mappedRouteName = mappedRouteName;
            return this;
        }

        public Builder setMappedRouteName(@Nullable String mappedRouteName) {
            this.mappedRouteName = Input.ofNullable(mappedRouteName);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setResourceRecords(@Nullable Input<List<DomainMappingStatusResourceRecordArgs>> resourceRecords) {
            this.resourceRecords = resourceRecords;
            return this;
        }

        public Builder setResourceRecords(@Nullable List<DomainMappingStatusResourceRecordArgs> resourceRecords) {
            this.resourceRecords = Input.ofNullable(resourceRecords);
            return this;
        }

        public DomainMappingStatusArgs build() {
            return new DomainMappingStatusArgs(conditions, mappedRouteName, observedGeneration, resourceRecords);
        }
    }
}