// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>An integer parameter.</p>
 * 
 */
public final class AnalysisIntegerParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisIntegerParameterArgs Empty = new AnalysisIntegerParameterArgs();

    /**
     * <p>The name of the integer parameter.</p>
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * <p>The values for the integer parameter.</p>
     * 
     */
    @InputImport(name="values", required=true)
        private final Input<List<Double>> values;

    public Input<List<Double>> getValues() {
        return this.values;
    }

    public AnalysisIntegerParameterArgs(
        Input<String> name,
        Input<List<Double>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private AnalysisIntegerParameterArgs() {
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisIntegerParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisIntegerParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValues(Input<List<Double>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<Double> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public AnalysisIntegerParameterArgs build() {
            return new AnalysisIntegerParameterArgs(name, values);
        }
    }
}
