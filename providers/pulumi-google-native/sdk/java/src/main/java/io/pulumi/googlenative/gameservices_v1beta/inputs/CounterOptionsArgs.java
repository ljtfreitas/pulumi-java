// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.inputs.CustomFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Increment a streamz counter with the specified metric and field names. Metric names should start with a '/', generally be lowercase-only, and end in "_count". Field names should not contain an initial slash. The actual exported metric names will have "/iam/policy" prepended. Field names correspond to IAM request parameters and field values are their respective values. Supported field names: - "authority", which is "[token]" if IAMContext.token is present, otherwise the value of IAMContext.authority_selector if present, and otherwise a representation of IAMContext.principal; or - "iam_principal", a representation of IAMContext.principal even if a token or authority selector is present; or - "" (empty string), resulting in a counter with no fields. Examples: counter { metric: "/debug_access_count" field: "iam_principal" } ==> increment counter /iam/policy/debug_access_count {iam_principal=[value of IAMContext.principal]}
 * 
 */
public final class CounterOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CounterOptionsArgs Empty = new CounterOptionsArgs();

    /**
     * Custom fields.
     * 
     */
    @InputImport(name="customFields")
      private final @Nullable Input<List<CustomFieldArgs>> customFields;

    public Input<List<CustomFieldArgs>> getCustomFields() {
        return this.customFields == null ? Input.empty() : this.customFields;
    }

    /**
     * The field value to attribute.
     * 
     */
    @InputImport(name="field")
      private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * The metric to update.
     * 
     */
    @InputImport(name="metric")
      private final @Nullable Input<String> metric;

    public Input<String> getMetric() {
        return this.metric == null ? Input.empty() : this.metric;
    }

    public CounterOptionsArgs(
        @Nullable Input<List<CustomFieldArgs>> customFields,
        @Nullable Input<String> field,
        @Nullable Input<String> metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    private CounterOptionsArgs() {
        this.customFields = Input.empty();
        this.field = Input.empty();
        this.metric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CounterOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomFieldArgs>> customFields;
        private @Nullable Input<String> field;
        private @Nullable Input<String> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(CounterOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder setCustomFields(@Nullable Input<List<CustomFieldArgs>> customFields) {
            this.customFields = customFields;
            return this;
        }

        public Builder setCustomFields(@Nullable List<CustomFieldArgs> customFields) {
            this.customFields = Input.ofNullable(customFields);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setMetric(@Nullable Input<String> metric) {
            this.metric = metric;
            return this;
        }

        public Builder setMetric(@Nullable String metric) {
            this.metric = Input.ofNullable(metric);
            return this;
        }
        public CounterOptionsArgs build() {
            return new CounterOptionsArgs(customFields, field, metric);
        }
    }
}
