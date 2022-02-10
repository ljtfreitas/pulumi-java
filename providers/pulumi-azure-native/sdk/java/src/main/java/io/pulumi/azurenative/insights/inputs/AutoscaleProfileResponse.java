// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RecurrenceResponse;
import io.pulumi.azurenative.insights.inputs.ScaleCapacityResponse;
import io.pulumi.azurenative.insights.inputs.ScaleRuleResponse;
import io.pulumi.azurenative.insights.inputs.TimeWindowResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscaleProfileResponse Empty = new AutoscaleProfileResponse();

    @InputImport(name="capacity", required=true)
    private final ScaleCapacityResponse capacity;

    public ScaleCapacityResponse getCapacity() {
        return this.capacity;
    }

    @InputImport(name="fixedDate")
    private final @Nullable TimeWindowResponse fixedDate;

    public Optional<TimeWindowResponse> getFixedDate() {
        return this.fixedDate == null ? Optional.empty() : Optional.ofNullable(this.fixedDate);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="recurrence")
    private final @Nullable RecurrenceResponse recurrence;

    public Optional<RecurrenceResponse> getRecurrence() {
        return this.recurrence == null ? Optional.empty() : Optional.ofNullable(this.recurrence);
    }

    @InputImport(name="rules", required=true)
    private final List<ScaleRuleResponse> rules;

    public List<ScaleRuleResponse> getRules() {
        return this.rules;
    }

    public AutoscaleProfileResponse(
        ScaleCapacityResponse capacity,
        @Nullable TimeWindowResponse fixedDate,
        String name,
        @Nullable RecurrenceResponse recurrence,
        List<ScaleRuleResponse> rules) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.fixedDate = fixedDate;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.recurrence = recurrence;
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private AutoscaleProfileResponse() {
        this.capacity = null;
        this.fixedDate = null;
        this.name = null;
        this.recurrence = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleCapacityResponse capacity;
        private @Nullable TimeWindowResponse fixedDate;
        private String name;
        private @Nullable RecurrenceResponse recurrence;
        private List<ScaleRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.fixedDate = defaults.fixedDate;
    	      this.name = defaults.name;
    	      this.recurrence = defaults.recurrence;
    	      this.rules = defaults.rules;
        }

        public Builder setCapacity(ScaleCapacityResponse capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setFixedDate(@Nullable TimeWindowResponse fixedDate) {
            this.fixedDate = fixedDate;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecurrence(@Nullable RecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder setRules(List<ScaleRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public AutoscaleProfileResponse build() {
            return new AutoscaleProfileResponse(capacity, fixedDate, name, recurrence, rules);
        }
    }
}