// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleHttpHeaderConfig {
    private final @Nullable String httpHeaderName;
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ListenerRuleHttpHeaderConfig(
        @CustomType.Parameter("httpHeaderName") @Nullable String httpHeaderName,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.httpHeaderName = httpHeaderName;
        this.values = values;
    }

    public Optional<String> getHttpHeaderName() {
        return Optional.ofNullable(this.httpHeaderName);
    }
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleHttpHeaderConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpHeaderName;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleHttpHeaderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.values = defaults.values;
        }

        public Builder httpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ListenerRuleHttpHeaderConfig build() {
            return new ListenerRuleHttpHeaderConfig(httpHeaderName, values);
        }
    }
}
