// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sample input data for the service's input(s).
 * 
 */
public final class ExampleRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExampleRequestArgs Empty = new ExampleRequestArgs();

    /**
     * Sample input data for the web service's global parameters
     * 
     */
    @Import(name="globalParameters")
      private final @Nullable Output<Map<String,Object>> globalParameters;

    public Output<Map<String,Object>> getGlobalParameters() {
        return this.globalParameters == null ? Output.empty() : this.globalParameters;
    }

    /**
     * Sample input data for the web service's input(s) given as an input name to sample input values matrix map.
     * 
     */
    @Import(name="inputs")
      private final @Nullable Output<Map<String,List<List<Object>>>> inputs;

    public Output<Map<String,List<List<Object>>>> getInputs() {
        return this.inputs == null ? Output.empty() : this.inputs;
    }

    public ExampleRequestArgs(
        @Nullable Output<Map<String,Object>> globalParameters,
        @Nullable Output<Map<String,List<List<Object>>>> inputs) {
        this.globalParameters = globalParameters;
        this.inputs = inputs;
    }

    private ExampleRequestArgs() {
        this.globalParameters = Output.empty();
        this.inputs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExampleRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> globalParameters;
        private @Nullable Output<Map<String,List<List<Object>>>> inputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ExampleRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalParameters = defaults.globalParameters;
    	      this.inputs = defaults.inputs;
        }

        public Builder globalParameters(@Nullable Output<Map<String,Object>> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }

        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = Output.ofNullable(globalParameters);
            return this;
        }

        public Builder inputs(@Nullable Output<Map<String,List<List<Object>>>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder inputs(@Nullable Map<String,List<List<Object>>> inputs) {
            this.inputs = Output.ofNullable(inputs);
            return this;
        }
        public ExampleRequestArgs build() {
            return new ExampleRequestArgs(globalParameters, inputs);
        }
    }
}
