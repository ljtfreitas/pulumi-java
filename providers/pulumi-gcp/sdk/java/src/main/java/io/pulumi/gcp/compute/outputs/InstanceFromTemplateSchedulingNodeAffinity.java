// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InstanceFromTemplateSchedulingNodeAffinity {
    private final String key;
    private final String operator;
    private final List<String> values;

    @CustomType.Constructor
    private InstanceFromTemplateSchedulingNodeAffinity(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    public String getKey() {
        return this.key;
    }
    public String getOperator() {
        return this.operator;
    }
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateSchedulingNodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateSchedulingNodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public InstanceFromTemplateSchedulingNodeAffinity build() {
            return new InstanceFromTemplateSchedulingNodeAffinity(key, operator, values);
        }
    }
}
