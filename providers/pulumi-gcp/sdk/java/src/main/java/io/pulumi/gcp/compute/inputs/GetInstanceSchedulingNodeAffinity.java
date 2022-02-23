// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceSchedulingNodeAffinity extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceSchedulingNodeAffinity Empty = new GetInstanceSchedulingNodeAffinity();

    @InputImport(name="key", required=true)
        private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="operator", required=true)
        private final String operator;

    public String getOperator() {
        return this.operator;
    }

    @InputImport(name="values", required=true)
        private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GetInstanceSchedulingNodeAffinity(
        String key,
        String operator,
        List<String> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetInstanceSchedulingNodeAffinity() {
        this.key = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceSchedulingNodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceSchedulingNodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetInstanceSchedulingNodeAffinity build() {
            return new GetInstanceSchedulingNodeAffinity(key, operator, values);
        }
    }
}
