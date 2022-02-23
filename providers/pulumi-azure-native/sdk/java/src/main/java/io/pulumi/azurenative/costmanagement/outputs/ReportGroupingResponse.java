// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReportGroupingResponse {
    /**
     * The name of the column to group.
     * 
     */
    private final String name;
    /**
     * Has type of the column to group.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","type"})
    private ReportGroupingResponse(
        String name,
        String type) {
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The name of the column to group.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Has type of the column to group.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ReportGroupingResponse build() {
            return new ReportGroupingResponse(name, type);
        }
    }
}
