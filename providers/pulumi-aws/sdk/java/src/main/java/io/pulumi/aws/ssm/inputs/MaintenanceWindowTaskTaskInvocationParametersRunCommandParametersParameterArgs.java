// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs();

    /**
     * The parameter name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The array of strings.
     * 
     */
    @InputImport(name="values", required=true)
    private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs(
        Input<String> name,
        Input<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs() {
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs defaults) {
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

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs(name, values);
        }
    }
}
