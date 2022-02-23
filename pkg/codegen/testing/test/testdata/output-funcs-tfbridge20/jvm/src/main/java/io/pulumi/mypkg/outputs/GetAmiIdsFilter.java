// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAmiIdsFilter {
    private final String name;
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GetAmiIdsFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.values = Objects.requireNonNull(values);
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

    public static Builder builder(GetAmiIdsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetAmiIdsFilter build() {
            return new GetAmiIdsFilter(name, values);
        }
    }
}
