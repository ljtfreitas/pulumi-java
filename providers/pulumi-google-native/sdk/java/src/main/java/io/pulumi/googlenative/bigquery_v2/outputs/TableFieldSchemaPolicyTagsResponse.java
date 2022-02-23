// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TableFieldSchemaPolicyTagsResponse {
    /**
     * A list of category resource names. For example, "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed.
     * 
     */
    private final List<String> names;

    @OutputCustomType.Constructor({"names"})
    private TableFieldSchemaPolicyTagsResponse(List<String> names) {
        this.names = Objects.requireNonNull(names);
    }

    /**
     * A list of category resource names. For example, "projects/1/location/eu/taxonomies/2/policyTags/3". At most 1 policy tag is allowed.
     * 
     */
    public List<String> getNames() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaPolicyTagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaPolicyTagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public TableFieldSchemaPolicyTagsResponse build() {
            return new TableFieldSchemaPolicyTagsResponse(names);
        }
    }
}
