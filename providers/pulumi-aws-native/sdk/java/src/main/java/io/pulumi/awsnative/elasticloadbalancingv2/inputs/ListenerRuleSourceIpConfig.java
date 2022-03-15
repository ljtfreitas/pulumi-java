// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleSourceIpConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerRuleSourceIpConfig Empty = new ListenerRuleSourceIpConfig();

    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public ListenerRuleSourceIpConfig(@Nullable List<String> values) {
        this.values = values;
    }

    private ListenerRuleSourceIpConfig() {
        this.values = List.of();
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

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleSourceIpConfig build() {
            return new ListenerRuleSourceIpConfig(values);
        }
    }
}
