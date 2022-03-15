// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AnalysisDateTimeParameter {
    /**
     * <p>A display name for the date-time parameter.</p>
     * 
     */
    private final String name;
    /**
     * <p>The values for the date-time parameter.</p>
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private AnalysisDateTimeParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * <p>A display name for the date-time parameter.</p>
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * <p>The values for the date-time parameter.</p>
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisDateTimeParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisDateTimeParameter defaults) {
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
        public AnalysisDateTimeParameter build() {
            return new AnalysisDateTimeParameter(name, values);
        }
    }
}
