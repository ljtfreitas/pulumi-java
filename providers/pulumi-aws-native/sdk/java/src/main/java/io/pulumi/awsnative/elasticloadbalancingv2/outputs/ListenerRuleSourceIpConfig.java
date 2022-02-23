// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleSourceIpConfig {
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"values"})
    private ListenerRuleSourceIpConfig(@Nullable List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleSourceIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleSourceIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleSourceIpConfig build() {
            return new ListenerRuleSourceIpConfig(values);
        }
    }
}
