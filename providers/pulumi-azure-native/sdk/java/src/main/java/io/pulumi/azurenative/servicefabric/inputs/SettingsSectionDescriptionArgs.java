// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.SettingsParameterDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a section in the fabric settings of the cluster.
 * 
 */
public final class SettingsSectionDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SettingsSectionDescriptionArgs Empty = new SettingsSectionDescriptionArgs();

    /**
     * The section name of the fabric settings.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The collection of parameters in the section.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final Input<List<SettingsParameterDescriptionArgs>> parameters;

    public Input<List<SettingsParameterDescriptionArgs>> getParameters() {
        return this.parameters;
    }

    public SettingsSectionDescriptionArgs(
        Input<String> name,
        Input<List<SettingsParameterDescriptionArgs>> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private SettingsSectionDescriptionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsSectionDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<SettingsParameterDescriptionArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsSectionDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(Input<List<SettingsParameterDescriptionArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(List<SettingsParameterDescriptionArgs> parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public SettingsSectionDescriptionArgs build() {
            return new SettingsSectionDescriptionArgs(name, parameters);
        }
    }
}
