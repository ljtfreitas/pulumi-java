// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetElasticIpFilter {
    private final String name;
    private final List<String> values;

    @CustomType.Constructor
    private GetElasticIpFilter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return this.name;
    }
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticIpFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticIpFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetElasticIpFilter build() {
            return new GetElasticIpFilter(name, values);
        }
    }
}
