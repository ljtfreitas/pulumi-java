// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs();

    /**
     * The parameter name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The array of strings.
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs(
        Output<String> name,
        Output<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs() {
        this.name = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs defaults) {
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

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterGetArgs(name, values);
        }
    }
}
