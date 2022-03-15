// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>An integer parameter.</p>
 * 
 */
public final class DashboardIntegerParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardIntegerParameterArgs Empty = new DashboardIntegerParameterArgs();

    /**
     * <p>The name of the integer parameter.</p>
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * <p>The values for the integer parameter.</p>
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<Double>> values;

    public Output<List<Double>> getValues() {
        return this.values;
    }

    public DashboardIntegerParameterArgs(
        Output<String> name,
        Output<List<Double>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private DashboardIntegerParameterArgs() {
        this.name = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardIntegerParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardIntegerParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder values(Output<List<Double>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<Double> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public DashboardIntegerParameterArgs build() {
            return new DashboardIntegerParameterArgs(name, values);
        }
    }
}
