// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatadogOrganizationPropertiesResponse {
    private final String id;
    private final String name;

    @OutputCustomType.Constructor({"id","name"})
    private DatadogOrganizationPropertiesResponse(
        String id,
        String name) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogOrganizationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogOrganizationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public DatadogOrganizationPropertiesResponse build() {
            return new DatadogOrganizationPropertiesResponse(id, name);
        }
    }
}